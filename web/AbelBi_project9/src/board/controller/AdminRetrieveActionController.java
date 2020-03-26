package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

public class AdminRetrieveActionController implements Controller {
	private BoardDAO dao;
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
		System.out.println("setDao() 호출됨 (dao) : " + dao);
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		System.out.println("AdminRetrieveActionController 실행됨!");
		int idx = Integer.parseInt(request.getParameter("idx"));
		System.out.println("idx : " +idx);

		// 레코드 한개를 담을 객체 필요
		BoardDTO data = dao.retrieve(idx);

		ModelAndView mav = new ModelAndView("adminRetrieve");
		// ModelAndView mav = new ModelAndView();
		// mav.setViewName("retrieve"); //retrieve.jsp
		
		//request.setAttribute("data", data); // 데이터 메모리에 올려서 다른 페이지에도 이동
		mav.addObject("data", data); // JSP에서 ${data} 로 가능
		System.out.println("AdminRetrieveActionController 끝!");
		return mav; // 메모리에 올림
	}

}
