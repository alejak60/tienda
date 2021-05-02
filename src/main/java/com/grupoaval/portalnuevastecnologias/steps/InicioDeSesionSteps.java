package com.grupoaval.portalnuevastecnologias.steps;


import com.grupoaval.portalnuevastecnologias.pageobjects.PortalNuevasTecnologiasHome;

import net.thucydides.core.annotations.Step;

public class InicioDeSesionSteps {

	PortalNuevasTecnologiasHome portalAFCHome= new PortalNuevasTecnologiasHome();
	
	@Step
	public void abrirPortalAFC() {
		portalAFCHome.open();
	}
	
	@Step
	public void clickCuenta() {
		portalAFCHome.clickCuenta();
	}
	
	@Step
	public void clickIngresar() {
		portalAFCHome.clickIngresar();
	}
	
	@Step
	public void escribirUsuario(String usuario) {
		portalAFCHome.escribirUsuario(usuario);
	}
	
	@Step
	public void escribirClave(String clave) {
		portalAFCHome.escribirClave(clave);
	}
	
	@Step
	public void clicEnIngresar() {
		portalAFCHome.clicEnIngresar();
	}
	
	@Step
	public void presionarEnterEnCampoClave() {
		portalAFCHome.presionarEnterEnCampoClave();
	}

	@Step
	public void validarPresenciaYContenidoDelMensaje(String mensaje) {
		portalAFCHome.validarPresenciaYContenidoDeMensaje(mensaje);
	}
	
	@Step
	public void clicEnBotonDeCuenta() {
		portalAFCHome.clicEnBotonDeCuenta();
	}
	
	@Step
	public void validarPresenciaYContenidoDeEtiquetaUsuario(String usuario) {
		portalAFCHome.validarPresenciaYContenidoDeEtiquetaUsuario(usuario);
	}
	
	@Step
	public void validarPresenciaYContenidoDeEtiquetaNombreUsuario(String nombreDeUsuario) {
		portalAFCHome.validarNombreUsuarioDesplegableCuenta(nombreDeUsuario);
	}
	
	@Step
	public void validarQueNoAparezcaElMensajeEnPantalla(String mensaje) {
		portalAFCHome.validarQueNoAparezcaElMensajeEnPantalla(mensaje);
	}
	
	@Step
	public void validarQueNoAparezcaUnNombreDeUsuario(String nombreDeUsuario) {
		portalAFCHome.validarQueNoAparezcaUnNombreDeUsuario(nombreDeUsuario);
	}
	
	@Step
	public void validarQueNoAparezcaUnUsuario(String usuario) {
		portalAFCHome.validarQueNoAparezcaUnUsuario(usuario);
	}
	
	@Step
	public void clicEnCampoUsuario() {
		portalAFCHome.clicEnCampoUsuario();
	}
	
	@Step
	public void clicEnCampoClave() {
		portalAFCHome.clicEnCampoClave();
	}
	
	@Step
	public void clickEnRegistrarme() {
		portalAFCHome.clickRegistro();
	}
	
	@Step
	public void escribirUsuarioRegistro(String usuario) {
		portalAFCHome.escribirUsuarioRegistro(usuario);
	}
	
	@Step
	public void escribirUsuarioDocumento(String usuario) {
		portalAFCHome.escribirDocumentoRegistro(usuario);
	}
	
	@Step
	public void escribirUsuarioPassword(String usuario) {
		portalAFCHome.escribirPasswordRegistro(usuario);
	}
	
	@Step
	public void escribirUsuarioNombre(String usuario) {
		portalAFCHome.escribirNombreRegistro(usuario);
	}
	
	@Step
	public void escribirUsuarioApellido(String usuario) {
		portalAFCHome.escribirApellidoRegistro(usuario);
	}
	
	@Step
	public void clickBotonRegistro() {
		portalAFCHome.clickBotonRegistroUsuario();
	}
	
	@Step
	public void validarPresenciaYContenidoDelMensajeRegistroUsuario(String mensaje) {
		portalAFCHome.validarMensajeRegistroUsuario(mensaje);
	}
	
	
}
