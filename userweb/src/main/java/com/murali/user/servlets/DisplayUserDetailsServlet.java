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
 * Servlet implementation class DisplayUserDetailsServlet
 */
public class DisplayUserDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		System.out.println("value passed in the request to fetch "+id);
		UserDAO dao = new UserDAOImpl();
		User user = dao.read(id);
		
//		ProductBO bo = (ProductBO) context.getBean("productbo");
//		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));

		PrintWriter out = response.getWriter();
		out.print("User Details");
		out.print("User ID:" + user.getId());
		out.print("User name:" + user.getName());
		out.print("User email:" + user.getEmail());
	}

}
