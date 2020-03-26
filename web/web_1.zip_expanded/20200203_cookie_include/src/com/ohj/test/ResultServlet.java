package com.ohj.test;

import java.io.IOException;
import java.io.PrintWriter;

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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession();//세션을 시작하는 메서드
		String food = (String) session.getAttribute("Food");// 푸드를 세션에 스트링형식으로 저장을 시키겟다.
		String animal = request.getParameter("animal");// 애니멀에서 넘어오는 것을 받겠다.
		session.invalidate(); //세션을 끝내는 메서드
		response.setContentType("text/html;charset=UTF-8");
		
		
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<head><title>성격테스트</title></head>");
		out.println("<BODY>");
		out.println("<h3>성격테스트</h3>");
		out.printf("당신은 %s 와 %s를 좋아하는 성격입니다", food, animal);
		out.println("</BODY>");
		out.println("</HTML>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
