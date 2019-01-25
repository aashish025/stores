package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name = request.getParameter("name");
		String Pass = request.getParameter("password");
		PrintWriter out = response.getWriter();
		Properties prop = new Properties();
		prop.load(getServletContext().getResourceAsStream("/WEB-INF/properties/config.properties"));
	boolean ash;
	if(ash=request.getParameter("r") != null) {
		out.println("ewdwd");
		out.println(prop.getProperty("database"));
	}
	else {
	
	//	InputStream input = null;

		try {

		//	input = new FileInputStream("src/main/java/com/config.properties");

			// load a properties file
		//	prop.load(input);
			
			
			out.println(prop.getProperty("database"));
			out.println(prop.getProperty("dbuser"));
			out.println(prop.getProperty("dbpassword"));
			out.println(prop.getProperty("pdf"));
			out.println(prop.getProperty("pdff"));
			out.println(Name);
			out.println(Pass);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	}

}
