package choice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ChoiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//�ѱ�ó���� �����غ���..
		
		/*	response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");*/
		
		
		PrintWriter out = response.getWriter();
		
		String [] dog = request.getParameterValues("dog");
		//�޾ƿ� ����(�̹���) ���̺� �������� ������ ���
		
		out.println("<html><body bgcolor='green'>");
		out.println("<h2 align='center><font color='yellow'>������ �ʰ� �����ϴ� �������Դϴ�. </h2>");
		out.println("<table align='center' bgcolor='yellow' width='80%'>");
		out.println("<tr>");
		
		//������ �̹����� ������... td�� ������...
		for(int i=0; i<dog.length; i++) {
			out.println("<td>");
			out.println("<img src='"+dog[i]+"'/>");
			out.println("</td>");
		}//
		out.println("</body></html>");
		out.close();
		
	}
}
