package com.amstech.bikerent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.amstech.bikerent.dto.BookingDTO;
import com.amstech.bikerent.util.DBUtil;

public class BookingDAO {

	private final String BOOKING_INSERT_DATA = "insert into booking( bike_details_id, customer_id, booking_date_time, price) value(?,?,?,?)";

	private final String BOOKING_FIND_BY_ID = "select * from booking where id =?";

	private final String BOOKING_FIND_ALL = "select * from booking";

	private DBUtil dbUtil;

	public BookingDAO(DBUtil dbUtil) {
		this.dbUtil = dbUtil;
	}

	public int save(BookingDTO bookingDTO) throws ClassNotFoundException, SQLException {
		// step-1
		Connection connection = dbUtil.getconnection();

		// step-2
		PreparedStatement pstmt = connection.prepareStatement(BOOKING_INSERT_DATA);
		pstmt.setInt(1, bookingDTO.getBike_details_id());
		pstmt.setInt(2, bookingDTO.getCustomer_id());
		pstmt.setString(3, bookingDTO.getBooking_date_time());
		pstmt.setDouble(4, bookingDTO.getPrice());

		int count = pstmt.executeUpdate();

		dbUtil.getclose(connection, pstmt);
		return count;
	}

	public BookingDTO findById(int id) throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;
		BookingDTO bookingDTO = null;
		try {
			connection = dbUtil.getconnection();
			pstmt = connection.prepareStatement(BOOKING_FIND_BY_ID);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				bookingDTO = new BookingDTO();
				bookingDTO.setBooking_date_time(rs.getString("booking_date_time"));
				bookingDTO.setPrice(rs.getDouble("price"));

			}
			return bookingDTO;
		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.getclose(connection, pstmt);
		}
	}

	public List<BookingDTO> findAll() throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;
		List<BookingDTO> bookingDTOList = new ArrayList<>();

		try {
			connection = dbUtil.getconnection();
			pstmt = connection.prepareStatement(BOOKING_FIND_ALL);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				BookingDTO bookingDTO = new BookingDTO();
				bookingDTO.setId(rs.getInt("id"));
				bookingDTO.setBooking_date_time(rs.getString("booking_date_time"));
				bookingDTO.setPrice(rs.getDouble("price"));
				bookingDTOList.add(bookingDTO);
			}
			return bookingDTOList;
		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.getclose(connection, pstmt);
		}
	}

}
