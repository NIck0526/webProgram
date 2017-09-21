package servlet.context;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.vo.PersonVO;


public class EntranceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ServletContext cont;
	private ArrayList<PersonVO> list = new ArrayList<PersonVO>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		System.out.println("1. 폼으로부터 값 받아옴..");

		PersonVO vo = new PersonVO(name,age);
		
		System.out.println("2. 폼으로부터 받은 값으로 VO생성...");
		
		list.add(vo);
		
		cont = getServletContext();//Config의 기능으로부터 ServletContext를 받아온다.
		cont.setAttribute("list", list);
		System.out.println("3. Attribute에 바인딩..");
		
		
		
		//네비게이션
		
		out.println(name+" 님이 카페에 가입하셨습니다..<br>");
		out.println("<a href=ViewServlet?name="+name+"> 회원명단 보러가기</a>");
		
		
		out.close();
	}

}
