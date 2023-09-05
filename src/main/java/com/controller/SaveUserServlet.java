package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;
import com.service.MailerService;

public class SaveUserServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException,IOException {
		
		String firstname = request.getParameter("firstname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		// Setting values for new user 
		UserBean NewUser = new UserBean();
		NewUser.setFirstname(firstname);
		NewUser.setEmail(email);
		NewUser.setPassword(password);
		NewUser.setRole("USER");
		
		UserDao userDao = new UserDao(); 
		userDao.addUser(NewUser);
		
		MailerService mailerService = new MailerService();
		mailerService.sendWelcomeMail(NewUser);
		
		response.sendRedirect("Login.jsp");
		
		
	}

}
