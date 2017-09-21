package context.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import context.model.MemberDAO;
import context.model.MemberVO;


public class RegisterMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		doProcess(request, response);
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1. PrintWriter 리턴받고
		 * 2. 폼값 받아서
		 * 3. VO생성
		 * 4. DAO리턴 받아서
		 * try{
		  		5. 비지니스 로직 호출... 이때 VO를 인자값으로 넣는다.
		  		dao.registerMember(vo);
		  		out.println(vo.getName()+"님이 가입");
		  }catch{
		  		out.println(vo.getName()+"님이 가입 ㄴㄴ");
		  }
		 */
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
		MemberVO vo = new MemberVO(id, password, name, address);
		
		try {
		MemberDAO.getInstance().registerMember(vo);
		out.println(name+" 님이 cafe 가입 성공!!");
		}catch(Exception e) {
		out.println(name+" 님 가입 불가 관리자에 문의하세요.");
		}
		
		
	}

}
