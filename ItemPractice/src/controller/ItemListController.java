package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Item;
import model.ItemDao;

public class ItemListController implements  Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<Item> list = ItemDao.getInstance().getAllItems();
		request.setAttribute("list", list);
		ModelAndView mv = new ModelAndView();
		mv.setUri("itemList.jsp");
		return mv;
	}

}















