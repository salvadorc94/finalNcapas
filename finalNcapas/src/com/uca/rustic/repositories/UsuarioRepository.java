package com.uca.rustic.repositories;
import com.uca.rustic.domain.Usuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	public List<Usuario> findByUsuarioAndClave(String username, String password);
	

}