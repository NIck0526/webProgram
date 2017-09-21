package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DriverLoadingListener implements ServletContextListener {

		
	@Override
	public void contextInitialized(ServletContextEvent sce) {
			System.out.println("1.Driver Loading...");
			String driver = sce.getServletContext().getInitParameter("ODriver");
			
			try {
				Class.forName(driver);
				System.out.println("DriverLoading...Success!!!");
			} catch (Exception e) {
				System.out.println("DriverLoading...Fail!!!");
			}
			
		
	}
	
	
	@Override
		public void contextDestroyed(ServletContextEvent sce) {
			// TODO Auto-generated method stub
			
		}
		
}
