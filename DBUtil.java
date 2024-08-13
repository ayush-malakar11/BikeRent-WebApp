package com.amstech.bikerent.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
	private final String URL = "jdbc:mysql://localhost:3306/bike_rent_db";
	private final String USERNAME = "root";
	private final String PASSWORD = "ayush123";
	private final String DRIVER = "com.mysql.cj.jdbc.Driver";

	public DBUtil() {
		System.out.println("object created");
	}

	public Connection getconnection() throws ClassNotFoundException, SQLException {

		Class.forName(DRIVER);
		Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		System.out.println("Connection Successfully");
		return connection;

	}

	public void getclose(Connection conn, PreparedStatement pstmt) throws SQLException {
		if (conn != null)
			conn.close();
		if (pstmt != null)
			pstmt.close();
	}

}
