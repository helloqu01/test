package com.freeflux.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.freeflux.dao.JoinDAO;
import com.freeflux.model.JoinModel;


@WebServlet("/JoinList")
public class JoinList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**JOIN DAO*/
	private JoinDAO joinDAO=null;
	
    public JoinList() {
        super();
       
    }
    /**
     * @see GET접근시 (등록 폼 접근 시)
     * */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.joinDAO=new JoinDAO();
		ArrayList<JoinModel> joinlist = this.joinDAO.selectAll();
		
		for(JoinModel joinModel : joinlist){
			System.out.println(joinModel.getnum()+"\t");
			System.out.println(joinModel.getid()+"\t");
			System.out.println(joinModel.getpw()+"\t");
			System.out.println(joinModel.getemail()+"\t");
			System.out.println(joinModel.getphone()+"\t");
		}
		
		//View(목록화면)보내기
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("JoinList.jsp");
			request.setAttribute("LIST", joinlist);
			requestDispatcher.forward(request, response);
	}

	/**@see POST 접근 시(등록처리 접근 시)*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
