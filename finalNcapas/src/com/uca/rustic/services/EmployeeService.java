package com.uca.rustic.services;

import java.util.List;

import com.uca.rustic.domain.Empleado;

public interface EmployeeService {
	public List<Empleado> findAll();
	
	public Empleado findOne(Integer id);
	
	public void delete(int id);
	
	public void insert(Empleado s);
}
