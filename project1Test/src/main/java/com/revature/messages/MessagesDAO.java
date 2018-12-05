package com.revature.messages;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.ConnectionFactory.*;

public class MessagesDAO {
	private static Connection conn = ConnectionFactory
			.getConnectionFactory().createConnection();
	public void logMessage(messages messageToLog) {
		String sql = "insert into RMS (fromid, toid, message) values('" 
				+ messageToLog.getFromID() + "','" 
				+ messageToLog.getToID() + "','"
				+ messageToLog.getMessage() + "');";
				
				try {
					conn.createStatement().executeUpdate(sql);
				} catch (SQLException e) {
					System.out.println("Failed to add Message!!!");
					e.printStackTrace();
				}
	}
}
