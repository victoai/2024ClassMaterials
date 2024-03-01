package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex07")
public class Ex07_book extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		Ex07_boook boook = new Ex07_boook("처음 가보는 길은 누구나 다 그래", "이은정", 13000);
		out.println(boook);

	
	}
}
