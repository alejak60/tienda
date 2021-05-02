package com.grupoaval.portalnuevastecnologias.stepdefinitions;

import java.util.List;


import com.grupoaval.portalnuevastecnologias.steps.DetalleProductoSteps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class DetalleProductoStepDefinitions {

	@Steps
	DetalleProductoSteps detalleProductoSteps;

	// Escenario 1

	@Cuando("^se agrega a lista de deseo$")
	public void agregarALaListaDeDeseos() {
		detalleProductoSteps.agregarProductoAlistaDeDeseo();
	}

	@Cuando("^selecciona lista de deseo$")
	public void seleccionarListaDeDeseos() {
		detalleProductoSteps.seleccionarListaDeDeseos();
	}

	@Entonces("^valida que aparezca el producto agregado en lista de deseo:$")
	public void validarPopupProductoAgregado(List<String> listaDeMensajes) {
		detalleProductoSteps.validarProductoAgregadoALaListaDeDeseos(listaDeMensajes.get(0));
	}

	// Escenario 2

	@Cuando("^se agrega a comparar$")
	public void seAgregaProductoAComparar() {
		detalleProductoSteps.agregarProductoAComparar();
	}

	@Cuando("^selecciona comparar$")
	public void seleccionarCompararProducto() {
		detalleProductoSteps.seleccionaCompararProducto();
	}

	@Entonces("^valida que aparezca el producto agregado a comparar:$")
	public void validarProductoEnComparar(List<String> listaDeMensajes) {
		detalleProductoSteps.validarProductoAgregadoAComparar(listaDeMensajes.get(0));
	}

	@Cuando("^da clic sobre la opcion X para eliminar el producto$")
	public void clickEliminarProductoEnComparar() {
		detalleProductoSteps.clickSobreRemoverProductoEnComparar();
	}

	// Escenario 3

	@Entonces("^valida que aparezca el producto agregado a lista de deseo:$")
	public void validarProductoEnListaDeDeseo(List<String> listaDeMensajes) {
		detalleProductoSteps.validarProductoAgregadoAListaDeDeseo(listaDeMensajes.get(0));
	}

	@Cuando("^da clic sobre la opcion X para eliminar el producto en lista de deseo$")
	public void clickRemoverProductoEnListaDeDeseo() {
		detalleProductoSteps.clickSobreRemoverProductoEnListaDeDeseo();
	}

	// Escenario 4

	@Entonces("^valida que aparezcan fotos en el producto$")
	public void validarImagenesProducto() {
		detalleProductoSteps.validarImagenesProducto();
	}

	// Escenario 5
	@Cuando("^se realiza scroll$")
	public void scrollBajaADescripcion() {
		detalleProductoSteps.scrollBajaADescripcion();
	}

	@Entonces("^visualiza los items Description, Aditional information y Reviews$")
	public void visualizaItemsDeProducto() {
		detalleProductoSteps.vizualizaItemsDeProducto();
	}

	// Escenario 6
	@Cuando("^da clic sobre el nombre del producto$")
	public void clickSobreNombreProductoOpcionComparar(List<String> nombreProducto) {
		detalleProductoSteps.clickNombreProductoOpcionComparar(nombreProducto.get(0));
	}

	@Entonces("^valida que aparezca el producto$")
	public void validarNombreProductoRedireccionOpcionComprar(List<String> nombreProducto) {
		detalleProductoSteps.validarNombreProductoRedireccionDesdeOpcionComparar(nombreProducto.get(0));
	}

	// Escenario 7

	@Cuando("^el usuario realiza scroll$")
	public void scrollAProductosEnInicio() {
		detalleProductoSteps.scrollAProductosEnInicio();
	}

	@Cuando("^selecciona una categoria desde inicio$")
	public void seleccionaCategoriaDesdeCaruselDeProductos(List<String> listaDeCaregorias) {
		detalleProductoSteps.seleccionaCaterogiaDesdeCarousel(listaDeCaregorias.get(0));
	}

	@Cuando("^selecciona el producto de inicio$")
	public void seleccionaProductoEnCarousel(List<String> nombreProducto) {
		detalleProductoSteps.seleccionaProductoEnCarousel(nombreProducto.get(0));
	}

	// Escenario 8 y 9
	
	@Cuando("^da clic sobre la opcion Limpiar$")
	public void clickBotonLimpiarProductos() {
		detalleProductoSteps.clickBotonLimpiarProductos();
	}


}
