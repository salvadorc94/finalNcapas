package com.uca.rustic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uca.rustic.domain.Sucursal;
import com.uca.rustic.repositories.SucursalRepository;


@Service
public class SucursalServiceImp implements SucursalService {
		
	@Autowired
	public SucursalRepository sucursalrepository;

	@Override
	public List<Sucursal> findAll() {
		return sucursalrepository.findAll();
	}

	@Transactional
	@Override
	public void delete(int id) {
		sucursalrepository.deleteById(id);
	}

	@Override
	public Sucursal findOne(Integer id) {
		return sucursalrepository.getOne(id);
	}

	@Transactional
	@Override
	public void insert(Sucursal s) {
		sucursalrepository.save(s);
	}
	
	


}
