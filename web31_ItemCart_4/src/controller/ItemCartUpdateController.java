package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.util.ModelAndView;
import model.CartBiz;
import model.Item;
import model.ItemDao;

public class ItemCartUpdateController implements Controller {

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CartBiz.getInstance().updateCart(request);
		return new ModelAndView("itemCartList.do", true);
	}

}
