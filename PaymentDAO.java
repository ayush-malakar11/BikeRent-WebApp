package com.amstech.bikerent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.amstech.bikerent.dto.PaymentDTO;
import com.amstech.bikerent.util.DBUtil;

public class PaymentDAO {
	private final String PAYMENT_INSERT_DATA = "insert into payment( booking_id, payment_mode, payment_status, txn_id, payment_date_time, advance_amount, remaining_amount, extra_charges, total_amount) value(?,?,?,?,?,?,?,?,?)";

	private final String PAYMENT_FIND_BY_ID = "select * from payment where id =?";

	private final String PAYMENT_FIND_ALL = "select * from payment";

	private DBUtil dbUtil;

	public PaymentDAO(DBUtil dbUtil) {
		this.dbUtil = dbUtil;
	}

	public int save(PaymentDTO paymentDTO) throws ClassNotFoundException, SQLException {

		Connection connection = dbUtil.getconnection();

		PreparedStatement pstmt = connection.prepareStatement(PAYMENT_INSERT_DATA);
		pstmt.setInt(1, paymentDTO.getBooking_id());
		pstmt.setString(2, paymentDTO.getPayment_mode());
		pstmt.setString(3, paymentDTO.getPayment_status());
		pstmt.setString(4, paymentDTO.getTxn_id());
		pstmt.setString(5, paymentDTO.getPayment_date_time());
		pstmt.setInt(6, paymentDTO.getAdvance_amount());
		pstmt.setInt(7, paymentDTO.getRemaining_amount());
		pstmt.setInt(8, paymentDTO.getExtra_charges());
		pstmt.setInt(9, paymentDTO.getTotal_amount());

		int count = pstmt.executeUpdate();

		dbUtil.getclose(connection, pstmt);

		return count;
	}

	public PaymentDTO findById(int id) throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;
		PaymentDTO paymentDTO = null;
		try {
			connection = dbUtil.getconnection();
			pstmt = connection.prepareStatement(PAYMENT_FIND_BY_ID);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				paymentDTO = new PaymentDTO();
				paymentDTO.setPayment_mode(rs.getString("payment_mode"));
				paymentDTO.setPayment_status(rs.getString("payment_status"));
				paymentDTO.setTxn_id(rs.getString("txn_id"));
				paymentDTO.setPayment_date_time(rs.getString("payment_date_time"));
				paymentDTO.setAdvance_amount(rs.getInt("advance_amount"));
				paymentDTO.setRemaining_amount(rs.getInt("remaining_amount"));
				paymentDTO.setExtra_charges(rs.getInt("extra_charges"));
				paymentDTO.setTotal_amount(rs.getInt("total_amount"));

			}
			return paymentDTO;
		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.getclose(connection, pstmt);
		}
	}

	public List<PaymentDTO> findAll() throws Exception {
		Connection connection = null;
		PreparedStatement pstmt = null;
		List<PaymentDTO> paymentDTOList = new ArrayList<>();

		try {
			connection = dbUtil.getconnection();
			pstmt = connection.prepareStatement(PAYMENT_FIND_ALL);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				PaymentDTO paymentDTO = new PaymentDTO();
				paymentDTO.setId(rs.getInt("id"));
				paymentDTO.setPayment_mode(rs.getString("payment_mode"));
				paymentDTO.setPayment_status(rs.getString("payment_status"));
				paymentDTO.setTxn_id(rs.getString("txn_id"));
				paymentDTO.setPayment_date_time(rs.getString("payment_date_time"));
				paymentDTO.setAdvance_amount(rs.getInt("advance_amount"));
				paymentDTO.setRemaining_amount(rs.getInt("remaining_amount"));
				paymentDTO.setExtra_charges(rs.getInt("extra_charges"));
				paymentDTO.setTotal_amount(rs.getInt("total_amount"));
				paymentDTOList.add(paymentDTO);
			}
			return paymentDTOList;
		} catch (Exception e) {
			throw e;
		} finally {
			dbUtil.getclose(connection, pstmt);
		}
	}

}
