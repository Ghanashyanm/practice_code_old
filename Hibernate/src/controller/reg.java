package controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.regdao;
import vo.regvo;

@WebServlet("/reg")
public class reg<E> extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public reg() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String opr = request.getParameter("opr");
		if(opr.equals("insert"))
		{
			String fn = request.getParameter("fn");
			String ln = request.getParameter("ln");
		
			regvo v = new regvo();
			v.setFn(fn);
			v.setLn(ln);
			regdao d = new regdao();
			d.insert(v);
		}
		if(opr.equals("search"))
		{
			String keyword = request.getParameter("keyword");
			regvo v = new regvo();
			v.setKeyword(keyword);
			regdao d = new regdao();
			List<?> ls = d.search(v);
			HttpSession session = request.getSession();
			session.setAttribute("list", ls);
			session.setAttribute("opr", "Search results");
			response.sendRedirect("search.jsp");
		}
		if(opr.equals("delete"))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			regvo v = new regvo();
			regdao d = new regdao();
			v.setId(id);
			d.delete(v);
			/*HttpSession session = request.getSession();
			session.setAttribute("opr", "delete");*/
			List<?> ls = d.ShowData();
			HttpSession session = request.getSession();
			session.setAttribute("list", ls);
			response.sendRedirect("search.jsp?deletion=true");
		}
		if(opr.equals("edit"))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			regvo v = new regvo();
			regdao<E> d = new regdao<E>();
			v.setId(id);
			List ls = d.edit(v);
			HttpSession session = request.getSession();
			session.setAttribute("list", ls);
			session.setAttribute("id", id);
			response.sendRedirect("edit.jsp");
		}
		if(opr.equals("update"))
		{
			String fn_updated = request.getParameter("fn_updated");
			String ln_updated = request.getParameter("ln_updated");
			HttpSession session = request.getSession();
			Integer id = (Integer)session.getAttribute("id");
			regvo v = new regvo();
			regdao<E> d = new regdao<E>();
			v.setId(id);
			v.setFn(fn_updated);
			v.setLn(ln_updated);
			d.update(v);
			List<?> ls = d.ShowData();
			session.setAttribute("list", ls);
			response.sendRedirect("search.jsp?updation=true");
		}
	}
}