#language: es
Característica: Vizualizar Detalles de Los Productos

  Antecedentes: 
    Dado que Usuario ingresa al portal nuevas tecnologias
    Cuando ingresa su usuario y clave
      | Usuario | Clave      |
      | oswaldo | 1233903960 |
    Y presiona la tecla Enter

  @SmokeTest
  Escenario: Agregar producto a lista de deseo
    Cuando selecciona una categoria
      | celulares |
    Y selecciona el producto
      | Parlante KALLEY Bluetooth Azul |
    Y se agrega a lista de deseo
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Parlante KALLEY Bluetooth Azul ha sido añadido a la lista de deseos. |
    Y selecciona lista de deseo
    Entonces valida que aparezca el producto agregado en lista de deseo:
      | Parlante KALLEY Bluetooth Azul |

  @SmokeTest
  Escenario: Agregar producto para comparar
    Cuando selecciona una categoria
      | celulares |
    Y selecciona el producto
      | Parlante KALLEY Bluetooth Azul |
    Y se agrega a comparar
    Entonces valida que aparezca el siguiente mensaje:
      | El producto Parlante KALLEY Bluetooth Azul ha sido añadido a la lista de comparación. |
    Y selecciona comparar
    Entonces valida que aparezca el producto agregado a comparar:
      | Parlante KALLEY Bluetooth Azul |

  @SmokeTest
  Escenario: Eliminar producto desde la opción comparar
    Cuando selecciona una categoria
      | celulares |
    Y selecciona el producto
      | Parlante KALLEY Bluetooth Azul |
    Y se agrega a comparar
    Y selecciona comparar
    Entonces valida que aparezca el producto agregado a comparar:
      | Parlante KALLEY Bluetooth Azul |
    Y da clic sobre la opcion X para eliminar el producto
    Entonces valida que aparezca el siguiente mensaje:
      | NO TIENE ITEMS A COMPARAR. |

  @SmokeTest
  Escenario: Eliminar producto desde la opción lista de deseos
    Cuando selecciona una categoria
      | celulares |
    Y selecciona el producto
      | Parlante KALLEY Bluetooth Azul |
    Y se agrega a lista de deseo
    Y selecciona lista de deseo
    Entonces valida que aparezca el producto agregado a lista de deseo:
      | Parlante KALLEY Bluetooth Azul |
    Y da clic sobre la opcion X para eliminar el producto en lista de deseo
    Entonces valida que aparezca el siguiente mensaje:
      | NO TIENES ITEMS EN TU LISTA DE DESEOS. |

  @SmokeTest
  Escenario: Ver las fotos al ingresar al producto
    Cuando selecciona una categoria
      | celulares |
    Y selecciona el producto
      | Parlante KALLEY Bluetooth Azul |
    Entonces valida que aparezcan fotos en el producto

  @SmokeTest
  Escenario: Ver las descripciones al ingresar al producto
    Cuando selecciona una categoria
      | celulares |
    Y selecciona el producto
      | Parlante KALLEY Bluetooth Azul |
    Y se realiza scroll
    Entonces visualiza los items Description, Aditional information y Reviews

  @SmokeTest
  Escenario: Ingresar al detalle del producto por la opcion comparar
    Cuando selecciona una categoria
      | celulares |
    Y selecciona el producto
      | Parlante KALLEY Bluetooth Azul |
    Y se agrega a comparar
    Y selecciona comparar
    Entonces valida que aparezca el producto agregado a comparar:
      | Parlante KALLEY Bluetooth Azul |
    Y da clic sobre el nombre del producto
     | Parlante KALLEY Bluetooth Azul |
    Entonces valida que aparezca el producto
      | Parlante KALLEY Bluetooth Azul |

  @SmokeTest
  Escenario: Ingresar al detalle del producto por la opcion lista de deseo
    Cuando selecciona una categoria
      | celulares |
    Y selecciona el producto
      | Parlante KALLEY Bluetooth Azul |
    Y se agrega a lista de deseo
    Y selecciona lista de deseo
    Entonces valida que aparezca el producto agregado a lista de deseo:
      | Parlante KALLEY Bluetooth Azul |
    Y da clic sobre el nombre del producto
      | Parlante KALLEY Bluetooth Azul |
    Entonces valida que aparezca el producto
      | Parlante KALLEY Bluetooth Azul |

  @SmokeTest
  Escenario: Ingresar al detalle del producto desde inicio
    Cuando el usuario realiza scroll
    Y selecciona una categoria desde inicio
      | celulares |
    Y selecciona el producto de inicio
      | Parlante KALLEY Bluetooth Azul |
    Entonces valida que aparezca el producto
      | Parlante KALLEY Bluetooth Azul |

  @SmokeTest
  Escenario: Limpiar productos desde la opción comparar
    Cuando selecciona una categoria
      | celulares |
    Y selecciona el producto
      | Parlante KALLEY Bluetooth Azul |
    Y se agrega a comparar
    Y selecciona comparar
    Entonces valida que aparezca el producto agregado a comparar:
      | Parlante KALLEY Bluetooth Azul |
    Y da clic sobre la opcion Limpiar
    Entonces valida que aparezca el siguiente mensaje:
      | NO TIENE ITEMS A COMPARAR. |

  @SmokeTest
  Escenario: Limpiar productos desde lista de deseos
    Cuando selecciona una categoria
      | celulares |
    Y selecciona el producto
      | Parlante KALLEY Bluetooth Azul |
    Y se agrega a lista de deseo
    Y selecciona lista de deseo
    Entonces valida que aparezca el producto agregado a lista de deseo:
      | Parlante KALLEY Bluetooth Azul |
    Y da clic sobre la opcion Limpiar
    Entonces valida que aparezca el siguiente mensaje:
      | NO TIENES ITEMS EN TU LISTA DE DESEOS. |
