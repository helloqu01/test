package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import board.dao.BoardDAO;

public class UserRetrieveActionController implements Controller {
	private BoardDAO dao;
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
		System.out.println("setDao() 호출됨 (dao) : " + dao);
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		System.out.println("UserRetrieveActionController  실행됨!");

		System.out.println("UserRetrieveActionController  끝!");
		return null;
	}

}
