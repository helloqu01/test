package board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import board.dao.BoardDAO;

//Controller 구현 받음
//전달된 num을 이용하여 DAO의 search()를 수행. 그 결과 값을 ArrayList 객체에 담아 list.jsp에게 전달
public class SearchActionController implements Controller {
	
	private BoardDAO dao;
	public void setDao(BoardDAO dao){
		this.dao=dao;
		System.out.println("setDao(BoardDAO dao) 호출"+dao);
	}

	public SearchActionController() {
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		System.out.println("SearchActionController 실행됨!");
		
		String searchName=request.getParameter("searchName");
		//<option value="author">작성자</option>
		//<option value="title">제목</option>
		
		String searchValue=request.getParameter("searchValue");
		
		ArrayList list = dao.search(searchName,searchValue);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("list");//list.jsp
		mav.addObject("list",list);
		
		return mav;
	}

}
