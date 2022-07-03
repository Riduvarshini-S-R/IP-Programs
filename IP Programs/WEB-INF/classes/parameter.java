import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class parameter extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)
throws IOException,ServletException
{ res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String s1=req.getParameter("name");
String s2=req.getParameter("mob");
pw.println("<html><title>student details</title><head></head>");
pw.println("<body>");
pw.println("<h1>PARAMETER PASSING IN JAVA SERVLET<h1>");
pw.println("this is the response created by java servlet ");
pw.println("<h1>"+s1+"<h1>");
pw.println(s2);
pw.println("</body>");
pw.println("</html>" );
pw.close();
}
}
