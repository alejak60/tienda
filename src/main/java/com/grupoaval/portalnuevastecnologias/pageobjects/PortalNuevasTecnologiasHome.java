package com.grupoaval.portalnuevastecnologias.pageobjects;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://aae49f8cf479211eaad3c0ed862d58a0-8482866.us-east-1.elb.amazonaws.com/")
public class PortalNuevasTecnologiasHome extends PageObject {

	// Inicio de Sesion

	By clickCuenta = By.xpath(
			"//div[@id='app']/app-pages/mat-sidenav-container/mat-sidenav-content/mat-toolbar/mat-toolbar-row/app-top-menu/div/a");

	By clickIngresar = By.xpath("//div[@id='cdk-overlay-0']/div/div/span/a/span");

	By txtUsuario = By.xpath("//input[@formcontrolname='user']");

	By txtClave = By.xpath("//input[@formcontrolname='password']");

	By btnIngresar = By.xpath("//button[@class='mat-elevation-z6 mat-fab mat-primary']");

	By btnCuenta = By.xpath("//div[@class='top-menu']/a");

	By lblNombreDeUsuario = By.xpath("//div[@class='user-info ng-star-inserted']/p");

	By lblUsuario = By.tagName("small");

	// Registro de Usuario

	By btnRegistrarUsuario = By.xpath("//button[contains(.,'Registrarme')]");

	By txtUsuarioRegistro = By.xpath("//app-create-user/div/mat-card/div/div/form/mat-form-field/div/div/div/input");

	By txtDocumentoRegistro = By
			.xpath("//app-create-user/div/mat-card/div/div/form/mat-form-field[2]/div/div/div/input");

	By txtPasswordRegistro = By.xpath("//mat-form-field[3]/div/div/div/input");

	By txtNombreRegistro = By.xpath("//mat-form-field[4]/div/div/div/input");

	By txtApellidoRegistro = By.xpath("//mat-form-field[5]/div/div/div/input");

	By btnRegistrarUsuarioEnPortal = By.xpath("//app-create-user/div/mat-card/div/div/form/div/button");

	public void clickCuenta() {
		find(clickCuenta).click();
	}

	public void clickIngresar() {
		find(clickIngresar).click();
	}

	public void escribirUsuario(String usuario) {
		find(txtUsuario).sendKeys(usuario);

	}

	public void escribirClave(String clave) {
		find(txtClave).sendKeys(clave);
	}

	public void clicEnIngresar() {
		find(btnIngresar).click();
	}

	public void presionarEnterEnCampoClave() {
		find(txtClave).sendKeys(Keys.ENTER);
	}

	public void validarPresenciaYContenidoDeMensaje(String mensaje) {
		System.out.println("Aqui toy");
		WebElement lblMensaje = getDriver().findElement(By.xpath("//*[text()='" + mensaje + "']"));
		System.out.println("Aqui toy: " + lblMensaje.getText());
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

	public void validarNombreUsuarioDesplegableCuenta(String mensaje) {
		WebElement lblMensaje = getDriver().findElement(By.xpath("//span/div/p"));
		if (lblMensaje.isDisplayed()) {
			String mensajeText = lblMensaje.getText();
			mensajeText = quitarSaltos(mensajeText);
			mensajeText = quitarCorchetes(mensajeText);
			mensajeText = quitarSignosEspeciales(mensajeText);
			System.out.println("Nombre: " + mensajeText);
			assertThat(mensajeText, equalTo(mensaje));
		} else {
			throw new AssertionError("El elemento " + lblMensaje.toString() + " con mensaje '" + mensaje
					+ "' no está presente en la pantalla", null);
		}
	}

	public static String quitarSaltos(String cadena) {
		// Para el reemplazo usamos un string vacío
		return cadena.replaceAll("\n", " ");
	}

	public static String quitarCorchetes(String cadena) {
		// Para el reemplazo usamos un string vacío
		return cadena.replaceAll("(star )", "");
	}
	
    private static String quitarSignosEspeciales(String cadena) {
        return cadena.replaceAll("[(){},.;!?<>%]", "");
    }

	public void validarPresenciaYContenidoDeEtiquetaNombreUsuario(String nombreDeUsuario) {
		waitForAngularRequestsToFinish();
		if (find(lblNombreDeUsuario).isVisible()) {
			assertTrue("El elemento " + lblNombreDeUsuario.toString() + " no contiene el nombre de usuario.",
					find(lblNombreDeUsuario).getText().contains(nombreDeUsuario));
			assertTrue("El elemento " + lblNombreDeUsuario.toString() + " no está visible.",
					find(lblNombreDeUsuario).isVisible());

		} else {
			throw new AssertionError("El elemento " + lblNombreDeUsuario.toString() + " no está visible en la pantalla",
					null);
		}
	}

	public void validarPresenciaYContenidoDeEtiquetaUsuario(String usuario) {
		waitForAngularRequestsToFinish();
		if (find(lblUsuario).isVisible()) {
			assertTrue("El elemento " + lblUsuario.toString() + " no contiene el usuario.",
					find(lblUsuario).getText().contains(usuario));
			assertTrue("El elemento " + lblUsuario.toString() + " no está visible.", find(lblUsuario).isVisible());

		} else {
			throw new AssertionError("El elemento " + lblUsuario.toString() + " no está visible en la pantalla", null);
		}
	}

	public void clicEnBotonDeCuenta() {
		find(btnCuenta).click();
	}

	public void validarQueNoAparezcaUnNombreDeUsuario(String nombreDeUsuario) {
		if (getDriver().findElements(lblNombreDeUsuario).size() > 0) {
			throw new AssertionError(
					"El elemento " + lblNombreDeUsuario.toString() + " no debería estar presente en la pantalla", null);
		}
	}

	public void validarQueNoAparezcaUnUsuario(String usuario) {
		if (getDriver().findElements(lblUsuario).size() > 0) {
			throw new AssertionError(
					"El elemento " + lblUsuario.toString() + " no debería estar presente en la pantalla", null);
		}
	}

	public void clicEnCampoUsuario() {
		find(txtUsuario).click();
	}

	public void clicEnCampoClave() {
		find(txtClave).click();
	}

	public void clickRegistro() {
		find(btnRegistrarUsuario).click();
		espera(2000);
	}

	public void escribirUsuarioRegistro(String usuario) {
		find(txtUsuarioRegistro).sendKeys(usuario);
	}

	public void escribirDocumentoRegistro(String documento) {
		find(txtDocumentoRegistro).sendKeys(documento);
	}

	public void escribirPasswordRegistro(String password) {
		find(txtPasswordRegistro).sendKeys(password);
	}

	public void escribirNombreRegistro(String nombre) {
		find(txtNombreRegistro).sendKeys(nombre);
	}

	public void escribirApellidoRegistro(String apellido) {
		find(txtApellidoRegistro).sendKeys(apellido);
	}

	public void clickBotonRegistroUsuario() {
		find(btnRegistrarUsuarioEnPortal).click();
		espera(5000);
	}

	public void validarMensajeRegistroUsuario(String mensaje) {
		validarPresenciaYContenidoDeMensaje(mensaje);
	}

	public void espera(int milisegundos) {
		try {
			Thread.sleep(milisegundos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
