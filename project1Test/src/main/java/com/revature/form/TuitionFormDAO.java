package com.revature.form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.temporal.Temporal;
import java.util.ArrayList;

import com.revature.ConnectionFactory.*;

public class TuitionFormDAO {
	private static Connection conn = ConnectionFactory
			.getConnectionFactory().createConnection();
	public void submitTuitionForm(TuitionForm submitForm) {
		String sql = "insert into RMSForm (requestor, dateandtime, description, format,"
				+ "		currentapprover,status, amount) values('" 
				+ submitForm.getRequestor() + "','" 
				+ submitForm.getDate().toString() + "','"
				+ submitForm.getDescription() + "','"
				+ submitForm.getFormType() + "','"
				+ submitForm.getCurrentApprover() + "','"
				+ submitForm.getCurrentStatus().toString() + "','"
				+ submitForm.getAmount() + "');";
				
				try {
					conn.createStatement().executeUpdate(sql);
				} catch (SQLException e) {
					System.out.println("Failed to add Form!!!");
					e.printStackTrace();
				}
				
	}
	public void updateTutionForm(int ID , String approval) {
		String sql = null;
		if (approval.equals("BENCO")) {
			sql = "UPDATE RMSForm SET status = 'BENCO'"
					+ "WHERE id=" + ID + ";";
		}
		else if (approval.equals("HEAD")){
			sql = "UPDATE RMSForm SET status = 'HEAD'"
					+ "WHERE id=" + ID + ";";
		}
		else if (approval.equals("DIRECT")){
			sql = "UPDATE RMSForm SET status = 'DIRECT'"
					+ "WHERE id=" + ID + ";";
		}
		else if (approval.equals("PROOF")){
			sql = "UPDATE RMSForm SET status = 'PROOF'"
					+ "WHERE id=" + ID + ";";
		}
		else if (approval.equals("APPROVED")){
			sql = "UPDATE RMSForm SET status = 'APPROVED'"
					+ "WHERE id=" + ID + ";";
		}
		else if (approval.equals("DENIED")){
			sql = "UPDATE RMSForm SET status = 'DENIED'"
					+ "WHERE id=" + ID + ";";
		}
		try {
			conn.createStatement().executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Failed on update Application");
			e.printStackTrace();
		}
	}
	public TuitionForm FindTuitionI(int ID) {
		TuitionForm tempForm = null;
		String sql = "SELECT * FROM TuitionForm WHERE user1 = ?";
		try {
			PreparedStatement preparedStmt = conn.prepareStatement(sql);
			preparedStmt.setInt(1, ID);
			ResultSet results = preparedStmt.executeQuery();
//			if (results.next()) {
//				tempForm = new TuitionForm(results.getInt(1), results.getInt(2), (Temporal) results.getDate(3), results.getString(4), 
//						null, results.getInt(6), null, results.getDouble(8), results.getString(9));
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
			//e.printStackTrace();
		}
		return tempForm;
	}
}
