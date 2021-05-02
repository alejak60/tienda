package com.grupoaval.portalnuevastecnologias.pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://aae49f8cf479211eaad3c0ed862d58a0-8482866.us-east-1.elb.amazonaws.com/")
public class PasarelaDePagoPage extends PageObject {

//Process of product pay in PORTAL Nuevas Tecnologias
WebDriver driver;
// 1).Formulario direccion de envio
By clicProcederAlPago = By.xpath("//a[contains(@href, '/checkout')]");

By clicNombre = By.xpath("//input");

By clicApellido = By.xpath("//div[2]/mat-form-field/div/div/div/input");

By clicIngrearSegundoApellido = By.xpath("//div[3]/mat-form-field/div/div/div/input");

By clicIngresarCompania = By.xpath("//div[4]/mat-form-field/div/div/div/input");

By clicIngresarCorreo = By.xpath("//div[5]/mat-form-field/div/div/div/input");

By clicIngresarTelefono = By.xpath("//div[6]/mat-form-field/div/div/div/input");

By clicListaPaises =  By.xpath("//span[contains(.,'País')]");

By clicIngresarCiudad = By.xpath("//div[8]/mat-form-field/div/div/div/input");

By clicIngresarProvincia = By.xpath("//div[9]/mat-form-field/div/div/div/input");

By clicIngresarPostal = By.xpath("//div[10]/mat-form-field/div/div/div/input");

By clicIngresarDireccion = By.xpath("//div[11]/mat-form-field/div/div/div/input");

   By clicBotonContinuarPago = By.xpath("//div[@id='cdk-step-content-0-0']/form/div[2]/button");
   
   By clicBotonDireccionEnvio = By.xpath("//mat-step-header[@id='cdk-step-label-4-0']/div[3]/div");
   
   By clicPais = By.xpath("//mat-option[48]/span");
   
   By validarSumaTotal = By.xpath("//h2/span[2]");
   
   By valorTotalProductos = By.xpath("//div[@id='app']/app-pages/mat-sidenav-container/mat-sidenav-content/div/app-cart/mat-card/div/div[4]/div[5]/div/span[3]");
   
 //2).Detalle de orden
   By btnIrEnvio = By.xpath("//button[contains(.,'navigate_before')]");
   
   By btnConfirmarPedido = By.xpath("//button[2]");
   
 // 3).Metodo de pago PSE
   By btnMetodoPse = By.xpath("//mat-icon[contains(.,'account_balance')]");
   
 //Formulario metodo de pago PSE
   By campoSelecionarBanco = By.xpath(" //Pasarela de pago");
   
   By campoTipoPersona = By.xpath("//form[2]/div/div[3]/mat-form-field/div/div/div");
   
   By campoTitular = By.xpath("//form[2]/div/div[4]/mat-form-field/div/div/div/input");
   
   By campoDocumento = By.xpath("//span[contains(.,'Tipo de documento')]");
   
   By campoNumeroDocumento = By.xpath("//form[2]/div/div[6]/mat-form-field/div/div/div/input");
   
   By campoCorreo = By.xpath("//div[7]/mat-form-field/div/div/div/input");
   
   By campoTelefono = By.xpath("//form[2]/div/div[8]/mat-form-field/div/div/div/input");
   
   By btnRealizarPago = By.xpath("//button[contains(.,'Realizar pago')]");
   
   By scrollBajarResultadoPago = By.xpath("//modal/div");
  // 4).Confirmacion de pago
   By btnFinalizarCompra = By.xpath("//button[contains(.,'Finalizar Compra')]");
   
   By btnRegresarTienda = By.xpath("//*[@id=\"cdk-step-content-2-3\"]/div[2]/a");
   
   By clickEnlacesPago = By.xpath("//a[contains(@href, '/checkout')]");
   
   By clickDesplegablePago = By.xpath("(//a[contains(@href, '/checkout')])[2]");
   
   By productoDetalleUno = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div[1]/div/div[2]/div[2]/div[5]/font/font");

   By productoDetalleDos = By.xpath("//div[@id='cdk-step-content-0-1']/div/div/div[2]/div[3]/div[5]/font/font");
   
//En carrito de compras da click en el boton "PROCEDER AL PAGO".    
public void botonProcederAlPago()  {
find(clicProcederAlPago).click();
}
//1).Formulario direccion de envio:
//En Detalle de envio Ingresa data en el campo "NOMBRE".
public void ingresarNombre(String nombre)  {
find(clicNombre).sendKeys(nombre);
}
//En Detalle de envio Ingresa data en el campo "PRIMER APELLIDO".
public void ingresarPrimerApelido(String apellido)  {
find(clicApellido).sendKeys(apellido);
}
//En Detalle de envio Ingresa data en el campo "SEGUNDO APELLIDO".
public void ingresarSegundoApellido(String SegundoApellido) {
find(clicIngrearSegundoApellido).sendKeys(SegundoApellido);
}
//En Detalle de Envio Ingresa Data en el Campo "COMPAÑIA".
public void ingresarCompania(String compania) {
find(clicIngresarCompania).sendKeys(compania);
}
//En Detalle de envio Ingresa data en el campo "CORREO".
public void ingresarCorreo(String correo) {
find(clicIngresarCorreo).sendKeys(correo);

}
//En Detalle de envio Ingresa data en el campo "PRIMER APELLIDO".
public void ingresarTelefono(String telefono) {
find(clicIngresarTelefono).sendKeys(telefono);

}
//En Detalle de Envio Ingresa Data en el Campo "PAIS".
public void seleccionarPais(String pais)  {
find(clicListaPaises).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
String paisSeleccionado = "//span[contains(.,'"+pais+"')]";
//span[contains(.,'Angola')]
find(paisSeleccionado).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

try {
	Thread.sleep(500);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
//En Detalle de Envio Ingresa Data en el Campo "CIUDAD".
public void ingresarCiudad(String ciudad) {
find(clicIngresarCiudad).sendKeys(ciudad);
}
//En Detalle de Envio Ingresa Data en el Campo "ZIP/CODIGO POSTAL".
public void ingresarPostal(String postal)  {
find(clicIngresarPostal).sendKeys(postal);
}
//En Detalle de Envio Ingresa Data en el Campo "ESTADO/PROVINCIA".
public void ingresarProvincia(String provincia)  {
find(clicIngresarProvincia).sendKeys(provincia);
}
//En Detalle de Envio Ingresa Data en el Campo "DIRECCION".
public void ingresarDireccion(String direccion)  {
find(clicIngresarDireccion).sendKeys(direccion);
}

//En Detalle de Envio damos click en el boton "NEXT o SIGUIENTE"
public void botonContinuarPagando()  {
find(clicBotonContinuarPago).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
//2).DETALLE DE ORDEN:
//En Detalle de orden damos click en el boton "CONFIRMAR PEDIDO"
public void botonConfirmarPedido()  {
try {
espera(2000);
Scroll(0,350);
espera(1000);
} catch (Exception e) {
e.printStackTrace();
}
find(btnConfirmarPedido).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
//3).METODO DE PAGO
//En metodo de pago seleccionamos la opcion "DEBITO PSE"
public void metodoDePago() {
find(btnMetodoPse).click();
try {
espera(2000);
Scroll(0,360);
espera(1000);
} catch (Exception e) {
e.printStackTrace();
}
}
// a)Formulario;
//Seleccionamos banco en el campo "BANCO GRUPO AVAL*".
public void seleccionandoBanco(String banco)  {
String divBanco = "//span[contains(.,'Banco grupo aval')]";
find(divBanco).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String divBancoSeleccionado = "//span[contains(.,'"+banco+"')]";
find(divBancoSeleccionado).click();
}
//Seleccionamos el tipo de persona en el campo "TIPO DE PERSONA *".
public void tipoPersona(String persona)  {
find(campoTipoPersona).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String divPersona = "//span[contains(.,'"+persona+"')]";
find(divPersona).click();
}

//Ingresamos nombre del titular de la cuenta en el campo "NOMBRE TITULAR *".
public void nombreTitular(String titular) {
find(campoTitular).click();
find(campoTitular).sendKeys(titular);
}
//Seleccionamos el tipo de documento en el campo "TIPO DE DOCUMENTO *".
public void campoTipoDocumento(String tipo)  {
find(campoDocumento).click();
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String divTipo = "//span[contains(.,'"+tipo+"')]";
find(divTipo).click();
}
//Ingresamos el numero de documento en el campo "DOCUMENTO *".
public void numeroDocumento(String numero) {
find(campoNumeroDocumento).click();
find(campoNumeroDocumento).sendKeys(numero);
}
//Ingresamos correo electroninco el campo "EMAIL".
public void correoElectronico(String email) {
find(campoCorreo).sendKeys(email);
}
//Ingresamos telefono en el campo "TELEFONO *".
public void telefono(String telefono) {
find(campoTelefono).sendKeys(telefono);
}
//Damos click en el boton "REALIZAR PAGO".
public void botonPago()  {
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
find(btnRealizarPago).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Vemos el mensaje de resultado de pago y damos click en el boton "FINALIZAR COMPRA".

}//Fin formulario

// 4).CONFIRMACION
//Confirmacion del pago con el mensaje "Felicidades! Su orden ha sido procesada".


public void finalizarCompra()  {
find(btnFinalizarCompra).click();
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
public void mensajeCompraExitosa() {
String compraExitosa = "//h2[contains(.,'Felicidades! Su orden ha sido procesada')]";
if (compraExitosa.equals("//h2[contains(.,'Felicidades! Su orden ha sido procesada')]"));
{
System.out.println("HEMOS COMPRADO NUESTROS PRODUCTOS ¡YEAH!!!");

}
}

public void chulitoDesplegable() {
	find(clickDesplegablePago).click();
}

public void enlacesUtilesPago() {
	find(clickEnlacesPago).click();
}

//Metodos Adicionales
public void Scroll(int ParametroInt1, int ParametroInt2)  {
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

public void esperar() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}




}