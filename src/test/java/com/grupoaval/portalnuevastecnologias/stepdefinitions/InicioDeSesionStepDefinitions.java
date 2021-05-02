package com.grupoaval.portalnuevastecnologias.stepdefinitions;

import java.util.List;

import com.grupoaval.portalnuevastecnologias.entities.Registro;
import com.grupoaval.portalnuevastecnologias.entities.Usuario;
import com.grupoaval.portalnuevastecnologias.steps.InicioDeSesionSteps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class InicioDeSesionStepDefinitions {

	@Steps
	InicioDeSesionSteps inicioDeSesionSteps;
	
	String usuario;


	@Dado("^que Usuario ingresa al portal nuevas tecnologias$")
	public void queDavidIntreAlPortalAFC() {
		inicioDeSesionSteps.abrirPortalAFC();
		inicioDeSesionSteps.clickCuenta();
		inicioDeSesionSteps.clickIngresar();
	}

	
	@Cuando("^ingresa su usuario y clave$")
	public void ingresaSuUsuarioYClave(List<Usuario> listaDeUsuarios) {
		usuario=listaDeUsuarios.get(0).getUsuario();
		inicioDeSesionSteps.escribirUsuario(usuario);
		inicioDeSesionSteps.escribirClave(listaDeUsuarios.get(0).getClave());
	}

	@Cuando("^presiona la tecla Enter$")
	public void presionaLaTeclaEnter() {
		inicioDeSesionSteps.presionarEnterEnCampoClave();
        try {
            Thread.sleep(2000);
         } catch (InterruptedException ex) {
            System.out.println("Error> " + ex.getMessage());
        }
	}
	
	@Cuando("^presiona boton Ingresar$")
	public void presionaBotonIngresar() {
		inicioDeSesionSteps.clicEnIngresar();
        try {
            Thread.sleep(2000);
         } catch (InterruptedException ex) {
            System.out.println("Error> " + ex.getMessage());
        }
	}
	
	@Entonces("^deberia ver el siguiente mensaje en pantalla:$")
	public void deberiaVerElSiguienteMensajeEnPantalla(List<String> listaDeMensajes) {
		inicioDeSesionSteps.validarPresenciaYContenidoDelMensaje(listaDeMensajes.get(0));
	}

	@Entonces("^su nombre y usuario registrados deberian aparecer en el menu de Cuenta:$")
	public void suNombreYUsuarioRegistradosDeberianAparecerEnElMenuDeCuenta(List<String> listaNombre) {
		inicioDeSesionSteps.clicEnBotonDeCuenta();
		inicioDeSesionSteps.validarPresenciaYContenidoDeEtiquetaNombreUsuario(listaNombre.get(0));
	}

	@Cuando("^hace clic en el boton de Log In$")
	public void haceClicEnElBotonDeLogIn() {
		inicioDeSesionSteps.clicEnIngresar();
	}

	@Entonces("^no deberia ver el siguiente mensaje en pantalla:$")
	public void noDeberiaVerElSiguienteMensajeEnPantalla(List<String> listaDeMensajes) {
		inicioDeSesionSteps.validarQueNoAparezcaElMensajeEnPantalla(listaDeMensajes.get(0));
	}

	@Entonces("^no deberia ver su nombre en el menu de Cuenta$")
	public void noDeberiaVerSuNombreEnElMenuDeCuenta(List<String> listaDeNombres) {
		inicioDeSesionSteps.clicEnBotonDeCuenta();
		inicioDeSesionSteps.validarQueNoAparezcaUnNombreDeUsuario(listaDeNombres.get(0));
		inicioDeSesionSteps.validarQueNoAparezcaUnUsuario(usuario);
	}

	@Cuando("^hace clic sobre el campo Usuario$")
	public void haceClicSobreElCampoUsuario() {
		inicioDeSesionSteps.clicEnCampoUsuario();
	}

	@Cuando("^hace clic sobre el campo Clave$")
	public void haceClicSobreElCampoClave() {
		inicioDeSesionSteps.clicEnCampoClave();
	}
	

	@Cuando("^da click en Registrarme$")
	public void haceClickSobreRegistrarme() {
		inicioDeSesionSteps.clickEnRegistrarme();
	}
	
	@Cuando("^ingresa datos requeridos$")
	public void igresarDatosRegistroUsuario(List<Registro> listDatosRegistro) {
		inicioDeSesionSteps.escribirUsuarioRegistro(listDatosRegistro.get(0).getUsuario());
		inicioDeSesionSteps.escribirUsuarioDocumento(listDatosRegistro.get(0).getDocumento());
		inicioDeSesionSteps.escribirUsuarioPassword(listDatosRegistro.get(0).getPassword());
		inicioDeSesionSteps.escribirUsuarioNombre(listDatosRegistro.get(0).getNombre());
		inicioDeSesionSteps.escribirUsuarioApellido(listDatosRegistro.get(0).getApellido());
	}
	
	@Cuando("^da click en Registro$")
	public void haceClicSobreBotonRegistro() {
		inicioDeSesionSteps.clickBotonRegistro();
	}
	
	@Entonces("^deberia ver el siguiente mensaje de registro en pantalla:$")
	public void deberiaVerElSiguienteMensajeDeRegistroEnPantalla(List<String> listaDeMensajes) {
		inicioDeSesionSteps.validarPresenciaYContenidoDelMensajeRegistroUsuario(listaDeMensajes.get(0));
	}


}
