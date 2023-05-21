package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.CountryDAO;
import VO.CountryVO;

/**
 * Servlet implementation class CountryController
 */
@WebServlet("/CountryController")
public class CountryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CountryController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");

			if(flag.equals("searchCountry"))
			{
				searchCountry(request,response);
				response.sendRedirect("SearchCountry.jsp");
			}
			else if(flag.equals("deleteCountry"))
			{
				deleteCountry(request,response);
				searchCountry(request,response);
				response.sendRedirect("SearchCountry.jsp");
			}
			else if(flag.equals("editCountry"))
			{
				editCountry(request,response);
				response.sendRedirect("EditCountry.jsp");
			}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");

			if(flag.equals("insertCountry"))
			{
				insertCountry(request,response);
				response.sendRedirect("AddCountry.jsp");
	
			}
			else if(flag.equals("updateCountry"))
			{
				updateCountry(request,response);
				searchCountry(request,response);
				response.sendRedirect("SearchCountry.jsp");
			}


	}
	protected void insertCountry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String country = request.getParameter("country");

		CountryVO countryVO = new  CountryVO();
		countryVO.setCountryName(country);

		CountryDAO countryDAO = new CountryDAO();
		countryDAO.insertCountry(countryVO);
	}

	protected void searchCountry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		CountryDAO countryDAO = new CountryDAO();
		List countryData = countryDAO.searchCountry();

		HttpSession s =request.getSession();
		s.setAttribute("countryData", countryData);

	}
	protected void deleteCountry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int id = Integer.parseInt(request.getParameter("id"));
		
		CountryVO countryVO = new CountryVO();
		countryVO.setCountryId(id);
		
		CountryDAO countryDAO = new CountryDAO();
		countryDAO.deleteCountry(countryVO);

	}
	protected void editCountry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int id = Integer.parseInt(request.getParameter("id"));
		
		CountryVO countryVO = new CountryVO();
		countryVO.setCountryId(id);
		
		CountryDAO countryDAO = new CountryDAO();
		List countryList = countryDAO.editCountry(countryVO);
		
		HttpSession s = request.getSession();
		s.setAttribute("countryList", countryList);
	}
	protected void updateCountry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int id = Integer.parseInt(request.getParameter("id"));
		String country = request.getParameter("country");
		
		CountryVO countryVO = new CountryVO();
		
		countryVO.setCountryId(id);
		countryVO.setCountryName(country);
		
		CountryDAO countryDAO = new CountryDAO();
		countryDAO.updateCountry(countryVO);

	}

}
