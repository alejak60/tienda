package com.grupoaval.portalnuevastecnologias.steps;

import java.awt.AWTException;

import com.grupoaval.portalnuevastecnologias.pageobjects.AgregarProductoAlCarritoPage;

import net.thucydides.core.annotations.Step;

public class AgregarProductoAlCarritoSteps {

	AgregarProductoAlCarritoPage agregarProductos = new AgregarProductoAlCarritoPage();

	// Escenario 1

	@Step
	public void clickEnCatergoria(String categoria) {
		agregarProductos.clicEnBotonDeCategoria(categoria);
	}

	@Step
	public void clickEnSeleccionarProducto(String nombreProducto) {
		agregarProductos.clickSeleccionarProducto(nombreProducto);
	}

	@Step
	public void clickEnAgregarProducto() {
		agregarProductos.clickEnBotonDeAgregarProducto();
	}

	@Step
	public void validarModalProductoAgregado(String mensaje) {
		// agregarProductos.validarPresenciaYContenidoDeMensaje(mensaje);
	}

	@Step
	public void validarCarritoDeComprasItem() throws AWTException {
		agregarProductos.verCarritoDeComprasItem();
		// agregarProductos.validarPresenciaYContenidoDeMensaje("Celular XIAOMI Mi A2
		// Lite DS 4G Dorado");
	}

	@Step
	public void clickEnBotonPopupCarritoDeCompras() {
		agregarProductos.clickEnBotonPopupCarritoDeCompras();
	}

	@Step
	public void clickVerCarrito() throws InterruptedException {
		agregarProductos.clickVerCarrito();
		agregarProductos.waiting();
	}

	@Step
	public void validarProductoAgregado(String mensaje) {
		agregarProductos.validarProductoEnCarrito(mensaje);
	}

	// Escenario 2

	@Step
	public void removerProductoCarrito() {
		agregarProductos.clickEnBotonRemover();
	}

	@Step
	public void validarProductoRemovido(String mensaje) {
		agregarProductos.validarProductoEnCarritoRemovido(mensaje);
	}

	// Escenario 3

	@Step
	public void aumentarProductoEnCarrito() {
		agregarProductos.aumentarCantidadProducto();
	}

	@Step
	public void validarCantidadProducto() {
		agregarProductos.validarCantidadProducto();
	}

	// Escenario 4

	@Step
	public void disminuirProductoEnCarrito() {
		agregarProductos.disminuirCantidadProducto();
	}

	@Step
	public void validarCantidadProductoDisminuido() {
		agregarProductos.validarCantidadProductoDisminuido();
	}

	// Escenario 5

	@Step
	public void dirigimosAProductosHome() {
		agregarProductos.scrollAProductosHome();
	}

	@Step
	public void seleccionamosComprarHome() {
		agregarProductos.clickComprarHome();
	}

	// Escenario 6

	@Step
	public void removerProductoListaDesplegable() {
		agregarProductos.clickRemoverProductoListaDesplegable();
	}

	// Escenario 7
	@Step
	public void limpiarProductoListaDesplegable() {
		agregarProductos.clickLimpiarProductoListaDesplegable();
	}

	// Escenario 8
	@Step
	public void seleccionarContinuarComprandoEnCarrito() {
		agregarProductos.clickContinuarComprandoEnCarrito();
	}

	// Escenario 9
	@Step
	public void seleccionarProcederPagoEnCarrito() {
		agregarProductos.clickProcederPagoEnCarrito();
	}

	@Step
	public void clickEnSeleccionarProductoUno(String productoUno) {
		agregarProductos.clickSeleccionarProductoUno(productoUno);
	}

	@Step
	public void clickEnSeleccionarProductoDos(String productoDos) {
		agregarProductos.clickSeleccionarProductoDos(productoDos);
	}
	
	@Step
	public void clickOtrosProductos() {
		agregarProductos.espera(4000);
	}
	
	 @Step
	 public void compararProductos() {
		 agregarProductos.seleccionarProductoAComparar();
	 }
	 
	 @Step
	 public void botonComparar() {
		 agregarProductos.botonCompararProductos();
	 }
	 
	 @Step
	 public void agregarProductoCategoria() {
		 agregarProductos.agregarProducto();
	 }
	 
	 @Step
	 public void validarTotal() {
		 agregarProductos.obtenerValorTotal();
	 }
	 
	 @Step
	 public void validarSumaCarrito() {
		 agregarProductos.sumaTotalProductosCarrito();
	 }
	 
	 @Step
	 public void quitarProductos() {
		 agregarProductos.quitarProductosCarrrito();
	 }
	 

}
