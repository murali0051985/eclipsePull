package com.murali.user.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.murali.user.dao.UserDAO;
import com.murali.user.dao.UserDAOImpl;
import com.murali.user.dto.User;



/**
 * Servlet implementation class CreateUserServlet
 */
public class createUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		
		UserDAO dao = new UserDAOImpl();
		dao.create(user);
		
		/*
		 * WebApplicationContext context =
		 * WebApplicationContextUtils.getRequiredWebApplicationContext(this.
		 * getServletContext()); ProductBO bo = (ProductBO)
		 * context.getBean("productbo"); bo.create(product);
		 */
		
		PrintWriter out = response.getWriter();
		out.print("User created!!");
		
	}

}
