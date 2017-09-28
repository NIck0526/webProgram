package pattern.client.test;


import pattern.action.Action;
import pattern.action.ActionFactory;

/*
 * Factory Method pattern
 * ::
 * 추상화 된 클래스(Action)의 인스턴스를(구상객체 혹은 컴퍼넌트) 생성하고 반환받는 방법
 * 구상객체를 생성하는 곳은 싱글톤 패턴으로 돌아가는 Factory
 * 이때 command 값에 따라서 서로 다른 구상객체가 만들어지는데...(Command pattern)
 * 생성된 객체를 다시 반환할때는 추상화 된 클래스로 한다.
 * 
 * 결국 클라이언트는 (DispatcherServlet) Factory로 하여금 컴퍼넌트 생성을 만들도록 요청
 * Factory는 컴퍼넌트를 감춘 상태로 추상객체를 리턴한다.
 * 클라이언트가 추상객체의 기능을 호출 
 * 실질적인 컴포넌트가 기능을 실행한다.
 */
public class DispatcherServletMain {
	public static void main(String[] args) {
		String command = "INSERT";
		
		ActionFactory factory = ActionFactory.getFactory();
		
		Action action = factory.createAction(command);

		action.execute();
	}

}
