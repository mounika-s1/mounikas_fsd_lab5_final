package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {

		List<Employee> getAllEmployees();

		Employee saveEmployee(Employee employee);

		Employee getEmployeeById(int id);

		Employee updateEmployee(Employee employee);

		void deleteEmployeeById(Long id);

		Employee getEmployeeById(Long id);
	}

