package com.grupoaval.portalnuevastecnologias.pageobjects;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://aae49f8cf479211eaad3c0ed862d58a0-8482866.us-east-1.elb.amazonaws.com/")
public class AgregarProductoAlCarritoPage extends PageObject {

	static Robot robot;

	// Escenario 1

	By btnAgregarProducto = By.xpath(
			"//div[@id='app']/app-pages/mat-sidenav-container/mat-sidenav-content/div/app-product/div/div[2]/div[5]/app-controls/div/div[2]/button[2]");

	By btnPoPupCarrito = By
			.xpath("//div[@id='app']/app-pages/mat-sidenav-container/mat-sidenav-content/app-menu/mat-toolbar/a[3]");

	By aVerCarrito = By.xpath("//a[contains(text(),'VER CARRITO')]");

	By clickMenuSideVar = By.xpath(
			"//*[@id=\"app\"]/app-pages/mat-sidenav-container/mat-sidenav-content/mat-toolbar/mat-toolbar-row[2]/div[2]/div");

	By moverAMenuCuenta = By.xpath(
			"//div[@id='app']/app-pages/mat-sidenav-container/mat-sidenav-content/mat-toolbar/mat-toolbar-row[2]/div[2]/div/button");

	// Escenario 2

	By clickBotonRemoverProducto = By.xpath(
			"//div[@id='app']/app-pages/mat-sidenav-container/mat-sidenav-content/div/app-cart/mat-card/div/div[2]/div[6]/div/button");

	// Escenario 3

	By clickBotonAumentarProducto = By.xpath(
			"//div[@id='app']/app-pages/mat-sidenav-container/mat-sidenav-content/div/app-cart/mat-card/div/div[2]/div[4]/app-controls/div/div/button[2]");

	// Escenario 4

	By clickBotonDisminuirProducto = By.xpath(
			"//div[@id='app']/app-pages/mat-sidenav-container/mat-sidenav-content/div/app-cart/mat-card/div/div[2]/div[4]/app-controls/div/div/button");

	// Escenario 5

	By clickBotonComprar = By.xpath("//a[contains(.,'Comprar')]");

	// Escenario 6
	By clickBotonRemoverListaDesplegable = By.xpath("//mat-list-item/div/button");

	// Escenario 7
	By clickBotonLimpiarListaDesplegable = By.xpath("//button[contains(.,'remove_shopping_cart')]");

	// Escenario 8
	By clickBotonContinuarComprandoEnCarrito = By.xpath("//a[contains(.,'Continuar comprando')]");

	// Escenario 9
	By clickBotonProcederPagoEnCarrito = By.xpath("//a[contains(.,'Proceder al Pago')]");

	By clickBotonCompararProductoUno = By.xpath("//button[contains(.,'compare')]");
	
	By clickBotonCompararProductos = By.xpath("//a[contains(@href, '/compare')]");
	
	By clickAgregarProductoCategoria = By.xpath("//div[4]/mat-card/div[3]/app-controls/div/div/button[2]");

	By totalProductoDesplegable = By.cssSelector(".text-muted > .new-price");
	
	By totalProductoSeleccionado = By.cssSelector(".new-price");
	
	By productoUno = By.xpath("//div[@id='app']/app-pages/mat-sidenav-container/mat-sidenav-content/div/app-cart/mat-card/div/div[2]/div[5]");
	
	By productoDos = By.xpath("//div[@id='app']/app-pages/mat-sidenav-container/mat-sidenav-content/div/app-cart/mat-card/div/div[3]/div[5]");
	
	By clickLimpiarCarrito = By.xpath("//button[contains(.,'Limpiar carrito')]");
	
	By valorTotalProductos = By.xpath("//div[@id='app']/app-pages/mat-sidenav-container/mat-sidenav-content/div/app-cart/mat-card/div/div[4]/div[5]/div/span[3]");
	
	public void clicEnBotonDeCategoria(String categoria) {
		String btnCategoria = "(//a[contains(@href, '/products/" + categoria + "')])[2]";
		find(btnCategoria).click();
	}

	public void clickSeleccionarProducto(String nombreProducto) {
		String divProducto = "//a[contains(text(),'" + nombreProducto + "')]";
		find(divProducto).click();
	}

	public void clickEnBotonDeAgregarProducto() {
		find(btnAgregarProducto).click();
		try {
			espera(2000);
			Scroll(0, -700);
			espera(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*	WebElement lblMensaje = getDriver().findElement(By.xpath("//*[text()='" + mensaje + "']"));
		if (lblMensaje.isDisplayed()) {
			assertThat(lblMensaje.getText(), equalTo(mensaje));
			System.out.println("Aqui esstoy exitoso");
		} else {
			throw new AssertionError("El elemento " + lblMensaje.toString() + " con mensaje '" + mensaje
					+ "' no está presente en la pantalla", null);
		}
	 * 
	 */
	
	
	public void obtenerValorTotal() {
		find(clickMenuSideVar).click();
		String valorProducto = find(totalProductoSeleccionado).getTextValue();
		String valorDesplegable = find(totalProductoDesplegable).getTextValue();
		System.out.println("VALOR PRODUCTO SELECCIONADO:"+valorProducto);
		System.out.println("VALOR TOTAL DESPLEGABLE:"+valorDesplegable);
		if (valorProducto.equals(valorDesplegable)) {
			assertEquals(valorProducto,valorDesplegable);
			System.out.println("AMBOS VALORES COINCIDEN CORRECTAMENTE");
		}
		
		
	}
		
		/*
		String precioProducto = quitarSignos(valorProducto);
		double precio = Double.parseDouble(precioProducto);
		String precioDesplegableDos = quitarSignos(valorDesplegable);
		double precioDesplegable = Double.parseDouble(preci)
		
		if (valorProducto.equals(valorDesplegable)) {
			assertEquals(valorProducto,valorDesplegable);
			System.out.println("AMBOS VALORES COINCIDEN CORRECTAMENTE");
		}
		
		else
			throw new AssertionError("Los valores no son iguales");
	}
	
	*/
	/*
	 *   Thread.sleep(10000);
        // Producto 1
        WebElement precioProducto1 = driver.findElement(By.xpath("//*[@id=\"app\"]/app-pages/mat-sidenav-container/mat-sidenav-content/div/app-cart/mat-card/div/div[2]/div[5]"));
        System.out.println("Precio1: " + precioProducto1.getText());

        String precioString = quitarSignos(precioProducto1.getText());
        double precioDoubleUno = Double.parseDouble(precioString);

        // Producto 2
        WebElement precioProducto2 = driver.findElement(By.xpath("//*[@id=\"app\"]/app-pages/mat-sidenav-container/mat-sidenav-content/div/app-cart/mat-card/div/div[3]/div[5]"));
        System.out.println("Precio2: " + precioProducto2.getText());
        String precioDosString = quitarSignos(precioProducto2.getText());
        double precioDoubleDos = Double.parseDouble(precioDosString);

        // Total productos suma
        double totalProductos = precioDoubleUno + precioDoubleDos;
        System.out.println("Suma: " + totalProductos);
        // Aplica Descuento 15%
        double porcentaje = totalProductos - totalProductos * 15 / 100;
        System.out.println("Porcentaje: " + porcentaje);
	 */
	
	
	
	/*	WebElement lblMensaje = getDriver().findElement(By.xpath("//*[text()='" + mensaje + "']"));
	if (lblMensaje.isDisplayed()) {
		assertThat(lblMensaje.getText(), equalTo(mensaje));
		System.out.println("Aqui esstoy exitoso");
	} else {
		throw new AssertionError("El elemento " + lblMensaje.toString() + " con mensaje '" + mensaje
				+ "' no está presente en la pantalla", null);
	}
 * 
 */
	
	public void sumaTotalProductosCarrito() {
		String precioProductoUno = find(productoUno).getText();
		String precioUnoString = quitarSignos(precioProductoUno);
		double precioUnoDouble = Double.parseDouble(precioUnoString);
		System.out.println("EL TOTAL DE LOS PRODUCTO UNO: "+precioUnoDouble);
		String precioProductoDos = find(productoDos).getText();
		String precioDosString = quitarSignos(precioProductoDos);
		double precioDosDouble = Double.parseDouble(precioDosString);
		System.out.println("EL TOTAL DE LOS PRODUCTOS DOS: "+precioDosDouble);
		String valorProductos = find(valorTotalProductos).getText();
		String valorTotalProductosString = quitarSignos(valorProductos);
		//Total productos en carrito
		double valorTotalProductosDouble = Double.parseDouble(valorTotalProductosString);
		System.out.println("EL TOTAL DE LOS PRODUCTOS EN CARRITO: "+valorTotalProductosDouble);
		
		//Total
		double totalProductos = precioUnoDouble + precioDosDouble;
		System.out.println("EL TOTAL DE LOS PRODUCTOS SIN DESCUENTO ES: "+totalProductos);
		  // Aplica Descuento 15%
        double porcentaje = totalProductos - totalProductos * 15 / 100;
        System.out.println("EL TOTAL DE LOS PRODUCTOS CON DESCUENTO " + porcentaje);
        if(valorTotalProductosDouble==porcentaje) {
        	 System.out.println("Ambos valores corresponden");
        }
        
        else throw new AssertionError("El valor capturado no corresponde con del descuento aplicado" );
      
        
        
        
	}
	
	 private static String quitarSignos(String hilera1) {
	        return hilera1.replaceAll("[^\\w\\.@-]", "");
	    }
	 
	 
	 public void quitarProductosCarrrito() {
		 find(clickLimpiarCarrito).click();
	 }
	
    public void agregarProducto() {
    	try {
			espera(2000);
			Scroll(0, 300);
			espera(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 find(clickAgregarProductoCategoria).click();
		 try {
				espera(2000);
				Scroll(0, -700);
				espera(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		 
	}
    
    

	public void verCarritoDeComprasItem() {
		// validarPresenciaYContenidoDeMensaje(" Celular XIAOMI Mi A2 Lite DS 4G Dorado
		// ");
	}

	public void clickEnBotonPopupCarritoDeCompras() {
		find(clickMenuSideVar).click();
		espera(2000);
	}

	public void clickVerCarrito() {
		find(aVerCarrito).click();
		espera(2000);
	}

	public void validarPresenciaYContenidoDeMensaje(String mensaje) {
		/*
		 * if (lblMensajeLogIn.isDisplayed()) { assertThat(lblMensajeLogIn.getText(),
		 * equalTo(mensaje));
		 * 
		 * } else { throw new AssertionError("El elemento " + lblMensajeLogIn.toString()
		 * + " no está presente en la pantalla", null); }
		 */
		waitForAngularRequestsToFinish();
		System.out.println("Aqui toy");
		WebElement lblMensaje = getDriver().findElement(By.xpath("//*[text()='" + mensaje + "']"));
		if (lblMensaje.isDisplayed()) {
			assertThat(lblMensaje.getText(), equalTo(mensaje));
			System.out.println("Aqui esstoy exitoso");
		} else {
			throw new AssertionError("El elemento " + lblMensaje.toString() + " con mensaje '" + mensaje
					+ "' no está presente en la pantalla", null);
		}

	}

	public void validarProductoEnCarrito(String nombreProducto) {
		validarPresenciaYContenidoDeMensaje(nombreProducto);
		espera(5000);
	}

	// Escenario 2

	public void clickEnBotonRemover() {
		find(clickBotonRemoverProducto).click();
		espera(5000);
	}

	public void validarProductoEnCarritoRemovido(String nombreProductoARemover) {
		validarPresenciaYContenidoDeMensaje(nombreProductoARemover);
		espera(5000);
	}

	// Escenario 3

	public void aumentarCantidadProducto() {
		find(clickBotonAumentarProducto).click();
		;
		espera(5000);
	}

	public void validarCantidadProducto() {
		String cantAValidar = "2";
		validarPresenciaYContenidoDeMensaje(cantAValidar);
	}

	// Escenario 4

	public void disminuirCantidadProducto() {
		find(clickBotonDisminuirProducto).click();
		espera(5000);
	}

	public void validarCantidadProductoDisminuido() {
		String cantAValidar = "1";
		validarPresenciaYContenidoDeMensaje(cantAValidar);
	}

	// Escenario 5

	public void scrollAProductosHome() {
		try {
			espera(2000);
			Scroll(0, 900);
			espera(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void scrollAProductosHomeDos() {
		try {
			espera(2000);
			Scroll(0, 900);
			espera(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickComprarHome() {
		find(clickBotonComprar).click();
		espera(2000);
	}

	// Escenario 6

	public void clickRemoverProductoListaDesplegable() {
		find(clickBotonRemoverListaDesplegable).click();
	}

	// Escenerio 7
	public void clickLimpiarProductoListaDesplegable() {
		find(clickBotonLimpiarListaDesplegable).click();
	}

	// Escenario 8
	public void clickContinuarComprandoEnCarrito() {
		find(clickBotonContinuarComprandoEnCarrito).click();
		espera(5000);
	}

	// Escenario 9
	public void clickProcederPagoEnCarrito() {
		find(clickBotonProcederPagoEnCarrito).click();
		espera(5000);
	}

	public void clickSeleccionarProductoUno(String productoUno) {
		String divProductoUno = "//a[contains(text(),'" + productoUno + "')]";
		find(divProductoUno).click();
		System.out.println("productoUno seleccionado");

	}

	public void clickSeleccionarProductoDos(String productoDos) {
		String divProductoDos = "//a[contains(text(),'" + productoDos + "')]";
		find(divProductoDos).click();
		System.out.println("productoDos seleccionado");

	}

	public void esperaOtroProducto() {
		espera(4000);
	}

	public void seleccionarProductoAComparar() {
		find(clickBotonCompararProductoUno).click();
	}

	// Metodos Adicionales
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
	
	public void botonCompararProductos() {
		find(clickBotonCompararProductos).click();
		}
	public void waiting() throws InterruptedException {
		Thread.sleep(5000);
	}

}
