package servlet.http.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HttpServletTest")
public class HttpServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public HttpServletTest() {
        super();
       
    }

    //�⺻ 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	//post����� ���ڴ�... ��� �����Ҷ��� ������..html ���Ͽ��� ����.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���� ������ ���⼭ �ۼ�..
		
		//1.�� �������� �����ϱ� ���ؼ��� PrintWriter ��ü�� �ϳ� ����
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		
		//2.PrintWriter ��ü�� �������� ����ϴ� ���..println()
		out.println("<html><body bgcolor='Green'>");
		//������ ������Դϴ�.. 
		out.println("<h3>������ ������Դϴ�..</h3>");
		out.println("</body></html>");
		out.close();
		
		/*
		 * 1.
		 * Tomcat_Home > webapps > ContextPath(Project) > WEB-INF > classes > servlet >
		 * > http > exam > HttpServletTest.class  ������ ���� ����
		 * 
		 * 2.
		 * ���� restart
		 * 
		 * 3.
		 * �� ������ �ּ�â��
		 * http://127.0.0.1:8888/web01_FirstHttpServlet/HttpServletTest
		 */
		
		
	}

}
