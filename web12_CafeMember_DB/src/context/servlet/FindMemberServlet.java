package context.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import context.model.MemberDAO;
import context.model.MemberVO;


public class FindMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
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
		
		try {
			MemberVO rvo = MemberDAO.getInstance().findByIdMember(id);
			if(rvo!= null) out.println(id+"에 해당하는 정보 출력 : "+rvo);
			else out.println(id+" 라는 사람 없어요!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
