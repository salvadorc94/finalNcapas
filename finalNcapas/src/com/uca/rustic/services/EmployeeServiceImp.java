package com.uca.rustic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.rustic.domain.Empleado;
import com.uca.rustic.repositories.EmployeeRepository;


@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	public EmployeeRepository employeerepository;
	
	@Override
	public List<Empleado> findAll() {
		return employeerepository.findAll();
	}

	@Override
	public Empleado findOne(Integer id) {
		return employeerepository.getOne(id);
	}

	@Override
	public void delete(int id) {
		employeerepository.deleteById(id);
		
	}

	@Override
	public void insert(Empleado s) {
		employeerepository.save(s);
	}

}
