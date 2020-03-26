package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import board.command.BoardCommand;
import board.dao.BoardDAO;

//AbstractCommandColtroller를 상속 받은
//전달된 수정 값들을 DAO의 update()로 수정하고 list.jsp를 호출
public class UpdateActionController extends AbstractCommandController {
	private BoardDAO dao;
	//BoardDAO dao = new BoardDAO();
	//board-servlet.xml
	//<property name="commandClass" value="board.command.BoardCommand" />
	
	public void setDao(BoardDAO dao){
		this.dao=dao;
		System.out.println("setDao(BoardDAO dao) 호출"+dao);
	}

	public UpdateActionController() {
		// TODO Auto-generated constructor stub
	}

	public UpdateActionController(Class commandClass) {
		super(commandClass);
		// TODO Auto-generated constructor stub
	}

	public UpdateActionController(Class commandClass, String commandName) {
		super(commandClass, commandName);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException error)
			throws Exception {
	request.setCharacterEncoding("UTF-8");
	
	//BoardCommand는 상속받은 부모의 class이다.
	BoardCommand data =(BoardCommand) command;
	
	String num=request.getParameter("num");
	dao.update(data,num);
	
	//String author = data.getAuthor();
	//String content = data.getContent();
	//String title = data.getTitle();
	//String num = request.getParameter("num");
	//dao.update(num,author,content,title);
	
	return new ModelAndView("redirect:/list.do");
	}

}
