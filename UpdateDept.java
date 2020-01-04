package curdoperations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.dep.dao.DeptDao;
import com.deloitte.dept.dao.impl.DeptDaoImpl;

/**
 * Servlet implementation class UpdateDept
 */
@WebServlet("/UpdateDept")
public class UpdateDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		String dname=request.getParameter("dname");
		String loc=request.getParameter("loc");
		DeptDao dept=new DeptDaoImpl();
		int rows=dept.upDept(dname,loc,deptno);
		if(rows>0)
			out.println("inserted");
		else
			out.println(" not inserted");	
	}

}
