package com.utm.beans;

import org.springframework.stereotype.Component;

@Component
public class Equipo {
	private int id;
	private String nombre;
	public int getId() {
		return id;
	}
	
	
	
	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + "]";
	}



	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
