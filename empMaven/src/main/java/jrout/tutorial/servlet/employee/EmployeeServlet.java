package jrout.tutorial.servlet.employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		super();
		System.out.println("I am been created");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("I am been initialized");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is Service Method");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("Date is " + new java.util.Date());

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		/*out.println(
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">");
		*/out.println("</head>");
		out.println("<body>");
		//out.println("<table class=\"table table-striped table-bordered\">");
		out.println("<table>");
		out.println("<thead>");
		out.println("<tr>");
		out.println("<th>EMPLOYEE_ID</th>");
		out.println("<th>FIRST Name</th>");
		out.println("<th>Last Name</th>");
		out.println("<th>Email</th>");
		out.println("</tr>");
		out.println("</thead>");
		out.println("<tbody>");
		out.println("<tr>");
		out.println("<td>100</td>");
		out.println("<td>Jackson</td>");
		out.println("<td>Rom</td>");
		out.println("<td>jack@Rom</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>John</td>");
		out.println("<td>Doe</td>");
		out.println("<td>80</td>");
		out.println("<td>john@doe</td>");
		out.println("</tr>");
		out.println("</tbody>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

	@Override
	public void destroy() {
		System.out.println("I am been destroyed");
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * //response.getWriter().append("Served at: "
	 * ).append(request.getContextPath()); response.getWriter().println(
	 * "Hello EMployee"); }
	 * 
	 *//**
		 * @see HttpServlet#doPost(HttpServletRequest request,
		 *      HttpServletResponse response)
		 *//*
		 * protected void doPost(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException { // TODO
		 * Auto-generated method stub doGet(request, response); }
		 */

}
