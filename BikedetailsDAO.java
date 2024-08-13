package com.amstech.bikerent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.amstech.bikerent.dto.BikedetailsDTO;
import com.amstech.bikerent.util.DBUtil;

public class BikedetailsDAO {
	private final String BIKE_INSERT_DATA = "insert into bike_details(bike_model_name ,bike_registration_number, city_id) value(?, ?, ?)";

	private final String BIKE_FIND_BY_ID = "select * from bike_details where id = ?";

	private final String BIKE_FIND_ALL = "select * from bike_details";

	private DBUtil dbUtil;

	public BikedetailsDAO(DBUtil dbUtil) {
		System.out.println("Creating UserDAO Object...");
		this.dbUtil = dbUtil;
	}

	public int save(BikedetailsDTO bikedetailsDTO) throws Exception {

		// Step-1
		Connection connection = dbUtil.getconnection();

		// Step-2
//		first_name, lastname, email, password, mobile_number, Address, city_id
		PreparedStatement pstmt = connection.prepareStatement(BIKE_INSERT_DATA);
		pstmt.setString(1, bikedetailsDTO.getBike_model_name());
		pstmt.setString(2, bikedetailsDTO.getBike_registration_number());
		pstmt.setInt(3, bikedetailsDTO.getCityId());

		// Step-3
		int count = pstmt.executeUpdate(); // way1 3 1 0
//		boolean status = pstmt.execute(); // way2 true true false

		// Step-4
		dbUtil.getclose(connection, pstmt);
		;
		return count;
	}

	public BikedetailsDTO findById(int id) throws Exception {
		// Step-1: connection
		Connection connection = null;
		PreparedStatement pstmt = null;
		BikedetailsDTO bikedetailsDTO = null;
		try {
			connection = dbUtil.getconnection();
			// Step-2: pstmt
			pstmt = connection.prepareStatement(BIKE_FIND_BY_ID);
			pstmt.setInt(1, id);
			// Step-3: exc
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				bikedetailsDTO = new BikedetailsDTO();
				bikedetailsDTO.setBike_model_name(rs.getString("Bike_model_name"));
				bikedetailsDTO.setBike_registration_number(rs.getString("Bike_registration_number"));
			}
			return bikedetailsDTO;
		} catch (Exception e) {
			throw e;
		} finally {
			// Step-4: close
			dbUtil.getclose(connection, pstmt);
			;
		}
	}

	public List<BikedetailsDTO> findAll() throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;
		List<BikedetailsDTO> bikedetailsDTOList = new ArrayList<>();
		try {
			connection = dbUtil.getconnection();
			pstmt = connection.prepareStatement(BIKE_FIND_ALL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				BikedetailsDTO bikedetailsDTO = new BikedetailsDTO();
				bikedetailsDTO.setId(rs.getInt("id"));
				bikedetailsDTO.setBike_model_name(rs.getString("bike_model_name"));
				bikedetailsDTO.setBike_registration_number(rs.getString("bike_registration_number"));
				bikedetailsDTOList.add(bikedetailsDTO);
			}
			return bikedetailsDTOList;
		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.getclose(connection, pstmt);
		}
	}

}
