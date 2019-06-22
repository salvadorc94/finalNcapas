package com.uca.rustic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.rustic.domain.Usuario;
import com.uca.rustic.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UsuarioService  {

	@Autowired
	public UsuarioRepository usuariorepository;
	
	@Override
	public List<Usuario> findByUsuarioAndClave(String username, String password) {
		// TODO Auto-generated method stub
		return usuariorepository.findByUsuarioAndClave(username, password);
	}

}
