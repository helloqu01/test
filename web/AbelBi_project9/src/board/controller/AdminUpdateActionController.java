package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import board.command.BoardCommand;
import board.dao.BoardDAO;

public class AdminUpdateActionController extends AbstractCommandController {
	private BoardDAO dao;
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
		System.out.println("setDao() 호출됨 (dao) : " + dao);
	}

	// 어드민 업로드 화면 처리
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException error)
			throws Exception {
		request.setCharacterEncoding("UTF-8");
		System.out.println("AdminUpdateActionController 실행됨!");
		
		// BoardCommand 는 상속받은 부모의 class 이다.
		BoardCommand data = (BoardCommand) command;
/*		String author = data.getAuthor();
		String content = data.getContent();
		String title = data.getTitle(); */
		int idx = Integer.parseInt(request.getParameter("idx"));
		dao.update(data, idx);
		
		// dao.update(data);
//		dao.update(num, author, title, content);
		System.out.println("AdminUpdateActionController 끝!");
		
		return new ModelAndView("redirect:/adminList.do");
		
		
	}

}
