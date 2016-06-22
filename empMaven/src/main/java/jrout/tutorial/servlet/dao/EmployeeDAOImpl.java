package jrout.tutorial.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jrout.tutorial.servlet.domain.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;

	public EmployeeDAOImpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException var18) {
			var18.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "HR", "HR");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Employee> getEmpWithDepartMent(int deptId) {
		List<Employee> employeeList = new ArrayList<Employee>();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(
					"select EMPLOYEE_ID , FIRST_NAME , LAST_NAME , EMAIL from employees where DEPARTMENT_ID = "
							+ deptId);
			
			Employee emp = null;
			
			while (rs.next()) {
				emp = new Employee();
				emp.setFname(rs.getString(2));
				emp.setLname(rs.getString(3));
				emp.setEmail(rs.getString(4));
				emp.setEmployeeId(rs.getInt(1));
				employeeList.add(emp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return employeeList;
	}

	public List<Employee> getEmpSalaryManagerDepartMent(int deptId) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(
					"select first_name , salary , MANAGER_ID from employees where DEPARTMENT_ID = "
							+ deptId);
			Employee emp = null;
			
			while (rs.next()) {
				emp = new Employee();
				emp.setFname(rs.getString(1));
				emp.setSalary(rs.getInt(2));
				emp.setManagerId(rs.getInt(3));
				employeeList.add(emp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return employeeList;
	}
}