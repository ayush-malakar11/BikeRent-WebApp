package com.amstech.bikerent.service;

import java.util.List;

import com.amstech.bikerent.dao.PaymentDAO;
import com.amstech.bikerent.dto.PaymentDTO;

public class PaymentService {

	private PaymentDAO paymentDAO;

	public PaymentService(PaymentDAO paymentDAO) {
		this.paymentDAO = paymentDAO;
	}

	public int save(PaymentDTO paymentDTO) throws Exception {
		int count = paymentDAO.save(paymentDTO);
		return count;
	}

	public PaymentDTO findById(int id) throws Exception {
		return paymentDAO.findById(id);
	}

	public List<PaymentDTO> findAll() throws Exception {
		return paymentDAO.findAll();
	}

}