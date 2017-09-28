package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.util.ModelAndView;
import model.Item;
import model.ItemDao;

public class ItemViewController implements Controller {

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int itemid = Integer.parseInt(request.getParameter("itemnumber"));
		ItemDao.getInstance().updateRecordCount(itemid);
		Item item = ItemDao.getInstance().getItem(itemid);
		request.setAttribute("item", item);
		return new ModelAndView("itemView.jsp");
	}

}
