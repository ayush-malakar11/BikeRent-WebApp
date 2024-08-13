package com.amstech.bikerent.service;

import java.util.List;

import com.amstech.bikerent.dao.BikedetailsDAO;
import com.amstech.bikerent.dto.BikedetailsDTO;

public class BikeService {
	private BikedetailsDAO bikedetailsDAO;

	public BikeService(BikedetailsDAO bikedetailsDAO) {
		this.bikedetailsDAO = bikedetailsDAO;
	}

	public int save(BikedetailsDTO bikedetailsDTO) throws Exception {
		// pre process
		int count = bikedetailsDAO.save(bikedetailsDTO);
		// post process(send welcome email, sms)
		return count;
	}

	public BikedetailsDTO findById(int id) throws Exception {
		return bikedetailsDAO.findById(id);
	}

	public List<BikedetailsDTO> findAll() throws Exception {
		return bikedetailsDAO.findAll();
	}

}
