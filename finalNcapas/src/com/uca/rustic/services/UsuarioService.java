package com.uca.rustic.services;

import java.util.List;

import com.uca.rustic.domain.Usuario;

public interface UsuarioService {
	public List<Usuario> findByUsuarioAndClave(String username, String password);
}
