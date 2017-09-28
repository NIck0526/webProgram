package model;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class CartBiz {
	private static CartBiz cartBiz = new CartBiz();
	private CartBiz() {}
	public static CartBiz getInstance() {
		return cartBiz;
	}
	
	public void addCart(HttpServletRequest request, Item item) {
		HttpSession session = request.getSession();
		if(session.getAttribute("cartList")==null) {
			session.setAttribute("cartList", new CartList<Cart>());
		}
		CartList<Cart> list = (CartList<Cart>)session.getAttribute("cartList");
		boolean isExist = false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(item.getName())) {
				System.out.println("list[i] name : " + list.get(i).getName() + " / item name : " + item.getName());
				System.out.println(list.get(i));
				int oldQuantity = list.get(i).getQuantity();
				list.get(i).setQuantity(oldQuantity+1);
				isExist=true;
			}
		}
		if(list.size()==0 || isExist==false) list.add(new Cart(item.getUrl(), item.getName(), item.getPrice(), 1));
	}
	
	public CartList<Cart> getCartList(HttpServletRequest request){
		CartList<Cart> cartList = null;
		cartList = (CartList<Cart>) request.getSession().getAttribute("cartList");
		return cartList;
	}
	
	public void updateCart(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String itemname = request.getParameter("itemname");
		int count = Integer.parseInt(request.getParameter("count"));
		CartList<Cart> cartList = (CartList<Cart>) request.getSession().getAttribute("cartList");
		int newCount = 0;
		for(int i=0;i<cartList.size();i++) {
			if(cartList.get(i).getName().equals(itemname)) {
				newCount = cartList.get(i).getQuantity() + count;
				if(newCount>0) cartList.get(i).setQuantity(newCount);
				else cartList.remove(i);
			}
		}
	}
	
	public void removeCart(HttpServletRequest request) {
		HttpSession session = request.getSession();
		System.out.println(request.getRequestURL());
		Enumeration<String> paramNames = request.getParameterNames();
		CartList<Cart> cartList = (CartList<Cart>) request.getSession().getAttribute("cartList");
		while(paramNames.hasMoreElements()) {
			String itemname = paramNames.nextElement();
			for(int i=0;i<cartList.size();i++) {
				if(cartList.get(i).getName().equals(itemname)) {
					cartList.remove(i);
				}
			}
		}
	}
}
