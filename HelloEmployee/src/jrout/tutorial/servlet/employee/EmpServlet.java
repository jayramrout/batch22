package jrout.tutorial.servlet.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmpServlet() {
		super();
		System.out.println("I am been created");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("I am been initialized");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        //http://localhost:8082/HelloEmployee/EmpServlet?deptId=60
        int deptId = Integer.parseInt(request.getParameter("deptId"));
        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException var18) {
            var18.printStackTrace();
        }

        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.6:1521/XE", "HR", "HR");
            stmt = con.createStatement();
            rs = stmt.executeQuery("select EMPLOYEE_ID , FIRST_NAME , LAST_NAME , EMAIL from employees where DEPARTMENT_ID = "+ deptId);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<table class=\"table table-striped table-bordered\">");
            //out.println("<table style=\"width:100%\">");
            out.println("<thead>");
            out.println("<tr>");
            out.println("<th>EMPLOYEE_ID</th>");
            out.println("<th>FIRST Name</th>");
            out.println("<th>Last Name</th>");
            out.println("<th>Email</th>");
            out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody>");

            while(rs.next()) {
                out.println("<tr><td class=\"info\">" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4) + "</td></tr>");
            }

            out.println("</tbody>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException exception) {
            exception.printStackTrace();
        } finally {
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }

        }

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
