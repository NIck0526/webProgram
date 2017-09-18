package form.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SelectServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 한글처리.. 양방향
		 * PrintWriter 리턴 받고
		 * 폼에 입력된 모든 값을 한번에 받아서 :: getParameter() 말고 getParameterNames() 사용
		 * 웹브라우저로 출력
 		 */
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		Enumeration<String> all = request.getParameterNames();
		while(all.hasMoreElements()){
			String name= all.nextElement();
			String value = request.getParameter(name);
			out.println("<li>"+name+" :: "+value+"</li><br>");
		}
				
	}


	private void While(boolean hasMoreElements) {
		// TODO Auto-generated method stub
		
	}

}
