package com.freeflux.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.freeflux.dao.JoinDAO;
import com.freeflux.model.JoinModel;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;


@WebServlet("/LogCheck")
public class LogCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**JOIN DAO*/
	private JoinDAO joinDAO = null;
	
    public LogCheckServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//(View)아이디 입력폼 보내기
		String input_id= request.getParameter("input_id");
		System.out.println(input_id+"--------------");
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("inputID.jsp");
		request.setAttribute("USE_ID", input_id);
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post 한글 파라미터 깨짐처리
		request.setCharacterEncoding("UTF-8");
		
		//파라미터
		String use_id = request.getParameter("USE_ID");
		
		//게시물 등록
		this.joinDAO = new JoinDAO();
		String result = this.joinDAO.idCheck(use_id);
		System.out.println(result+"++++++++");

		//페이지 이동
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("inputID.jsp");
		request.setAttribute("USE_ID", use_id);
		request.setAttribute("RESULT", result);
		requestDispatcher.forward(request, response);
		
		
	}

}
