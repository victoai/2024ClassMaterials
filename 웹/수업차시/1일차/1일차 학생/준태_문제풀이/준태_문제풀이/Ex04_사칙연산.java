package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex04")
public class Ex04_사칙연산 extends HttpServlet{
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
						//키이름으로 value 값을 얻어 올수 있다.
	String su1_=request.getParameter("su1");
	String su2_=request.getParameter("su1");
	response.setContentType("text/html;charset=utf-8");
	response.setCharacterEncoding("utf-8");
	int su1= Integer.parseInt(su1_);
	int su2= Integer.parseInt(su2_);
	int sum1 = su1 + su2;
	int sum2 = su1 - su2;
	int sum3 = su1 * su2;
	int sum4 = su1 / su2;
	PrintWriter out =  response.getWriter();
	out.println("<html>");
	out.println("<head>");
	out.println("</head>");
	out.println("<body>");
	out.println("<h2>더하기</h2>"+sum1);
	out.println("<h2>빼기</h2>"+sum2);
	out.println("<h2>곱하기</h2>"+sum3);
	out.println("<h2>나누기</h2>"+sum4);
	out.println("</body>");
	out.println("</html>");

}
}
