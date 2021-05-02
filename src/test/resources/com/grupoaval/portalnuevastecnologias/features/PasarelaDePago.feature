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
  Escenario: validar boton pse
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
    Cuando presiona el boton proceder al pago
    Y procede a realizar el check out, llenando un formulario
      | Nombre | Apellido | segundoApellido | Compania | Correo                  | Telefono  | Pais   | Ciudad | Provincia    | Postal | Direccion       |
      | Dilan  | Ibarguen | Garcia          | SQA S.A  | dilan.ibarguen@sqasa.co | 652323231 | Angola | Bogota | Cundinamarca | 100111 | cra. 8 No.64-42 |
    Entonces pulsa el boton siguiente valida que se dirija a Detalle de orden
    Y valida que se dirija al siguiente formulario Metodo de pago
    Y escoge el metodo de pago Debito PSE

  @SmokeTest
  Escenario: Pagar productos seleccionados
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
    Cuando presiona el boton proceder al pago
    Y procede a realizar el check out, llenando un formulario
      | Nombre | Apellido | segundoApellido | Compania | Correo                  | Telefono  | Pais   | Ciudad | Provincia    | Postal | Direccion       |
      | Dilan  | Ibarguen | Garcia          | SQA S.A  | dilan.ibarguen@sqasa.co | 652323231 | Angola | Bogota | Cundinamarca | 100111 | cra. 8 No.64-42 |
     Entonces pulsa el boton siguiente valida que se dirija a Detalle de orden
    Y valida que se dirija al siguiente formulario Metodo de pago
    Y escoge el metodo de pago Debito PSE
    Entonces valida que se genere formulario PSE
      | Banco              |
      | Banco de Occidente |
    Cuando ingresa tipo de persona y nombre de titular
      | Persona | Titular |
      | Natural | Dilan   |
    Y selecciona tipo de documento y numero de documento
      | Tipo | Numero  |
      | CE   | 3242342 |
    Cuando ingresa correo y telefono
      | Email                   | Telefono |
      | dilan.ibarguen@sqasa.co | 65312122 |
    Entonces pulsa el boton realizar pago
    Y se genera un resultado del pago con la informacion diligenciada
    Entonces hacemos clic en el boton finalizar compra
    Y se valida que la orden se ejecuto correctamente



 

  @SmokeTest
  Escenario: validar checkout
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
    Cuando presiona el boton proceder al pago
    Y procede a realizar el check out, llenando un formulario
      | Nombre | Apellido | segundoApellido | Compania | Correo                  | Telefono  | Pais   | Ciudad | Provincia    | Postal | Direccion       |
      | Dilan  | Ibarguen | Garcia          | SQA S.A  | dilan.ibarguen@sqasa.co | 652323231 | Angola | Bogota | Cundinamarca | 100111 | cra. 8 No.64-42 |
    Entonces pulsa el boton siguiente valida que se dirija a Detalle de orden

  @SmokeTest
  Escenario: validar boton confirmar pedido dentro de detalle de orden
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
      | El producto Audífonos inalámbricos EXTRA BASS™ XB650BT ha sido anadido al carrito. |
    Y valida que aparezca el producto agregado en el apartado de items del carrito
    Cuando se ingresa al menu de Cuenta
    Y selecciona ver carrito
    Entonces valida que aparezca el producto agregado:
      | Celular XIAOMI Mi A2 Lite DS 4G Dorado       |
      | Audífonos inalámbricos EXTRA BASS™ XB650BT |
    Cuando presiona el boton proceder al pago
    Y procede a realizar el check out, llenando un formulario
      | Nombre | Apellido | segundoApellido | Compania | Correo                  | Telefono  | Pais   | Ciudad | Provincia    | Postal | Direccion       |
      | Dilan  | Ibarguen | Garcia          | SQA S.A  | dilan.ibarguen@sqasa.co | 652323231 | Angola | Bogota | Cundinamarca | 100111 | cra. 8 No.64-42 |
    Entonces pulsa el boton siguiente valida que se dirija a Detalle de orden
    Y verifica la informacion de la compra
    Y valida que se dirija al siguiente formulario Metodo de pago

  @SmokeTest
  Escenario: validar informacion en detalle de orden
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
    Cuando presiona el boton proceder al pago
    Y procede a realizar el check out, llenando un formulario
      | Nombre | Apellido | segundoApellido | Compania | Correo                  | Telefono  | Pais   | Ciudad | Provincia    | Postal | Direccion       |
      | Dilan  | Ibarguen | Garcia          | SQA S.A  | dilan.ibarguen@sqasa.co | 652323231 | Angola | Bogota | Cundinamarca | 100111 | cra. 8 No.64-42 |
    Entonces pulsa el boton siguiente valida que se dirija a Detalle de orden
    Y verifica la informacion de la compra

  
  @SmokeTest
  Escenario: Validar boton proceder al pago dentro de la opcion ver carrito
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
    Cuando presiona el boton proceder al pago

  @SmokeTest
  Escenario: validar boton pse
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
    Cuando presiona el boton proceder al pago
    Y procede a realizar el check out, llenando un formulario
      | Nombre | Apellido | segundoApellido | Compania | Correo                  | Telefono  | Pais   | Ciudad | Provincia    | Postal | Direccion       |
      | Dilan  | Ibarguen | Garcia          | SQA S.A  | dilan.ibarguen@sqasa.co | 652323231 | Angola | Bogota | Cundinamarca | 100111 | cra. 8 No.64-42 |
    Entonces pulsa el boton siguiente valida que se dirija a Detalle de orden
    Y verifica la informacion de la compra
    Y escoge el metodo de pago Debito PSE
    Entonces valida que se genere formulario PSE

  @SmokeTest
  Escenario: validar formulario pse
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
    Cuando presiona el boton proceder al pago
    Y procede a realizar el check out, llenando un formulario
      | Nombre | Apellido | segundoApellido | Compania | Correo                  | Telefono  | Pais   | Ciudad | Provincia    | Postal | Direccion       |
      | Dilan  | Ibarguen | Garcia          | SQA S.A  | dilan.ibarguen@sqasa.co | 652323231 | Angola | Bogota | Cundinamarca | 100111 | cra. 8 No.64-42 |
    Entonces pulsa el boton siguiente valida que se dirija a Detalle de orden
    Y verifica la informacion de la compra
    Entonces valida que se dirija al siguiente formulario Metodo de pago
    Y escoge el metodo de pago Debito PSE
    Entonces valida que se genere formulario PSE
      | Banco              |
      | Banco de Occidente |
    Cuando ingresa tipo de persona y nombre de titular
      | Persona | Titular |
      | Natural | Dilan   |
    Y selecciona tipo de documento y numero de documento
      | Tipo | Numero  |
      | CE   | 3242342 |
    Cuando ingresa correo y telefono
      | Email                   | Telefono |
      | dilan.ibarguen@sqasa.co | 65312122 |

  @SmokeTest
  Escenario: validar boton realizar pago
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
    Cuando presiona el boton proceder al pago
    Y procede a realizar el check out, llenando un formulario
      | Nombre | Apellido | segundoApellido | Compania | Correo                  | Telefono  | Pais   | Ciudad | Provincia    | Postal | Direccion       |
      | Dilan  | Ibarguen | Garcia          | SQA S.A  | dilan.ibarguen@sqasa.co | 652323231 | Angola | Bogota | Cundinamarca | 100111 | cra. 8 No.64-42 |
    Entonces pulsa el boton siguiente valida que se dirija a Detalle de orden
    Y verifica la informacion de la compra
    Entonces valida que se dirija al siguiente formulario Metodo de pago
    Y escoge el metodo de pago Debito PSE
    Entonces valida que se genere formulario PSE
      | Banco              |
      | Banco de Occidente |
    Cuando ingresa tipo de persona y nombre de titular
      | Persona | Titular |
      | Natural | Dilan   |
    Y selecciona tipo de documento y numero de documento
      | Tipo | Numero  |
      | CE   | 3242342 |
    Cuando ingresa correo y telefono
      | Email                   | Telefono |
      | dilan.ibarguen@sqasa.co | 65312122 |
    Entonces pulsa el boton realizar pago

  @SmokeTest
  Escenario: validar resultado del pago
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
    Cuando presiona el boton proceder al pago
    Y procede a realizar el check out, llenando un formulario
      | Nombre | Apellido | segundoApellido | Compania | Correo                  | Telefono  | Pais   | Ciudad | Provincia    | Postal | Direccion       |
      | Dilan  | Ibarguen | Garcia          | SQA S.A  | dilan.ibarguen@sqasa.co | 652323231 | Angola | Bogota | Cundinamarca | 100111 | cra. 8 No.64-42 |
    Entonces pulsa el boton siguiente valida que se dirija a Detalle de orden
    Y verifica la informacion de la compra
    Entonces valida que se dirija al siguiente formulario Metodo de pago
    Y escoge el metodo de pago Debito PSE
    Entonces valida que se genere formulario PSE
      | Banco              |
      | Banco de Occidente |
    Cuando ingresa tipo de persona y nombre de titular
      | Persona | Titular |
      | Natural | Dilan   |
    Y selecciona tipo de documento y numero de documento
      | Tipo | Numero  |
      | CE   | 3242342 |
    Cuando ingresa correo y telefono
      | Email                   | Telefono |
      | dilan.ibarguen@sqasa.co | 65312122 |
    Entonces pulsa el boton realizar pago
    Y se genera un resultado del pago con la informacion diligenciada

  @SmokeTest
  Escenario: Finalizar compra
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
    Cuando presiona el boton proceder al pago
    Y procede a realizar el check out, llenando un formulario
      | Nombre | Apellido | segundoApellido | Compania | Correo                  | Telefono  | Pais   | Ciudad | Provincia    | Postal | Direccion       |
      | Dilan  | Ibarguen | Garcia          | SQA S.A  | dilan.ibarguen@sqasa.co | 652323231 | Angola | Bogota | Cundinamarca | 100111 | cra. 8 No.64-42 |
    Entonces pulsa el boton siguiente valida que se dirija a Detalle de orden
    Y verifica la informacion de la compra
    Entonces valida que se dirija al siguiente formulario Metodo de pago
    Y escoge el metodo de pago Debito PSE
    Entonces valida que se genere formulario PSE
      | Banco              |
      | Banco de Occidente |
    Cuando ingresa tipo de persona y nombre de titular
      | Persona | Titular |
      | Natural | Dilan   |
    Y selecciona tipo de documento y numero de documento
      | Tipo | Numero  |
      | CE   | 3242342 |
    Cuando ingresa correo y telefono
      | Email                   | Telefono |
      | dilan.ibarguen@sqasa.co | 65312122 |
    Entonces pulsa el boton realizar pago
    Y se genera un resultado del pago con la informacion diligenciada
    Entonces hacemos clic en el boton finalizar compra
    Y se valida que la orden se ejecuto correctamente

  @SmokeTest
  Escenario: Pagar productos seleccionados desde desplegable boton chulito
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
    Y presiona el chulito en desplegable
    Y procede a realizar el check out, llenando un formulario
      | Nombre | Apellido | segundoApellido | Compania | Correo                  | Telefono  | Pais   | Ciudad | Provincia    | Postal | Direccion       |
      | Dilan  | Ibarguen | Garcia          | SQA S.A  | dilan.ibarguen@sqasa.co | 652323231 | Angola | Bogota | Cundinamarca | 100111 | cra. 8 No.64-42 |
    Entonces pulsa el boton siguiente valida que se dirija a Detalle de orden
    Y valida que se dirija al siguiente formulario Metodo de pago
    Y escoge el metodo de pago Debito PSE
    Entonces valida que se genere formulario PSE
      | Banco              |
      | Banco de Occidente |
    Cuando ingresa tipo de persona y nombre de titular
      | Persona | Titular |
      | Natural | Dilan   |
    Y selecciona tipo de documento y numero de documento
      | Tipo | Numero  |
      | CE   | 3242342 |
    Cuando ingresa correo y telefono
      | Email                   | Telefono |
      | dilan.ibarguen@sqasa.co | 65312122 |
    Entonces pulsa el boton realizar pago
    Y se genera un resultado del pago con la informacion diligenciada
    Entonces hacemos clic en el boton finalizar compra
    Y se valida que la orden se ejecuto correctamente
