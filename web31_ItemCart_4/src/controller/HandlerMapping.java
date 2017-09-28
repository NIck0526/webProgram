package controller;

public class HandlerMapping {
	private static HandlerMapping handler = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getHandler() {
		return handler;
	}
	
	public Controller handleRequest(String command) {
		Controller controller = null;
		if(command.equals("/itemList.do")) {
			controller = new ItemListController();
		} else if(command.equals("/itemView.do")) {
			controller = new ItemViewController();
		} else if(command.equals("/itemCartAdd.do")) {
			controller = new ItemCartAddController();
		} else if(command.equals("/itemCartList.do")) {
			controller = new ItemCartListController();
		} else if(command.equals("/updateCart.do")) {
			controller = new ItemCartUpdateController();
		} else if(command.equals("/removeCart.do")) {
			controller = new ItemCartRemoveController();
		}
		return controller;
	}
}
