package servlet.context;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ServletContext에 바인딩 된 내용을 받아와서
 * 브라우저로 출력
 */

public class ServletContextReading extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  private HashMap userList;
	  private ServletContext cont;
       
	@Override
	public void init() throws ServletException {
		 cont = getServletContext();
		  // userList = new HashMap(); 이 서블릿은 받아오는것이라서 HashMap이 필요 없음
		 System.out.println("ServletCOntext...returning...");
		 System.out.println("Context Path :: "+cont.getContextPath());
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		userList = (HashMap)cont.getAttribute("userList");
		
		out.println("Context안에 바인딩 된 데이타 입니다...<br>");
		Set<String> set = userList.keySet();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String name = it.next();
			String value = (String)userList.get(name);
			out.println(name+" : "+value+"<br>");
		}
		
		
		
		
		
	}

}
