package com.grupoaval.portalnuevastecnologias.entities;

public class Pasarela {

	String nombre = "";
	String apellido = "";
	String segundoApellido = "";
	String compania = "";
	String correo = "";
	String telefono = "";
	String pais = "";
	String ciudad = "";
	String provincia = "";
	String postal = "";
	String direccion = "";
	String persona = "";
	String tipo = "";
	String numero = "";
	String banco = "";
	String titular = "";
	String email = "";

	public Pasarela(String tipo, String email, String numero, String banco, String persona, String titular,
			String nombre, String apellido, String postal, String telefono, String direccion, String pais,
			String ciudad, String provincia, String segundoApellido, String correo, String compania) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.segundoApellido = segundoApellido;
		this.correo = correo;
		this.compania = compania;
		this.postal = postal;
		this.pais = pais;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.telefono = telefono;
		this.titular = titular;
		this.tipo = tipo;
		this.persona = persona;
		this.titular = titular;
		this.banco = banco;
		this.numero = numero;
		this.email = email;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getapellido() {
		return apellido;
	}

	public void setapellido(String apellido) {
		this.apellido = apellido;
	}

	public String getsegundoApellido() {
		return segundoApellido;
	}

	public void setsegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
