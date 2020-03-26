package com.freeflux.servlets;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.freeflux.dao.JoinDAO;
import com.freeflux.model.JoinModel;

import sun.reflect.CallerSensitive;


@WebServlet("/JoinInsert")
public class JoinInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**JOIN DAO*/
	private JoinDAO joinDAO=null;
	
	
    public JoinInsert() {
        super();
      
    }
    /**
     * @see GET접근시 (등록 폼 접근 시)
     * */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		
	//View보내기
		RequestDispatcher requestdispatcher = request.getRequestDispatcher("JoinWrite.jsp");
		requestdispatcher.forward(request, response);
		
	}

	/**@see POST 접근 시(등록처리 접근 시)*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//POST 한글 파라미터 깨짐 처리
		request.setCharacterEncoding("UTF-8");//포스트 방식일 때는  한글이 깨질 수 있으므로 반드시 한글 깨짐 방지 코드를 넣는다.
		
		//파라미터
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		String email = request.getParameter("EMAIL");
		String phone = request.getParameter("PHONE");
		
		/*입력된 값이 없어도 전달된 파라미터명에는 ""값이 전달된다*/
		
		//모델
		JoinModel joinModel = new	JoinModel();
		joinModel.setid(id);
		joinModel.setpw(pw);
		joinModel.setemail(email);
		joinModel.setphone(phone);
		
		//게시물 등록
		this.joinDAO = new JoinDAO();
		this.joinDAO.insert(joinModel);
		
		//페이지 이동
		response.sendRedirect("JoinList"); //joinlist 서블릿(joinlistServlet) 요청
		
		
		
		//System.out.println(id+"______________");//웹서비스에서 입력된 것들이 콘솔창에 보인다.
		//System.out.println(pw+"______________");
		//System.out.println(email+"______________");
		//System.out.println(phone+"______________");
		
		//if(phone!=null){
		//	System.out.println(phone+"______________");
		//}
		
		/*if(phone!=""){//파라미터가 들어가면서 ""도 같이 들어간다.
			System.out.println(phone+"______________");
		}*/
		
		
		//doGet(request, response);
	}

}
