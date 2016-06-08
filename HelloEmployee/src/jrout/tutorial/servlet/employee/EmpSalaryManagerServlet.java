package jrout.tutorial.servlet.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jrout.tutorial.servlet.dao.EmployeeDAOImpl;
import jrout.tutorial.servlet.dao.IEmployeeDAO;
import jrout.tutorial.servlet.domain.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmpSalaryManagerServlet")
public class EmpSalaryManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmpSalaryManagerServlet() {
		super();
		System.out.println("I am been created");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("I am been initialized");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String password = req.getParameter("pwd");
		System.out.println(fname + " " + lname + " " + password);

		int deptId = Integer.parseInt(req.getParameter("deptId"));
		IEmployeeDAO employeeDAO = new EmployeeDAOImpl();
		List<Employee> employeeList = employeeDAO.getEmpSalaryManagerDepartMent(deptId);
		
		req.setAttribute("employeeList", employeeList);
		RequestDispatcher dispatcher = req.getRequestDispatcher("employeeSalaryManager.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

		@Override
	public void destroy() {
		System.out.println("I am been destroyed");
	}
	
}
