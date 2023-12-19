package treemap;

import java.util.TreeMap;

public class Employee {

	int empCode;
	String empName;
	String empDesignation;
	double salary;
	
	public Employee(int empCode, String empName, String empDesignation, double salary) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.salary = salary;
	}

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}