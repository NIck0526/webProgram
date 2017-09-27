package servlet.front;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pattern.controller.Product;
import pattern.controller.ProductFactory;


public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로직은 여기서 작성.. filter를 가져온다 .. dd수정
		String command = request.getParameter("command");
		String path = "error.jsp";
		
		Product product = ProductFactory.getFactory().createProduct(command);
		
		try {
			path = product.execute(request, response);
		}catch(Exception e){
			
		}//
		request.getRequestDispatcher(path).forward(request, response);
		
	}

}






