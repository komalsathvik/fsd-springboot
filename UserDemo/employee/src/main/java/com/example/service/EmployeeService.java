package com.example.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired(required=true)
	private EmployeeRepo repo;
	
	//create
	public Employee save(Employee e) {
		return repo.save(e);
	}
	
	//READ ALL
	public List<Employee> getAll(){
		return repo.findAll();
	}
	
	// Read By Id
	public Employee getById(int id) {
		return repo.findById(id).orElse(null);
	}
}
