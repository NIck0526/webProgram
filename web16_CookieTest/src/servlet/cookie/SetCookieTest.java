package servlet.cookie;
/*
 * 서버상의 첫번째 서블릿 페이지
 * ::
 * 1.Cookie 생성	
 * 	--> Cookie c = new Cookie("key","value");
 * 2 웹브라우저로 보냄
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
		Date now = new Date(); // now를 쿠키값으로 설정.. 쿠키가 생성된 시각을 알 수 있지 않을까?
		String id = "KOSTA";
		
		//2
		Cookie c1 = new Cookie("now",now+""); // now+"" 스트링하고 붙으면 스트링으로 컨버트
		Cookie c2 = new Cookie("id", id);
		
		//3
		c1.setMaxAge(24*60*60); // 하루로 지정...
		c2.setMaxAge(0); // 쿠키를 사용 못하는 꼴이 될 것이다.
		
		//4
		response.addCookie(c1);
		response.addCookie(c2);
		out.println("<h2>쿠키가 생성된 시점의 시각 ::"+now+"<br>");
		out.println("ID ::"+id+"<br>");
		out.println("<a href='GetCookieTest'>GetCookieTest GOGO...</a>");
		
	}

}
	

