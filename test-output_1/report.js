$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/grupoaval/portalnuevastecnologias/features/AgregarProductoAlCarrito.feature");
formatter.feature({
  "name": "Agregar producto al carrito de compras",
  "description": "  Como usuario dentro del sistema, quiero adicionar productos al carrito de compras",
  "keyword": "Característica"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar que agregue,sume y quite cantidad de productos",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escoge otra categoria",
  "rows": [
    {
      "cells": [
        "celulares"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionarOtraCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Audífonos Sony tipo banda para la cabeza - MDR-ZX110"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Audífonos inalámbricos EXTRA BASS™ XB650BT ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado en el apartado de items del carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.vadidarProductoItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresa al menu de Cuenta",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.cickMenuCuenta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona ver carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.clickVerCarrito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida suma total productos",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarTotalProductosCarrito()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: El valor capturado no corresponde con del descuento aplicado\r\n\tat com.grupoaval.portalnuevastecnologias.pageobjects.AgregarProductoAlCarritoPage.sumaTotalProductosCarrito(AgregarProductoAlCarritoPage.java:207)\r\n\tat com.grupoaval.portalnuevastecnologias.steps.AgregarProductoAlCarritoSteps.validarSumaCarrito(AgregarProductoAlCarritoSteps.java:168)\r\n\tat com.grupoaval.portalnuevastecnologias.steps.AgregarProductoAlCarritoSteps$$EnhancerByCGLIB$$3d72818c.CGLIB$validarSumaCarrito$15(\u003cgenerated\u003e)\r\n\tat com.grupoaval.portalnuevastecnologias.steps.AgregarProductoAlCarritoSteps$$EnhancerByCGLIB$$3d72818c$$FastClassByCGLIB$$3a2f0a5e.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:460)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:445)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:420)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:175)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:162)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat com.grupoaval.portalnuevastecnologias.steps.AgregarProductoAlCarritoSteps$$EnhancerByCGLIB$$3d72818c.validarSumaCarrito(\u003cgenerated\u003e)\r\n\tat com.grupoaval.portalnuevastecnologias.stepdefinitions.AgregarProductoStepDefinitions.validarTotalProductosCarrito(AgregarProductoStepDefinitions.java:184)\r\n\tat ✽.valida suma total productos(src/test/resources/com/grupoaval/portalnuevastecnologias/features/AgregarProductoAlCarrito.feature:33)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "quita cantidad de productos",
  "keyword": "Entonces "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar total producto en desplegable",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valida el valor total de los productos en desplegable carrito",
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarTotalDesplegable()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar suma del total de productos en carrito de compras",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escoge otra categoria",
  "rows": [
    {
      "cells": [
        "celulares"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionarOtraCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Audífonos Sony tipo banda para la cabeza - MDR-ZX110"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Audífonos inalámbricos EXTRA BASS™ XB650BT ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado en el apartado de items del carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.vadidarProductoItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresa al menu de Cuenta",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.cickMenuCuenta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona ver carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.clickVerCarrito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida suma total productos",
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarTotalProductosCarrito()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: El valor capturado no corresponde con del descuento aplicado\r\n\tat com.grupoaval.portalnuevastecnologias.pageobjects.AgregarProductoAlCarritoPage.sumaTotalProductosCarrito(AgregarProductoAlCarritoPage.java:207)\r\n\tat com.grupoaval.portalnuevastecnologias.steps.AgregarProductoAlCarritoSteps.validarSumaCarrito(AgregarProductoAlCarritoSteps.java:168)\r\n\tat com.grupoaval.portalnuevastecnologias.steps.AgregarProductoAlCarritoSteps$$EnhancerByCGLIB$$3d72818c.CGLIB$validarSumaCarrito$15(\u003cgenerated\u003e)\r\n\tat com.grupoaval.portalnuevastecnologias.steps.AgregarProductoAlCarritoSteps$$EnhancerByCGLIB$$3d72818c$$FastClassByCGLIB$$3a2f0a5e.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:460)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:445)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:420)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:175)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:162)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat com.grupoaval.portalnuevastecnologias.steps.AgregarProductoAlCarritoSteps$$EnhancerByCGLIB$$3d72818c.validarSumaCarrito(\u003cgenerated\u003e)\r\n\tat com.grupoaval.portalnuevastecnologias.stepdefinitions.AgregarProductoStepDefinitions.validarTotalProductosCarrito(AgregarProductoStepDefinitions.java:184)\r\n\tat ✽.valida suma total productos(src/test/resources/com/grupoaval/portalnuevastecnologias/features/AgregarProductoAlCarrito.feature:68)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar opcion anadir al carrito dentro de las categorias",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega producto al carrito desde categoria",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregarProductoDesdeCategoria()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Agregar mas de un producto al carrito",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escoge otra categoria",
  "rows": [
    {
      "cells": [
        "celulares"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionarOtraCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Audífonos Sony tipo banda para la cabeza - MDR-ZX110"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Audífonos inalámbricos EXTRA BASS™ XB650BT ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado en el apartado de items del carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.vadidarProductoItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresa al menu de Cuenta",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.cickMenuCuenta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona ver carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.clickVerCarrito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado:",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    },
    {
      "cells": [
        "Audífonos inalámbricos EXTRA BASS™ XB650BT"
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar boton comprar en inicio",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "procedemos a realizar scroll",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.scrollHomeProductos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionamos comprar",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionamosComprarEnHome()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar carrito de compras dentro de la opcion comparar",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escoge otra categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionarOtraCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "agrega otro producto a comparar",
  "rows": [
    {
      "cells": [
        "ProductoDos"
      ]
    },
    {
      "cells": [
        "iPhone 7 32GB Negro Mate"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionarOtroProducto(Producto\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el mensaje con el producto comparado:",
  "rows": [
    {
      "cells": [
        "El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido a la lista de comparación."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoComparado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida en la opcion comparar los productos",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarProductosComparados()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar opcion añadir al carrito ingresando al producto",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado en el apartado de items del carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.vadidarProductoItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresa al menu de Cuenta",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.cickMenuCuenta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona ver carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.clickVerCarrito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado:",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar lista desplegable en carrito de comprar eliminar producto",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado en el apartado de items del carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.vadidarProductoItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresa al menu de Cuenta",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.cickMenuCuenta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se remueve producto en lista desplegable",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seRemueveProductoListaDesplegable()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar lista desplegable en carrito de comprar limpiar producto",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado en el apartado de items del carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.vadidarProductoItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresa al menu de Cuenta",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.cickMenuCuenta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se limpia producto en lista desplegable",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seLimpiaProductoListaDesplegable()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@formcontrolname\u003d\u0027user\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.116)\n  (Driver info: chromedriver\u003d2.37.544315 (730aa6a5fdba159ac9f4c1e8cbc59bf1b5ce12b7),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027TGP\u0027, ip: \u0027169.254.195.21\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_222\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.37.544315 (730aa6a5fdba15..., userDataDir: C:\\Users\\SOPORT~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 80.0.3987.116, webStorageEnabled: true}\nSession ID: c2d1afbcfa716ba0b47df5ba7bb6b7d1\n*** Element info: {Using\u003dxpath, value\u003d//input[@formcontrolname\u003d\u0027user\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat net.thucydides.core.webdriver.WebDriverFacade.findElement(WebDriverFacade.java:222)\r\n\tat net.serenitybdd.core.pages.WebElementResolverByLocator.resolveForDriver(WebElementResolverByLocator.java:18)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.getElement(WebElementFacadeImpl.java:221)\r\n\tat net.serenitybdd.core.pages.WebElementFacadeImpl.sendKeys(WebElementFacadeImpl.java:1293)\r\n\tat com.grupoaval.portalnuevastecnologias.pageobjects.PortalNuevasTecnologiasHome.escribirUsuario(PortalNuevasTecnologiasHome.java:62)\r\n\tat com.grupoaval.portalnuevastecnologias.steps.InicioDeSesionSteps.escribirUsuario(InicioDeSesionSteps.java:29)\r\n\tat com.grupoaval.portalnuevastecnologias.steps.InicioDeSesionSteps$$EnhancerByCGLIB$$53ece3b1.CGLIB$escribirUsuario$22(\u003cgenerated\u003e)\r\n\tat com.grupoaval.portalnuevastecnologias.steps.InicioDeSesionSteps$$EnhancerByCGLIB$$53ece3b1$$FastClassByCGLIB$$4fc9038.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:460)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:445)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:420)\r\n\tat net.thucydides.core.steps.StepInterceptor.runOrSkipMethod(StepInterceptor.java:175)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:162)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat com.grupoaval.portalnuevastecnologias.steps.InicioDeSesionSteps$$EnhancerByCGLIB$$53ece3b1.escribirUsuario(\u003cgenerated\u003e)\r\n\tat com.grupoaval.portalnuevastecnologias.stepdefinitions.InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(InicioDeSesionStepDefinitions.java:33)\r\n\tat ✽.ingresa su usuario y clave(src/test/resources/com/grupoaval/portalnuevastecnologias/features/AgregarProductoAlCarrito.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validar producto en carrito de compras",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "valida que aparezca el producto agregado en el apartado de items del carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.vadidarProductoItem()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "se ingresa al menu de Cuenta",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.cickMenuCuenta()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "selecciona ver carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.clickVerCarrito()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "valida que aparezca el producto agregado:",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar opcion ver carrito",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado en el apartado de items del carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.vadidarProductoItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresa al menu de Cuenta",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.cickMenuCuenta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona ver carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.clickVerCarrito()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Aumentar cantidad del producto",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado en el apartado de items del carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.vadidarProductoItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresa al menu de Cuenta",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.cickMenuCuenta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona ver carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.clickVerCarrito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado:",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se aumenta la cantidad de productos",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.aumentarCantidadProductoEnCarrito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca mas de un producto",
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarCantidadDeProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Disminuir cantidad del producto",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado en el apartado de items del carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.vadidarProductoItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresa al menu de Cuenta",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.cickMenuCuenta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona ver carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.clickVerCarrito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado:",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se disminuye la cantidad del producto",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.disminuyeCantidadProductoEnCarrito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca la cantidad esperada",
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarCantidadDisminuidaDeProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Agregar producto al carrito y validar boton continuar comprando",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado en el apartado de items del carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.vadidarProductoItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresa al menu de Cuenta",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.cickMenuCuenta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona ver carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.clickVerCarrito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado:",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionar continuar comprando",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionarContinuarComprando()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.step({
  "name": "que Usuario ingresa al portal nuevas tecnologias",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.queDavidIntreAlPortalAFC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingresa su usuario y clave",
  "rows": [
    {
      "cells": [
        "Usuario",
        "Clave"
      ]
    },
    {
      "cells": [
        "oswaldo",
        "1233903960"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.ingresaSuUsuarioYClave(Usuario\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "presiona la tecla Enter",
  "keyword": "Y "
});
formatter.match({
  "location": "InicioDeSesionStepDefinitions.presionaLaTeclaEnter()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Agregar producto al carrito y validar boton proceder pago",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "selecciona una categoria",
  "rows": [
    {
      "cells": [
        "audio"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccioneCategoria(Carrito\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona el producto",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionaProducto(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se agrega al carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.agregaProducto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el siguiente mensaje:",
  "rows": [
    {
      "cells": [
        "El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito."
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarPopupProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado en el apartado de items del carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.vadidarProductoItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresa al menu de Cuenta",
  "keyword": "Cuando "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.cickMenuCuenta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciona ver carrito",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.clickVerCarrito()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valida que aparezca el producto agregado:",
  "rows": [
    {
      "cells": [
        "Celular XIAOMI Mi A2 Lite DS 4G Dorado"
      ]
    }
  ],
  "keyword": "Entonces "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.validarProductoAgregado(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleccionar proceder pago",
  "keyword": "Y "
});
formatter.match({
  "location": "AgregarProductoStepDefinitions.seleccionarProcederPago()"
});
formatter.result({
  "status": "passed"
});
});