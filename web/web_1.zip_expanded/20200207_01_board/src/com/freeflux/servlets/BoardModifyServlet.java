package com.freeflux.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.freeflux.dao.BoardDAO;
/**
 * 게시판 수정폼, 수정처리 서블릿 클래스
 * @since 2020.02.07
 * @author freeflux
 */
@WebServlet("/board/BoardModifyServlet")
public class BoardModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	  /** BOARD DAO*/
	private BoardDAO boardDAO = null;
		
		
    public BoardModifyServlet() {
        super();
    }

    /**
	 * GET 접근 시(수정폼 접근시)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//파라미터( pageNum,searchType,searchText )
		
		//mySQL 한글저장
		String searchTextUTF8 =  new String(searchText.getBytes("ISO-8859-1"),"UTF-8");
		//모델에 파라미터 값 설정(BoardModel)
		//게시물 상세 조회(BoardDAO => selectOne()호출)
		//view 사용 될 객체 설정
		//view 보내기(BoardModifyServlet.jsp : forward(request,response))
	}
	/**
	 * post 접근 시(수정처리 접근시)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post 한글 파라미터 깨짐 처리
		//파라미터(num,subject,writer,contents, pageNum,searchType,searchText )
		String searchTextUTF8_E = URLEnocoder.encode(searchTextUTF8,"UTF-8");
		
		//ip 주소 추출(request.getRemoteAddr())
		//모델에 파라미터 값 설정(BoardModel)
		
		//게시물 수정처리(BoardDAO => update()호출)
		//페이지 이동
		//response.sendRedirect(boardViewServlet에게 num, pageNum,searchType,searchText 전달);
	}

}
