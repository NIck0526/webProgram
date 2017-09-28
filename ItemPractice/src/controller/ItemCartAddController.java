package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Item;
import model.ItemDao;

public class ItemCartAddController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int itemnumber = Integer.parseInt(request.getParameter("itemnumber"));
		Item item = ItemDao.getInstance().getItem(itemnumber);
		
		return null;
	}

}
