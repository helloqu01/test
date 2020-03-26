package com.freeflux.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.freeflux.dao.BoardDAO;

/**
 * 게시판 등록폼, 등록처리 서블릿 클래스
 * @since 2020.02.07
 * @author freeflux
 */
@WebServlet("/BoardwriteServlet")
public class BoardwriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 /** BOARD DAO*/
	private BoardDAO boardDAO = null;
			
		
    public BoardwriteServlet() {
        super();
    }

    /**
   	 * GET 접근 시(등록폼 접근시)
   	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//view 보내기(BoardWrite.jsp : forward(request,response))
	}


    /**
   	 * POST 접근 시(등록폼 접근시)
   	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post 한글 파라미터 깨짐 처리
		request.setCharacterEncoding("UTF-8");
		//파라미터( num,pageNum,searchType,searchText )
		//ip 주소 추출(request.getRemoteAddr())
		//모델에 파라미터 값 설정(BoardModel)
		//게시물 등록(BoardDAO => insert()호출)
		//페이지 이동
		//response.sendRedirect(boardListServlet);
	}

}
