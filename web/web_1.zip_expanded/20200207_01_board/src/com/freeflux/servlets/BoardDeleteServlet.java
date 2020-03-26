package com.freeflux.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.freeflux.dao.BoardDAO;

/**
 * 게시판 삭제 서블릿 클래스
 * @since 2020.02.07
 * @author freeflux
 */
@WebServlet("/board/BoardDeleteServlet")
public class BoardDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  /** BOARD DAO*/
		private BoardDAO boardDAO = null;
	
    public BoardDeleteServlet() {
        super();
    }

	/**
	 *GET 접근 시 (상세 조회 접근 시)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//파라미터 (num,gageNum,searchType, searchText)
		
		//mySQL 한글저장
		String searchTextUTF8 =  new String(searchText.getBytes("ISO-8859-1"),"UTF-8");
		String searchTextUTF8_E = URLEnocoder.encode(searchTextUTF8,"UTF-8");
		
		//모델에 파라미터 값 설정(BoardModel)
		
		//게시물 삭제(BoardDAO = >delete() 호촐)
		
		//페이지 이동
		//response.sendRedirect(boardListServlet에게 pageNum,searchType,searchText 전달);
 	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
