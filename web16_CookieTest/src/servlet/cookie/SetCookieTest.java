package servlet.cookie;
/*
 * �������� ù��° ���� ������
 * ::
 * 1.Cookie ����	
 * 	--> Cookie c = new Cookie("key","value");
 * 2 ���������� ����
 * 	--> response.addCookie(c);
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SetCookieTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//1
		Date now = new Date(); // now�� ��Ű������ ����.. ��Ű�� ������ �ð��� �� �� ���� ������?
		String id = "KOSTA";
		
		//2
		Cookie c1 = new Cookie("now",now+""); // now+"" ��Ʈ���ϰ� ������ ��Ʈ������ ����Ʈ
		Cookie c2 = new Cookie("id", id);
		
		//3
		c1.setMaxAge(24*60*60); // �Ϸ�� ����...
		c2.setMaxAge(0); // ��Ű�� ��� ���ϴ� ���� �� ���̴�.
		
		//4
		response.addCookie(c1);
		response.addCookie(c2);
		out.println("<h2>��Ű�� ������ ������ �ð� ::"+now+"<br>");
		out.println("ID ::"+id+"<br>");
		out.println("<a href='GetCookieTest'>GetCookieTest GOGO...</a>");
		
	}

}
	

