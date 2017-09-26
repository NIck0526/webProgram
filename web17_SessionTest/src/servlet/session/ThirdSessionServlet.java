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
		 * 기존 세션을 다시 받아온다
		 * JSESSIONID값을 웹으로 다시 출력
		 * 세션에 바인딩된 데이타가 있다면...세션을 죽인다... 로그아웃
		 * 이때 팝업창을 띄워서 "로그아웃 하셨습니다" 라는 메세지가 뜨게...
		 * 네비게이션...session.html
		 */
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		
		out.println("JSESSIONTID VALUE :: Thrid Servlet "+session.getId());
		if(session.getAttributeNames()!=null) {
			session.invalidate();
			//세션이 죽으면서 로그아웃된 사실을 popup으로 알리고. 
			//다시 page를 index로 돌린다.
			out.println("<script>");
			out.println("alert('로그 아웃 하셨습니다!!')");
			out.println("location.href='session.html' ");
			out.println("</script>");
		}else {
			response.sendRedirect("session.html");
		}
		
	
	}
}
