package controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Item;
import model.ItemDao;

public class ItemViewController implements Controller {

	@Override
	public ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int itemnumber = Integer.parseInt(request.getParameter("itemnumber"));
		
		boolean result = ItemDao.getInstance().updateRecordCount(itemnumber);
		System.out.println("count update...."+result);
		
		Item item=ItemDao.getInstance().getItem(itemnumber);
		System.out.println("get item...."+item);
		
		/*
		 * 쿠키를 생성
		 * 오늘 내가 관심을 가지고 클릭한 상품의 이미지를 값으로 저장
		 * 응답시 생성된 쿠키를 클라이언트에 저장
		 */
		
		///////////////////// 오늘 본 상품정보 쿠키 부분 추가 //////////////////
		Cookie c = new Cookie("images"+itemnumber,item.getUrl());
		c.setMaxAge(24*60*60);// One Day 브라우저에 저장
		response.addCookie(c);
		////////////////////////////////////////////////////////////////////
		
		request.setAttribute("item", item);
		ModelAndView mv = new ModelAndView();
		mv.setUrl("itemView.jsp");
		return mv;
	}

}
















