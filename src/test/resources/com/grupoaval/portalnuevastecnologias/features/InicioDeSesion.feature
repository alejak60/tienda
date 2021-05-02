#language: es
Característica: Inicio de sesion
  Como usuario registrado, quiero iniciar sesion en el portal nuevas tecnologias
  para poder hacer compras.

  @SmokeTest
  Escenario: Inicio de sesion exitoso presionando Enter
    Dado que Usuario ingresa al portal nuevas tecnologias
    Cuando ingresa su usuario y clave
      | Usuario | Clave      |
      | oswaldo | 1233903960 |
    Y presiona la tecla Enter
    Entonces deberia ver el siguiente mensaje en pantalla:
      | Login Exitoso |

  @SmokeTest
  Escenario: Inicio de sesion exitoso presionando boton Ingresar
    Dado que Usuario ingresa al portal nuevas tecnologias
    Cuando ingresa su usuario y clave
      | Usuario | Clave      |
      | oswaldo | 1233903960 |
    Y presiona boton Ingresar
    Entonces deberia ver el siguiente mensaje en pantalla:
      | Login Exitoso |

  @SmokeTest
  Escenario: Inicio de sesion validando nombre de usuario
    Dado que Usuario ingresa al portal nuevas tecnologias
    Cuando ingresa su usuario y clave
      | Usuario | Clave      |
      | oswaldo | 1233903960 |
    Y presiona la tecla Enter
    Entonces deberia ver el siguiente mensaje en pantalla:
      | Login Exitoso |
    Y su nombre y usuario registrados deberian aparecer en el menu de Cuenta:
      | Oswaldo Buitrago |

  @SmokeTest
  Esquema del escenario: Inicio de sesión no exitoso
    Dado que Usuario ingresa al portal nuevas tecnologias
    Cuando ingresa su usuario y clave
      | Usuario | Clave      |
      | oswaldo | 1233903960 |
    Y hace clic en el boton de Log In
    Entonces no deberia ver el siguiente mensaje en pantalla:
      | Login Exitoso |
    Y no deberia ver su nombre en el menu de Cuenta
      | Oswaldo Buitrago |

  @SmokeTest
  Escenario: Mensaje de Usuario Obligatorio
    Dado que Usuario ingresa al portal nuevas tecnologias
    Cuando hace clic sobre el campo Usuario
    Y hace clic sobre el campo Clave
    Entonces deberia ver el siguiente mensaje en pantalla:
      | El Usuario es requerido |

  @SmokeTest
  Escenario: Mensaje de Clave Obligatoria
    Dado que Usuario ingresa al portal nuevas tecnologias
    Cuando hace clic sobre el campo Clave
    Y hace clic sobre el campo Usuario
    Entonces deberia ver el siguiente mensaje en pantalla:
      | Contraseña es requerida |

  @SmokeTest
  Escenario: Registro exitoso
    Dado que Usuario ingresa al portal nuevas tecnologias
    Y da click en Registrarme
    Cuando ingresa datos requeridos
      | Usuario | Documento | Password | Nombre | Apellido |
      | Test2    | 123456789 |    12345 | Test   | Test A   |
    Y da click en Registro
    Entonces deberia ver el siguiente mensaje de registro en pantalla:
      | Usuario creado satisfactoriamente |
