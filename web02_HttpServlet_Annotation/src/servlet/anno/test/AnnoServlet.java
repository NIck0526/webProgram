package servlet.anno.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description = "서블릿 3.0버전을 이용해서 작성", urlPatterns = { "/Anno" })
public class AnnoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public AnnoServlet() {
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<b>Annotation Servlet....</b>");
	}

}
