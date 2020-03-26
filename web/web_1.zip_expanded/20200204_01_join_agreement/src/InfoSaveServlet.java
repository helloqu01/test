

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/InfoSaveServlet")
public class InfoSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public InfoSaveServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		String name = request.getParameter("NAME");
		
		HttpSession session = request.getSession();//세션을 시작한다.
		
		RequestDispatcher rd = request.getRequestDispatcher("Agreement.jsp");//동의로 보낸다.
		session.setAttribute("ID", id);
		session.setAttribute("PW", pw);
		session.setAttribute("NAME", name);
		rd.forward(request, response);// 보내라
		
	}

	
	

}
