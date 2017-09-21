package listener;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;



/*
 * ServletContextEvent�� �����ϴ� ������
 * ServletContextEvent�� ServletContext�� � ������ �ʱ�ȭ��
 * ����Ǿ����� �̸� �ϳ��� ������� �����ϰ� �̺�Ʈ�� �߻�
 * ::
 * '� ������ �ʱ�ȭ'
 * getInitParameter("param-name")���� �����涧...dd���Ͽ� ���
 * ::
 * �̺�Ʈ�� �����ϴ� ������
 * ServletContextListener��.
 * �̺�Ʈ�� �߻��ϸ�
 * contextInitialized(sce) --> ���⿡ getInitparameter()�� ���
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
				 * ServletContext�� �ϳ� ���Ϲ���
				 * String fileName = getInitParameter()�� �̿��ؼ� ���� �޾ƿ���
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
				System.out.println("������ ������ �о���Դϴ�...");
				while((line=br.readLine())!=null) {
					System.out.println(line);
				}
			}catch(Exception e) {
				System.out.println("������ �о���� ���߽��ϴ�....");
			}
		}
}
