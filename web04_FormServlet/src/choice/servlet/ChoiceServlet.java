package choice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ChoiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//한글처리는 생략해보자..
		
		/*	response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");*/
		
		
		PrintWriter out = response.getWriter();
		
		String [] dog = request.getParameterValues("dog");
		//받아온 값을(이미지) 테이블 형식으로 웹으로 출력
		
		out.println("<html><body bgcolor='green'>");
		out.println("<h2 align='center><font color='yellow'>다음은 너가 좋아하는 강아지입니다. </h2>");
		out.println("<table align='center' bgcolor='yellow' width='80%'>");
		out.println("<tr>");
		
		//선택한 이미지가 여러개... td가 여러개...
		for(int i=0; i<dog.length; i++) {
			out.println("<td>");
			out.println("<img src='"+dog[i]+"'/>");
			out.println("</td>");
		}//
		out.println("</body></html>");
		out.close();
		
	}
}
