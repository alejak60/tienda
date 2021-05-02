package com.grupoaval.portalnuevastecnologias.entities;

public class Carrito {

	String categoria = "";
	
	String nombre = "";
	
	public Carrito(String categoria) {
		this.categoria = categoria;
	}
	
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
	
}
