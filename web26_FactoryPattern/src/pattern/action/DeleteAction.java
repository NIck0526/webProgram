package pattern.action;
// 구상객체 ,,,,컴포넌트
public class DeleteAction implements Action{

	@Override
	public void execute() {		
	
		delete();
	}
	private void delete(){
		//비지니스 로직이 돌았다 치고...
		/*
		 * 폼값 받아서
		 * dao리턴받고
		 * 비지니스 로직 호출
		 * 바인딩
		 * 리턴타입?
		 */
		System.out.println("DELETE...OK!!");
	}

}
