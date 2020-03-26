package com.freeflux.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.freeflux.dao.JoinDAO;
import com.freeflux.model.JoinModel;


@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
	/**JOIN DAO*/
	private JoinDAO joinDAO=null;
	
       
    
    public InfoServlet() {
        super();
    }

	/**@see POST 접근 시(등록처리 접근 시)*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//POST 한글 파라미터 깨짐 처리
		request.setCharacterEncoding("UTF-8");//포스트 방식일 때는  한글이 깨질 수 있으므로 반드시 한글 깨짐 방지 코드를 넣는다.
		
		//파라미터
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		String name = request.getParameter("NAME");
		String bt = request.getParameter("BT");
		String gender = request.getParameter("GENDER");
		String email = request.getParameter("EMAIL");
		String phone = request.getParameter("PHONE");
		
		/*입력된 값이 없어도 전달된 파라미터명에는 ""값이 전달된다*/
		
		//모델
		JoinModel joinModel = new	JoinModel();
		joinModel.setid(id);
		joinModel.setpw(pw);
		joinModel.setpw(name);
		joinModel.setpw(bt);
		joinModel.setpw(gender);
		joinModel.setemail(email);
		joinModel.setphone(phone);
		
		//게시물 등록
		this.joinDAO = new JoinDAO();
		this.joinDAO.insert(joinModel);
		
		//페이지 이동
		response.sendRedirect("JoinList"); //joinlist 서블릿(joinlistServlet) 요청
		
		
		
	}
}
