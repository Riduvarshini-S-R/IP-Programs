import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class sessiontrack extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse response)throws 
IOException, ServletException
 {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 HttpSession session = request.getSession(true);
 Date created = new Date(session.getCreationTime());
 Date accessed = new Date(session.getLastAccessedTime());
 out.println("Session ID " + session.getId());
 out.println("Created: " + created);
 out.println("Last Accessed: " + accessed);
String info;
 Integer c=(Integer)session.getAttribute("c");
if(c==null)
{
c=0; //c=new Integer(0);
info="Welcome First Time";
}
else
{
info="Welcome once again";
c=new Integer(c+1); //c=new Integer(c.intvalue()+1);
}
session.setAttribute("c",c);
out.println("<h2>"+info+"</h2>");
out.println("<h2>no of time previous acces"+c+"</h2>");
out.close();
 } //doget
}//class
