package jrout.tutorial.servlet.dao;

import java.util.List;

import jrout.tutorial.servlet.domain.Employee;

public interface IEmployeeDAO {
	List<Employee> getEmpWithDepartMent(int deptId);
	List<Employee> getEmpSalaryManagerDepartMent(int deptId);
}