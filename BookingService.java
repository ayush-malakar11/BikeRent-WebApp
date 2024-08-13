package com.amstech.bikerent.service;

import java.util.List;

import com.amstech.bikerent.dao.BookingDAO;
import com.amstech.bikerent.dto.BookingDTO;

public class BookingService {
	private BookingDAO bookingDAO;

	public BookingService(BookingDAO bookingDAO) {
		this.bookingDAO = bookingDAO;
	}

	public int save(BookingDTO bookingDTO) throws Exception {
		// pre process
		int count = bookingDAO.save(bookingDTO);
		return count;
	}

	public BookingDTO findById(int id) throws Exception {
		return bookingDAO.findById(id);
	}

	public List<BookingDTO> findAll() throws Exception {
		return bookingDAO.findAll();
	}

}
