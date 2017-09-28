package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		System.out.println("getRequestURI() :: "+requestURI);
		
		String conTextPath = request.getContextPath();
		System.out.println("getConText() :: "+conTextPath);
		
		String command = requestURI.substring(conTextPath.length());
		System.out.println("command() ::"+command);
		
		ModelAndView mv = null;
		Controller controller = HandlerMapping.getInstance().createController(command);
		
		try {
			mv=controller.handleRequest(request, response);
		}catch(Exception e) {
			
		}
		
		if(mv!=null) {
			if(mv.isRedirect())
				response.sendRedirect(mv.getUri());
			else
				request.getRequestDispatcher(mv.getUri()).forward(request, response);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

}















