package com.amstech.bikerent.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.amstech.bikerent.dao.PaymentDAO;
import com.amstech.bikerent.dto.PaymentDTO;
import com.amstech.bikerent.service.PaymentService;
import com.amstech.bikerent.util.DBUtil;

@WebServlet("/payment")

public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DBUtil dbutil;
	private PaymentDAO paymentDAO;
	private PaymentService paymentservice;

	public PaymentServlet() {
		System.out.println("PaymentServlet:Object Created");
		this.dbutil = new DBUtil();
		this.paymentDAO = new PaymentDAO(dbutil);
		this.paymentservice = new PaymentService(paymentDAO);

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("UserServlet: doget method");
		String task = request.getParameter("task");
		System.out.println("task:" + task);
		if (task.equalsIgnoreCase("pay")) {

			try {
				findAll(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("not found");
		}
	}

	public void destroy() {
		System.out.println("PaymentServlet: destroy method");
	}

	public void findAll(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			List<PaymentDTO> paymentDTOList = paymentservice.findAll();
			if (!paymentDTOList.isEmpty()) {
				System.out.println("payment successfully");
				RequestDispatcher rd = request.getRequestDispatcher("Payment.jsp");
				request.setAttribute("bookingDTOList", paymentDTOList);
				rd.forward(request, response);
			} else {
				System.out.println("failed to find user");
				RequestDispatcher rd = request.getRequestDispatcher("Message.jsp");
				request.setAttribute("status", "Error");
				request.setAttribute("message", "Failed to payment");
				request.setAttribute("redirectURL", "Registration.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("Message.jsp");
			request.setAttribute("status", "Error");
			request.setAttribute("message", "Failed to payment:" + e.getMessage());
			request.setAttribute("redirectURL", "Registration.jsp");
			rd.forward(request, response);
		}
	}

}
