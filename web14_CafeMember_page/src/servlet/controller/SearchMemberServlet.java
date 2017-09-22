package servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import context.model.MemberDAO;
import context.model.MemberVO;

public class SearchMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		
		MemberDAO dao = MemberDAO.getInstance();
		
		try {
			MemberVO rvo = dao.findByIdMember(id); // rvo, pvo vo의 표시기법 (pvo 파라미터로 받은)
			
			request.setAttribute("vo", rvo); // 바인딩
			
			out.println("<h2>RequestDispatcher...Getting...</h2><p>");
		
			RequestDispatcher rdp = request.getRequestDispatcher("ShowFindMember.jsp");
		
			rdp.forward(request, response); 
		
		
			
			out.println("<p><h1>FORWARD...</h1>");
			out.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
