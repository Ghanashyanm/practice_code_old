package A2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jdbcsrev2
 */
@WebServlet("/jdbcsrev2")
public class jdbcsrev2 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jdbcsrev2() {
        super();
        // TODO Auto-generated constructor stub
    					}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String s1=request.getParameter("fn");
		String s2=request.getParameter("ln");
		String s3=request.getParameter("un");
		String s4=request.getParameter("pw");
		String s5=request.getParameter("country");
		String s6=request.getParameter("address");
		String s7=request.getParameter("gender");
		String[] s8=request.getParameterValues("hobby");
		String hb="";
		if(s7==null){
			hb="NULL";
					}
		else
		{
			for(String y:s8)
			{
				hb=hb+y+",";
				
			}
		}
	
	
	try
	{
		Class.forName("com.mysql.jdbc.Driver");

		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","root");
		Statement s=c.createStatement();


		s.executeUpdate("INSERT INTO servtbl (`first_name`, `last_name`, `user_name`, `password`, `country`,`address`, `gender`, `hobby`) VALUES ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+hb);
		

		s.close();
		c.close();
	}
	catch(Exception e){
		
	}
	//to delete data
	
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
