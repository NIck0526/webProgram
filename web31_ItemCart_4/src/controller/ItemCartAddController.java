package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.util.ModelAndView;
import model.CartBiz;
import model.Item;
import model.ItemDao;

public class ItemCartAddController implements Controller {

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int itemid = Integer.parseInt(request.getParameter("itemnumber"));
		Item item = ItemDao.getInstance().getItem(itemid);
		CartBiz.getInstance().addCart(request, item);
		return new ModelAndView("itemCartList.do", true);
	}

}
