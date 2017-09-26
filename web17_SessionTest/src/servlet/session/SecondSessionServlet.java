package servlet.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SecondSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		if(session.getAttribute("name")!=null) {
				String name = (String)session.getAttribute("name");
				out.println("SESSION BINDING NAME ::"+name+"<br>");
				out.println("JSESSIONTID VALUE :: "+session.getId());
				out.println("<hr>");
				out.println("<a href='Third'>ThirdSessionServlet GOGO </a>");
		}		
		/*
		 * ������ ������� ������ �̾ ����Ѵ�.(�޾ƿ´�)
		 * �̶� ���ǿ� ���ε��� ���� null�� �ƴ϶��,
		 * �� ���� ã�ƿͼ�
		 * ���(�̶� ��, jsessionid)
		 * ������ �̵�...a�±׷� �̵�.. Third�� �̵�
		 * 
		 */
		
	}

}
