package listener.login;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import vo.login.LoginVO;


public class LoginListener implements ServletContextListener {
	private ServletContext cont;
	private ArrayList<LoginVO> list = new ArrayList<LoginVO>();
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("contextDestroyed...call");		
    }
    
    
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("contextInitialized...call");		
		cont=sce.getServletContext();
		String fileName = cont.getInitParameter("userFile");
		
		System.out.println("fileName : " + fileName);
		InputStream is = null;
		BufferedReader br = null;
		LoginVO data = null;
		
		
		try {
			is = cont.getResourceAsStream(fileName);
			br = new BufferedReader(new InputStreamReader(is));
			String line = null;
			while( ( line = br.readLine() ) != null) {
				//System.out.println(line);
				String[] s = line.split("|");
				String num = s[0].trim();
				String id = s[1].trim();
				String pass = s[2].trim();
				//data.put(id, pass);
				//date = new LoginVO(userNumber, userId, userPass);
				data = new LoginVO(num, id,pass);
				list.add(data);
			}//while
			} catch(Exception e){
			System.out.println("파일 못읽음..");
			}//catch
		System.out.println(list);
		
		
		cont.setAttribute("list", list);
		
    }
	
}
