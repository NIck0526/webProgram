package servlet.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import context.model.MemberDAO;
import context.model.MemberVO;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberVO user;
	   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		HttpSession session = request.getSession(true);
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		try {
			user = MemberDAO.getInstance().login("id", "password");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		session.setAttribute("user", user);
		
		if(user!=null) {
			request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
		}else{
			out.println("alert('ID 또는 password가 일치하지 않습니다.')");
		}
		
		
		
		
	}
		
	
}
