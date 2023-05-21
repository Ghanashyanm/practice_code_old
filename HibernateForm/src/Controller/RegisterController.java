package Controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.LoginDAO;
import DAO.RegDAO;
import VO.LoginVO;
import VO.RegVO;
import sun.util.logging.resources.logging_de;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		
		
		
		 if(flag.equals("searchReg"))
		{
			searchReg(request,response);
			response.sendRedirect("SearchReg.jsp");
		}
		else if(flag.equals("deleteReg"))
		{
			deleteReg(request,response);
			searchReg(request,response);
			response.sendRedirect("SearchReg.jsp");
		}
		else if(flag.equals("editReg"))
		{
			editReg(request,response);
			response.sendRedirect("EditReg.jsp");
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String flag = request.getParameter("flag");
		if(flag.equals("insert"))
		{
			insert(request,response);
			response.sendRedirect("Registration.jsp");
		}
		
		else if(flag.equals("updateReg"))
		{
			updateReg(request,response);
			searchReg(request,response);
			response.sendRedirect("SearchReg.jsp");
		}
		
	
		
	}
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fn = request.getParameter("fn");
		String ln = request.getParameter("ln");
		String un = request.getParameter("un");
		String pwd = request.getParameter("pwd");
		
		LoginVO loginVO = new LoginVO();
		loginVO.setUn(un);
		loginVO.setPwd(pwd);
		
		LoginDAO loginDAO = new LoginDAO();
		loginDAO.insertLogin(loginVO);
		
		RegVO regVO = new RegVO();
		regVO.setFn(fn);
		regVO.setLn(ln);
		regVO.setLoginVO(loginVO);
		
		RegDAO regDAO = new RegDAO();
		
		regDAO.insertReg(regVO);
		
	}
	
	protected void searchReg(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RegDAO  regDAO = new RegDAO();
		List RegData = regDAO.searchReg();
		
		HttpSession s = request.getSession();
		
		s.setAttribute("RegData", RegData);
		
	}
	
	protected void deleteReg(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(request.getParameter("id"));
		int loginId = Integer.parseInt(request.getParameter("loginId"));
		
		RegVO regVO = new RegVO();
		regVO.setId(id);

		RegDAO regDAO = new RegDAO();
		regDAO.deleteReg(regVO);		
		
		LoginVO loginVO = new LoginVO();
		loginVO.setLoginId(loginId);
		
		
		LoginDAO loginDAO = new LoginDAO();
		loginDAO.deleteLogin(loginVO);		
		
	}
	
	protected void editReg(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		
		LoginVO loginVO = new LoginVO();
		loginVO.setLoginId(id);
		
		LoginDAO loginDAO = new LoginDAO();
		List loginData = loginDAO.editLogin(loginVO);
		
		RegVO regVO = new RegVO();
		regVO.setId(id);
		
		RegDAO regDAO = new RegDAO();
		List regData = regDAO.editReg(regVO);
		
		HttpSession s = request.getSession();
		s.setAttribute("loginData", loginData);
		s.setAttribute("regData", regData);
		
	}
	
	protected void updateReg(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(request.getParameter("id"));
		int loginId = Integer.parseInt(request.getParameter("loginId"));
		System.out.println(loginId);
		System.out.println(id);
		
		String fn = request.getParameter("fn");
		String ln = request.getParameter("ln");
		
		String un = request.getParameter("un");
		String pwd = request.getParameter("pwd");
		
		LoginVO loginVO = new LoginVO();
		loginVO.setLoginId(loginId);
		loginVO.setPwd(pwd);
		loginVO.setUn(un);
		
		LoginDAO loginDAO = new LoginDAO();
		loginDAO.updateLogin(loginVO);
		
		RegVO regVO = new  RegVO();
		regVO.setId(id);
		regVO.setFn(fn);
		regVO.setLn(ln);
		regVO.setLoginVO(loginVO);
		
		RegDAO regDAO = new RegDAO();
		regDAO.updateReg(regVO);
		
	}

}
