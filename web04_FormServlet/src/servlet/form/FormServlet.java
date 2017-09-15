package servlet.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 방향성을 고려해서 기능들을 다시 떠올려 봅니다.
		//setCharacterEncoding("utf-8")
		
		response.setContentType("text/html; charset=utf-8"); //당신의이름은
		//request.setCharacterEncoding("utf-8");//name , address
		
		//1. PrintWriter를 리턴받음
		PrintWriter out = response.getWriter();
				
		
		//2. 폼에 입력된 값을 받아온다...2개
		
		String name = request.getParameter("name");
		String add = request.getParameter("address");
		
		//3. 받아온 값을 웹브라우저로 출력한다. // Servlet 수정시 다시 서버 접속해야함
		out.println("<html><body><h2>");
		out.println("당신의 이름은 "+name+"<br>");
		out.println("당신이 사는 곳은 "+add);	
		out.println("</h2></body></html>");
		out.close();
			/*
			 * 당신의 이름은 코스타
			 * 당신이 사는 곳은 판교
			 */
	}

}
