package com.freeflux.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet { // HttpServlet 톰캣의 것(import javax)
	private static final long serialVersionUID = 1L;// 수정해서는 안되는 것(톰캣이 이 파일을 찾을 때 사용)
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //<form action = "TestServlet" method ="get">
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//타입은 바꾸면 안되나 변수 이름은 바꿔도 됨
		//throws ServletException, IOException => 예외처리
		//HttpServletRequest request 외부로 부터 값을 전달 받는 역할
		//HttpServletResponse response 내부의 것을 밖으로 전달 할 때 주로 사용
		//response.getWriter().append("ohj at: ").append(request.getContextPath());
		
		int total = 0;
		for(int cnt = 1; cnt<101;cnt++)
			total += cnt;
		
		
			PrintWriter out = response.getWriter();
			out.println("<HTML>");
			out.println("<HEAD><TITLE> 1부터 100까지 더하는 서블릿</TITLE></HEAD>");
			out.println("<BODY>");
			out.printf("1부터 100까지의 합은 = %d",total);
			out.println("</BODY>");
			out.println("</HTML>");
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//<form action = "TestServlet" method ="post">
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
