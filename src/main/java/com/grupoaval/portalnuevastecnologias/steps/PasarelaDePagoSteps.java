package com.grupoaval.portalnuevastecnologias.steps;


import com.grupoaval.portalnuevastecnologias.pageobjects.PasarelaDePagoPage;

import net.thucydides.core.annotations.Step;

public class PasarelaDePagoSteps {
	PasarelaDePagoPage pagarProductos = new PasarelaDePagoPage();

	@Step
	public void clickEnProcederAlPago()  {
		pagarProductos.botonProcederAlPago();
	}

	// fill form, because I need to pay my product
	@Step
	public void Nombre(String nombre)  {
		pagarProductos.ingresarNombre(nombre);
	}

	@Step
	public void Apelido(String apellido) {
		pagarProductos.ingresarPrimerApelido(apellido);
	}

	@Step
	public void segundoApellido(String SegundoApellido) {
		pagarProductos.ingresarSegundoApellido(SegundoApellido);
	}

	@Step
	public void compania(String compania) {
		pagarProductos.ingresarCompania(compania);
	}

	@Step
	public void correo(String correo) {
		pagarProductos.ingresarCorreo(correo);
	}

	@Step
	public void telefono(String telefono) {
		pagarProductos.ingresarTelefono(telefono);
	}

	@Step
	public void pais(String pais) {
		pagarProductos.seleccionarPais(pais);
	}

	@Step
	public void ciudad(String ciudad)  {
		pagarProductos.ingresarCiudad(ciudad);
	}

	@Step
	public void provincia(String provincia) {
		pagarProductos.ingresarProvincia(provincia);
	}

	@Step
	public void postal(String postal){
		pagarProductos.ingresarPostal(postal);
	}

	@Step
	public void direccion(String direccion){
		pagarProductos.ingresarDireccion(direccion);
	}

	@Step
	public void continuarPagando() {
		pagarProductos.botonContinuarPagando();
	}

	// Metodo de pago

	@Step
	public void confirmarPedido() {
		pagarProductos.botonConfirmarPedido();
	}

	@Step
	public void metodoPago() {
		pagarProductos.metodoDePago();
	}

	@Step
	public void banco(String banco) {
		pagarProductos.seleccionandoBanco(banco);
		
	}

	@Step
	public void tipoPersona(String persona)  {
		pagarProductos.tipoPersona(persona);
	}

	@Step
	public void titular(String titular) {
		pagarProductos.nombreTitular(titular);
	}

	@Step
	public void tipodocumento(String tipo)  {
		pagarProductos.campoTipoDocumento(tipo);
	}

	@Step
	public void numero(String numero) {
		pagarProductos.numeroDocumento(numero);
	}

	@Step
	public void ingresarCorreo(String correo) {
		pagarProductos.correoElectronico(correo);
	}

	@Step
	public void ingresarTelefono(String telefono) {
		pagarProductos.telefono(telefono);
	}

	@Step
	public void pulsarBotonPagar()  {
		pagarProductos.botonPago();
		pagarProductos.mensajeCompraExitosa();
	}
	
	@Step
	public void informacionPago() {
		pagarProductos.esperar();
	}
	

	@Step
	public void finalizarOrden() {
		pagarProductos.finalizarCompra();
	}
	
	@Step
	public void orden() {
		pagarProductos.mensajeCompraExitosa();
	}
	
	@Step
	public void enlacesutilesPago() {
		pagarProductos.enlacesUtilesPago();
	}
	
	
	@Step
	public void chulitoPago() {
		pagarProductos.chulitoDesplegable();
	}
	
	@Step
	public void espera() {
		pagarProductos.esperar();
	}
	
}