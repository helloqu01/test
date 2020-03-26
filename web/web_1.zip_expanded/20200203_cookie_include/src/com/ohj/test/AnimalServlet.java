
package com.ohj.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AnimalServlet")
public class AnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AnimalServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String food = request.getParameter("Food");
		HttpSession session = request.getSession(); // 세션을 시작하는 메서드
		session.setAttribute("Food", food);	// 같은 이름의 데이터가 있으면 기존 값을 지우고 새로운 값을 저장
		response.setContentType("text/html;charset=UTF-8");
		
		
		
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<head><title>성격테스트</title></head>");
		out.println("<BODY>");
		out.println("<h3>좋아하는 동물은?</h3>");
		out.println("<form action=ResultServlet>");
		out.println("<input type = text name = animal>");
		out.println("<input type = submit value = 확인>");
		out.println("</FORM>");
		out.println("</BODY>");
		out.println("</HTML>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}