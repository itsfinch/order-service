package com.tcs.bbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.bbs.employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
