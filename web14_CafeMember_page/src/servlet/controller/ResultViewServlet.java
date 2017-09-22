package servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import context.model.MemberVO;


public class ResultViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		MemberVO vo = (MemberVO)request.getAttribute("vo");
		
		out.println("<h2>���� ������ �ش��ϴ� id�� ���� ����Դϴ�...</h2><p>");
		out.println("ID : "+vo.getId()+"<br>");
		out.println("NAME : "+vo.getName()+"<br>");
		out.println("ADDRESS : "+vo.getAddress()+"<br>");
		
		out.close();
	}

}
