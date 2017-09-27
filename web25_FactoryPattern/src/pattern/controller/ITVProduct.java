package pattern.controller;
/*
 * Component ::
 * Product라는 인터페이스를 상속받은 자바 클래스..
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pattern.model.ITV;
import pattern.model.MockDAO;

public class ITVProduct implements Product{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String model  = request.getParameter("model");
		//ITV itv=MockDAO.getInstance().findNoteBook(model);
		return null;
	}

}








