package com.ohj.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//2번

@WebServlet("/adder")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int n1 = Integer.parseInt(request.getParameter("NUM1"));//doget메서드 자동호출( request가 값을 받음)
		int n2 = Integer.parseInt(request.getParameter("NUM2"));//doget메서드 자동호출( request가 값을 받음)
		
		RequestDispatcher rd= request.getRequestDispatcher("r.jsp");////("r.jsp")로 이동 시키겠다.
		request.setAttribute("ADD", new Integer(n1+n2));
		rd.forward(request, response);//값을 넘기겠다.
		
		//params	     /       	arrtibute	
		//NUM1="10"입력됨				"ADD":30
		//NUM2="20"입력됨
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
