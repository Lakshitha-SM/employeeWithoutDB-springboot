package com.example.employeeapp.Entity;

public class Employee {
	private Long employeeId;
	private String employeeName;
	private String email;
	private Long salary;
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Employee(Long employeeId, String employeeName, String email, Long salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.salary = salary;
	}
	

}
