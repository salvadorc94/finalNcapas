package com.uca.rustic.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

@Entity
@Table(schema="public", name="sucursal")
public class Sucursal {
	
	@Id
	@GeneratedValue(generator="sucursal_codigo_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sucursal_codigo_seq", sequenceName = "public.sucursal_codigo_seq", allocationSize = 1)
	@Column(name = "codigo")
	private int codigo;
	
	@NotEmpty(message="Branch name can't be empty")
	@NotNull
	@Column(name = "nombre")
	private String nombre;
	
	@NotEmpty(message="Branch location can't be empty")
	@NotNull
	@Column(name = "ubicacion")
	private String ubicacion;
	
	@NotEmpty(message="Opening hours can't be empty")
	@NotNull
	@Column(name = "horarioapertura")
	private String horarioapertura;
	
	@NotEmpty(message="Closing hours can't be empty")
	@NotNull
	@Column(name = "horariocierre")
	private String horariocierre;
	
	@Min(1)
	@NotNull
	@Column(name = "nmesas")
	private int nmesas;
	
	@NotEmpty(message="Name of the manager can't be empty")
	@NotNull
	@Column(name = "nomgerente")
	private String nomgerente;
	
	@OneToMany(mappedBy = "sucursal", fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Empleado> empleados;

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

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getHorarioapertura() {
		return horarioapertura;
	}

	public void setHorarioapertura(String horarioapertura) {
		this.horarioapertura = horarioapertura;
	}

	public String getHorariocierre() {
		return horariocierre;
	}

	public void setHorariocierre(String horariocierre) {
		this.horariocierre = horariocierre;
	}

	public int getNmesas() {
		return nmesas;
	}

	public void setNmesas(int nmesas) {
		this.nmesas = nmesas;
	}

	public String getNomgerente() {
		return nomgerente;
	}

	public void setNomgerente(String nomgerente) {
		this.nomgerente = nomgerente;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Sucursal() {
		super();
	}
	
	

}
