package servlet.life.step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int count = 0; //field를 하나 선언..   
  
    public LifeCycleServlet() {     
    	System.out.println("1. Constructor call....::Servlet Creating..by Container!!");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("3. doGet() call......by Container!!");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h2>LifeCycle Method....Test</h2><p>");
		out.println("<b>Count :: </b>"+ ++count);
		out.println("</body></html>");
		out.close();		
	}	
	@Override
	public void init() throws ServletException {
		System.out.println("2. init() call......by Container!!");
	}	
	@Override
	public void destroy() {
		System.out.println("4. destroy() call......by Container!!");
	}
}










