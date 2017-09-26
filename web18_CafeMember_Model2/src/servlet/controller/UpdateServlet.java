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
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    //update_result.jsp 로 돌린다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		MemberVO pvo = new MemberVO(id, name, password, address); // pvo 는 수정한 객체이다.
		try {
				MemberDAO.getInstance().updateMember(pvo);
				
				//이부분 꼭 넣자.. 세션에다가 수정한 객체를 반드시 바인딩 해야한다.
				
				HttpSession session = request.getSession();
				if(session.getAttribute("mvo")!=null) {
					session.setAttribute("mvo", pvo);
				}
				request.getRequestDispatcher("update_resuslt.jsp").forward(request, response);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}











