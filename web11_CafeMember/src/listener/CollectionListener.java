package listener;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import servlet.vo.PersonVO;

public class CollectionListener implements ServletContextListener {

	
		@Override
		public void contextInitialized(ServletContextEvent sce) {
			System.out.println("1.contetInitialized...CollectionListener..");
			ArrayList<PersonVO> list = new ArrayList<PersonVO>();
			sce.getServletContext().setAttribute("list", list);
			System.out.println("2.ArrayList Binding..");
		}
	
		@Override
		public void contextDestroyed(ServletContextEvent sce) {
			// TODO Auto-generated method stub
			
		}
}
