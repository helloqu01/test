package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//Controller 구현 받음
//전달된 num을 이용하여 DAO의 retrive()를 통해 해당 레코드만 DTO객체에 담아 retrive.jsp를 호출
public class RetrieveActionController implements Controller {

	public RetrieveActionController() {
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
