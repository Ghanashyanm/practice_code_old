package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class serv3form
 */
@WebServlet("/serv3form")
public class serv3form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serv3form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
HttpSession s=request.getSession();
		
		String news1=(String)s.getAttribute("firstname");
		String news2=(String)s.getAttribute("lastname");
		PrintWriter o=response.getWriter();
		o.write("<br>");
		o.write(news1);
		o.write("<br>");
		o.write(news2);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String s1=request.getParameter("fn");
		String s2=request.getParameter("ln");
		
		HttpSession s=request.getSession();
		
		s.setAttribute("firstname", s1);
		s.setAttribute("lastname", s2);
		
		
	}

}
