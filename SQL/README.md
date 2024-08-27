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

### GROUP BY

SELECT MAX(age) FROM users GROUP BY age;

- GROUP BY agrupa los resultados en función de una columna. Aquí se agrupan los datos por edad y se obtiene la edad máxima dentro de cada grupo.

SELECT count(age), age FROM users GROUP BY age;

- Este comando es muy útil para agrupar datos en función de una columna determinada, por ejemplo podríamos utilizarlo para conseguir la cantidad de ventas por producto.

SELECT producto, SUM(precio) AS total_ventas
FROM ventas
GROUP BY producto;

- * producto es la columna por la que estás agrupando los datos.
- * SUM(precio) es la función que estás aplicando a la columna precio.
- * AS total_ventas es el alias que le estás dando a la columna que se genera con la función SUM(precio).

### HAVING

SELECT COUNT(age) FROM users HAVING COUNT(age) > 3;

- HAVING se usa para aplicar condiciones sobre las funciones de agrupamiento, en este caso limita los resultados a aquellos con un conteo de edad mayor a 3.

### CASE

SELECT *,
CASE
	WHEN age > 24 THEN "Es mayor de 24"
    ELSE "Es menor de 24"
END AS "EsMayorQue"
FROM users;

- Con CASE vamos a tener un IF, luego del SELECT va una coma.

SELECT *,
CASE
	WHEN age > 24 THEN "Es mayor de 24"
    WHEN age = 24 THEN "Tiene 24"
    ELSE "Es menor de 24"
END AS "EsMayorQue"
FROM users;

- Se puede anidar. Aunque hay que tener cuidado, resulta que cuando se cumple una condición ya salta esa.

## DATABASE

CREATE DATABASE test;

- Si bien depende del manejador de base de datos, en general se puede hacer uso de la siguiente sentencia para crear una base de datos. Las bases de datos se llaman en minúsculas.

DROP DATABASE test;

- Ahora tenemos una sentencia DROP DATABASE que elimina la base de datos test.

## Writing

INSERT INTO users (name, surname, age, init_date, email) VALUES ("Nico", "Burraco", 21, "2003-01-23", "hola@gmail.com");

- Con INSERT INTO vamos a agregar entidades a la tabla. Cosas como el ID en caso de que sea auto incremental no necesitan que le aclaremos su valor.

### Ejemplo aclarando ID

INSERT INTO users (user_id, name, surname, age, init_date, email) VALUES (26, "Nico", "Burraco", 21, "2003-01-23", "hola@gmail.com");

UPDATE users SET name = "Juan" WHERE user_id = 27;

- De esta manera vamos a poder actualizar un registro en la base de datos, usando la sentencia UPDATE, seguido del nombre de la tabla, SET, el nombre de la columna que queremos actualizar, el valor que queremos asignarle y finalmente la condición que debe cumplir el registro que queremos actualizar.

UPDATE users SET age = 21, init_date = "2020-10-12" WHERE user_id = 23;

- En este caso estamos actualizando la edad y la fecha de inicio de un usuario con user_id 23. O sea, actualizamos más de una columna a la vez.

DELETE FROM users WHERE user_id = 27;

- Con el DELETE se borra el registro de la tabla. SIEMPRE se debe tener cuidado con el DELETE ya que no se puede recuperar la información. El WHERE es importante para indicar qué registro se va a borrar, no se debe olvidar.

## Tables

CREATE TABLE persons (
	id int,
    name varchar(100),
    age int,
    email varchar(50),
    created date
);

- Así vamos a crear una tabla en la base de datos. Resulta interesante recordar que tenemos que agregar el nombre de la columna, el tipo de dato y si es requerido o no.

### Restricciones

#### NOT NULL

CREATE TABLE persons2 (
	id int 	NOT NULL,
    name varchar(100) NOT NULL,
    age int,
    email varchar(50),
    created date
);

- **NOT NULL**: Indica que el campo no puede ser nulo.

#### UNIQUE

CREATE TABLE persons3 (
	id int NOT NULL,
    name varchar(100) NOT NULL,
    age int,
    email varchar(50),
    created datetime,
    UNIQUE(id)
);

- **UNIQUE**: Indica que el campo no puede repetirse.

#### PRIMARY KEY

CREATE TABLE person4 (
	id int NOT NULL,
    name varchar(100) NOT NULL,
    age int,
    email varchar(50),
    created datetime,
    UNIQUE(id),
    PRIMARY KEY(id)
);

- **PRIMARY KEY**: Indica que el campo es la llave primaria de la tabla.

#### CHECK

CREATE TABLE person4 (
	id int NOT NULL,
    name varchar(100) NOT NULL,
    age int,
    email varchar(50),
    created datetime,
    UNIQUE(id),
    PRIMARY KEY(id),
    CHECK(age>=18)
);

- **CHECK**: Indica que el campo debe cumplir con una condición. Nuestras bases de datos y tablas van a tener muchas restricciones y eso es lo que nos va a permitir tener una base de datos consistente.

#### DEFAULT

CREATE TABLE persons4 (
	id int NOT NULL,
    name varchar(100) NOT NULL,
    age int,
    email varchar(50),
    created datetime DEFAULT CURRENT_TIMESTAMP(), -- CURRENT_TIMESTAMP es una función que nos va a dar la fecha y hora actual.
    UNIQUE(id),
    PRIMARY KEY(id),
    CHECK(age>=18)
);

- **DEFAULT**: Indica que el campo tiene un valor por defecto.

#### AUTO_INCREMENT

CREATE TABLE persons5 (
	id int NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    age int,
    email varchar(50),
    created datetime DEFAULT CURRENT_TIMESTAMP(),
    UNIQUE(id),
    PRIMARY KEY(id),
    CHECK(age>=18)
);

- **AUTO_INCREMENT**: Indica que el campo se va a autoincrementar.

### DROP TABLE

DROP TABLE persons6;

- **DROP TABLE**: Elimina una tabla de la base de datos.

### ALTER TABLE

ALTER TABLE persons6
ADD surname varchar(50);

- **ALTER TABLE**: Modifica una tabla de la base de datos.
- **ADD COLUMN**: Agrega una columna a la tabla.

ALTER TABLE persons6
RENAME COLUMN surname TO description;

- **RENAME COLUMN**: Renombra una columna de la tabla. Se pone el RENAME COLUMN y el nombre de la columna que se quiere cambiar y luego TO y el nuevo nombre de la columna.

ALTER TABLE persons6
MODIFY COLUMN description varchar(250);

- **MODIFY COLUMN**: Modifica una columna de la tabla. Se pone el MODIFY COLUMN y el nombre de la columna que se quiere modificar y luego el nuevo tipo de dato.
