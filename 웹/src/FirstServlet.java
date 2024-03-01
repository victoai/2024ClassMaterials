import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FirstServlet  extends HttpServlet{
  protected void service(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {     
        System.out.println("hello servlet ");
        PrintWriter out= response.getWriter();
        out.println("Hello Servlet!!!!"); 
 }
}