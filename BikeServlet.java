package com.amstech.bikerent.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.amstech.bikerent.dao.BikedetailsDAO;
import com.amstech.bikerent.dto.BikedetailsDTO;
import com.amstech.bikerent.service.BikeService;
import com.amstech.bikerent.util.DBUtil;

@WebServlet("/bike")
public class BikeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DBUtil dbUtil;
	private BikedetailsDAO bikeDAO;
	private BikeService bikeservice;

	public BikeServlet() {
		this.dbUtil = new DBUtil();
		this.bikeDAO = new BikedetailsDAO(dbUtil);
		this.bikeservice = new BikeService(bikeDAO);

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("UserServlet: doget method");
		String task = request.getParameter("task");
		System.out.println("task:" + task);
		if (task.equalsIgnoreCase("search")) {

			try {

				findAll(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (task.equalsIgnoreCase("findId")) {
			findById(request, response);
		} else if (task.equalsIgnoreCase("save")) {
			save(request, response);
		} else {
			System.out.println("not found");
		}
	}

	public void destroy() {
		System.out.println("BikeServlet: destroy method");
	}

	public void save(HttpServletRequest request, HttpServletResponse response) {
		try {

			BikedetailsDTO bikeDTO = new BikedetailsDTO();
			bikeDTO.setBike_model_name("Royal Enfield");
			bikeDTO.setBike_registration_number("RL 40 R 3294");
			bikeDTO.setCityId(1);

			int count = bikeservice.save(bikeDTO);
			if (count > 0)
				System.out.println("Bike Added successfully");
			else
				System.out.println("Failed to create bike data..");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void findById(HttpServletRequest request, HttpServletResponse response) {
		try {
			int id = 2;
			BikedetailsDTO BikeDTO = bikeservice.findById(id);
			if (BikeDTO != null) {
				System.out.println("User found successfully");
				System.out.println("Model Name:" + BikeDTO.getBike_model_name());
				System.out.println("Registration Number:" + BikeDTO.getBike_registration_number());

			} else {
				System.out.println("Failed to find bike.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<BikedetailsDTO> BikeDTOList = bikeservice.findAll();
			if (!BikeDTOList.isEmpty()) {
				System.out.println("bikes found successfully");
				RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
				request.setAttribute("BikeDTOList", BikeDTOList);
				rd.forward(request, response);
			} else {
				System.out.println("failed to find bikes");
				RequestDispatcher rd = request.getRequestDispatcher("Message.jsp");
				request.setAttribute("status", "Error");
				request.setAttribute("message", "Failed to find bike data");
				request.setAttribute("redirectURL", "frontpage.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("Message.jsp");
			request.setAttribute("status", "Error");
			request.setAttribute("message", "Failed to find bike data due to:" + e.getMessage());
			request.setAttribute("redirectURL", "frontpage.jsp");
			rd.forward(request, response);
		}
	}

}
