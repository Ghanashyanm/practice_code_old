package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.countryDAO;
import DAO.stateDAO;
import VO.countryVO;
import VO.stateVO;

/**
 * Servlet implementation class StateController
 */
@WebServlet("/stateController")
public class stateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public stateController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String flag = request.getParameter("flag");

		if (flag.equals("loadCountry")) {
			
			loadCountry(request, response);
			response.sendRedirect("addState.jsp");
		}
		if (flag.equals("searchState")) {
			
			searchState(request, response);
			response.sendRedirect("ViewState.jsp");

		}
		if (flag.equals("deleteState")) {
			
			deleteState(request, response);
			searchState(request, response);
			response.sendRedirect("ViewState.jsp");

		}
		if (flag.equals("editState")) {
			
			editState(request, response);
			response.sendRedirect("editState.jsp");
			
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String flag = request.getParameter("flag");
		if (flag.equals("insert")) {
			insertState(request, response);
			loadCountry(request, response);
			response.sendRedirect("addState.jsp");
		}
		if (flag.equals("updateState")) {
			updateState(request, response);
			searchState(request, response);
			loadCountry(request, response);
			response.sendRedirect("ViewState.jsp");
		}

	}

	protected void searchState(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		stateDAO d = new stateDAO();

		List stateList = d.search(); // search method

		HttpSession session = request.getSession();
		session.setAttribute("stateList", stateList);
	}

	private void loadCountry(HttpServletRequest request, HttpServletResponse response) {
		countryDAO d = new countryDAO();

		List countryData = d.searchCountry(); // get methods
	
		HttpSession session = request.getSession();
		session.setAttribute("countryData", countryData);
		
	}

	protected void insertState(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int countryId = Integer.parseInt(request.getParameter("countryId"));

		String stateName = request.getParameter("stateName");

		stateVO stateVO = new stateVO();

		stateVO.setStateName(stateName);

		countryVO countryVO = new countryVO();
		countryVO.setCountryId(countryId);

		stateVO.setCountryVO(countryVO);

		stateDAO d = new stateDAO();
		d.insert(stateVO);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void deleteState(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		stateVO sv = new stateVO();

		int i = Integer.parseInt(request.getParameter("id"));
		sv.setId(i);
		
		stateDAO sd = new stateDAO();
		sd.deleteState(sv);

	}

	protected void editState(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i = Integer.parseInt(request.getParameter("stateId"));

		stateVO v1 = new stateVO();
		v1.setId(i);

		stateDAO d1 = new stateDAO();
		countryDAO countryDAO = new countryDAO();

		List stateList = d1.editState(v1);
		List countryList = countryDAO.searchCountry();

		HttpSession session = request.getSession();

		//System.out.println(countryList.size());

		session.setAttribute("countryData", countryList);
		session.setAttribute("stateList", stateList);
	}

	protected void updateState(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id1"));
		String state = request.getParameter("state");
		int countryId = Integer.parseInt(request.getParameter("countryId"));
		
		countryVO cv = new countryVO();
		cv.setCountryId(countryId);

		stateVO v2 = new stateVO();
		v2.setId(id);
		v2.setStateName(state);
		v2.setCountryVO(cv);

		stateDAO d2 = new stateDAO();
		d2.updateState(v2);
	}
}
