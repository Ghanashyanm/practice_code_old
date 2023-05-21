package controller;

import java.util.*;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.formDAO;
import VO.formVO;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String flag = request.getParameter("flag");
		if(flag.equals("search"))
		{
			search(request,response);
			response.sendRedirect("search.jsp");
		}
		if(flag.equals("delete")){
			delete(request,response);
			search(request,response);
			response.sendRedirect("search.jsp");
		}
		if(flag.equals("edit")){
			edit(request,response);
			response.sendRedirect("edit.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		
		if(flag.equals("insert")){
			
			insert(request,response);
			response.sendRedirect("form.jsp");
			
		}
		if(flag.equals("update")){
			
			update(request,response);
			search(request,response);
			response.sendRedirect("search.jsp");
			
		}
		
		
		
	}
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fn = request.getParameter("fn");
		String ln = request.getParameter("ln");
		
		formVO v = new formVO();
		v.setFirstname(fn);
		v.setLastname(ln);
		
		formDAO d = new formDAO();
		d.insert(v);
		
		
		
	}
	protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		formDAO d = new formDAO();
		List ls = d.search();
		
		HttpSession s = request.getSession();
		s.setAttribute("formData", ls);
	}
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		formVO v = new formVO();
		v.setId(id);
		
		formDAO d =new formDAO();
		d.delete(v);
		
	}
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		formVO v = new formVO();
		v.setId(id);
		
		formDAO d =new formDAO();
		List editData = d.edit(v);
		
		HttpSession s = request.getSession();
		s.setAttribute("editData", editData);
		
	}
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fn = request.getParameter("fn1");
		String ln = request.getParameter("ln1");
		int id = Integer.parseInt(request.getParameter("id"));
		
		formVO v = new formVO();
		v.setFirstname(fn);
		v.setLastname(ln);
		v.setId(id);
		
		formDAO d = new formDAO();
		d.update(v);
	}
}
