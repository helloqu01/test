package com.freeflux.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.freeflux.dao.BoardDAO;
/**
 * 게시판 상세 조회 서블릿 클래스
 * @since 2020.02.07
 * @author freeflux
 */
@WebServlet("/BoardViewServlet")
public class BoardViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	  /** BOARD DAO*/
		private BoardDAO boardDAO = null;
			
    public BoardViewServlet() {
        super();
      
    }
    /**
  	 * GET 접근 시(상세조회 접근시)
  	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//파라미터( num,pageNum,searchType,searchText )
		//mySQL 한글저장
		String searchTextUTF8 =  new String(searchText.getBytes("ISO-8859-1"),"UTF-8");
		//모델에 파라미터 값 설정(BoardModel)
		//게시물 상세 조회(BoardDAO => selectOne()호출)
		//게시물 조회수 증가(BoardDAO => updateHit()호출)
		//view 사용 될 객체 설정
		//view 보내기(BoardViewServlet.jsp : forward(request,response))
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
