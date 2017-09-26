package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
public class IdcheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	//��������� idcheck.jsp �� ������.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		try{
			boolean flag =MemberDAO.getInstance().isExist(id);
			request.setAttribute("flag", flag);
			request.getRequestDispatcher("idcheck.jsp").forward(request, response); // Forwarding ��� �̶��!!!!!!!!
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}













