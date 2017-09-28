package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.util.ModelAndView;
import model.Cart;
import model.CartBiz;
import model.CartList;

public class ItemCartListController implements Controller {

	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		int totalPrice = 0;
		CartList<Cart> cartList = CartBiz.getInstance().getCartList(request);
		for(Cart item : cartList) 
			totalPrice += (item.getPrice() * item.getQuantity());
		session.setAttribute("totalPrice", totalPrice);
		return new ModelAndView("itemCartList.jsp");
	}

}
