package controller;
//페이지 이동 방법에 대한 클래스
/*
 * 결과 페이지 이름
 * 그 결과 페이지로 어떻게 이동할건지? ----직접 이동 | 브라우저로 갔다가 다시 서버로 가는(redirect)
 */
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
