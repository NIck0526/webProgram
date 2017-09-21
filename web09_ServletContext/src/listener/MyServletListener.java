package listener;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;



/*
 * ServletContextEvent를 감지하는 리스너
 * ServletContextEvent는 ServletContext에 어떤 값으로 초기화가
 * 진행되었을때 이를 하나의 사건으로 감지하고 이벤트를 발생
 * ::
 * '어떤 값으로 초기화'
 * getInitParameter("param-name")값을 끌어당길때...dd파일에 등록
 * ::
 * 이벤트를 감지하는 리스너
 * ServletContextListener임.
 * 이벤트가 발생하면
 * contextInitialized(sce) --> 여기에 getInitparameter()를 사용
 * contextdestroyed(sce)
 */
public class MyServletListener implements ServletContextListener {
	private ServletContext cont;
	
		@Override
		public void contextDestroyed(ServletContextEvent sce) {
			System.out.println("contextDestroyed()...call");
			
		}
		
		@Override
		public void contextInitialized(ServletContextEvent sce) {
			System.out.println("contextInitialized...call");
			
				/*
				 * ServletContext를 하나 리턴받음
				 * String fileName = getInitParameter()를 이용해서 값을 받아오자
				 */
			cont = sce.getServletContext();
			String fileName = cont.getInitParameter("userFile");
		
			System.out.println("fileName ::"+fileName);
			
			InputStream is = null;
			BufferedReader br = null;
			try {
				System.out.println("getResourceAsStream()...call..");
				is = cont.getResourceAsStream(fileName);
				
				br = new BufferedReader(new InputStreamReader(is));
				String line = null;
				System.out.println("파일의 내용을 읽어들입니다...");
				while((line=br.readLine())!=null) {
					System.out.println(line);
				}
			}catch(Exception e) {
				System.out.println("파일을 읽어오지 못했습니다....");
			}
		}
}
