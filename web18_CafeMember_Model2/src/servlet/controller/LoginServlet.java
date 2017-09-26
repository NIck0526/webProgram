package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberDAO;
import model.MemberVO;
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	//login_ok | login.fail 로 돌린다.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String path = "index.jsp";
		try{
			MemberVO vo = MemberDAO.getInstance().login(id, password);
			if(vo!=null) {
				HttpSession session = request.getSession();
				session.setAttribute("mvo", vo);//login_ok.jsp
				path = "login_ok.jsp";
			}else {//login_fail.jsp
				path="login_fail.jsp";
			}
			/*
			 * session 받아와서
			 * 바인딩
			 * 네비게이션
			 */
		}catch(SQLException e){
			e.printStackTrace();
		}
		request.getRequestDispatcher(path).forward(request, response); // 반복을 피하기 위해 path를 이용
	}
}














