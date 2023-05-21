package PasswordVerify;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class serv1
 */
@WebServlet("/serv1")
public class serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serv1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String s1=request.getParameter("fn");
		String s2=request.getParameter("ln");
		String s3=request.getParameter("un");
		String s4=request.getParameter("pw");
		
		HttpSession session=request.getSession();
		
		session.setAttribute("fn1", s1);
		session.setAttribute("ln1", s2);
		session.setAttribute("un1", s3);
		session.setAttribute("pw1", s4);
		
		response.sendRedirect("login.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		
		String s5=request.getParameter("unl");
		String s6=request.getParameter("pwl");
		
		String s7=(String)session.getAttribute("un1");
		String s8=(String)session.getAttribute("pw1");
		
		if(s5.equals(s7) && s6.equals(s8))
		{
		 response.sendRedirect("Welcome.jsp");	
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	
	}

}
