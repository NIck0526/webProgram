package pattern.controller;
/*
 * Factory ::
 * 공장....뭔가를 만들어내는 곳이다...생성하는 곳
 * interface 타입으로 Factory가 지정됬다는 의미는
 * 이것을 구체적으로 구현하는 실체클래스가 있다는 것을 의미한다.
 * 실체클래스= 구상객체 = 컴포넌트
 * 
 *  Component :: 
 *  자바 클래스
 *  캡슐화된 자바 클래스
 *  인터페이스에 기반한 재사용가능한 자바클래스
 */
public interface Factory {
	public Product createProduct(String command);
}












