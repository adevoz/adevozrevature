package com.revature.EmployeeMenuServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.employee.Employee;


public class HomeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2153399712240109178L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession sess = req.getSession();

		Employee user = (Employee) sess.getAttribute("user");

		String username = null;

		if (user != null) {
			username = user.getUsername();
		}
		
		System.out.println(username);

		if (username == null) {
			System.out.println("Invalid Login");
			resp.sendRedirect("RMSFront.html");
		}

		else {
			// forward to home page
			RequestDispatcher rd = req.getRequestDispatcher("EmployeeMenu.html");
			rd.forward(req, resp);
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
