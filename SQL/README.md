# Apuntes SQL

- SQL sigue unos parámetros muy concretos ya que es un estándar desde hace más de 30 años. Aprendiendo las bases, podemos trabajar en cualquier motor de bases de datos.
- Las bases de datos se cimientan en tablas. Estas tablas contienen información que luego los usuarios o programas pueden consultar o utilizar.
- Las tablas guardan relaciones entre sí. Es decir, nuestras tablas estarán "conectadas" entre sí para hacer nuestros datos más complejos.

## ¿Dónde estudiar?

- [W3School](https://www.w3schools.com/sql/default.asp)

## Fundamentos

- **Entidad**: Las entidades son los componentes de las bases de datos. Una entidad podría ser "PROGRAMADORES", que sería una "tabla" que guarda datos de programadores. También podríamos tener una tabla llamada "LENGUAJES" que se conecte con los programadores más adelante.
- **Filas**: Las filas serían los distintos "programadores" en la tabla "PROGRAMADORES".
- **Columnas**: Las columnas son las "propiedades" de los programadores, como nombre, edad, lenguaje, etc. Una de estas propiedades que suele estar siempre presente es el ID.
- **Relaciones**: Son las "conexiones" que tenemos entre las distintas bases de datos. Por ejemplo, un programador sabe varios lenguajes de programación, eso sería una relación de 1:n o de uno a varios. También podría ser que solo sepa uno, eso sería 1:1, es decir, de uno a uno. Por último, también tenemos relaciones de n:n, de muchos a muchos.

### Tipos de datos

El estándar SQL nos permite crear valores en diferentes tipos, vamos a ver algunos de ellos:

#### Texto

- CHAR(size):
  - En los paréntesis van la longitud.
  - Son caracteres.
- VARCHAR(size):
  - A nivel de procesamiento y almacenamiento funciona distinto que CHAR, en VARCHAR no ocupamos si o si todo el largo disponible, el CHAR si.
- TEXT:
  - No requiere el largo.

#### Numéricos

- INTEGER:
  - INT (4 bits)
  - SMALLINT (2 bits)
  - BIGINT (8 bits)
- DECIMAL(10, 2):
  - Esto sería un valor de 10 dígitos con una precisión fija después de la coma de 2 dígitos.
- FLOAT:
  - No hace falta definir una precisión fija.

#### Fecha

- TIME:
  - La hora.
- DATE:
  - La fecha.
- DATETIME:
  - Las dos cosas juntas.
- TIMESTAMP:
  - Fecha más la hora y el formato UTC.
- BOOL:
  - Seria solo un valor cero, considerado falso, o un uno, considerado verdadero.

## Sistema de gestión de base de datos

Parte porque lo necesito y otra parte porque es muy utilizado, lo que voy a aprender y en lo que me voy a centrar en este reto será en MySQL.

[![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
