package com.revature.login;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.employee.Employee;
import com.revature.service.AuthService;


public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private AuthService aServ = new AuthService();
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws IOException, ServletException{
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		
		Employee user = aServ.validateUser(username, password);
		
		System.out.println("User found: " + user);
		
		if(user != null){
			//set up session
			HttpSession sess = req.getSession();
			sess.setAttribute("user", user);
			//redirect to home page
			//resp.sendRedirect("home");
			//send a forward to maintain Request Scope between Servlets
			RequestDispatcher rd = req.getRequestDispatcher("EmployeeMenu.html");
			rd.forward(req, resp);
		}
		
		else {
			resp.getWriter().write("<h1> You have logged in incorrectly!!!!!!!!</h1>");
			resp.sendRedirect("RMSFront.html");
		}
		
		
	}

}
