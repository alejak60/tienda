package com.grupoaval.portalnuevastecnologias.entities;

public class Producto {

String productoUno = "";

String productoDos = "";

public Producto(String productoUno, String productoDos) {
this.productoUno = productoUno;
this.productoDos = productoDos;
}


public String getProductoUno() {
return productoUno;
}

public void setProductoUno(String productoUno) {
this.productoUno = productoUno;
}


   public String getProductoDos() {
       return productoDos;
   }

   public void setProductoDos(String productoDos) {
       this.productoDos = productoDos;
   }
       

}