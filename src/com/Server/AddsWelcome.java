package com.Server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddsWelcome extends HttpServlet{
	public void doGet(HttpServletRequest req,  HttpServletResponse res) throws IOException, ServletException {
		
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int o=i+j;
		
		Cookie cookie=new Cookie("o",o+""); //Send var by Cookies 
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		
//		HttpSession session=req.getSession();      //2. Session Managment--used for verify user authentication
//		session.setAttribute("o", o);				
//		res.sendRedirect("sq");
		
//		res.sendRedirect("sq?o="+o);   //1. sendRedirect Method + 1. URL rewriting without session so data not mantained
		
//		req.setAttribute("o", o);  // Send var in req as object
//		RequestDispatcher rd=req.getRequestDispatcher("sq");   
//		rd.forward(req, res);
		
	}
	

}
