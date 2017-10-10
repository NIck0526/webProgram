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
		}else if(command.equals("deleteCheckPassword")) {
			controller = new DeleteCheckPasswordController();
		}else if(command.equals("deletePosting")) {
			controller = new DeletePostingController();
		}
			
		
		return controller;
	}
}
