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
	    * userList�� ����
	    * cont�� ���Ϲ޾ƿ�
	    */
	   System.out.println("init() call......");
	  cont = getServletContext();
	  System.out.println("ServletCOntext...returning...");
	  userList = new HashMap();
	  
	  //ServletContext�� getInitParameter()�� �̿��ؼ�
	  //�޾ƿ� ���� �ַܼ� ����
	  System.out.println(getServletContext().getInitParameter("NAME"));
	  System.out.println(getServletContext().getInitParameter("JOB"));
	  System.out.println(getServletContext().getInitParameter("EMAIL"));
   }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*
	 *  �ѱ�ó��..���͸�
	 *  ���� �޴´�. id, password, name
	 *  HashMap�� �߰��Ѵ�. (id, password, name)
	 *    
	 *  HashMap�� ServletCOntext�� ���ε�
	 *  (setAttribute())
	 *  
	 *  html�� ��¹��� �����ϰ� �ۼ�
	 *  a�±׸� ����ؼ� SC2�� ����
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
		out.println("������� ������ ServletContext�� ���ε� �Ǿ����ϴ�...</b>");
		
		out.println("<a href='SC2'>������ ��� ����</a>");
	}

}
