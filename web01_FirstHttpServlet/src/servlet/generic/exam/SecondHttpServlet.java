package servlet.generic.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description = "HttpServlet을 상속받아서 작성", urlPatterns = { "/Second" })
public class SecondHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SecondHttpServlet() {
    
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter()	;
		out.println("<html><body bgcolor='pink'>");
		out.println("Hello SecondServlet~~~~~~~!!!");
		out.println("</body></html>");
		
		out.close();
	}

}
