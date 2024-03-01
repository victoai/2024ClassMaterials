package prj5;

 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/testdb")
public class TestDBServlet   extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
		PrintWriter out =   response.getWriter();
		response.setCharacterEncoding("utf-8");			   
		//response.setContentType("text/html;charset=utf-8");   // html문서   
		//response.setHeader("Content-Type", "text/html;charset=UTF-8");
	 	
		//디비연동
		 Connection con=null;
		 Statement st = null;
		 ResultSet rs = null;
		 out.println("한글");
		 try{
			String driver = "oracle.jdbc.driver.OracleDriver" ;
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String password="1234";
			 //1. 오라클드라이버 로딩
			Class.forName(driver); //2. 데이터베이스 연결
			con= DriverManager.getConnection(url, user, password); //3. statement 얻어오기
			st = con.createStatement();
			 //4. 필요한 sql 작성
			String sql ="select * from customertbl"; //5. 최종적으로 실행
			rs = st.executeQuery( sql) ;
			 //6. 가져온 쿼리 결과를 화면에 출력하기
			 
			while( rs.next() ) {
				out.print(rs.getString(1)); // out은 브라우저에 출력을 의미함
				out.print(rs.getString(2));
				out.print(rs.getString(3));				
			}			 
			 
		}catch(Exception e){
		   e.printStackTrace();
		}
		finally{ //자원의 반납
			//if( rs!= null)  rs.close();
			//if( st != null) st.close();
			//if( con != null) con.close();
		}
		
		
	}
}
