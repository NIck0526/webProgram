package form.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MultiFormServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       //한글 처리는 생략... Filter를 사용함
	
	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		out.println("<h2>다음은 폼에 입력된 값들입니다.</h2>");
		//폼에 입력된 값 받아오는 서블릿의 기능...getParameter("폼이름")
		String id = request.getParameter("id");
		String password = request.getParameter("pass");
		String gender = request.getParameter("gender");
		String tel = request.getParameter("tel");
		String command = request.getParameter("command");
		String intro = request.getParameter("intro");
		
		out.println("<li> ID:"+id+"</li><br>");
		out.println("<li> PASSWORD:"+password+"</li><br>");
		out.println("<li> GENDER:"+gender+"</li><br>");
		out.println("<li> TEL:"+tel+"</li><br>");
		out.println("<li> COMMAND:"+command+"</li><br>");
		out.println("<li> INTRO:"+intro+"</li><br>");
		
		//checkbox 폼일 경우에는 getParameterValues()를 사용한다.
		String [] hobbies = request.getParameterValues("hobby");
		if(hobbies!=null) {
			for(String str : hobbies) {
				out.println(str+"<br>");
				System.out.println("당신의 취미는 ::" + str);
			}//for
		}//if
		
	}

}
