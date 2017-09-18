package life.cycle.step2;

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
       private String path = "c:\\filestore\\life\\step2\\count.txt";
	 public LifeCycleFile() {
		 System.out.println("1. Servlet Creating...");
	        
    }
	public void init(ServletConfig config) throws ServletException {
		System.out.println("1. init() call.....");
		/*
		 * 서버가 다시 가동 될때 이 부분이 먼저 호출 됨.
		 * count.txt에 값을 끌어 올려서 필드 초기화를 시켜 놓는다.
		 * 파일에 저장 된 값을 받아서 count에 재 할당
		 */
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String str = br.readLine();
			//필드에 할당
			count = Integer.parseInt(str);
			System.out.println("파일에서 읽어들인 count 값 :: "+count);
			br.close();
		}catch(Exception e) {
			System.out.println("스트림 실패");
		}
		
		
	}	
	public void destroy() {
		System.out.println("4. destroy() call.....");
		/*
		 * 필드 count에 저장된 값을 File(count.txt)에 출력하는 로직
		 * 1. path에 해당하는 File을 먼저 생성
		 * 2. mkdirs() 를 사용해서 File의 경로를 먼저 생성
		 * 3. 출력용 스트림 생성..PrintWriter, FileWriter
		 * 4. count의 내용을 파일로 출력한다.
		 */
		
		File file= new File(path);
		file.getParentFile().mkdirs();{ // 디렉토리까지 만듬.
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(file));
			pw.print(+count);
			pw.close();
			System.out.println(path+"count 값 ::"+count+"파일에 영구적으로 저장");
		}catch(IOException e) {
			System.out.println("출력용 파일을 생성하지 못했습니다.");
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
