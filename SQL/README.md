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

## Ejemplos de consultas SQL

### SELECT

SELECT * FROM users;

- SELECT nos sirve para elegir qué queremos traer de una tabla en específico. El asterisco hace referencia a todos los campos, aunque podemos especificar campos específicos:

SELECT name FROM users;
SELECT user_id, name FROM users;

### DISTINCT

SELECT DISTINCT * FROM users;

- La palabra clave DISTINCT asegura que los resultados no contengan filas duplicadas.

SELECT DISTINCT age FROM users;

- Este ejemplo trae solo las edades que no se repiten.

### WHERE

SELECT * FROM users WHERE age = 26;

- WHERE limita el criterio con el que recuperamos los datos. Solo trae los usuarios que cumplen con que la edad sea 26.

SELECT name FROM users WHERE age = 26;

- Este ejemplo trae los nombres de las personas que tienen 26 años.

### ORDER BY

SELECT * FROM users WHERE age > 25 ORDER BY age DESC;

- ORDER BY nos sirve para aplicar criterios de ordenamiento en cómo se muestran los resultados. DESC indica un orden descendente.

### LIKE

SELECT * FROM users WHERE email LIKE '%gmail.com';

- LIKE permite filtrar resultados utilizando patrones. En este caso, se buscan las filas donde el valor en la columna email termine con "gmail.com". El % indica que puede haber cualquier texto antes de "gmail.com".

### NOT LIKE

SELECT * FROM users WHERE email NOT LIKE '%gmail.com';

- NOT es el operador lógico de negación. Este ejemplo selecciona las filas donde el email no termina en "gmail.com".

### AND y OR

SELECT * FROM users WHERE email NOT LIKE '%gmail.com' AND age > 20;

- AND nos sirve para concatenar criterios. Por ejemplo, en este caso, que el correo no sea gmail y que tenga más de 20 años. Ambos criterios deben cumplirse.

SELECT * FROM users WHERE email NOT LIKE '%gmail.com' OR age > 20;

- OR también sirve para concatenar criterios, pero en este caso basta con que uno de los dos se cumpla.

### LIMIT

SELECT * FROM users LIMIT 2;

- LIMIT restringe la cantidad de resultados devueltos.

### NULL

SELECT * FROM users WHERE email IS NULL;

SELECT * FROM users WHERE email IS NOT NULL;

- Podemos usar IS NULL o IS NOT NULL para filtrar registros que sean o no sean NULL.

### MAX y MIN

SELECT MAX(age) FROM users;

- MAX consigue el valor máximo (o mínimo con MIN). Solo devuelve el valor, sin la información de quién es.

### COUNT

SELECT COUNT(age) FROM users;

- COUNT cuenta la cantidad de registros que tienen un valor asignado en la columna especificada.

### SUM

SELECT SUM(age) FROM users;

- SUM suma todos los valores de la columna especificada.

### AVG

SELECT AVG(age) FROM users;

- AVG devuelve la media aritmética de los valores en la columna especificada.

### IN

SELECT * FROM users WHERE name IN ('Nacho', 'Trini');

- IN se usa para filtrar resultados que coincidan con alguno de los valores especificados.

### BETWEEN

SELECT * FROM users WHERE age BETWEEN 24 AND 26;

- BETWEEN se utiliza para filtrar resultados que estén dentro de un rango especificado.

### Alias

SELECT name, init_date AS 'init' FROM users WHERE age BETWEEN 24 AND 26;

- Podemos crear un alias para que se represente en el resultado de la búsqueda.

### CONCAT

SELECT CONCAT(name, ' ' ,surname) AS 'Nombre Completo' FROM users;

- CONCAT se usa para combinar varios valores en un solo campo.
