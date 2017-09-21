package servlet.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.login.LoginVO;

public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	  private ServletContext cont;
	  
	  @Override
	public void init() throws ServletException {
		  System.out.println("init() call......");
		  cont = getServletContext();
		  System.out.println("ServletCOntext...returning...");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String userNumber = request.getParameter("userNumber");
		String userId = request.getParameter("userId");
		String userPass = request.getParameter("userPass");
		
		LoginVO vo = new LoginVO(userNumber, userId, userPass);//자바는 우리가 생성한다. 서블릿이 아님
		
		//ServletContet에 바인딩
		cont.setAttribute("vo", vo);
		
		out.println("<html><body bgcolor=green>");
		out.println("<b> ServletContext에 바인딩 되었습니다...</b>");
		
	
		//다음 서블릿으로 연결...<A>
		out.println("<a href='LoginContext'>List불러오기</a>");
		
	}

}















