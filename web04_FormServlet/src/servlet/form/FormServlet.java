package servlet.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���⼺�� ����ؼ� ��ɵ��� �ٽ� ���÷� ���ϴ�.
		//setCharacterEncoding("utf-8")
		
		response.setContentType("text/html; charset=utf-8"); //������̸���
		//request.setCharacterEncoding("utf-8");//name , address
		
		//1. PrintWriter�� ���Ϲ���
		PrintWriter out = response.getWriter();
				
		
		//2. ���� �Էµ� ���� �޾ƿ´�...2��
		
		String name = request.getParameter("name");
		String add = request.getParameter("address");
		
		//3. �޾ƿ� ���� ���������� ����Ѵ�. // Servlet ������ �ٽ� ���� �����ؾ���
		out.println("<html><body><h2>");
		out.println("����� �̸��� "+name+"<br>");
		out.println("����� ��� ���� "+add);	
		out.println("</h2></body></html>");
		out.close();
			/*
			 * ����� �̸��� �ڽ�Ÿ
			 * ����� ��� ���� �Ǳ�
			 */
	}

}
