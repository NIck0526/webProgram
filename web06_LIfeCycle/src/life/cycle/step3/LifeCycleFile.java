package life.cycle.step3;
/*
 * file path�� �ҽ��ڵ忡 �״�� �ϵ��ڵ� �Ǿ� �ִ�
 * path���� �޾ƿ��� ��η� client�� ���� ������ �ȵȴ�.
 * �ֳ��ϸ� ��û�ÿ� form�� �Էµ� ���� �޾ƿ� �� �ִµ�
 * ���� path�� �޾ƿ;� �ϴ� ���� init()���� ���;� �ϱ� �����̴�.
 * :
 * ServletCOnfig��ü�� getInitParameter("param-name")�� ���
 * ServletCOnfig��ü�� ����ϸ� ������ web.xml�� ����ϰ�
 * �� ���� �ʱ�ȭ �������� ������ �� �ִ�.
 * �� ���� �ʱ�ȭ ����(init())���� �ҽ��� ������ �� �ִ�.
 * :
 * <servlet>
 * 	<servlet-name>
 * 	<servlet-class>
 *	 	<init-param>
 * 			<param-name> filepath
 * 			<param-value> c:\\filestore\\life\\step2\\count.txt
 *		</init-param>
 *	<load-on-startup>3
 *</servlet>
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleFile
 */
public class LifeCycleFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private int count = 0;
       private String path = "";
	 public LifeCycleFile() {
		 System.out.println("1. Servlet Creating...");
	        
    }
	public void init() throws ServletException {
		System.out.println("1. init() call.....");
		path= getInitParameter("filepath");
		System.out.println(path+"...getInitParameter()...");
		System.out.println("=============================");
		String name = getInitParameter("NAME");
		String email = getInitParameter("E-MAIL");
		System.out.println(name+"<<<<<"+email);
		/*
		 * ������ �ٽ� ���� �ɶ� �� �κ��� ���� ȣ�� ��.
		 * count.txt�� ���� ���� �÷��� �ʵ� �ʱ�ȭ�� ���� ���´�.
		 * ���Ͽ� ���� �� ���� �޾Ƽ� count�� �� �Ҵ�
		 */
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String str = br.readLine();
			//�ʵ忡 �Ҵ�
			count = Integer.parseInt(str);
			System.out.println("���Ͽ��� �о���� count �� :: "+count);
			br.close();
		}catch(Exception e) {
			System.out.println("��Ʈ�� ����");
		}
		
		
	}	
	public void destroy() {
		System.out.println("4. destroy() call.....");
		/*
		 * �ʵ� count�� ����� ���� File(count.txt)�� ����ϴ� ����
		 * 1. path�� �ش��ϴ� File�� ���� ����
		 * 2. mkdirs() �� ����ؼ� File�� ��θ� ���� ����
		 * 3. ��¿� ��Ʈ�� ����..PrintWriter, FileWriter
		 * 4. count�� ������ ���Ϸ� ����Ѵ�.
		 */
		
		File file= new File(path);
		file.getParentFile().mkdirs();{ // ���丮���� ����.
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(file));
			pw.print(+count);
			pw.close();
			System.out.println(path+"count �� ::"+count+"���Ͽ� ���������� ����");
		}catch(IOException e) {
			System.out.println("��¿� ������ �������� ���߽��ϴ�.");
		}
		}
		
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("3. doGet() call...repeat....");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body bgcolor='yellow'>");
		out.println("<h2>LifeCycle Method....Test</h2><p>");
		out.println("<b>Count :: </b>"+ ++count);
		out.println("</body></html>");
		out.close();	
	}

}
