package com.murali;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")

public class AddServlet extends HttpServlet {
	public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		System.out.println("result is " + k);
		
		Cookie cookie = new Cookie("k",k + "");
		res.addCookie(cookie);
		
		PrintWriter myout = res.getWriter();
		myout.println("<html><body bgcolor='yellow'>");
		myout.println("result is " + k);
		myout.println("</body></html>");
		
		// servlet within servlet by request dispatcher
//		req.setAttribute("k", k); //passing the request value to the other servlet
//		
//		// this wont be printed , since we are redirecting the output to a different servlet
//		PrintWriter myout = res.getWriter();
//		myout.println("result is " + k);
//		
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		// res.sendRedirect("sq?k="+k); // url rewriting to pass the value to the other servlet
		
		// passing the value of k through the session
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k",k);
		
		// res.sendRedirect("sq");
		
	}

}
