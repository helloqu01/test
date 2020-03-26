package board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

public class UserSearchActionController implements Controller {
	private BoardDAO dao;
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
		System.out.println("setDao() 호출됨 (dao) : " + dao);
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		System.out.println("UserSearchActionController 실행됨!");
		String searchName = request.getParameter("searchName");
		// <option value="author">작성자</option>
		// <option value="title">제목</option>
		
		String searchValue = request.getParameter("searchValue");
		
		ArrayList<BoardDTO> list = dao.search(searchName, searchValue);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("userList"); // list.jsp
		mav.addObject("list", list);
		
		System.out.println("UserSearchActionController 끝!");	
		return mav;
	}

}
