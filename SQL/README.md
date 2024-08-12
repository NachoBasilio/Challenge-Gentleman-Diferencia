# Apuntes SQL

- SQL sigue unos parámetros muy concretos, ya que es un estándar desde hace más de 30 años. Aprendiendo las bases, podemos trabajar en cualquier motor de bases de datos.
- Las bases de datos se fundamentan en tablas. Estas tablas contienen información que luego los usuarios o programas pueden consultar o utilizar.
- Las tablas guardan relaciones entre sí, es decir, nuestras tablas estarán "conectadas" entre sí para hacer nuestros datos más complejos.

## ¿Dónde estudiar?

- [W3Schools](https://www.w3schools.com/sql/default.asp)

## Fundamentos

- **Entidad**: Las entidades son los componentes de las bases de datos. Una entidad podría ser "PROGRAMADORES", que sería una "tabla" que guarda datos de programadores. También podríamos tener una tabla llamada "LENGUAJES", que se conecte con la tabla de programadores más adelante.
- **Filas**: Las filas serían los distintos "programadores" en la tabla "PROGRAMADORES".
- **Columnas**: Las columnas son las "propiedades" de los programadores, como nombre, edad, lenguaje, etc. Una de estas propiedades que suele estar siempre presente es el ID.
- **Relaciones**: Son las "conexiones" que tenemos entre las distintas tablas de una base de datos. Por ejemplo, un programador sabe varios lenguajes de programación, eso sería una relación de 1:n (uno a varios). También podría ser que solo sepa uno, lo que sería 1:1 (uno a uno). Por último, también tenemos relaciones de n:n (muchos a muchos).
- **Esquemas**: Los esquemas son las "estructuras" o "marcos" de una base de datos. Aunque a veces se les llama "bases de datos", tienen un significado más amplio, ya que definen la organización de toda la base de datos.
- **PK**: Clave primaria (Primary Key).
- **NN**: No nulo (Not Null).
- **UQ**: Campo único (Unique).
- **BIN**: Que sea binario (Binary).
- **UN**: Sin signo (Unsigned).
- **ZF**: Campo con ceros a la izquierda (Zero Filled).
- **AI**: Auto incremental (Auto Increment).
- **G**: Columna generada (Generated Column).

### Tipos de datos

El estándar SQL nos permite crear valores en diferentes tipos, vamos a ver algunos de ellos:

#### Texto

- **CHAR(size)**:
  - En los paréntesis va la longitud.
  - Son caracteres de longitud fija.
- **VARCHAR(size)**:
  - A nivel de procesamiento y almacenamiento funciona distinto que CHAR; en VARCHAR no ocupamos necesariamente todo el espacio disponible, mientras que en CHAR sí.
- **TEXT**:
  - No requiere especificar el largo.

#### Numéricos

- **INTEGER**:
  - **INT**: 4 bytes.
  - **SMALLINT**: 2 bytes.
  - **BIGINT**: 8 bytes.
- **DECIMAL(10, 2)**:
  - Esto sería un valor de 10 dígitos con una precisión fija después de la coma de 2 dígitos.
- **FLOAT**:
  - No hace falta definir una precisión fija.

#### Fecha

- **TIME**:
  - La hora.
- **DATE**:
  - La fecha.
- **DATETIME**:
  - La fecha y la hora juntas.
- **TIMESTAMP**:
  - Fecha más la hora en formato UTC.
- **BOOL**:
  - Sería solo un valor cero, considerado falso, o un uno, considerado verdadero.

## Sistema de gestión de bases de datos

En parte porque lo necesito y en parte porque es muy utilizado, me voy a centrar en MySQL en este reto.

[![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
