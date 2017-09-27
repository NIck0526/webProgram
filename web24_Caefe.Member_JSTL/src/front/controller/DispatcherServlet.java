package front.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberDAO;
import model.MemberVO;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberDAO dao=MemberDAO.getInstance(); //필드로 추가..
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		String path = "error.jsp";
		try {
			if(command.equals("find")){ //예전에 FindServlet이 동작했다.
				path=find(request,response);
			}else if(command.equals("login")){
				path=login(request,response);
			}else if(command.equals("register")){
				path=register(request,response);
			}else if(command.equals("update")){
				path=update(request,response);
			}else if(command.equals("allView")){
				path=allView(request,response);
			}else if(command.equals("logout")){
				path=logout(request,response);
			}else if(command.equals("idcheck")){
				path=idcheck(request,response);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher(path).forward(request, response);
	}
	protected String find(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");		
		
			MemberVO rvo=dao.findMemberById(id);
			if(rvo!=null) {
				request.setAttribute("mvo", rvo);
				return "find_ok.jsp";			
			}else {
				return "find_fail.jsp";	
			}			
	}//find	
	protected String login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String password = request.getParameter("password");				
			MemberVO vo=dao.login(id, password);
			if(vo!=null) {
				HttpSession session=request.getSession();
				session.setAttribute("mvo", vo);//login_ok.jsp
				return "login_ok.jsp";		
			}else { //login_fail.jsp
				return "login_fail.jsp";	
			}
	}//login
	
	
	
	public String register(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String id = request.getParameter("id");
		String password =request.getParameter("password");
		String name = request.getParameter("name");
		String address=  request.getParameter("address");
		
		MemberVO vo = new MemberVO(id, name, password, address);
		dao.registerMember(vo);
		return "register_result.jsp";
	}//register
	
	
	
	
	public String update(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String password =request.getParameter("password");
		String name = request.getParameter("name");
		String address=  request.getParameter("address");
		MemberVO vo  = new MemberVO(id, name, password,address);
		dao.updateMember(vo);
		
		HttpSession session = request.getSession();
		session.setAttribute("mvo", vo);
		return "update_result.jsp";
		
	}//update
	
	
	
	
	public String allView(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<MemberVO> list=dao.getAllMember();
		request.setAttribute("list", list);
		return "allView.jsp";
	}//allview
	
	
	
	public String idcheck(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MemberVO rvo=dao.findMemberById(request.getParameter("id"));
		boolean flag = false;
		if(rvo != null){			
			flag = true;
		}
		request.setAttribute("flag", flag);
		return "idcheck.jsp";
	}//idcheck
	
	
	
	
	public String logout(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		if(session.getAttribute("mvo") != null){
			session.invalidate();		
		}
		return "logout.jsp";
	}//logout
}
















