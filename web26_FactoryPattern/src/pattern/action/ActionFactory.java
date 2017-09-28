package pattern.action;
/*
 * 여러개의 Action 컴퍼넌트를 생성하는 실질적인 장소... 기능..
 * command 값에 따라서 서로다른 Action 클래스들이 생성된다.
 * 싱글톤으로 생성
 */
public class ActionFactory {
	private static ActionFactory factory = new ActionFactory();
	private ActionFactory() {}
	public static ActionFactory getFactory() {
		return factory;
	}
	
	public Action createAction(String comm) {
		Action action = null;
		if(comm.equals("INSERT")) {
			action = new InsertAction();
		}else if (comm.equals("UPDATE")) {
			action = new UpdateAction();
		}else {
			action = new DeleteAction();
		}
		
		return action;
	}
	
}












