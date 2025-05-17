package com.example.employeeapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.employeeapp.Service.EmployeeService;
import com.example.employeeapp.Entity.Employee;




@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
@PostMapping
public Employee createEmployee(@RequestBody Employee employee) {
	return employeeService.createEmployee(employee);
}

@GetMapping
public List<Employee> getEmployee()
{
	return employeeService.getEmployee();
}

@PutMapping("/update/{empid}")
public String updateEmployee(@RequestBody Employee employee, @PathVariable("empid") Long employeeId) {
   
	return employeeService.updateEmployee(employee, employeeId);
}

@DeleteMapping("/delete")
public String deleteEmployee(@RequestParam("empid") Long employeeId) {
	return employeeService.deleteMethod(employeeId);
}


	

}
