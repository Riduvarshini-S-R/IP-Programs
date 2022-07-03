import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class student extends HttpServlet 	{
String name,rno,dept,college,s1res,s2res,s3res,s4res,s5res,s6res;
int nm,ooad,wt,pcd,ai,aca;
float avg;
// process "get" requests from clients 
public void doGet(HttpServletRequest req,HttpServletResponse res) throws 
IOException,ServletException
{
res.setContentType( "text/html" ); 
PrintWriter pw=res.getWriter();
name=req.getParameter("name");
rno=req.getParameter("rno");
dept=req.getParameter("dept");
college=req.getParameter("college");
nm=Integer.parseInt(req.getParameter("nm"));
ooad=Integer.parseInt(req.getParameter("ooad"));
wt=Integer.parseInt(req.getParameter("wt"));
pcd=Integer.parseInt(req.getParameter("pcd"));
ai=Integer.parseInt(req.getParameter("ai"));
aca=Integer.parseInt(req.getParameter("aca"));
if(nm<50)
s1res="FAIL";
else
s1res="PASS";
if(ooad<50)
s2res="FAIL";
else
s2res="PASS";
if(wt<50)
s3res="FAIL";
else
s3res="PASS";
if(pcd<50)
s4res="FAIL";
else
s4res="PASS";
if(ai<50)
s5res="FAIL";
else
s5res="PASS";
if(aca<50)
s6res="FAIL";
else
s6res="PASS";
avg=(nm+ooad+wt+pcd+ai+aca)/6;
pw.println("<html><title>student details</title><head></head>");
pw.println("<body>");
pw.println("<h1>STUDENT DETAILS IN JAVA SERVLET<h1>");
pw.println("<table >" );
pw.println("<tr><td> Your Name :</td><td>"+name+" </td></tr>");
pw.println("<tr><td>Register Number:</td><td>"+rno+"</td></tr>");
pw.println("<tr><td>Deparment :</td><td>"+dept+"</td></tr>");
pw.println("<tr><td>College Name :</td><td>"+college+"</td></tr>");
pw.println("<tr><td>Subjects :</td><td>Mark & Result </td></tr>");
pw.println("<tr><td>Numerical Method :</td><td>"+nm+s1res+"</td></tr>");
pw.println("<tr><td>Object Oriented Analysis and Design :</td><td>"+ooad+s2res+"</td></tr>");
pw.println("<tr><td>Web Technology :</td><td>"+wt+s3res+"</td></tr>");
pw.println("<tr><td>Principles of Compiler Design:</td><td>"+pcd+s4res+"</td></tr>");
pw.println("<tr><td>Artificial Intelligence :</td><td>"+ai+s5res+"</td></tr>");
pw.println("<tr><td>Advance Computer Architecture :</td><td>"+aca+s6res+"</td></tr>");
pw.println("<tr><td>Average :</td><td>"+avg+"</td></tr>");
pw.println("</table></body>" );
pw.println("</html>" );
pw.close(); // close stream to complete the page
}
}
