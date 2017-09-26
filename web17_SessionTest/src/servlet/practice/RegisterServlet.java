package servlet.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import context.model.MemberDAO;
import context.model.MemberVO;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
    private ArrayList<MemberVO> list = new ArrayList<MemberVO>();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
		MemberVO vo = new MemberVO(id, password, name, address);
		HttpSession session = request.getSession(true);
		try {
			MemberDAO.getInstance().registerMember(vo);
			//out.println(name+" ���� Cafe ���� �����߽��ϴ�!!!");
			
		}catch(Exception e) {
			//out.println(name+" ���� Cafe ���� �����߽��ϴ�!!!");
		}
		
		list.add(vo);
		//request  �� ���ε� �� �� ����.
		//getServletContext().setAttribute("list",list);
		session.setAttribute("list", list);
		response.sendRedirect("RegisterMemberResult.jsp?name="+name);//get����� �Բ� �����..
		
	}	

}




