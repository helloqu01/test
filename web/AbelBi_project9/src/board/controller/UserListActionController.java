package board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

public class UserListActionController implements Controller {
	private BoardDAO dao;
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
		System.out.println("setDao() 호출됨 (dao) : " + dao);
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		System.out.println("UserListActionController 실행됨!");
		ArrayList<BoardDTO> list = dao.list();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("userList"); // list.jsp
		// ViewResolver에서 .jsp 를 추가 (board-servlet.xml 맨 마지막)
		
		// 서블릿 클래스의 request.setAttribute("list", list); 와 동일한 역할
		// ArrayList 객체를 add 시키면 ArrayList 로 들어가는게 아니라 Object로 감싸져서 들어감
		mav.addObject("list", list);
		System.out.println("UserListActionController 끝!");
		return mav; // DispatcherServlet 에게 전달
	}

}
