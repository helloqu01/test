package board.controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

//Controller 구현 받음
//전달된 num을 이용하여 DAO의 retrive()를 통해 해당 레코드만 DTO객체에 담아 retrive.jsp를 호출
public class RetrieveActionController implements Controller {
	
	private BoardDAO dao;
	
	public void setDao(BoardDAO dao){
		this.dao=dao;
		System.out.println("setDao(BoardDAO dao) 호출"+dao);
	}

	public RetrieveActionController() {
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("RetrieveActionController 실행됨!");

		String num = request.getParameter("num");
		System.out.println("num:"+num);
		
		//레코드 한 개를 담을 객체 필요
		BoardDTO data =dao.retrieve(num);//검색
		
		ModelAndView mav = new ModelAndView("retrieve");
		//ModelAndView mav = new ModelAndView();
		//mav.setViewName("retrieve");//retrieve.jsp
		
		//request.setAttribute(("data",data); //데이터 메모리에 올려서 다른 페이지에도
		mav.addObject("data",data);//JSP에서${data}로 가능
		
		return mav;//메모리에 올림
	}

}
