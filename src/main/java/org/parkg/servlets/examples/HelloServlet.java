package org.lgs.servlets.examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 데이터를 만듦
		String name="박호관";
		
		// 데이터를 request에 태움
		request.setAttribute("name", name);
		
		// jsp로 forward 함
		request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);
	}
}