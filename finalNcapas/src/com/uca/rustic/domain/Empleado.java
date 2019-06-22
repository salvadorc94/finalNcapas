package com.uca.rustic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

@Entity
@Table(schema="public", name="empleado")
public class Empleado {

	@Id
	@GeneratedValue(generator="empleado_codigo_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "empleado_codigo_seq", sequenceName = "public.empleado_codigo_seq", allocationSize = 1)
	@Column(name = "codigo")
	private int codigo;
	
	@NotEmpty(message="Employee name can't be empty")
	@NotNull
	@Column(name = "nombre")
	private String nombre;
	
	@NotEmpty(message="Age can't be empty")
	@Min(1)
	@NotNull
	@Column(name = "edad")
	private int edad;
	
	@NotEmpty(message="Gender can't be empty")
	@NotNull
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "estado")
	private Boolean estado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sucursal")
	private Sucursal sucursal;
	
	public String getEstadoDelegate() {
		if(this.estado == null) return "";
		else {
			return estado == true ? "Activo":"Inactivo";
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Empleado() {
		super();
	}
	
	
	
}
