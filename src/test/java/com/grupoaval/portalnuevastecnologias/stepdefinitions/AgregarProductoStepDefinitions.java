package com.grupoaval.portalnuevastecnologias.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.awt.AWTException;
import java.util.List;

import com.grupoaval.portalnuevastecnologias.entities.Carrito;
import com.grupoaval.portalnuevastecnologias.entities.Producto;
import com.grupoaval.portalnuevastecnologias.steps.AgregarProductoAlCarritoSteps;;

public class AgregarProductoStepDefinitions {

	@Steps
	AgregarProductoAlCarritoSteps agregarProductoStep;

	String categoria;
	String mensajeNombreProducto;
	String mensajeProductoRemovido;

	// Escenario 1

	@Cuando("^selecciona una categoria$")
	public void seleccioneCategoria(List<Carrito> listCarrito) {
		categoria = listCarrito.get(0).getCategoria();
		agregarProductoStep.clickEnCatergoria(categoria);
	}

	@Cuando("^selecciona el producto$")
	public void seleccionaProducto(List<String> listaDeMensajes) {
		agregarProductoStep.clickEnSeleccionarProducto(listaDeMensajes.get(0));
	}

	@Cuando("^se agrega al carrito$")
	public void agregaProducto() {
		agregarProductoStep.clickEnAgregarProducto();
	}

	@Entonces("^valida que aparezca el siguiente mensaje:$")
	public void validarPopupProductoAgregado(List<String> listaDeMensajes) {
		agregarProductoStep.validarModalProductoAgregado(listaDeMensajes.get(0));
	}

	@Cuando("^valida que aparezca el producto agregado en el apartado de items del carrito$")
	public void vadidarProductoItem() throws AWTException {
		// Pendiente
		// agregarProductoStep.validarCarritoDeComprasItem();
	}

	@Cuando("^se ingresa al menu de Cuenta$")
	public void cickMenuCuenta() {
		agregarProductoStep.clickEnBotonPopupCarritoDeCompras();
	}

	@Cuando("^selecciona ver carrito$")
	public void clickVerCarrito() throws InterruptedException {
		agregarProductoStep.clickVerCarrito();
	}

	@Entonces("^valida que aparezca el producto agregado:$")
	public void validarProductoAgregado(List<String> listNombreProductos) {
		mensajeNombreProducto = listNombreProductos.get(0);
		agregarProductoStep.validarProductoAgregado(mensajeNombreProducto);
	}

	// Escenario 2

	@Cuando("^se remueve el producto del carrito$")
	public void removerProductoCarrito() {
		agregarProductoStep.removerProductoCarrito();
	}

	@Entonces("^valida que aparezca el siguiente mensaje en el carrito:$")
	public void validarProductoRemovido(List<String> listMensajeProductoRemovido) {
		mensajeProductoRemovido = listMensajeProductoRemovido.get(0);
		agregarProductoStep.validarProductoRemovido(mensajeProductoRemovido);
	}

	// Escenario 3

	@Cuando("^se aumenta la cantidad de productos$")
	public void aumentarCantidadProductoEnCarrito() {
		agregarProductoStep.aumentarProductoEnCarrito();
	}

	@Entonces("^valida que aparezca mas de un producto$")
	public void validarCantidadDeProducto() {
		// agregarProductoStep.validarCantidadProducto();
	}

	// Escenario 4

	@Cuando("^se disminuye la cantidad del producto$")
	public void disminuyeCantidadProductoEnCarrito() {
		agregarProductoStep.disminuirProductoEnCarrito();
	}

	@Entonces("^valida que aparezca la cantidad esperada$")
	public void validarCantidadDisminuidaDeProducto() {
		// agregarProductoStep.validarCantidadProductoDisminuido();
	}

	// Escenario 5

	@Cuando("^procedemos a realizar scroll$")
	public void scrollHomeProductos() {
		agregarProductoStep.dirigimosAProductosHome();
	}

	@Cuando("^seleccionamos comprar$")
	public void seleccionamosComprarEnHome() {
		agregarProductoStep.seleccionamosComprarHome();
	}

	// Escenario 6

	@Cuando("^se remueve producto en lista desplegable$")
	public void seRemueveProductoListaDesplegable() {
		agregarProductoStep.removerProductoListaDesplegable();
	}

	// Escenario 7
	@Cuando("^se limpia producto en lista desplegable$")
	public void seLimpiaProductoListaDesplegable() {
		agregarProductoStep.limpiarProductoListaDesplegable();
	}

	// Escenario 8
	@Cuando("^seleccionar continuar comprando$")
	public void seleccionarContinuarComprando() {
		agregarProductoStep.seleccionarContinuarComprandoEnCarrito();
	}

	// Escenario 9
	@Cuando("^seleccionar proceder pago$")
	public void seleccionarProcederPago() {
		agregarProductoStep.seleccionarProcederPagoEnCarrito();
	}

	@Cuando("^escoge otra categoria$")
	public void seleccionarOtraCategoria(List<Carrito> listaCarrito) {
		String categoriaAtras = "";
		categoriaAtras = listaCarrito.get(0).getCategoria();
		agregarProductoStep.clickEnCatergoria(categoriaAtras);
	}

	@Cuando("^agrega otro producto a comparar$")
	public void seleccionarOtroProducto(List<Producto> listaProductos) throws InterruptedException {
		String producto = "";
		producto = listaProductos.get(0).getProductoDos();
		agregarProductoStep.clickEnSeleccionarProductoDos(producto);
		agregarProductoStep.clickOtrosProductos();
		agregarProductoStep.dirigimosAProductosHome();
		agregarProductoStep.clickOtrosProductos();
		agregarProductoStep.compararProductos();
		agregarProductoStep.clickOtrosProductos();
	}

	@Entonces("^valida que aparezca el mensaje con el producto comparado:$")
	public void validarPopupProductoComparado(List<String> listaDeMensajes) {
		agregarProductoStep.validarModalProductoAgregado(listaDeMensajes.get(0));
	}
	
	@Cuando("^valida en la opcion comparar los productos$")
	public void validarProductosComparados() throws InterruptedException {
		agregarProductoStep.botonComparar();
	}
	
	@Cuando("^se agrega producto al carrito desde categoria$")
	public void agregarProductoDesdeCategoria() {
		agregarProductoStep.agregarProductoCategoria();
	}
	
	@Entonces("^Valida el valor total de los productos en desplegable carrito$")
	public void validarTotalDesplegable() {
		agregarProductoStep.validarTotal();
		
	}
	
	@Cuando("^valida suma total productos$")
	public void validarTotalProductosCarrito() {
		agregarProductoStep.validarSumaCarrito();
	}
	
	@Entonces("$quita cantidad de productos$")
	public void validarQuitarProductos() {
		agregarProductoStep.quitarProductos();
	}
	
	

}
