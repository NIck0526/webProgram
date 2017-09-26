package servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ThirdSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * ���� ������ �ٽ� �޾ƿ´�
		 * JSESSIONID���� ������ �ٽ� ���
		 * ���ǿ� ���ε��� ����Ÿ�� �ִٸ�...������ ���δ�... �α׾ƿ�
		 * �̶� �˾�â�� ����� "�α׾ƿ� �ϼ̽��ϴ�" ��� �޼����� �߰�...
		 * �׺���̼�...session.html
		 */
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		
		out.println("JSESSIONTID VALUE :: Thrid Servlet "+session.getId());
		if(session.getAttributeNames()!=null) {
			session.invalidate();
			//������ �����鼭 �α׾ƿ��� ����� popup���� �˸���. 
			//�ٽ� page�� index�� ������.
			out.println("<script>");
			out.println("alert('�α� �ƿ� �ϼ̽��ϴ�!!')");
			out.println("location.href='session.html' ");
			out.println("</script>");
		}else {
			response.sendRedirect("session.html");
		}
		
	
	}
}
