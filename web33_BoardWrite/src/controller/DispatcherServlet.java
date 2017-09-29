	package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		Controller controller = HandlerMapping.getHandler().createController(command);
		ModelAndView mv = null;
		boolean isRedirect =false;
		try {
			mv = controller.handle(request, response);
			if(!mv.isRedirect())request.getRequestDispatcher(mv.getPath()).forward(request, response); // 질문하기 리다이렉트 안되면 forward로?
			else response.sendRedirect(mv.getPath());
		}catch(Exception e ) {
			
		}
	}
}
