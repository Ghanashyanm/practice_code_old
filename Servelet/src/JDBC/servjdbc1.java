package JDBC;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.*;

/**
 * Servlet implementation class servjdbc1
 */
@WebServlet("/servjdbc1")
public class servjdbc1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servjdbc1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String s1=request.getParameter("fn");
		String s2=request.getParameter("ln");
		String s3=request.getParameter("un");
		String s4=request.getParameter("pw");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/servjdbc","root","root");
			Statement s=c.createStatement();
			s.executeUpdate("INSERT INTO tbl1 (first_name,last_name,user_name,password) VALUES('"+s1+"','"+s2+"','"+s3+"','"+s4+"')");
			
			s.close();
			c.close();
			response.sendRedirect("RegisterJDBC.jsp");
		}
		catch(Exception z)
		{
			z.printStackTrace();
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
