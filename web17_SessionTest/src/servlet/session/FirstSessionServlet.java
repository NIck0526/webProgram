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
		
		//1. session을 하나 받아온다.
		//  콘솔로 Jsessionid 값을 출력
		
		HttpSession session = request.getSession(true);
		System.out.println("JSESSIONID :: "+session.getId());
		
		//2. 폼에서 받은 값이 kosta라 치고.. 이 값을 세션에 저장
		
		session.setAttribute("name", "kosta");
		
		//3. 페이지를 forwarding방법으로 이동... Second로 이동
		
		request.getRequestDispatcher("Second").forward(request, response);
		
	}

}
