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
 * Servlet implementation class servjdbc2search
 */
@WebServlet("/servjdbc2search")
public class servjdbc2search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servjdbc2search() {
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
		PrintWriter out=response.getWriter();
		out.println("<table border=1>");
		out.println("<tr>");
		out.println("<th>");out.println("Id");out.println("</th>");
		out.println("<th>");out.println("First Name");out.println("</th>");
		out.println("<th>");out.println("Last Name");out.println("</th>");
		out.println("<th>");out.println("Action");out.println("</th>");
		out.println("<th>");out.println("Edit");out.println("</th>");
		out.println("</tr>");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost/servjdbc","root","root");
			Statement s=c.createStatement();
			
			ResultSet rs=s.executeQuery("select *from tbl1");
			while(rs.next())
			{
				
				int i=rs.getInt("id"); 
				String s2=rs.getString("first_name");
				String s3=rs.getString("last_name");
				
				
				out.println("<tr>");
				out.println("<td>");out.println(i);out.println("</td>");
				out.println("<td>");out.println(s2);out.println("</td>");
				out.println("<td>");out.println(s3);out.println("</td>");
				out.println("<td>");out.println("<a href='servjdbc3delete?Id="+i+"'>Delete</a></td>");
				out.println("<td>");out.println("<a href='servjdbc4edit?Id="+i+"'>Edit</a></td>");
				
				out.println("</tr>");
				
				
			
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
	}
		out.println("<table>");
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
