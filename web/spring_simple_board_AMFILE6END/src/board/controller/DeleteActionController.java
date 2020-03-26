package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import board.dao.BoardDAO;

//Controller 구현 받음
//전달된 num을 이용하여 DAO의 delete()로 삭제하고 list.jsp를 호출
public class DeleteActionController implements Controller {
	private BoardDAO dao;
	public void setDao(BoardDAO dao){
		this.dao=dao;
		System.out.println("setDao(BoardDAO dao) 호출"+dao);
	}

	public DeleteActionController() {
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		String num = request.getParameter("num");
		//삭제하는 역할이기 때문에 값을 전달해주지 않아도 됨 
		dao.delete(num);
		
		return new ModelAndView("redirect:/list.do");
		
	}

}
