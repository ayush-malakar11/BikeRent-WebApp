package com.amstech.bikerent.service;

import java.util.List;

import com.amstech.bikerent.dao.CustomerDAO;
import com.amstech.bikerent.dto.CustomerDTO;

public class CustomerService {

	private CustomerDAO customerDAO;

	public CustomerService(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public int save(CustomerDTO customerDTO) throws Exception {
		int count = customerDAO.save(customerDTO);
		return count;
	}

	public CustomerDTO findById(int id) throws Exception {
		return customerDAO.findById(id);
	}

	public List<CustomerDTO> findAll() throws Exception {
		return customerDAO.findAllName();
	}

}
