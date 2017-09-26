package servlet.cookie;
/*
 * 두번째 서블릿 페이지
 * ::
 * 1. 브라우저에 저장 된 모든 쿠키를 다 받아온다..
 * 	Cookie [ ] cs = request.getCookies();
 * 2. for문을 돌면서 내가 찾고자하는 쿠키의 이름에 해당하는
 * 	  value값을 찾아서 웹으로 출력
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
