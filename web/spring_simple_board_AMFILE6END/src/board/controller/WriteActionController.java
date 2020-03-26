package board.controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import board.command.BoardCommand;
import board.dao.BoardDAO;

//AbstractCommandController를 상속 받음.
//handle()메서드 내에서 입력받은 값을 DAO의 write()로 저장하고 list.jsp를 호출
public class WriteActionController extends AbstractCommandController {
	
	private BoardDAO dao; //xml 문서에 의해 BoardDAO dao = new BoardDAO()
	
	public void setDao(BoardDAO dao){
		this.dao=dao;
		System.out.println("setDao(BoardDAO dao) 호출됨 : "+dao);
	}
	
	/**
	 *AbstractCommandController 가 가지고 있는 객체
	 * 1.httpServletRequest: 요청 객체
	 * 2.httpServletResponse: 응답 객체
	 * 3.Object : 입력받는 값을 저장하는 객체
	 * 4. BindException: 사용자로부터 값을 입력시, 에러가 발생하면 처리해주는 class
	 * */
	
	//매개변수를 알기 쉽게 변환
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException error)
			throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		/**spting 방식*/
		//BoardCommand는 상속받은 부모의 class이다.
		BoardCommand data =(BoardCommand) command;
		String author = data.getAuthor();
		String content = data.getContent();
		String title = data.getTitle();
		
		dao.write(author,content,title);
		
		/**
		response.sendRedirect("list.jsp");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("list");
		
		위에  ModelAndView()안에 넣음으로서 생략이 가능하다.
		ModelAndView mav = new ModelAndView("list");
		return mav;	*/
		
		//또는
		return new ModelAndView("redirect:/list.do");// 위의 주석 문을 한줄로 처리
	}
	
	
	
	public WriteActionController() {
		// TODO Auto-generated constructor stub
	}

	public WriteActionController(Class commandClass) {
		super(commandClass);
		// TODO Auto-generated constructor stub
	}

	public WriteActionController(Class commandClass, String commandName) {
		super(commandClass, commandName);
		// TODO Auto-generated constructor stub
	}

}
