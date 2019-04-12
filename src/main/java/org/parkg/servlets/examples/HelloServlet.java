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
		// �����͸� ����
		String name="��ȣ��";
		
		// �����͸� request�� �¿�
		request.setAttribute("name", name);
		
		// jsp�� forward ��
		request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);
	}
}