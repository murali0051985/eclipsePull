package com.murali;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")

public class SqServlet extends HttpServlet {
	public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException {
	
        // first para is the servlet call via request dispatcher
		
//		int k = (int) req.getAttribute("k");
//		k = k * k;
//		
//		PrintWriter myout = res.getWriter();
//		myout.println("Hello to square! The result is " + k);
	
		// second para is the servlet call via senddirect from the client
	
		
//		HttpSession session = req.getSession(); // for the session method of retrieval
//		int k = (int) session.getAttribute("k");
		
		// int k = Integer.parseInt(req.getParameter("k"));
		
		int k = 0;
		
		Cookie cookies[] = req.getCookies();
		for (Cookie c : cookies) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		
		k = k * k;
		PrintWriter myout = res.getWriter();
		myout.println("Hello to square! The result is " + k);
		
		System.out.println("Sq called in the console!");
		
		//session.removeAttribute("k");
		//System.out.println("The local value is " +k);
//		int newk = (int) session.getAttribute("k");
//		System.out.println("Sorry the value of K in the session is removed! " +newk);
	}

}
