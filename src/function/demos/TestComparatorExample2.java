package function.demos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	private int empId;
	private String empName;
	private double empSalary;
	public Employee(int empId, String empName, double empSalary) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public String toString() {
		return empId+" "+empName+" "+empSalary;
	}
}
public class TestComparatorExample2 {

	public static void main(String[] args) {
		List<Employee> listOfEmp = new ArrayList();
		listOfEmp.add(new Employee(11, "Gaurav", 24500.05));
		listOfEmp.add(new Employee(20, "Vaishnavi", 50000.07));
		listOfEmp.add(new Employee(8, "Krishna", 180542.27));
		listOfEmp.add(new Employee(1, "Ishnavi", 3456.67));
		
		// Sort employee based on salary
		Comparator<Employee> cmp = (e1, e2)->{
			if(e1.getEmpSalary()<e2.getEmpSalary()) {
				return 1;
			}
			return -1;
		};
		Collections.sort(listOfEmp, cmp);
		for(Employee e:listOfEmp) {
			System.out.println(e);
		}
	}
}