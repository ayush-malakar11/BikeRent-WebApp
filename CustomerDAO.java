package com.amstech.bikerent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.amstech.bikerent.dto.CustomerDTO;
import com.amstech.bikerent.util.DBUtil;

public class CustomerDAO {
	private final String CUSTOMER_INSERT_DATA = "insert into  customer(first_name,last_name,email,mobile_number,address,licence_number,city_id) value(?,?,?,?,?,?,?)";
	private final String CUSTOMER_FIND_BY_ID = "select * from  customer where id=?";
	private final String CUSTOMER_FIND_ALL = "select * from  customer";
	private final String CUSTOMER_FIND_ALL_NAME="select first_name from customer";
	private DBUtil dbUtil;

	public CustomerDAO(DBUtil dbUtil) {
		this.dbUtil = dbUtil;
	}

	public int save(CustomerDTO customerDTO) throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;
		try {
			connection = dbUtil.getconnection();
			pstmt = connection.prepareStatement(CUSTOMER_INSERT_DATA);
			pstmt.setString(1, customerDTO.getFirstname());
			pstmt.setString(2, customerDTO.getLastname());
			pstmt.setString(3, customerDTO.getEmail());
			pstmt.setString(4, customerDTO.getMobilenumber());
			pstmt.setString(5, customerDTO.getAddress());
			pstmt.setString(6, customerDTO.getLicencenumber());
			pstmt.setInt(7, customerDTO.getCityId());
			int count = pstmt.executeUpdate();
			return count;
		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.getclose(connection, pstmt);
		}
	}

	public CustomerDTO findById(int id) throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;
		CustomerDTO customerDTO = null;
		try {
			connection = dbUtil.getconnection();
			pstmt = connection.prepareStatement(CUSTOMER_FIND_BY_ID);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery(); // एक ResultSet ऑब्जेक्ट अपने डेटा की वर्तमान पंक्ति की ओर इशारा करते
													// हुए एक कर्सर रखता है। प्रारंभ में कर्सर पहली पंक्ति से पहले स्थित
													// होता है। अगली विधि कर्सर को अगली पंक्ति में ले जाती है, और
													// क्योंकि जब ResultSet ऑब्जेक्ट में कोई और पंक्तियाँ नहीं होती हैं
													// तो यह गलत रिटर्न देता है, इसका उपयोग परिणाम सेट के माध्यम से
													// पुनरावृत्त करने के लिए थोड़ी देर के लूप में किया जा सकता है।
			if (rs.next()) {
				customerDTO = new CustomerDTO();
				customerDTO.setId(rs.getInt("id"));
				customerDTO.setFirstname(rs.getString("first_name"));
				customerDTO.setLastname(rs.getString("last_name"));
				customerDTO.setEmail(rs.getString("email"));
				customerDTO.setMobilenumber(rs.getString("mobile_number"));
				customerDTO.setAddress(rs.getString("address"));
				customerDTO.setLicencenumber(rs.getString("licence_number"));

			}
			return customerDTO;
		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.getclose(connection, pstmt);
		}
	}

	public List<CustomerDTO> findAllName() throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;
		List<CustomerDTO> customerDTOList = new ArrayList<>();
		try {
			connection = dbUtil.getconnection();
			pstmt = connection.prepareStatement(CUSTOMER_FIND_ALL_NAME);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				CustomerDTO customerDTO = new CustomerDTO();
				customerDTO.setFirstname(rs.getString("first_name"));
				
				customerDTOList.add(customerDTO);
			}
			return customerDTOList;
		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.getclose(connection, pstmt);
		}
	}

}
