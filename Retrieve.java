package curdoperations;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.dep.dao.DeptDao;
import com.deloitte.dept.beans.Dept;
import com.deloitte.dept.dao.impl.DeptDaoImpl;


/**
 * Servlet implementation class Retrieve
 */
@WebServlet("/Retrieve")
public class Retrieve extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		DeptDao dao=new DeptDaoImpl();
		List<Dept>deptlist=dao.getDept();
		out.println("<table border=2>");
		out.println("<tr><th>DEPTNO<TH>DNAME<TH>LOC</tr>");
		for(Dept e : deptlist){
			out.println("<tr>");
			out.println("<td>"+e.getDeptno()+"</td>");
			out.println("<td>"+e.getDname()+"</td>");
			out.println("<td>"+e.getLoc()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}
		
		
		
		
	}


