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
		 * �ѱ�ó��.. �����
		 * PrintWriter ���� �ް�
		 * ���� �Էµ� ��� ���� �ѹ��� �޾Ƽ� :: getParameter() ���� getParameterNames() ���
		 * ���������� ���
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
