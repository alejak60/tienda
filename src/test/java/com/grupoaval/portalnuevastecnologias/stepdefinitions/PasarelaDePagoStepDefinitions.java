package com.grupoaval.portalnuevastecnologias.stepdefinitions;


import com.grupoaval.portalnuevastecnologias.entities.Pasarela;
import com.grupoaval.portalnuevastecnologias.steps.PasarelaDePagoSteps;
import java.util.List;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;


public class PasarelaDePagoStepDefinitions {
	@Steps
	PasarelaDePagoSteps pagarProductoStep;
	String datos;
	String pse;
	String pseCampos;
	String correoTelefono;
	String banco;
	String personas;
	String tipo;

	@Cuando("^presiona el boton proceder al pago$")
	public void procederAlPago() {
		pagarProductoStep.clickEnProcederAlPago();
	}

	@Cuando("^procede a realizar el check out, llenando un formulario$")
	public void llenarDatosFormulario(List<Pasarela> formularioEnvio)  {
		datos = formularioEnvio.get(0).getNombre();
		pagarProductoStep.Nombre(datos);
		pagarProductoStep.Apelido(formularioEnvio.get(0).getapellido());
		pagarProductoStep.segundoApellido(formularioEnvio.get(0).getsegundoApellido());
		pagarProductoStep.compania(formularioEnvio.get(0).getCompania());
		pagarProductoStep.correo(formularioEnvio.get(0).getCorreo());
		pagarProductoStep.telefono(formularioEnvio.get(0).getTelefono());
		pagarProductoStep.pais(formularioEnvio.get(0).getPais());
		pagarProductoStep.ciudad(formularioEnvio.get(0).getCiudad());
		pagarProductoStep.provincia(formularioEnvio.get(0).getProvincia());
		pagarProductoStep.postal(formularioEnvio.get(0).getPostal());
		pagarProductoStep.direccion(formularioEnvio.get(0).getDireccion());
	}

	@Entonces("^pulsa el boton siguiente valida que se dirija a Detalle de orden$")
	public void continuarPagando()  {
		pagarProductoStep.continuarPagando();

	}

	@Cuando("^valida que se dirija al siguiente formulario Metodo de pago$")
	public void confirmarPedido()  {
		pagarProductoStep.confirmarPedido();

	}

	@Cuando("^escoge el metodo de pago Debito PSE$")
	public void metodoDePago()  {
		pagarProductoStep.metodoPago();

	}

	@Entonces("^valida que se genere formulario PSE$")
	public void seleccionaBanco(List<Pasarela> listaBancos)  {
		banco = listaBancos.get(0).getBanco();
		pagarProductoStep.banco(listaBancos.get(0).getBanco());
	}

	@Cuando("^ingresa tipo de persona y nombre de titular$")
	public void ingresarTipo(List<Pasarela> listaPersona)  {
		personas = listaPersona.get(0).getPersona();
		pagarProductoStep.tipoPersona(personas);
		pagarProductoStep.titular(listaPersona.get(0).getTitular());

	}

	@Cuando("^selecciona tipo de documento y numero de documento$")
	public void tipoDocumentoNumero(List<Pasarela> listDocumentos)  {
		tipo = listDocumentos.get(0).getTipo();
		pagarProductoStep.tipodocumento(tipo);
		pagarProductoStep.numero(listDocumentos.get(0).getNumero());

	}

	@Cuando("^ingresa correo y telefono$")
	public void ingresarCorreoTelefono(List<Pasarela> listaDatos)  {
		correoTelefono = listaDatos.get(0).getEmail();
		pagarProductoStep.ingresarCorreo(correoTelefono);
		pagarProductoStep.ingresarTelefono(listaDatos.get(0).getTelefono());
	}

	@Entonces("^pulsa el boton realizar pago$")
	public void botonRealizarPago()  {
		pagarProductoStep.pulsarBotonPagar();
	}
	

	
	@Cuando("^verifica la informacion de la compra$")
	public void VerificarDetalleOrden() {
		pagarProductoStep.espera();
	}
	
	@Cuando("^se genera un resultado del pago con la informacion diligenciada$")
	public void informacionDiligenciada() {
		pagarProductoStep.informacionPago();
	}
	
	@Entonces("^hacemos clic en el boton finalizar compra$")
	public void botonFinalizarCompra()  {
		pagarProductoStep.finalizarOrden();
	}
	
	@Cuando("^se valida que la orden se ejecuto correctamente$")
	public void validarOrden() {
		pagarProductoStep.orden();
	}
	
	@Cuando("^presiona la opcion Pago$")
	public void opcionPago()  {
		pagarProductoStep.enlacesutilesPago();
	}
	
	@Cuando("^presiona el chulito en desplegable$")
	public void opcionChulito()  {
		pagarProductoStep.chulitoPago();
	}
}