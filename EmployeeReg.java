package Exercise5;

import java.util.ArrayList;

public class EmployeeReg {
	private ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	public EmployeeReg() {}

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
		}
	
	public Employee findEmployee(String ssn) {
		for(Employee employee:employeeList) {
			if(employee.getSsn().contentEquals(ssn)) {
				return employee;
				}
			}
		return null;
		}
	
	public void deleteEmployee(String ssn) {
		employeeList.remove(findEmployee(ssn));
		}
	
	public void updateEmployeeAddress(String ssn, String address) {
		Employee employee = findEmployee(ssn);
		employee.setAddress(address); 
		}
	
}
