package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

//AbstractCommandController를 상속 받음.
//handle()메서드 내에서 입력받은 값을 DAO의 write()로 저장하고 list.jsp를 호출
public class WriteActionController extends AbstractCommandController {

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

	@Override
	protected ModelAndView handle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, BindException arg3)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
