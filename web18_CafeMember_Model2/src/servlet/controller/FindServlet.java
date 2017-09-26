package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.MemberVO;
public class FindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	//find_action.jsp
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String path = "find_fail.jsp";
		try {
			MemberVO vo =MemberDAO.getInstance().findMemberById(id);
			if(vo!=null) {
				request.setAttribute("mvo",vo);
				path="find_ok.jsp";
			}
		}catch(SQLException e){
			
		}
		
		request.getRequestDispatcher(path).forward(request, response); // 반복을 피하기 위해 path를 이용
	}

}















