package servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class FirstSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		//1. session�� �ϳ� �޾ƿ´�.
		//  �ַܼ� Jsessionid ���� ���
		
		HttpSession session = request.getSession(true);
		System.out.println("JSESSIONID :: "+session.getId());
		
		//2. ������ ���� ���� kosta�� ġ��.. �� ���� ���ǿ� ����
		
		session.setAttribute("name", "kosta");
		
		//3. �������� forwarding������� �̵�... Second�� �̵�
		
		request.getRequestDispatcher("Second").forward(request, response);
		
	}

}
