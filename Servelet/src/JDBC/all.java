package JDBC;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class all
 */
@WebServlet("/all")
public class all extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public all() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
String flag = request.getParameter("flag");
		
		if (flag.equals("search")) {
			search(request, response);
		} else if (flag.equals("edit")) {
			edit(request, response);
		} else if (flag.equals("delete")) {
			delete(request, response);
			search(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");

		if (flag.equals("save")) {
			save(request, response);
			search(request, response);
		} else if (flag.equals("update")) {
			update(request, response);
			search(request, response);
		}

	}

	protected void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s2 = request.getParameter("fn");
		String s3 = request.getParameter("ln");
		String s4 = request.getParameter("un");
		String s5 = request.getParameter("password");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/servjdbc", "root", "root");
			Statement sn = cn.createStatement();
			sn.executeUpdate(
					"insert into tbl1(first_name,last_name,user_name,password) values('" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "')");
			sn.close();
			cn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void search(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String query = "select * from tbl1 ";

			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/servjdbc", "root", "root");
			Statement s = c.createStatement();
			PrintWriter o = response.getWriter();
			response.setContentType("text/html");

			ResultSet r = s.executeQuery(query);

			o.write("<table border='1px solid black'>");
			o.write("<tr>");
			o.write("<td>id</td>");
			o.write("<td>First_Name</td>");
			o.write("<td>Last_Name</td>");
			o.write("<td>Delete</td>");
			o.write("<td>Edit</td>");
			o.write("</tr>");

			while (r.next()) {

				o.write("<tr>");

				int i = r.getInt("id");
				String fn = r.getString("first_name");
				String ln = r.getString("last_name");

				o.write("<td>" + i + "</td>");
				o.write("<td>" + fn + "</td>");
				o.write("<td>" + ln + "</td>");
				o.write("<td> <a href='all?flag=delete&id=" + i + "'>Delete</a> </td>");
				o.write("<td> <a href='all?flag=edit&id=" + i + "'>Edit</a> </td>");

				o.write("</tr>");
			}

			o.write("</table>");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/servjdbc", "root", "root");
			Statement sn = cn.createStatement();
			sn.executeUpdate("delete from tbl1 where id = " + id);
			sn.close();
			cn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		PrintWriter out = response.getWriter();

		try {
			String query = "select * from tbl1 where id = " + id;

			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/servjdbc", "root", "root");
			Statement s = c.createStatement();
		
			response.setContentType("text/html");

			ResultSet r = s.executeQuery(query);

			out.println("<form action='all' method='post'>");

			while (r.next()) {

				int i = r.getInt("id");
				String fn = r.getString("first_name");
				String ln = r.getString("last_name");
				String un = r.getString("user_name");
				String password = r.getString("password");

				out.println("First Name <input type='text' name='fn' value='" + fn + "'>");
				out.println("<br>");

				out.println("Last Name <input type='text' name='ln' value='" + ln + "'>");
				out.println("<br>");

				out.println("User Name <input type='text' name='un' value='" + un + "'>");
				out.println("<br>");

				out.println("Password <input type='password' name='password' value='" + password + "'>");
				out.println("<br>");

				out.println("<input type='hidden' name='id' value='" + i + "'>");
				out.println("<br>");

				out.println("<input type='hidden' name='flag' value='update'>");
				out.println("<br>");
			}

			out.println("<input type='submit' value='update'>");

			out.println("</form>");

			s.close();
			c.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void update(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String s2 = request.getParameter("fn");
		String s3 = request.getParameter("ln");
		String s4 = request.getParameter("un");
		String s5 = request.getParameter("password");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/servjdbc", "root", "root");
			Statement sn = cn.createStatement();
			sn.executeUpdate("update tbl1 set first_name = '" + s2 + "' , last_name = '" + s3 + "' , user_name='" + s4 + "' , password = '"
					+ s5 + "' where id =  " + id);
			sn.close();
			cn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}


