package com.uca.rustic.services;

import java.util.List;

import com.uca.rustic.domain.Sucursal;

public interface SucursalService {
	public List<Sucursal> findAll();
	
	public Sucursal findOne(Integer id);
	
	public void delete(int id);
	
	public void insert(Sucursal s);
}
