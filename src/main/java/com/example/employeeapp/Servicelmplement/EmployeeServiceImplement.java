package com.example.employeeapp.Servicelmplement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.employeeapp.Service.EmployeeService;
import com.example.employeeapp.Entity.Employee;

@Service
public class EmployeeServiceImplement implements EmployeeService {
    private static List<Employee> empList = new ArrayList<>();

     
    public Employee createEmployee(Employee employee) {
        empList.add(employee);
        return employee;
    }


	@Override
	public List<Employee> getEmployee() {
		
		return empList;
	}


	@Override
	public String updateEmployee(Employee employee,Long employeeId) {
		for(int i=0;i<empList.size();i++) {
			Employee emp=empList.get(i);
			if(emp.getEmployeeId().equals(employeeId)) {
				emp.setEmployeeId(employee.getEmployeeId());
				emp.setEmployeeName(employee.getEmployeeName());
				emp.setEmail(employee.getEmail());
				emp.setSalary(employee.getSalary());
				empList.remove(i);
				empList.add(emp);
			}
			
		} 
		return "Employee Updated successfully : " +employeeId;
		
	}
	
	@Override
	public String deleteMethod(Long employeeId) {
		for(int i=0;i<empList.size();i++) {
			Employee emp=empList.get(i);
		if(emp.getEmployeeId().equals(employeeId))
				empList.remove(i);
				break;
			
			}
		return "Employee Deleted successfully : " +employeeId;
		
	}	
}
