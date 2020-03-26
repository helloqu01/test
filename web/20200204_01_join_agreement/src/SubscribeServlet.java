

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;


@WebServlet("/SubscribeServlet")
public class SubscribeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SubscribeServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String agree = request.getParameter("agree"); //가입에서 넘어오는 것을 받겠다.
	
		HttpSession session = request.getSession();//세션을 시작
		session.setAttribute("agree", agree);
		
		RequestDispatcher rd = request.getRequestDispatcher("Result.jsp");
		rd.forward(request, response);
		
	}



}
