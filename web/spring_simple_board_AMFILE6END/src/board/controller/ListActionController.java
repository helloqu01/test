package board.controller;

import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

//Controller 구현 받음
//handleRequest() 메서드 내에서 DAO의 list()결과 값을 list.jsp 에게 ArrayList로 전달.
public class ListActionController implements Controller {
	
	private BoardDAO dao; //xml 문서에 의해 BoardDAO dao = new BoardDAO(); 

	public void setDao(BoardDAO dao){
		this.dao = dao;
		System.out.println("setDao()호출됨(dao)"+dao);
	}
	
	/**dao는 board-servlet.xml<bean name="list.dp"~~ 
	 * <property~~~>에 의해 주입
	 * */

	public ListActionController() {
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		System.out.println("ListActionController 실행됨!");
		
		ArrayList<BoardDTO> list =dao.list();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("list");//list.jsp //setViewName=>board-servlet.xml의 <property name="viewName" value="write"></property>
		//ViewResolver에서 .jsp를 추가(board-servlet.xml 맨 마지막)
		
		//서블렛 클래스의 Request.setAttribute("list",list);와 동일한 역할
		//addObject를 하게 되면 어떤 객체든 Object타입으로 들어가게됨
		mav.addObject("list",list);
		
		return mav;
	}

}
