package servlet.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MusicalGreetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String greetMessage;
    
     public MusicalGreetServlet() {       
    	System.out.println("1. 생성자 호출...서블릿 생성..");
    		//생성자 호출시 config가 생성되지않아 init()에서 해야함
    }
     
    @Override
    public void init() throws ServletException {
    	
    	/*
    	 * 하나의 서블릿의 필드를 초기화 하는 작업은
    	 * 주로 init()에서 진행된다.
    	 * 생성자에서 진행할 수 없는 이유 ::
    	 * ServletCOnfig 객체가 그 시점에서는 아직까지 생성되지 않아서...
    	 * 	NullPointException발생...
    	 * ::
    	 * DD파일을 살펴보면
    	 * 하나의 클래스를 가지고 Servlet Element를 3개 작성
    	 * 요청할때마다 서블릿이 각각 구동되기 때문에
    	 * non java기반의 cgi 프로그램이 구동되는 방식과 흡사한 점이 있다.
    	 */
    	
    	System.out.println("2. init() 호출...ServletConfig passing into..");
    	greetMessage=getInitParameter("Greet");    // init()생성후에 해야함.
    	
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로직은 여기서 작성...
		System.out.println("3. doProcess 호출...요청을 처리...");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("userName");
		out.println("<html><body><h2>Welcome to Cats Musical...</h2><p>");
		out.println("<b>"+name+"....Welcome!!!</b><br>");
		System.out.println("폼에 입력한 당신의 이름은 "+name+" 입니다..");
		
		out.println(greetMessage);
		out.close();
	}
}








