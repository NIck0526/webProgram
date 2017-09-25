package context.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import context.model.MemberDAO;
import context.model.MemberVO;

public class AllServletMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1. dao 리턴 받고
		 * 2. getAllMember() 호출하면....ArrayList가 리턴
		 * 3. 바인딩
		 * 4. 페이지 이동....showAllMember.jsp
		 * 
		 */
		PrintWriter out = response.getWriter();
		
		MemberDAO dao = MemberDAO.getInstance();
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
		//바인딩

		request.setAttribute("list", list);
	
		
		response.sendRedirect("showAllMember.jsp");
		out.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
