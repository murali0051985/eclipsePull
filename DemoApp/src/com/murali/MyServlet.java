package com.murali;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	protected void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter myout = res.getWriter();
		myout.print("Hi ");
		
//		ServletContext ctx = getServletContext(); // using the servlet context which is common across all the servlets
//		String str = ctx.getInitParameter("name");
//		myout.println(str);
		
		ServletConfig cg = getServletConfig(); // using the servlet config which is particular to the servlet
		String str = cg.getInitParameter("name");
		myout.println(str);
	}

}
