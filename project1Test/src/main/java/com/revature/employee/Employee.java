package com.revature.employee;


import com.revature.form.TuitionForm;
import com.revature.messages.messages;

public class Employee {
	private int employeeID;
	private String department;
	private int balance;
	private int supervisor;
	private int departmenthead;
	private String username;
	private String pass;
	private String firstname;
	public Employee(int employeeID, String department, int balance, int supervisor, int departmenthead, String username,
			String pass, String firstname, String lastname) {
		super();
		this.employeeID = employeeID;
		this.department = department;
		this.balance = balance;
		this.supervisor = supervisor;
		this.departmenthead = departmenthead;
		this.username = username;
		this.pass = pass;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	private String lastname;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(int supervisor) {
		this.supervisor = supervisor;
	}
	public int getDepartmenthead() {
		return departmenthead;
	}
	public void setDepartmenthead(int departmenthead) {
		this.departmenthead = departmenthead;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	//public void submitRequest(int Amount, String Location, String Description)
	//{
	//	TuitionForm tempForm = new TuitionForm(this.getEmployeeID(), null, null, Description, null, this.getSupervisor(), null,
	//			Amount, Location);
	//}
	public void updateRequest(int FormID) {
	}
}
