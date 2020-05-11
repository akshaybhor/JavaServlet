package com.Server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;

public class SqrServer extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int o=0;
		
		javax.servlet.http.Cookie[] cookies=req.getCookies();   //Method 3. Get cookies from client to array
		
		
		for (javax.servlet.http.Cookie c:cookies) {
			System.out.println(((javax.servlet.http.Cookie) c).getName()+"  =  "+c.getValue());  // print client cookies on console
			if (((javax.servlet.http.Cookie) c).getName().equals("o"))
				o=Integer.parseInt(c.getValue());
		}
		
		o=o*o;
		PrintWriter out=res.getWriter();
		out.print("hello on two page and sqr result is :"+o);
		
		
		
//		int o= Integer.parseInt(req.getParameter("o"));  //Method 1. URL Rewritting,Accept req object from servlet1  by Send Redirect method as its in diff package
		
		
//		HttpSession session=req.getSession();       //Method 2. Session Managment 
//		int o=(int) session.getAttribute("o");

		
		

//		int o= (int)(req.getAttribute("o"));  //Accept req object from servlet1 
//		o=o*o;

//		PrintWriter out=res.getWriter();
//		out.print("hello on two page and sqr result is :"+o);
				
		
	}
}
