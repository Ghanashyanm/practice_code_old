package JDBC;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class servjdbc5edittoupdate
 */
@WebServlet("/servjdbc5edittoupdate")
public class servjdbc5edittoupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servjdbc5edittoupdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String i=request.getParameter("Id");
		String fn=request.getParameter("fn");
		String ln=request.getParameter("ln");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/servjdbc","root","root");
			Statement s=c.createStatement();
			
			s.executeUpdate("update tbl1 set first_name='"+fn+"',last_name='"+ln+"' where id='"+i+"'");
			response.sendRedirect("servjdbc2search");
		}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
