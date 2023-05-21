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
import DAO.StateDAO;
import VO.CountryVO;
import VO.StateVO;

/**
 * Servlet implementation class StateController
 */
@WebServlet("/StateController")
public class StateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StateController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");

		if(flag.equals("loadCountry"))
		{
			loadCountry(request,response);
			response.sendRedirect("AddState.jsp");
		}
		else if(flag.equals("searchState"))
		{
			searchState(request,response);
			loadCountry(request,response);
			response.sendRedirect("SearchState.jsp");
		}
		else if(flag.equals("deleteState"))
		{
			deleteState(request,response);
			searchState(request,response);
			loadCountry(request,response);
			response.sendRedirect("SearchState.jsp");
		}
		else if(flag.equals("editState"))
		{
			editState(request,response);
			response.sendRedirect("EditState.jsp");
		}
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");

		if(flag.equals("insertState"))
		{
			insertState(request,response);
			loadCountry(request,response);
			response.sendRedirect("AddState.jsp");
		}
		else if(flag.equals("updateState"))
		{
			updateState(request,response);
			searchState(request,response);
			loadCountry(request,response);
			response.sendRedirect("SearchState.jsp");
		}


	}
	protected void loadCountry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		CountryDAO countryDAO = new CountryDAO();
		List countryData = countryDAO.searchCountry();
		HttpSession s = request.getSession();
		s.setAttribute("countryData", countryData);

	}
	protected void insertState(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int countryId = Integer.parseInt(request.getParameter("countryId"));
		String state = request.getParameter("state");
		
		CountryVO countryVO = new CountryVO();
		countryVO.setCountryId(countryId);
		
		StateVO stateVO = new StateVO();
		stateVO.setStateName(state);
		stateVO.setCountryVO(countryVO);
		
		StateDAO stateDAO = new StateDAO();
		stateDAO.insertState(stateVO);

	}
	protected void searchState(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		StateDAO stateDAO = new StateDAO();
		List stateData = stateDAO.searchState();
		
		HttpSession s = request.getSession();
		s.setAttribute("stateData", stateData);

	}
	protected void deleteState(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		
		StateVO stateVO = new StateVO();
		stateVO.setId(id);
		
		StateDAO stateDAO = new StateDAO();
		stateDAO.deleteState(stateVO);
	}
	protected void editState(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		
		StateVO stateVO = new StateVO();
		stateVO.setId(id);
		
		StateDAO stateDAO = new StateDAO();
		List stateList = stateDAO.editState(stateVO);
		
		HttpSession s = request.getSession();
		s.setAttribute("stateList", stateList);
		
		CountryDAO countryDAO = new CountryDAO();
		List countryList = countryDAO.searchCountry();
		
		s.setAttribute("countryList", countryList);
		
	}
	protected void updateState(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String state = request.getParameter("state");
		
		int countryId = Integer.parseInt(request.getParameter("countryId"));
		
		CountryVO countryVO = new CountryVO();
		countryVO.setCountryId(countryId);
		
		StateVO stateVO = new StateVO();
		stateVO.setId(id);
		stateVO.setStateName(state);
		stateVO.setCountryVO(countryVO);
		
		StateDAO stateDAO = new StateDAO();
		stateDAO.updateState(stateVO);
		
	}
}
