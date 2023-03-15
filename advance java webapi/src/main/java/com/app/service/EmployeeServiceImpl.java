package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.AuthenticationDto;
import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public List<Employee> getAllEmpDetails() {

		return empRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeDetails(Long empId) {

		return empRepo.findById(empId);
	}

	@Override
	public Employee addEmployeeDetails(Employee transientEmp) {

		return empRepo.save(transientEmp);
	}

	@Override
	public Employee updateEmpDetails(Employee detachedEmp) {

		return empRepo.save(detachedEmp);
	}

	@Override
	public String deleteEmpDetails(Long empId) {
		
		if(empRepo.existsById(empId))
		{
			empRepo.deleteById(empId);
			return "Sucessfully deleted......";
		}

		return "Deletion Failed......";
	}

	@Override
	public Optional<Employee> AuthenticateEmp(AuthenticationDto dto) {
		return empRepo.findByEmailAndPassword(dto.getEmail(), dto.getPassword());
	}

}
