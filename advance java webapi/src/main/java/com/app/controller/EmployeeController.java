package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.AuthenticationDto;
import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping
	public List<Employee> getAllEmps()
	{
		return empService.getAllEmpDetails();
	}
	
	@GetMapping("/{empId}")
	public Optional<Employee> getEmp(@PathVariable Long empId)
	{
		return empService.getEmployeeDetails(empId);
	}
	
	@PostMapping
	public Employee addEmp(@RequestBody Employee transientEmp)
	{
		return empService.addEmployeeDetails(transientEmp);
	}
	
	@PutMapping
	public Employee updateEmp(@RequestBody Employee detachedEmp)
	{
		return empService.updateEmpDetails(detachedEmp);
	}
	
	@DeleteMapping("/{empId}")
	public String deleteEmp(@PathVariable Long empId)
	{
		return empService.deleteEmpDetails(empId);
	}
	
	@PostMapping("/Login")
	public String authEmp(@RequestBody AuthenticationDto dto)
	{
		if((empService.AuthenticateEmp(dto)).isPresent())
		{
			return "Login Sucessful";
		}
		return "Login failed....";
	}

}
