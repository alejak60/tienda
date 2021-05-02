package com.grupoaval.portalnuevastecnologias.pageobjects;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://aae49f8cf479211eaad3c0ed862d58a0-8482866.us-east-1.elb.amazonaws.com/")
public class DetalleProductoPage extends PageObject {

	// Escenario 1

	By clickAgregarAListaDeDeseos = By.xpath("//button[contains(.,'favorite')]");

	By clickVerListaDeDeseos = By.xpath("//a[contains(@href, '/wishlist')]");

	// Escenario 2

	By clickBtnCompararProducto = By.xpath("//button[contains(.,'compare')]");

	By clickAVerComparar = By.xpath("//a[contains(@href, '/compare')]");

	By clickRemoverProductoAComparar = By.cssSelector(".remove");

	// Escenario 3

	By clickRemoverProductoListaDeDeseos = By.cssSelector(".Eliminar");

	// Escenario 4

	By clickImagenProducto = By.xpath(
			"//*[@id=\"app\"]/app-pages/mat-sidenav-container/mat-sidenav-content/div[1]/app-product/div[1]/div[1]/div/div/div/div[1]/mat-card");

	// Escenario 5

	By clickDivDescription = By.xpath("//div[2]/div/div/div/div");

	By clickDivAditionalInformation = By.xpath("//div/div/div[2]/div");

	By clickDivReviews = By.xpath("//div[3]/div");

	// Escenario 6

	// By clickTextNombreProductoComparar = By.cssSelector(".product-name");

	// Escenario 7

	By clickLimpiarProducto = By.xpath("//button[contains(.,'Limpiar')]");

	// Escenario 1

	public void agregarProductoAListaDeseos() {
		find(clickAgregarAListaDeDeseos).click();
		espera(5000);
	}

	public void seleccionarListaDeseos() {
		find(clickVerListaDeDeseos).click();
		espera(5000);
	}

	public void validarProductoListaDeDeseos(String mensaje) {
		validarPresenciaYContenidoDeMensaje(mensaje);
	}

	// Escenario 2

	public void agregarProductoAcComparar() {
		find(clickBtnCompararProducto).click();
	}

	public void seleccionarComparar() {
		find(clickAVerComparar).click();
		espera(4000);
	}

	public void validarProductoAComparar(String nombreProducto) {
		validarPresenciaYContenidoDeMensaje(nombreProducto);
	}

	public void clickRemoverProductoAComparar() {
		find(clickRemoverProductoAComparar).click();
		espera(4000);
	}

	// Escenario 3

	public void validarProductoListaDeseo(String nombreProducto) {
		validarPresenciaYContenidoDeMensaje(nombreProducto);
	}

	public void clickRemoverProductoEnListaDeseo() {
		find(clickRemoverProductoListaDeDeseos).click();
	}

	// Escenario 4

	public void validarImagenesProducto() {
		find(clickImagenProducto).click();
		espera(4000);
	}

	// Escenario 5

	public void scrollBajaADescrionProducto() {
		espera(1000);
		try {
			Scroll(0, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		espera(1000);
	}

	public void vizualizaItemsProducto() {
		find(clickDivDescription).click();
		espera(1000);
		find(clickDivAditionalInformation).click();
		espera(1000);
		find(clickDivReviews).click();
		espera(1000);
	}

	// Escenario 6
	
	public void clickNombreProductoComparar() {
		
	}

	public void clickNombreProductoComparar(String nombreProducto) {
		espera(4000);
		String clickTextNombreProductoComparar = "//a[contains(.,'" + nombreProducto +  "')]";
		find(clickTextNombreProductoComparar).click();
		espera(4000);
	}

	public void validarNombreProductoOpcionComparar(String nombreProducto) {
		espera(1000);
		validarNombreDeProductoComparar(nombreProducto);
		espera(1000);
	}

	// Escenario 7

	public void scrollProductosEnInicio() {
		espera(1000);
		try {
			Scroll(0, 1600);
		} catch (Exception e) {
			e.printStackTrace();
		}
		espera(1000);
	}

	public void seleccionaCategoriaEnCarousel(String categoria) {
		String clickLabelCategoria = "";
		if (categoria.equals("celulares")) {
			clickLabelCategoria = "//mat-tab-header/div[2]/div/div/div/div";
		} else if (categoria.equals("audio")) {
			clickLabelCategoria = "//div[2]/div/div/div[2]/div";
		} else if (categoria.equals("accesorios")) {
			clickLabelCategoria = "//div[2]/div/div/div[3]/div']";
		} else {
			throw new AssertionError("La categoria: " + categoria + " no existe", null);
		}
		find(clickLabelCategoria).click();
	}

	public void seleccionaProductoCarousel(String nombreProducto) {
		String seleccionarDivProducto = "//a[contains(.,'" + nombreProducto + "')]";
		find(seleccionarDivProducto).click();
	}

	// Escenario 8 y 9

	public void clickBotonLimpiarProductos() {
		find(clickLimpiarProducto).click();
	}

	public void validarPresenciaYContenidoDeMensaje(String mensaje) {
		waitForAngularRequestsToFinish();
		System.out.println("Aqui toy");
		WebElement lblMensaje = getDriver().findElement(By.xpath("//*[text()='" + mensaje + "']"));
		if (lblMensaje.isDisplayed()) {
			assertThat(lblMensaje.getText(), equalTo(mensaje));
		} else {
			throw new AssertionError("El elemento " + lblMensaje.toString() + " con mensaje '" + mensaje
					+ "' no está presente en la pantalla", null);
		}
	}

	public void validarQueNoAparezcaElMensajeEnPantalla(String mensaje) {
		waitForAngularRequestsToFinish();
		WebElement lblMensaje = getDriver().findElement(By.xpath("//*[text()='" + mensaje + "']"));
		if (lblMensaje.isDisplayed()) {
			throw new AssertionError("El elemento " + lblMensaje.toString() + " con mensaje '" + mensaje
					+ "' está presente en la pantalla", null);
		}
	}
	
	public void validarNombreDeProductoComparar(String mensaje) {
		waitForAngularRequestsToFinish();
		WebElement lblMensaje = getDriver().findElement(By.xpath("//h2[contains(.,'" + mensaje  + "')]"));
		if (lblMensaje.isDisplayed()) {
			assertThat(lblMensaje.getText(), equalTo(mensaje));
		} else {
			throw new AssertionError("El elemento " + lblMensaje.toString() + " con mensaje '" + mensaje
					+ "' no está presente en la pantalla", null);
		}
	}

	public void validarMensajeRegistroUsuario(String mensaje) {
		validarPresenciaYContenidoDeMensaje(mensaje);
	}

	public void Scroll(int ParametroInt1, int ParametroInt2) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(" + ParametroInt1 + "," + ParametroInt2 + ")", "");
	}

	public void espera(int milisegundos) {
		try {
			Thread.sleep(milisegundos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
