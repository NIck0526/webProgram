package controller;

public class ModelAndView {
	private String uri;
	private boolean redirect; //false
	public ModelAndView(String uri, boolean redirect) {
		super();
		this.uri = uri;
		this.redirect = redirect;
	}
	public ModelAndView() {
		super();
	}
	public ModelAndView(String uri) {
		super();
		this.uri = uri;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	@Override
	public String toString() {
		return "ModelAndView [uri=" + uri + ", redirect=" + redirect + "]";
	}
	
	
}








