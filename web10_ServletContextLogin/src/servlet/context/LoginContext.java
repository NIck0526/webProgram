package servlet.context;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.login.LoginVO;


public class LoginContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private ServletContext cont;
	 private LoginVO vo;
	 private ArrayList<LoginVO> list = new ArrayList<LoginVO>();

	@Override
	public void init() throws ServletException {
		
		cont = getServletContext();
		 System.out.println("ServletCOntext...returning...");
		 System.out.println("Context Path :: "+cont.getContextPath());
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		list = (ArrayList)cont.getAttribute("list");
		String number = request.getParameter("userNumber");
		String id = request.getParameter("userId");
		String pass = request.getParameter("userPass");
		 
		
		if(list.contains(id) && ( pass.equals(request.getParameter("id")) ) ) { // if�� ������ �Ȱ�
			out.println("�α��� ����");
		} else {
			out.println("�α��� ����:<a href='http://localhost:8888/web10_ServletContextLogin/login.html'>���ư���</a>");
		}
	}
	
	

}




/* = (LoginVO)cont.getAttribute("vo");
out.println("Context�ȿ� ���ε� �� ����Ÿ �Դϴ�...<br>");

out.println(vo.getUserNumber()+"<br>");
out.println(vo.getUserId()+"<br>");
out.println(vo.getUserPass());*/