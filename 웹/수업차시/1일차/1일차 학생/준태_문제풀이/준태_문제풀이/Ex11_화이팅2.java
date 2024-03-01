package prj;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex11")
public class Ex11_화이팅2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random = new Random();
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String[] f= {"존버는 승리합니다. 다들 화이팅ฅʕ•.•ʔฅ!!",
				"다들 건강을 위해 스트래칭 한번씩 😆😆😆",
				"퐈이야아ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ"}; 
		int rsu= random.nextInt(3);
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>"+f[rsu]+"<h2>");
		out.println("</body>");
		out.println("</html>");
	
	}
}
