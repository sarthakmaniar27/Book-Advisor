package com.books.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.books.model.*;

public class BookSelect extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{

		String bookType = request.getParameter("type");
		//PrintWriter out = response.getWriter();
		//out.println("<br>Got book type"+bookType);
		
		BookExpert be = new BookExpert();
		List<String> result = be.getBooks(bookType); //getBooks() returns a List object
		
		response.setContentType("text/html"); //content type of the response will be text/html
		
		request.setAttribute("styles", result);
		request.setAttribute("cardText", be.cardText);
		request.setAttribute("imagePath", be.imagePath);
		request.setAttribute("shopPath", be.shopPath);
		
		
		RequestDispatcher view = request.getRequestDispatcher("bookResult.jsp");
		view.forward(request, response);
		
		
	}
}
