package A2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class search
 */
@WebServlet("/searchserv1")
public class serachserv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public searchserv1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * response.getWriter().append("Served at: ").append(request.
		 * getContextPath());
		 */
		// String s8 = request.getParameter("search");
		try {

			response.setContentType("text/HTML");
			PrintWriter o = response.getWriter();
			o.write("<table border=3>");
			o.write("<tr>");
			o.write("<td>");
			o.write("Firstname");
			o.write("</td>");
			o.write("<td>");
			o.write("Lastname");
			o.write("</td>");
			o.write("<td>");
			o.write("Username");
			o.write("</td>");
			o.write("<td>");
			o.write("Country");
			o.write("</td>");
			o.write("<td>");
			o.write("Adress");
			o.write("</td>");
			o.write("<td>");
			o.write("Gender");
			o.write("</td>");
			o.write("<td>");
			o.write("Hobby");
			o.write("</td>");
			o.write("<td>");
			o.write("Action");
			o.write("</td>");
			o.write("</tr>");

			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/demodb","root", "root");
			Statement x = c.createStatement();
			ResultSet r = x.executeQuery("SELECT * FROM servtbl ");
			while (r.next()) {

				int i = r.getInt("id");
				String s = r.getString("first_name");
				String s1 = r.getString("last_name");
				String s2 = r.getString("user_name");
				String s3 = r.getString("country");
				String s4 = r.getString("address");
				String s5 = r.getString("gender");
				String s6 = r.getString("hobby");

				o.write("<tr>");
				o.write("<td>");
				o.write(s);
				o.write("</td>");
				o.write("<td>");
				o.write(s1);
				o.write("</td>");
				o.write("<td>");
				o.write(s2);
				o.write("</td>");
				o.write("<td>");
				o.write(s3);
				o.write("</td>");
				o.write("<td>");
				o.write(s4);
				o.write("</td>");
				o.write("<td>");
				o.write(s5);
				o.write("</td>");
				o.write("<td>");
				o.write(s6);
				o.write("</td>");

				o.write("<td>");
				o.write("<a href='delete?id=" + i + "'>delete</a>");
				o.write("</td>");

				o.write("</tr>");

			}
			o.write("</table>");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}