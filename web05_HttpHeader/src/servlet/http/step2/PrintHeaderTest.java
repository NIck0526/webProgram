package servlet.http.step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintHeaderTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body bgcolor='yellow'>");
		out.println("<h2>Header Information Print.....</h2><p>");
		
		/*
		 * HttpServletRequest��ü �ȿ� �ִ� ��� �߿���
		 * Header �� ������ ��� �����ͼ� ����Ҽ� �ִ� ����� ��� ������ �ۼ�..
		 */
		Enumeration<String> en=request.getHeaderNames();
		while(en.hasMoreElements()) {
			String name = en.nextElement();
			String value = request.getHeader(name);
			out.println(name+"  :  "+value+"<br>");
		}
		///////////////////////////////////////////////////////////
		
		out.println("<hr><p>");
		String name = request.getParameter("myName");
		out.println("����� �̸��� "+name);
		out.println("</body></html>");
		out.close();
	}
}











