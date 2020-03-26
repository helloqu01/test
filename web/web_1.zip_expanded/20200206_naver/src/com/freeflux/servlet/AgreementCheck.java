package com.freeflux.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.freeflux.dao.JoinDAO;


@WebServlet("/AgreementCheck")
public class AgreementCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**JOIN DAO*/
	private JoinDAO joinDAO = null;
	
    public AgreementCheck() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String checkbox1 = request.getParameter("checkbox1");//가입 넘어오는 것을 받겠다.
	 
	 HttpSession session = request.getSession();//세션시작
	 session.setAttribute("checkbox1", checkbox1);
	 RequestDispatcher rd =  request.getRequestDispatcher("PersonalInfo.jsp");
	 rd.forward(request, response);
	
	}

	/**
	 * create table naver_table(
 		num int not null auto_increment, 
   		id varchar(10) not null,
    	pw varchar(10) not null,
		name  varchar(10) not null,
		bt varchar(20) not null,
		gender varchar(10) not null,  
		email varchar(20),
   		phone char(13) not null,
 		PRIMARY key(num)
  		);
	 * */

}
