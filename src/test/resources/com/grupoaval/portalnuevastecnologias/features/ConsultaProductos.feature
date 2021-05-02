#language: es
Característica: Vizualizar Detalles de Los Productos

  Antecedentes: 
    Dado que Usuario ingresa al portal nuevas tecnologias
    Cuando ingresa su usuario y clave
      | Usuario | Clave      |
      | oswaldo | 1233903960 |
    Y presiona la tecla Enter

  @SmokeTest
  Escenario: Filtrar productos por categoria en el menú superior
    Cuando selecciona una categoria en el menú superior de la página
      | Accesorios |
    Entonces valida que aparezca el producto relacionado a la categoria:
      | Parlante KALLEY Bluetooth Azul |

  @SmokeTest
  Escenario: Filtrar productos por categoria en el menú del lado izquierdo de la página
    Cuando ingresa a productos
    Y selecciona una categoria en el menú del lado izquierdo de la página
      | accesorios |
    Entonces valida que aparezca el producto relacionado a la categoria:
      | solo se muestran productos relacionados con Accesorios |

  @SmokeTest
  Escenario: Filtrar productos por categoria Audio en el menú inferior
    Y selecciona una categoria en el menú inferior de la página
      | Audio |
    Entonces valida que aparezca el producto relacionado a la categoria:
      | Parlante KALLEY Bluetooth Azul |

  @SmokeTest
  Escenario: Filtrar productos por precio
    Cuando ingresa a productos
    Y selecciona una opción del menu del lado derecho de la página
      | todas las categorías |
    Y Se elige un valor para el campo precio desde
      | 1 |
    Y Se elige un valor para el campo precio hasta
      | 67316 |
    Y presiona boton consultar
    Entonces valida que aparezca el producto relacionado aL precio:
      | Parlante KALLEY Bluetooth Azul |

  @SmokeTest
  Escenario: Filtrar productos por la opción producto disponible
    Cuando ingresa a productos
    Y selecciona la opción disponibilidad al lado derecho de la página
      | Disponible |
    Y presiona boton consultar
    Entonces valida que aparezcan:
      | solo se muestran productos que estan disponibles, en stock |

  @SmokeTest
  Escenario: Filtrar productos por la opción producto disponible
    Cuando ingresa a productos
    Y selecciona la opción disponibilidad al lado derecho de la página
      | No Disponible |
    Y presiona boton consultar
    Entonces valida que aparezcan:
      | solo se muestran productos que NO estan disponibles, sin stock |

  @SmokeTest
  Escenario: Filtrar productos por la opción Todas las Categorías en el menú del lado derecho de la página
    Cuando ingresa a productos
    Y selecciona una categoría en el menú del lado derecho de la página
      | Todas las Categorías |
    Entonces valida que aparezcan:
      | Se muestran todos los productos de todas las categorías |

  @SmokeTest
  Escenario: Abrir vista rapida y verificar el nombre del producto
    Cuando selecciona una categoria en el menú inferior de la página
      | Accesorios |
    Y Presionar el icono de vista rapida de un producto
      | Audífonos Sony interno... |
    Entonces valida que aparezcan el nombre del producto
      | Audífonos Sony internos y Funcion Manos Libres- MDR-EX15AP |

  @SmokeTest
  Escenario: Abrir vista rapida y presionar la opción View full details
    Cuando selecciona una categoria en el menú inferior de la página
      | Accesorios |
    Y Presionar el icono de vista rapida de un producto
      | Audífonos Sony interno... |
    Entonces presionar la opción View full details
      | View full details |
    Entonces validar que se muestre
      | Todos los detalles del producto |

  @SmokeTest
  Escenario: Abrir vista rapida y cerrarla
    Cuando selecciona una categoria en el menú inferior de la página
      | Accesorios |
    Y Presionar el icono de vista rapida de un producto
      | Audífonos Sony interno... |
    Entonces presionar la opción cerrar
      | Circulo rojo con X blanca |
    Entonces validar que se cierre la vista rapida
