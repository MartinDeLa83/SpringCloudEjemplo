package com.atsistemas.cloud.entidades;

import java.io.Serializable;

public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String dni;
	private String nombre;
	
	public Usuario (){};
	
	public Usuario(long id, String dni, String nombre) {
		this.id=id;
		this.dni=dni;
		this.nombre=nombre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + "]";
	}
	

}
