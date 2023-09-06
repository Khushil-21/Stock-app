package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.UserBean;
import com.dao.UserDao;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UserDao userDao = new UserDao();

		UserBean user = userDao.authenitcate(email, password);

		if (user == null) {
			request.setAttribute("error", "Invalid Credentials");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		} else {
			// loggedin

			HttpSession session = request.getSession();
			session.setAttribute("user", user);// userId , firstName ,email, password
			if (user.getRole().equals("USER")) {
				response.sendRedirect("Welcome.jsp");
			} else if (user.getRole().equals("ADMIN")) {
				response.sendRedirect("AdminDashboard.jsp");

			}
		}
	}

}
