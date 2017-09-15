package servlet.anno.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 *  <servlet>
 * 		<servlet-name>HttpServletAnnoTest</servlet-name>
 * 	<servlet-class>servlet.anno.test.HttpServletAnnoTest</servlet-class>
 *  </servlet>
 *  <servlet-mapping>
 *  	<servlet-name>HttpServletAnnoTest</servlet-name>
 *  	<url-pattern>/Anno</url-pattern>
 *  </servlet-mapping>
 */
@WebServlet("/Anno")
public class HttpServletAnnoTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Servelt...");
	}

}
