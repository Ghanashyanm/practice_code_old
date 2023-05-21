package A1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class verify1
 */
@WebServlet("/verify1")
public class verify1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public verify1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String  un=request.getParameter("username1");
		String pw=request.getParameter("password1");
		
		HttpSession s=request.getSession();
		
		String uns=(String)s.getAttribute("username");
		String pws=(String)s.getAttribute("password");
		
		if(uns.equals(un) && pws.equals(pw))
		{
			response.sendRedirect("welcome1.jsp");
		}
		else
		{
			s.setAttribute("f", "flag");
			response.sendRedirect("login1.jsp");
		}
		
	}

}
