package servlet.generic.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstGenericServlet extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor='yellow'>");
		out.println("<h2>Hello GenericsServlet!!!~~~~~~~~~~~~~~~</h2>");
		out.println("</body></html>");
		
		out.close();
	}

}