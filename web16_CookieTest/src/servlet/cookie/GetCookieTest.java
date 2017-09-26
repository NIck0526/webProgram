package servlet.cookie;
/*
 * �ι�° ���� ������
 * ::
 * 1. �������� ���� �� ��� ��Ű�� �� �޾ƿ´�..
 * 	Cookie [ ] cs = request.getCookies();
 * 2. for���� ���鼭 ���� ã�����ϴ� ��Ű�� �̸��� �ش��ϴ�
 * 	  value���� ã�Ƽ� ������ ���
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCookieTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<h2>SetCookieTest...Finding cookie information</h2><p>");
		
		Cookie[] cs = request.getCookies();
		
		for( Cookie c : cs)
			out.println(c.getName()+"--------"+c.getValue()+"<br>");
		
	
		
		
	}

}
