package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.dto.AuthenticationDto;
import com.app.pojos.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmpDetails();
	
	public Optional<Employee> getEmployeeDetails(Long empId);
	
	public Employee addEmployeeDetails(Employee transientEmp);
	
	public Employee updateEmpDetails(Employee detachedEmp);
	
	public String deleteEmpDetails(Long empId);
	
	public Optional<Employee> AuthenticateEmp(AuthenticationDto dto);
	
	

}
