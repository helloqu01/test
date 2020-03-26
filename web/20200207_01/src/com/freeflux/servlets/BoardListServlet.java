package com.freeflux.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.freeflux.dao.BoardDAO;
/**
 * 게시판 목록 페이지 서블렛 클래스
 * @since 2020.02.07
 * @author freeflux
 */
@WebServlet("/board/BoardListServlet")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  /** BOARD DAO*/
	private BoardDAO boardDAO = null;
	
    public BoardListServlet() {
        super();
    }

	/**
	 * GET 접근 시(목록 조회 접근시)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//파라미터( pageNum,searchType,searchText )
		if(pageNum==null){
			pageNum="1";
		}
		if(searchText==null){
			searchType="";
			searchText="";
		}
		
		//mySQL 한글저장
		String searchTextUTF8 =  new String(searchText.getBytes("ISO-8859-1"),"UTF-8");
		
		//모델에 파라미터 값 설정(BoardModel)
		
		
		//DAO 객체 생성
		
		//게시물 총수(BoardDAO => selectCount()호출)
		
		//게시물 목록을 얻는 쿼리 실행(BoardDAO => selectList()호출)
	
		//view 사용될 객체에 전달할 값 설정
		
		//view 보내기(boardList.jsp : forward(request,response))
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
