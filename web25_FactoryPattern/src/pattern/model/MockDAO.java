package pattern.model;

import java.sql.SQLException;

/*
 * Mock 객체
 * ::
 * 프로젝트 초기 단계에 
 * 특정한 로직을 정상적으로 구동되는지를 테스트해보기 위해서 만든
 * 가상의 객체
 */
public class MockDAO {
	private static MockDAO dao = new MockDAO();
	private MockDAO() {}
	public static MockDAO getInstance() {
		return dao;
	}
	
	//비지니스 로직....
	public NoteBook findNoteBook(String model)throws SQLException{
		System.out.println(model);
		NoteBook nb = new NoteBook(model, 130);
		return nb;
	}
}














