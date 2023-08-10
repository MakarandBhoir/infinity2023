package test08;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Employee(int employeeId, String employeeName, double employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public void displayEmployee() {
		System.out.println("Employee Id = "+this.employeeId);
		System.out.println("Employee Name = "+this.employeeName);
		System.out.println("Employee Salary = "+this.employeeSalary);
	}
}
