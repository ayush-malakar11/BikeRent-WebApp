package com.amstech.bikerent.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.amstech.bikerent.dao.BookingDAO;
import com.amstech.bikerent.dao.CustomerDAO;
import com.amstech.bikerent.dto.BikedetailsDTO;
import com.amstech.bikerent.dto.BookingDTO;
import com.amstech.bikerent.dto.CustomerDTO;
import com.amstech.bikerent.service.BookingService;
import com.amstech.bikerent.service.CustomerService;
import com.amstech.bikerent.util.DBUtil;

@WebServlet("/booking")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DBUtil dbUtil;
	private BookingDAO bookingDAO;
	private BookingService bookingService;

	public BookingServlet() {
		System.out.println("Object Creared");
		this.dbUtil = new DBUtil();
		this.bookingDAO = new BookingDAO(dbUtil);
		this.bookingService = new BookingService(bookingDAO);

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("UserServlet: dopost method");
		String task = request.getParameter("task");
		System.out.println("task:" + task);
		if (task.equalsIgnoreCase("booknow")) {

			try {
				save(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
//		if(task.equalsIgnoreCase("books")) {
//				findById(request, response);
//			}

		else {
			System.out.println("not found");
		}

	}

	public void destroy() {
		System.out.println("BookingServlet: destroy method");
	}

	public void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			

			BookingDTO bookingDTO = new BookingDTO();
			bookingDTO.setBike_details_id(Integer.parseInt(request.getParameter("bikeid")));
			bookingDTO.setCustomer_id(Integer.parseInt(request.getParameter("customerid")));
			bookingDTO.setBooking_date_time(request.getParameter("registrationdate"));
			bookingDTO.setPrice(Integer.parseInt(request.getParameter("price")));

			int count = bookingService.save(bookingDTO);
			if (count > 0) {
				System.out.println("user booking successfully.");
				RequestDispatcher rd = request.getRequestDispatcher("Payment.jsp");
				request.setAttribute("status", "Success");
				request.setAttribute("message", "User booking successfully");
				request.setAttribute("redirectURL", "main.jsp");
				rd.forward(request, response);
			} else {
				System.out.println("failed to booking user");
				RequestDispatcher rd = request.getRequestDispatcher("Message.jsp");
				request.setAttribute("status", "Error");
				request.setAttribute("message", "Failed to creat user data");
				request.setAttribute("redirectURL", "main.jsp");
				rd.forward(request, response);

			}
		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("Message.jsp");
			request.setAttribute("status", "Error");
			request.setAttribute("message", "Failed to booking user data due to:" + e.getMessage());
			request.setAttribute("redirectURL", "main.jsp");
			rd.forward(request, response);
		}
	}

	/*
	 * public void findById(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { try {
	 * 
	 * int id = Integer.parseInt(request.getParameter("bikeid"));
	 * 
	 * BookingDTO bookingDTO = bookingService.findById(id); if (bookingDTO != null)
	 * { System.out.println("User found successfully"); RequestDispatcher rd =
	 * request.getRequestDispatcher("Booking.jsp");
	 * request.setAttribute("customerDTOEdit", bookingDTO); rd.forward(request,
	 * response); // System.out.println("FirstName: " + customerDTO.getFirstname());
	 * // System.out.println("LastName: " + customerDTO.getLastname()); } else {
	 * System.out.println("failed to find user"); RequestDispatcher rd =
	 * request.getRequestDispatcher("Message.jsp"); request.setAttribute("status",
	 * "Error"); request.setAttribute("message", "Failed to find user data");
	 * request.setAttribute("redirectURL", "main.jsp"); rd.forward(request,
	 * response); } } catch (Exception e) { e.printStackTrace(); RequestDispatcher
	 * rd = request.getRequestDispatcher("Message.jsp");
	 * request.setAttribute("status", "Error"); request.setAttribute("message",
	 * "Failed to find user data to" + e.getMessage());
	 * request.setAttribute("redirectURL", "main.jsp"); rd.forward(request,
	 * response); } }
	 */

	public void findAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			List<BookingDTO> bookingDTOList = bookingService.findAll();
			if (!bookingDTOList.isEmpty()) {
				System.out.println("booking successfully");
				RequestDispatcher rd = request.getRequestDispatcher("Payment.jsp");
				request.setAttribute("bookingDTOList", bookingDTOList);
				rd.forward(request, response);
			} else {
				System.out.println("failed to find user");
				RequestDispatcher rd = request.getRequestDispatcher("Message.jsp");
				request.setAttribute("status", "Error");
				request.setAttribute("message", "Failed to booking");
				request.setAttribute("redirectURL", "Booking.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("Message.jsp");
			request.setAttribute("status", "Error");
			request.setAttribute("message", "Failed to booking:" + e.getMessage());
			request.setAttribute("redirectURL", "Booking.jsp");
			rd.forward(request, response);
		}
	}

}
