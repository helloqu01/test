package com.ohj.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ResultServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	
		String NAME = request.getParameter("NAME");//멤버에서 넘어오는 것을 받겠다.
		String NUMBER = request.getParameter("NUMBER");
		String EMAIL = request.getParameter("EMAIL");
		
		HttpSession session =  request.getSession();//세션을 시작
		session.setAttribute("NAME", NAME);
		session.setAttribute("NUMBER", NUMBER);
		session.setAttribute("EMAIL", EMAIL);		
		
		RequestDispatcher rd= request.getRequestDispatcher("result.jsp");//merber.jsp로 이동시키겠다
		rd.forward(request, response);
	}
}
