package board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

public class AdminListActionController implements Controller {
	private BoardDAO dao;
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
		System.out.println("setDao() 호출됨 (dao) : " + dao);
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		System.out.println(" AdminListActionController 실행됨!");
		ArrayList<BoardDTO> list = dao.list();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("list");
		
		mav.addObject("list", list);
		System.out.println(" AdminListActionController 끝!");
		return mav;
	}

}
