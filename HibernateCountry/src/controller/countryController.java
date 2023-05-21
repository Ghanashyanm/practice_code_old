package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.*;
import DAO.countryDAO;
import VO.countryVO;

/**
 * Servlet implementation class countryController
 */
@WebServlet("/countryController")
public class countryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public countryController() {
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
		String flag = request.getParameter("flag");

		System.out.println(flag);

		if (flag.equals("searchCountry")) {
			searchCountry(request, response);
			response.sendRedirect("countrySearch.jsp");
		} else if (flag.equals("delete")) {
			deleteCountry(request, response);
			searchCountry(request, response);
			response.sendRedirect("countrySearch.jsp");
		}
		 else if (flag.equals("edit")) {
				editCountry(request, response);
				response.sendRedirect("editCountry.jsp");
			}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String flag = request.getParameter("flag");
		if (flag.equals("insert"))
		{
			insertCountry(request, response);
			response.sendRedirect("AddCountry.jsp");
		}
		else if (flag.equals("updateCountry")) {
			updateCountry(request, response);
			searchCountry(request, response);
			response.sendRedirect("countrySearch.jsp");
		}
	}

	protected void insertCountry(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String country = request.getParameter("country");
		countryVO v = new countryVO();
		v.setCountryName(country);

		countryDAO d = new countryDAO();
		d.insert(v);

	}

	protected void searchCountry(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		countryDAO d = new countryDAO();

		List ls = d.searchCountry();

		HttpSession s = request.getSession();
		s.setAttribute("countryData", ls);

	}

	protected void deleteCountry(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int countryId = Integer.parseInt(request.getParameter("countryId"));

		countryVO v = new countryVO();
		v.setCountryId(countryId);

		countryDAO d = new countryDAO();
		d.deleteState(v);
		d.deleteCountry(v);
	}
	protected void editCountry(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int countryId = Integer.parseInt(request.getParameter("countryId"));

		countryVO v = new countryVO();
		v.setCountryId(countryId);

		countryDAO d = new countryDAO();
		List ls = d.editCountry(v);
		
		HttpSession s = request.getSession();
		s.setAttribute("countryData", ls);
		
		
	}
	protected void updateCountry(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id= Integer.parseInt(request.getParameter("countryId"));
		String country = request.getParameter("countryName");
		
		countryVO v = new countryVO();
		v.setCountryId(id);
		v.setCountryName(country);
		
		countryDAO d = new countryDAO();
		d.upadateCountry(v);

	}

}
