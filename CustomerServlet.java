package com.amstech.bikerent.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import com.amstech.bikerent.dao.CustomerDAO;
import com.amstech.bikerent.dto.CustomerDTO;
import com.amstech.bikerent.service.CustomerService;
import com.amstech.bikerent.util.DBUtil;

@WebServlet("/customers")

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DBUtil dbUtil;
	private CustomerDAO customerDAO;
	private CustomerService customerservice;

	public CustomerServlet() {
		System.out.println("Object Creared");
		this.dbUtil = new DBUtil();
		this.customerDAO = new CustomerDAO(dbUtil);
		this.customerservice = new CustomerService(customerDAO);

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String task = request.getParameter("task");
		System.out.println("task:" + task);
		if (task.equalsIgnoreCase("customerdetails")) {
			try {
//				findAll(request, response);
				save(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("not valid");
		}
	}

	public void destroy() {
		System.out.println("CustomerServlet: destroy method");
	}

	public void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

			CustomerDTO customerDTO = new CustomerDTO();
			customerDTO.setFirstname(request.getParameter("firstName"));
			customerDTO.setLastname(request.getParameter("lastName"));
			customerDTO.setEmail(request.getParameter("email"));
			customerDTO.setMobilenumber(request.getParameter("mobilenumber"));
			customerDTO.setAddress(request.getParameter("address"));
			customerDTO.setLicencenumber(request.getParameter("licencenumber"));
			customerDTO.setCityId(Integer.parseInt(request.getParameter("cityid")));

			int count = customerservice.save(customerDTO);
			if (count > 0) {
				HttpSession session = request.getSession();
				session.setAttribute("auth", customerDTO);
				System.out.println("customer created successfully.");
				RequestDispatcher rd = request.getRequestDispatcher("Booking.jsp");
				request.setAttribute("status", "Success");
				request.setAttribute("message", "customer created successfully");
				rd.forward(request, response);
			} else {
				System.out.println("failed to create user");
				RequestDispatcher rd = request.getRequestDispatcher("Message.jsp");
				request.setAttribute("status", "Error");
				request.setAttribute("message", "Failed to creat user data");
				request.setAttribute("redirectURL", "Registration.jsp");
				rd.forward(request, response);

			}
		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("Message.jsp");
			request.setAttribute("status", "Error");
			request.setAttribute("message", "Failed to creat user data due to:" + e.getMessage());
			request.setAttribute("redirectURL", "Registration.jsp");
			rd.forward(request, response);
		}
	}

	public void findById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			int id = Integer.parseInt(request.getParameter("userId"));

			CustomerDTO customerDTO = customerservice.findById(id);
			if (customerDTO != null) {
				System.out.println("User found successfully");
				RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
				request.setAttribute("customerDTOEdit", customerDTO);
				rd.forward(request, response);
//				System.out.println("FirstName: " + customerDTO.getFirstname());
//				System.out.println("LastName: " + customerDTO.getLastname());
			} else {
				System.out.println("failed to find user");
				RequestDispatcher rd = request.getRequestDispatcher("Message.jsp");
				request.setAttribute("status", "Error");
				request.setAttribute("message", "Failed to find user data");
				request.setAttribute("redirectURL", "Home.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("Message.jsp");
			request.setAttribute("status", "Error");
			request.setAttribute("message", "Failed to find user data to" + e.getMessage());
			request.setAttribute("redirectURL", "Home.jsp");
			rd.forward(request, response);
		}
	}

	public void findAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			List<CustomerDTO> customerDTOList = customerservice.findAll();
			if (!customerDTOList.isEmpty()) {
				System.out.println("Customer found successfully");
//				RequestDispatcher rd = request.getRequestDispatcher("Booking.jsp");
//				request.setAttribute("customerDTOList", customerDTOList);
//				rd.forward(request, response);

				RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
				request.setAttribute("customerDTOList", customerDTOList);
				rd.forward(request, response);
				RequestDispatcher rd1 = request.getRequestDispatcher("Booking.jsp");
			} else {
				System.out.println("failed to find user");
				RequestDispatcher rd = request.getRequestDispatcher("Message.jsp");
				request.setAttribute("status", "Error");
				request.setAttribute("message", "Failed to find customer data");
				request.setAttribute("redirectURL", "main.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("Message.jsp");
			request.setAttribute("status", "Error");
			request.setAttribute("message", "Failed to find customer data due to:" + e.getMessage());
			request.setAttribute("redirectURL", "main.jsp");
			rd.forward(request, response);
		}
	}

}
