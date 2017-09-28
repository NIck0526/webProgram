package controller;

public class ModelAndView {
	private String path;
	private boolean isRedirect; //false
	
	public ModelAndView(String path, boolean isRedirect) {		
		this.path = path;
		this.isRedirect = isRedirect;
	}
	public ModelAndView() {	}
	public ModelAndView(String path) {		
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}
	public boolean isRedirect() {
		return isRedirect;
	}
	
}
