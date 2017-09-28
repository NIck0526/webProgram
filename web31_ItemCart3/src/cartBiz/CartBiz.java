package cartBiz;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

/*
 * 장바구니 비지니스 로직..
 * 1. 장바구니에 Item이 추가
 * 	1) 이미 있는것을 추가.. 수량만 변경
 * 	2) 없는 것을 추.... 새롭게 생성
 * 
 * 2. 담겨있는 모든 Item으 받아오는 로직
 * 
 */
public class CartBiz {
	public void addCart(HttpServletRequest request, Item item) {
		
		
	}
	
	public ArrayList<Cart> getCartList(HttpServletRequest request){
		
	}
}
