package com.revature.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.ConnectionFactory.*;


public class EmployeeDAO {
	private static Connection conn = ConnectionFactory
			.getConnectionFactory().createConnection(); 
	public Employee grabEmployee(String username, String password) {
		Employee tempEmployee = null;
		if (conn == null) {
			System.out.println("connection issues!!");
			return tempEmployee;
		}
		try {
			System.out.println(username + " " + password);
			String sql = "SELECT * FROM RMSEmployee WHERE username = ? and pass = ?";
			PreparedStatement preparedStmt = conn.prepareStatement(sql);
			preparedStmt.setString(1, username);
			preparedStmt.setString(2, password);
			ResultSet results = preparedStmt.executeQuery();
			if (results.next())
			{
				tempEmployee = new Employee(results.getInt(1), results.getString(2), results.getInt(3),
											results.getInt(4), results.getInt(5), results.getString(6),
											results.getString(7), results.getString(8), results.getString(9));
				System.out.println("i grabbed a employee!");
				return tempEmployee;
			}
			return tempEmployee;
		} catch (SQLException e) {
			System.out.println("Incorrect Username or Password!");
			e.printStackTrace();
		}
		System.out.println("empty ish");
		return tempEmployee;
	}
}
