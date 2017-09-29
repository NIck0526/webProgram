package controller;

public class HandlerMapping {
	private static HandlerMapping handler = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getHandler() {
		return handler;
	}
	
	public Controller createController(String command) {
		Controller controller = null;
		if(command.equals("write")) {
			controller = new WriteController();
		}else if(command.equals("showContent")){
			controller = new ShowContentController();
		}else if(command.equals("list")) {
			controller = new ListController();
		}
			
		
		return controller;
	}
}
