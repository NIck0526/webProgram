package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDao;
import model.BoardVO;

public class DeletePostingController implements Controller {

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDao.getInstance().deletePosting(no);
		
		String path = "DispatcherServlet?command=list";  // HandlerMapping 거쳐서 ListController 가기위함.
		
		return new ModelAndView(path,true);
	}

}
