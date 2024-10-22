package com.tcs.bbs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bbs.employee.Employee;
import com.tcs.bbs.service.EmployeeService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public List<Employee> addEmployee(@RequestBody List<Employee> employeeList) {
		
		return employeeService.saveEmployee(employeeList);
	}
	
	@GetMapping("/getEmployee")
	public List<Employee> getEmployee(){
		return employeeService.getEmployee();
	}
	
	@GetMapping("/getEmployee/{employeeId}")
	public Optional<Employee> getEmployeeById(@PathVariable Integer employeeId){
		return employeeService.getEmployeeById(employeeId);
	}
	

}
