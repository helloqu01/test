package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import board.command.BoardCommand;
import board.dao.BoardDAO;

public class AdminWriteActionController extends AbstractCommandController {
	private BoardDAO dao;
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
		System.out.println("setDao() 호출됨 (dao) : " + dao);
	}


	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException error)
			throws Exception {
		request.setCharacterEncoding("UTF-8");
		System.out.println("AdminWriteActionController 실행됨!");
		BoardCommand data = (BoardCommand) command;
		// 상품명, 상품이미지, 상품가격, 타입, 상품내용
		// 배송비, 수량, 합계
		String productName = data.getProductName();
		String productImage = data.getProductImage();
		int productPrice = data.getProductPrice();
		String summary = data.getSummary();
		String top = data.getTop();
		String bottom = data.getBottom();
		String dress = data.getDress();
		String productContent = data.getProductContent();
		int delivery = data.getDelivery();
		int countProduct = data.getCountProduct();
		int sumOfProduct = data.getSumOfProduct();
		
		dao.write(data);
		
		System.out.println("AdminWriteActionController 끝!");

		return new ModelAndView("redirect:/adminList.do"); // 위의 주석문을 한줄로 처리
	}

}
