#language: es
Característica: Agregar producto al carrito de compras
  Como usuario dentro del sistema, quiero adicionar productos al carrito de compras

  Antecedentes: 
    Dado que Usuario ingresa al portal nuevas tecnologias
    Cuando ingresa su usuario y clave
      | Usuario | Clave      |
      | oswaldo | 1233903960 |
    Y presiona la tecla Enter



  @SmokeTest
  Escenario: Validar que agregue,sume y quite cantidad de productos
  Cuando selecciona una categoria
      | audio |
    Y selecciona el producto
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito. |
    Y escoge otra categoria
      | celulares |
    Cuando selecciona el producto
      | Audífonos Sony tipo banda para la cabeza - MDR-ZX110 |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Audífonos inalámbricos EXTRA BASS™ XB650BT ha sido añadido al carrito. |
    Y valida que aparezca el producto agregado en el apartado de items del carrito
    Cuando se ingresa al menu de Cuenta
    Y selecciona ver carrito
    Y valida suma total productos
    Entonces quita cantidad de productos

@SmokeTest
  Escenario: Validar total producto en desplegable
    Cuando selecciona una categoria
      | audio |
    Y selecciona el producto
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se agrega al carrito
    Entonces Valida el valor total de los productos en desplegable carrito





  @SmokeTest
  Escenario: Validar suma del total de productos en carrito de compras
  Cuando selecciona una categoria
      | audio |
    Y selecciona el producto
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito. |
    Y escoge otra categoria
      | celulares |
    Cuando selecciona el producto
      | Audífonos Sony tipo banda para la cabeza - MDR-ZX110 |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Audífonos inalámbricos EXTRA BASS™ XB650BT ha sido añadido al carrito. |
    Y valida que aparezca el producto agregado en el apartado de items del carrito
    Cuando se ingresa al menu de Cuenta
    Y selecciona ver carrito
    Entonces valida suma total productos


  @SmokeTest
  Escenario: Validar opcion anadir al carrito dentro de las categorias
    Cuando selecciona una categoria
      | audio |
    Y se agrega producto al carrito desde categoria

  @SmokeTest
  Escenario: Agregar mas de un producto al carrito
    Cuando selecciona una categoria
      | audio |
    Y selecciona el producto
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito. |
    Y escoge otra categoria
      | celulares |
    Cuando selecciona el producto
      | Audífonos Sony tipo banda para la cabeza - MDR-ZX110 |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Audífonos inalámbricos EXTRA BASS™ XB650BT ha sido añadido al carrito. |
    Y valida que aparezca el producto agregado en el apartado de items del carrito
    Cuando se ingresa al menu de Cuenta
    Y selecciona ver carrito
    Entonces valida que aparezca el producto agregado:
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado       |
      | Audífonos inalámbricos EXTRA BASS™ XB650BT |



  @SmokeTest
  Escenario: Validar boton comprar en inicio
    Cuando procedemos a realizar scroll
    Y seleccionamos comprar

  @SmokeTest
  Escenario: Validar carrito de compras dentro de la opcion comparar
    Cuando selecciona una categoria
      | audio |
    Y selecciona el producto
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y escoge otra categoria
      | audio |
    Y agrega otro producto a comparar
      | ProductoDos              |
      | iPhone 7 32GB Negro Mate |
    Entonces valida que aparezca el mensaje con el producto comparado:
      | El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido a la lista de comparación. |
    Cuando valida en la opcion comparar los productos

  @SmokeTest
  Escenario: Validar opcion añadir al carrito ingresando al producto
    Cuando selecciona una categoria
      | audio |
    Y selecciona el producto
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito. |
    Y valida que aparezca el producto agregado en el apartado de items del carrito
    Cuando se ingresa al menu de Cuenta
    Y selecciona ver carrito
    Entonces valida que aparezca el producto agregado:
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |

  @SmokeTest
  Escenario: Validar lista desplegable en carrito de comprar eliminar producto
    Cuando selecciona una categoria
      | audio |
    Y selecciona el producto
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito. |
    Y valida que aparezca el producto agregado en el apartado de items del carrito
    Cuando se ingresa al menu de Cuenta
    Y se remueve producto en lista desplegable

  @SmokeTest
  Escenario: Validar lista desplegable en carrito de comprar limpiar producto
    Cuando selecciona una categoria
      | audio |
    Y selecciona el producto
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito. |
    Y valida que aparezca el producto agregado en el apartado de items del carrito
    Cuando se ingresa al menu de Cuenta
    Y se limpia producto en lista desplegable

  @SmokeTest
  Escenario: Validar producto en carrito de compras
    Cuando selecciona una categoria
      | audio |
    Y selecciona el producto
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito. |
    Y valida que aparezca el producto agregado en el apartado de items del carrito
    Cuando se ingresa al menu de Cuenta
    Y selecciona ver carrito
    Entonces valida que aparezca el producto agregado:
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |

  @SmokeTest
  Escenario: Validar opcion ver carrito
    Cuando selecciona una categoria
      | audio |
    Y selecciona el producto
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito. |
    Y valida que aparezca el producto agregado en el apartado de items del carrito
    Cuando se ingresa al menu de Cuenta
    Y selecciona ver carrito



  @SmokeTest
  Escenario: Aumentar cantidad del producto
    Cuando selecciona una categoria
      | audio |
    Y selecciona el producto
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito. |
    Y valida que aparezca el producto agregado en el apartado de items del carrito
    Cuando se ingresa al menu de Cuenta
    Y selecciona ver carrito
    Entonces valida que aparezca el producto agregado:
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se aumenta la cantidad de productos
    Entonces valida que aparezca mas de un producto

  @SmokeTest
  Escenario: Disminuir cantidad del producto
    Cuando selecciona una categoria
      | audio |
    Y selecciona el producto
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito. |
    Y valida que aparezca el producto agregado en el apartado de items del carrito
    Cuando se ingresa al menu de Cuenta
    Y selecciona ver carrito
    Entonces valida que aparezca el producto agregado:
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se disminuye la cantidad del producto
    Entonces valida que aparezca la cantidad esperada

  @SmokeTest
  Escenario: Validar que añada o quite la cantidad de productos y que sume correctamente
  	

  @SmokeTest
  Escenario: Validar el valor total de los productos

  @SmokeTest
  Escenario: Agregar producto al carrito y validar boton continuar comprando
    Cuando selecciona una categoria
      | audio |
    Y selecciona el producto
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito. |
    Y valida que aparezca el producto agregado en el apartado de items del carrito
    Cuando se ingresa al menu de Cuenta
    Y selecciona ver carrito
    Entonces valida que aparezca el producto agregado:
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y seleccionar continuar comprando

  @SmokeTest
  Escenario: Agregar producto al carrito y validar boton proceder pago
    Cuando selecciona una categoria
      | audio |
    Y selecciona el producto
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y se agrega al carrito
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Celular XIAOMI Mi A2 Lite DS 4G Dorado ha sido añadido al carrito. |
    Y valida que aparezca el producto agregado en el apartado de items del carrito
    Cuando se ingresa al menu de Cuenta
    Y selecciona ver carrito
    Entonces valida que aparezca el producto agregado:
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado |
    Y seleccionar proceder pago
