package JDBC;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class servjdbc4edit
 */
@WebServlet("/servjdbc4edit")
public class servjdbc4edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servjdbc4edit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String i=request.getParameter("Id");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/servjdbc","root","root");
			Statement s=c.createStatement();
			
			ResultSet rs=s.executeQuery("select *from tbl1 where id='"+i+"';");
			while(rs.next())
			{
				int id=rs.getInt("id");
				String fn=rs.getString("first_name");
				String ln=rs.getString("last_name");
				
				out.println("<form action='servjdbc5edittoupdate' method='post'>");
				
				out.println("First Name:<input type='text' name='fn' value='"+fn+"'>");
				out.println("Last Name:<input type='text' name='ln' value='"+ln+"'>");
				
				out.println("<input type='hidden' name='Id' value='"+id+"'>");
				out.println("<button>Submit</button>");
				out.println("</form>");
			}
		
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
