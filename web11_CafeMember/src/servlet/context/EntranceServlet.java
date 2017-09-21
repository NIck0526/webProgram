package servlet.context;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.vo.PersonVO;


public class EntranceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ServletContext cont;
	private ArrayList<PersonVO> list = new ArrayList<PersonVO>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
		System.out.println("1. �����κ��� �� �޾ƿ�..");

		PersonVO vo = new PersonVO(name,age);
		
		System.out.println("2. �����κ��� ���� ������ VO����...");
		
		list.add(vo);
		
		cont = getServletContext();//Config�� ������κ��� ServletContext�� �޾ƿ´�.
		cont.setAttribute("list", list);
		System.out.println("3. Attribute�� ���ε�..");
		
		
		
		//�׺���̼�
		
		out.println(name+" ���� ī�信 �����ϼ̽��ϴ�..<br>");
		out.println("<a href=ViewServlet?name="+name+"> ȸ����� ��������</a>");
		
		
		out.close();
	}

}
