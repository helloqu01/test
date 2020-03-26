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


@WebServlet("/JoinServlet")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public JoinServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		
		HttpSession session =  request.getSession();//세션을 시작
	
	
		RequestDispatcher rd= request.getRequestDispatcher("merber.jsp");//merber.jsp로 이동시키겠다.
		session.setAttribute("ID", id);
		session.setAttribute("PW", pw);// id와 pw를 멤버로 보낸다. 
		rd.forward(request, response);
	
	
	}

}