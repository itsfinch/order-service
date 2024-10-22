package com.tcs.bbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.bbs.employee.Employee;
import com.tcs.bbs.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> saveEmployee(List<Employee> employeeList) {
		
		return employeeRepository.saveAll(employeeList);
	}

	public List<Employee> getEmployee() {

		return employeeRepository.findAll();
	}

	public Optional<Employee> getEmployeeById(Integer employeeId) {
		
		return employeeRepository.findById(employeeId);
	}

}
