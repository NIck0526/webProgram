package servlet.context;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextWriting extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap userList;
    private ServletContext cont;
   @Override
	public void init() throws ServletException{
	   /*
	    * userList를 생성
	    * cont를 리턴받아옴
	    */
	   System.out.println("init() call......");
	  cont = getServletContext();
	  System.out.println("ServletCOntext...returning...");
	  userList = new HashMap();
	  
	  //ServletContext의 getInitParameter()를 이용해서
	  //받아온 값을 콘솔로 추적
	  System.out.println(getServletContext().getInitParameter("NAME"));
	  System.out.println(getServletContext().getInitParameter("JOB"));
	  System.out.println(getServletContext().getInitParameter("EMAIL"));
   }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*
	 *  한글처리..필터링
	 *  폼값 받는다. id, password, name
	 *  HashMap에 추가한다. (id, password, name)
	 *    
	 *  HashMap을 ServletCOntext에 바인딩
	 *  (setAttribute())
	 *  
	 *  html로 출력문을 간단하게 작성
	 *  a태그를 사용해서 SC2로 연결
	 *  
	 */
		
		PrintWriter out = response.getWriter();

		String userId = request.getParameter("userId");
		String userPass = request.getParameter("userPass");
		String userName = request.getParameter("userName");
		
		userList.put("userId", userId);
		userList.put("userPass", userPass);
		userList.put("userName", userName);
		
		cont.setAttribute("userList", userList);
		out.println("<html><body bgcolor=pink>");
		out.println("<b>================= The Communication Servlets ===========================");
		out.println("사용자의 정보가 ServletContext에 바인딩 되었습니다...</b>");
		
		out.println("<a href='SC2'>접속자 명단 보기</a>");
	}

}
