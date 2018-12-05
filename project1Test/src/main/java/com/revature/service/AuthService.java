package com.revature.service;

import com.revature.employee.Employee;
import com.revature.employee.EmployeeDAO;

public class AuthService {
	
	EmployeeDAO udao = new EmployeeDAO();
	
	public Employee validateUser(String username, String password){
		
		Employee tempEmployee = udao.grabEmployee(username, password);
		
		return tempEmployee;
		
	}

}
