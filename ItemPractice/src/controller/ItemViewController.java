package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Item;
import model.ItemDao;

public class ItemViewController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int itemnumber = Integer.parseInt(request.getParameter("itemnumber"));
		
		boolean result = ItemDao.getInstance().updateRecordCount(itemnumber);
		
		Item item = ItemDao.getInstance().getItem(itemnumber);
		
		request.setAttribute("item",item);
		ModelAndView mv = new ModelAndView();
		mv.setUri("itemView.jsp");
		
		return mv;
	}


}
