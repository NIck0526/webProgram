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
    	System.out.println("1. ������ ȣ��...���� ����..");
    		//������ ȣ��� config�� ���������ʾ� init()���� �ؾ���
    }
     
    @Override
    public void init() throws ServletException {
    	
    	/*
    	 * �ϳ��� ������ �ʵ带 �ʱ�ȭ �ϴ� �۾���
    	 * �ַ� init()���� ����ȴ�.
    	 * �����ڿ��� ������ �� ���� ���� ::
    	 * ServletCOnfig ��ü�� �� ���������� �������� �������� �ʾƼ�...
    	 * 	NullPointException�߻�...
    	 * ::
    	 * DD������ ���캸��
    	 * �ϳ��� Ŭ������ ������ Servlet Element�� 3�� �ۼ�
    	 * ��û�Ҷ����� ������ ���� �����Ǳ� ������
    	 * non java����� cgi ���α׷��� �����Ǵ� ��İ� ����� ���� �ִ�.
    	 */
    	
    	System.out.println("2. init() ȣ��...ServletConfig passing into..");
    	greetMessage=getInitParameter("Greet");    // init()�����Ŀ� �ؾ���.
    	
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//������ ���⼭ �ۼ�...
		System.out.println("3. doProcess ȣ��...��û�� ó��...");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("userName");
		out.println("<html><body><h2>Welcome to Cats Musical...</h2><p>");
		out.println("<b>"+name+"....Welcome!!!</b><br>");
		System.out.println("���� �Է��� ����� �̸��� "+name+" �Դϴ�..");
		
		out.println(greetMessage);
		out.close();
	}
}








