package servlet.http.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HttpServletTest")
public class HttpServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public HttpServletTest() {
        super();
       
    }

    //기본 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	//post방식을 쓰겠다... 라고 지정할때만 구동됨..html 파일에서 지정.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//실제 로직은 여기서 작성..
		
		//1.웹 브라우저로 응답하기 위해서는 PrintWriter 객체를 하나 리턴
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		
		//2.PrintWriter 객체에 브라우저로 출력하는 기능..println()
		out.println("<html><body bgcolor='Green'>");
		//오늘은 목요일입니다.. 
		out.println("<h3>오늘은 목요일입니다..</h3>");
		out.println("</body></html>");
		out.close();
		
		/*
		 * 1.
		 * Tomcat_Home > webapps > ContextPath(Project) > WEB-INF > classes > servlet >
		 * > http > exam > HttpServletTest.class  파일을 직접 배포
		 * 
		 * 2.
		 * 서버 restart
		 * 
		 * 3.
		 * 웹 브라우저 주소창에
		 * http://127.0.0.1:8888/web01_FirstHttpServlet/HttpServletTest
		 */
		
		
	}

}
