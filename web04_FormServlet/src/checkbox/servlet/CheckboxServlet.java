package checkbox.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		String kisu = request.getParameter("kisu");
		String gender = request.getParameter("gender");
		
		String [] menu = request.getParameterValues("menu");
		
		out.println("<html><body bgcolor='green'>");
		out.println("<h3>다음은 "+kisu+" 기 "+gender+"성 들이 좋아하는 메뉴입니다. ");
		out.println("</h3><p>");
		for(String str : menu) {
			out.println("<li>"+str+"</li>");
		}
		out.println("</body></html>");
		out.close();
		
	}

}
