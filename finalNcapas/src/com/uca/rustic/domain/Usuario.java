package com.uca.rustic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

@Entity
@Table(schema="public", name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(generator="usuario_idusuario_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "usuario_idusuario_seq", sequenceName = "public.usuario_idusuario_seq", allocationSize = 1)
	@Column(name = "idusuario")
	private int idusuario;
	
	@NotEmpty(message="Username required")
	@NotNull
	@Column(name = "usuario")
	private String usuario;
	
	@NotEmpty(message="Password required")
	@NotNull
	@Column(name="clave")
	private String clave;

	public Usuario() {
		super();
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
}
