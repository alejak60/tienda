package com.grupoaval.portalnuevastecnologias.steps;


import com.grupoaval.portalnuevastecnologias.pageobjects.DetalleProductoPage;


import net.thucydides.core.annotations.Step;

public class DetalleProductoSteps {

	DetalleProductoPage detalleProducto= new DetalleProductoPage();
	
	@Step
	public void agregarProductoAlistaDeDeseo() {
		detalleProducto.agregarProductoAListaDeseos();
	}
	
	@Step
	public void validarProductoAgregadoALaListaDeDeseos(String mensaje) {
		detalleProducto.validarProductoListaDeDeseos(mensaje);
	}
	
	@Step
	public void seleccionarListaDeDeseos() {
		detalleProducto.seleccionarListaDeseos();
	}
	
	
	@Step
	public void agregarProductoAComparar() {
		detalleProducto.agregarProductoAcComparar();
	}
	
	@Step
	public void seleccionaCompararProducto() {
		detalleProducto.seleccionarComparar();
	}
	
	@Step
	public void validarProductoAgregadoAComparar(String mensaje) {
		detalleProducto.validarProductoAComparar(mensaje);
	}
	
	@Step
	public void clickSobreRemoverProductoEnComparar() {
		detalleProducto.clickRemoverProductoAComparar();
	}
	
	@Step
	public void validarProductoAgregadoAListaDeDeseo(String nombreProducto) {
		detalleProducto.validarProductoListaDeseo(nombreProducto);
	}
	
	@Step
	public void clickSobreRemoverProductoEnListaDeDeseo() {
		detalleProducto.clickRemoverProductoEnListaDeseo();
	}
	
	@Step
	public void validarImagenesProducto() {
		detalleProducto.validarImagenesProducto();
	}
	
	@Step
	public void scrollBajaADescripcion() {
		detalleProducto.scrollBajaADescrionProducto();
	}
	
	@Step
	public void vizualizaItemsDeProducto() {
		detalleProducto.vizualizaItemsProducto();
	}
	
	@Step
	public void clickNombreProductoOpcionComparar(String nombreProducto) {
		detalleProducto.clickNombreProductoComparar(nombreProducto);
	}
	
	@Step
	public void validarNombreProductoRedireccionDesdeOpcionComparar(String nombreProducto) {
		detalleProducto.validarNombreProductoOpcionComparar(nombreProducto);
	}
	
	@Step
	public void scrollAProductosEnInicio() {
		detalleProducto.scrollProductosEnInicio();
	}
	
	@Step
	public void seleccionaCaterogiaDesdeCarousel(String categoria) {
		detalleProducto.seleccionaCategoriaEnCarousel(categoria);
	}
	
	@Step
	public void seleccionaProductoEnCarousel(String nombreProducto) {
		detalleProducto.seleccionaProductoCarousel(nombreProducto);
	}
	
	@Step
	public void clickBotonLimpiarProductos() {
		detalleProducto.clickBotonLimpiarProductos();
	}
	
}
