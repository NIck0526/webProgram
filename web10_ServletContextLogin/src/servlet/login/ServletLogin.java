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
		
		LoginVO vo = new LoginVO(userNumber, userId, userPass);//�ڹٴ� �츮�� �����Ѵ�. ������ �ƴ�
		
		//ServletContet�� ���ε�
		cont.setAttribute("vo", vo);
		
		out.println("<html><body bgcolor=green>");
		out.println("<b> ServletContext�� ���ε� �Ǿ����ϴ�...</b>");
		
	
		//���� �������� ����...<A>
		out.println("<a href='LoginContext'>List�ҷ�����</a>");
		
	}

}















