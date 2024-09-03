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
```sql
SELECT * FROM users;

- SELECT nos sirve para elegir qué queremos traer de una tabla en específico. El asterisco hace referencia a todos los campos, aunque podemos especificar campos específicos:


SELECT name FROM users;
SELECT user_id, name FROM users;
```

### DISTINCT

```sql
SELECT DISTINCT * FROM users;

- La palabra clave DISTINCT asegura que los resultados no contengan filas duplicadas.

SELECT DISTINCT age FROM users;

- Este ejemplo trae solo las edades que no se repiten.
```

### WHERE

```sql
SELECT * FROM users WHERE age = 26;

- WHERE limita el criterio con el que recuperamos los datos. Solo trae los usuarios que cumplen con que la edad sea 26.

SELECT name FROM users WHERE age = 26;

- Este ejemplo trae los nombres de las personas que tienen 26 años.
```

### ORDER BY

```sql
SELECT * FROM users WHERE age > 25 ORDER BY age DESC;

- ORDER BY nos sirve para aplicar criterios de ordenamiento en cómo se muestran los resultados. DESC indica un orden descendente.
```

### LIKE

```sql
SELECT * FROM users WHERE email LIKE '%gmail.com';

- LIKE permite filtrar resultados utilizando patrones. En este caso, se buscan las filas donde el valor en la columna email termine con "gmail.com". El % indica que puede haber cualquier texto antes de "gmail.com".
```

### NOT LIKE

```sql
SELECT * FROM users WHERE email NOT LIKE '%gmail.com';

- NOT es el operador lógico de negación. Este ejemplo selecciona las filas donde el email no termina en "gmail.com".
```

### AND y OR

```sql
SELECT * FROM users WHERE email NOT LIKE '%gmail.com' AND age > 20;

- AND nos sirve para concatenar criterios. Por ejemplo, en este caso, que el correo no sea gmail y que tenga más de 20 años. Ambos criterios deben cumplirse.

SELECT * FROM users WHERE email NOT LIKE '%gmail.com' OR age > 20;

- OR también sirve para concatenar criterios, pero en este caso basta con que uno de los dos se cumpla.
```

### LIMIT

```sql
SELECT * FROM users LIMIT 2;

- LIMIT restringe la cantidad de resultados devueltos.
```

### NULL

```sql
SELECT * FROM users WHERE email IS NULL;

SELECT * FROM users WHERE email IS NOT NULL;

- Podemos usar IS NULL o IS NOT NULL para filtrar registros que sean o no sean NULL.
```

### MAX y MIN

```sql
SELECT MAX(age) FROM users;

- MAX consigue el valor máximo (o mínimo con MIN). Solo devuelve el valor, sin la información de quién es.
```

### COUNT

```sql
SELECT COUNT(age) FROM users;

- COUNT cuenta la cantidad de registros que tienen un valor asignado en la columna especificada.
```

### SUM

```sql
SELECT SUM(age) FROM users;

- SUM suma todos los valores de la columna especificada.
```

### AVG

```sql
SELECT AVG(age) FROM users;

- AVG devuelve la media aritmética de los valores en la columna especificada.
```

### IN

```sql
SELECT * FROM users WHERE name IN ('Nacho', 'Trini');

- IN se usa para filtrar resultados que coincidan con alguno de los valores especificados.
```

### BETWEEN

```sql
SELECT * FROM users WHERE age BETWEEN 24 AND 26;

- BETWEEN se utiliza para filtrar resultados que estén dentro de un rango especificado.
```

### Alias

```sql
SELECT name, init_date AS 'init' FROM users WHERE age BETWEEN 24 AND 26;

- Podemos crear un alias para que se represente en el resultado de la búsqueda.
```

### CONCAT

```sql
SELECT CONCAT(name, ' ' ,surname) AS 'Nombre Completo' FROM users;

- CONCAT se usa para combinar varios valores en un solo campo.
```

### GROUP BY

```sql
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
```

### HAVING

```sql
SELECT COUNT(age) FROM users HAVING COUNT(age) > 3;

- HAVING se usa para aplicar condiciones sobre las funciones de agrupamiento, en este caso limita los resultados a aquellos con un conteo de edad mayor a 3.
```

### CASE

```sql
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
```

## DATABASE

```sql
CREATE DATABASE test;

- Si bien depende del manejador de base de datos, en general se puede hacer uso de la siguiente sentencia para crear una base de datos. Las bases de datos se llaman en minúsculas.

DROP DATABASE test;

- Ahora tenemos una sentencia DROP DATABASE que elimina la base de datos test.
```

## Writing

```sql
INSERT INTO users (name, surname, age, init_date, email) VALUES ("Nico", "Burraco", 21, "2003-01-23", "hola@gmail.com");

- Con INSERT INTO vamos a agregar entidades a la tabla. Cosas como el ID en caso de que sea auto incremental no necesitan que le aclaremos su valor.
```

### Ejemplo aclarando ID

```sql
INSERT INTO users (user_id, name, surname, age, init_date, email) VALUES (26, "Nico", "Burraco", 21, "2003-01-23", "hola@gmail.com");

UPDATE users SET name = "Juan" WHERE user_id = 27;

- De esta manera vamos a poder actualizar un registro en la base de datos, usando la sentencia UPDATE, seguido del nombre de la tabla, SET, el nombre de la columna que queremos actualizar, el valor que queremos asignarle y finalmente la condición que debe cumplir el registro que queremos actualizar.

UPDATE users SET age = 21, init_date = "2020-10-12" WHERE user_id = 23;

- En este caso estamos actualizando la edad y la fecha de inicio de un usuario con user_id 23. O sea, actualizamos más de una columna a la vez.

DELETE FROM users WHERE user_id = 27;

- Con el DELETE se borra el registro de la tabla. SIEMPRE se debe tener cuidado con el DELETE ya que no se puede recuperar la información. El WHERE es importante para indicar qué registro se va a borrar, no se debe olvidar.
```

## Tablas

### CREATE TABLE

```sql
CREATE TABLE persons (
	id int,
    name varchar(100),
    age int,
    email varchar(50),
    created date
);

- Así vamos a crear una tabla en la base de datos. Resulta interesante recordar que tenemos que agregar el nombre de la columna, el tipo de dato y si es requerido o no.
```

### RESTRICCIONES

#### NOT NULL

```sql
CREATE TABLE persons2 (
	id int 	NOT NULL,
    name varchar(100) NOT NULL,
    age int,
    email varchar(50),
    created date
);
```

- **NOT NULL**: Indica que el campo no puede ser nulo.

#### UNIQUE

```sql
CREATE TABLE persons3 (
	id int NOT NULL,
    name varchar(100) NOT NULL,
    age int,
    email varchar(50),
    created datetime,
    UNIQUE(id)
);
```

- **UNIQUE**: Indica que el campo no puede repetirse.

#### PRIMARY KEY

```sql
CREATE TABLE person4 (
	id int NOT NULL,
    name varchar(100) NOT NULL,
    age int,
    email varchar(50),
    created datetime,
    UNIQUE(id),
    PRIMARY KEY(id)
);
```

- **PRIMARY KEY**: Indica que el campo es la llave primaria de la tabla.

#### CHECK

```sql
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
```

- **CHECK**: Indica que el campo debe cumplir con una condición. Nuestras bases de datos y tablas van a tener muchas restricciones y eso es lo que nos va a permitir tener una base de datos consistente.

#### DEFAULT

```sql
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
```

- **DEFAULT**: Indica que el campo tiene un valor por defecto.

#### AUTO_INCREMENT

```sql
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
```

- **AUTO_INCREMENT**: Indica que el campo se va a autoincrementar.

### DROP TABLE

```sql
DROP TABLE persons6;
```

- **DROP TABLE**: Elimina una tabla de la base de datos.

### ALTER TABLE

```sql
ALTER TABLE persons6
ADD surname varchar(50);
```
- **ALTER TABLE**: Modifica una tabla de la base de datos.
- **ADD COLUMN**: Agrega una columna a la tabla.

```sql
ALTER TABLE persons6
RENAME COLUMN surname TO description;
```
- **RENAME COLUMN**: Renombra una columna de la tabla. Se pone el RENAME COLUMN y el nombre de la columna que se quiere cambiar y luego TO y el nuevo nombre de la columna.

```sql
ALTER TABLE persons6
MODIFY COLUMN description varchar(250);
```

- **MODIFY COLUMN**: Modifica una columna de la tabla. Se pone el MODIFY COLUMN y el nombre de la columna que se quiere modificar y luego el nuevo tipo de dato.

## Relaciones en Bases de Datos Relacionales

### Relación 1 : 1
Esta relación se trata de una relación donde un registro de una tabla se relaciona con un solo registro de otra tabla.

- **FOREIGN KEY(user_id) REFERENCES users(user_id):** Con esto estamos diciendo que la columna `user_id` de la tabla `dni` es una llave foránea que se relaciona con la columna `user_id` de la tabla `users`. Las claves foráneas son una forma de relacionar dos tablas, en este caso estamos relacionando la tabla `dni` con la tabla `users`.

![](https://i.sstatic.net/w9ooX.gif)

### Relación 1 : N
Este tipo de relación ocurre cuando un registro en una tabla puede estar relacionado con múltiples registros en otra tabla.

- **Ejemplo:** Una compañía puede tener varios empleados, pero cada empleado solo trabaja para una compañía. Aquí la relación es 1:N entre la tabla `companies` y la tabla `users`.
- Primero agregamos una columna `company_id` a la tabla `users` para poder relacionarla con la tabla `companies`.
- Luego, añadimos la restricción de llave foránea usando `ADD CONSTRAINT fk_company FOREIGN KEY (company_id) REFERENCES companies(company_id)`. El `CONSTRAINT` es una manera de identificar la restricción que estamos agregando.

![](https://sqlearning.com/es/introduccion-sql-server/relaciones/relacion-1aN.png)

### Relación N : N
En una relación N:N, múltiples registros en una tabla pueden estar relacionados con múltiples registros en otra tabla. Para gestionar esta relación, se utiliza una tabla intermedia.

- **Ejemplo:** Imagina que tienes una tabla de `users` y una tabla de `languages`, donde un usuario puede conocer varios lenguajes de programación, y un lenguaje puede ser conocido por varios usuarios. Para modelar esta relación, se crea una tabla intermedia `users_languages` que contiene los IDs de ambas tablas.

- **IMPORTANTE:** A estas tablas intermedias, normalmente se les da un nombre que es una concatenación de los nombres de las tablas que se están relacionando.

![](https://i.sstatic.net/l7fDF.png)

## JOIN en SQL

### Inner Join

```sql
El `INNER JOIN` se utiliza para retornar las filas de dos o más tablas que cumplen con una condición.

SELECT * FROM users INNER JOIN dni ON users.user_id = dni.user_id;

- En este caso, se seleccionan todas las columnas de la tabla `users` y de la tabla `dni`, donde el `user_id` de la tabla `users` sea igual al `user_id` de la tabla `dni`. En teoría de conjuntos, el `INNER JOIN` nos devuelve la intersección de los conjuntos de las dos tablas.

SELECT * FROM users JOIN dni ON users.user_id = dni.user_id;

- En la mayoría de los casos, se puede omitir la palabra `INNER`, ya que por defecto se realiza un `INNER JOIN`.

SELECT CONCAT(name, " " , surname), dni_number FROM users JOIN dni ON users.user_id = dni.user_id ORDER BY age;

- En este ejemplo, se concatena el nombre y el apellido de los usuarios, y se muestra el `dni_number` de la tabla `dni`, ordenado por la edad de los usuarios.

SELECT CONCAT(users.name, " " , users.surname) AS "Nombre completo", companies.name AS "Laburo" FROM users JOIN companies ON users.company_id = companies.company_id;

- En una relación uno a muchos, donde cada usuario tiene una sola empresa, este `JOIN` se utiliza para seleccionar el nombre completo de los usuarios y el nombre de la empresa donde trabajan.

SELECT users.name, languages.name FROM users_languages JOIN users ON users_languages.user_id = users.user_id JOIN languages ON users_languages.language_id = languages.language_id;

- En una relación muchos a muchos, donde un usuario puede conocer varios lenguajes y un lenguaje puede ser conocido por varios usuarios, este `JOIN` se utiliza para seleccionar el nombre de los usuarios y el nombre de los lenguajes que hablan.
```

### Left Join

```sql
El `LEFT JOIN` retorna todas las filas de la tabla de la izquierda y las filas de la tabla de la derecha que cumplen con la condición especificada.

SELECT * FROM users LEFT JOIN dni ON users.user_id = dni.user_id ORDER BY age;

- Este ejemplo muestra todas las filas de la tabla `users` y las filas correspondientes de la tabla `dni`. Si no hay coincidencia en `dni`, las columnas de `dni` se rellenan con `NULL`.

SELECT users.name, languages.name FROM users LEFT JOIN users_languages ON users.user_id = users_languages.user_id LEFT JOIN languages ON users_languages.language_id = languages.language_id;

- Aquí se selecciona el nombre de los usuarios y el nombre de los lenguajes que hablan. Si un usuario no habla ningún lenguaje, aparecerá `NULL` en el nombre del lenguaje.
```

### Right Join

```sql
El `RIGHT JOIN` retorna todas las filas de la tabla de la derecha y las filas de la tabla de la izquierda que cumplen con la condición especificada.

SELECT * FROM users RIGHT JOIN dni ON users.user_id = dni.user_id;

- Este `JOIN` es similar al `LEFT JOIN`, pero se devuelven todas las filas de la tabla de la derecha (`dni`) y las correspondientes filas de la izquierda (`users`). Si no hay coincidencia en `users`, las columnas de `users` se rellenan con `NULL`.

SELECT users.name, languages.name FROM users RIGHT JOIN users_languages ON users.user_id = users_languages.user_id RIGHT JOIN languages ON users_languages.language_id = languages.language_id;

- En este caso, se muestran todos los lenguajes y los usuarios que hablan esos lenguajes. Si un lenguaje no es hablado por ningún usuario, aparecerá `NULL` en el nombre del usuario.
```

### Full Join (UNION ALL)

En MySQL no existe la función `FULL JOIN`, por lo que se utiliza `UNION`. Se debe especificar qué columnas mostrar en el `SELECT`.

```sql
SELECT users.user_id AS u_user_id, dni.user_id AS d_user_id FROM users LEFT JOIN dni ON users.user_id = dni.user_id
UNION ALL
SELECT users.user_id AS u_user_id, dni.user_id AS d_user_id FROM users RIGHT JOIN dni ON users.user_id = dni.user_id;

- Este ejemplo combina los resultados de un `LEFT JOIN` y un `RIGHT JOIN` para obtener todas las coincidencias posibles de ambas tablas, incluyendo las filas que no tienen coincidencias en la otra tabla.
```
## Advanced

### Índices

Un índice en SQL es una estructura de datos que nos permite "indexar" una tabla, lo que facilita un acceso más rápido a los datos. Existen distintos tipos de índices, como los índices únicos, compuestos y de texto, cada uno útil en diferentes situaciones. Sin embargo, no siempre es necesario crear índices, ya que ocupan espacio en disco y pueden ralentizar las operaciones de escritura.

- Índice primario: Está vinculado a la clave primaria de una tabla, y es único, es decir, no puede haber dos registros con la misma clave primaria.

- Índices únicos: No permiten duplicados, pero no están necesariamente vinculados a la clave primaria.

- Índices compuestos: Se crean a partir de dos o más columnas y son útiles para consultas que involucran varias columnas.

#### Para crear índices:

```sql
CREATE INDEX idx_name ON users(name);
```

Para crear un índice único:

```sql
CREATE UNIQUE INDEX idx_name ON users(name);
```

Para crear un índice compuesto:

```sql
CREATE INDEX idx_name ON users(name, surname);
```

Si quisieras borrar un índice:

```sql
DROP INDEX idx_name ON users;
```

### Triggers

Los triggers en SQL son un conjunto de instrucciones que se ejecutan automáticamente antes o después de que ocurra un evento específico en una tabla. Los triggers son útiles para automatizar tareas y mantener la integridad de los datos en la base de datos.

- Eventos: Los triggers pueden ser disparados por eventos como INSERT, UPDATE, o DELETE en una tabla.

- Tipos de ejecución: Pueden ejecutarse BEFORE (antes) o AFTER (después) de que ocurra el evento especificado.

#### Ejemplo de Trigger

Imagina que quieres que, cada vez que un usuario actualice su correo electrónico, el correo anterior se guarde en una tabla de historial. Para ello, puedes utilizar un trigger:

```sql
CREATE TRIGGER tg_email
AFTER UPDATE
ON users
FOR EACH ROW
	BEGIN
		IF OLD.email <> NEW.email THEN
			INSERT INTO email_history (user_id, email) VALUES (OLD.user_id, OLD.email);
		END IF;
	END;
```

##### En este ejemplo:

- Nombre del Trigger: tg_email.
- Tipo de evento: AFTER UPDATE - El trigger se ejecutará después de una actualización en la tabla users.
- Condición: Verificamos si el valor del correo electrónico ha cambiado comparando OLD.email (el valor anterior) con NEW.email (el valor nuevo).
- Acción: Si el correo ha cambiado, se inserta un registro en la tabla email_history con el user_id y el correo anterior.
  
##### Cambiar Delimitador en MySQL

En algunos motores, como MySQL, es necesario cambiar el delimitador para utilizar correctamente bloques BEGIN ... END dentro de un trigger:

```sql
DELIMITER //

CREATE TRIGGER tg_email AFTER UPDATE ON users FOR EACH ROW BEGIN IF OLD.email <> NEW.email THEN INSERT INTO email_history (user_id, email) VALUES (OLD.user_id, OLD.email); END IF; END; //

DELIMITER ;
```

##### En este caso:

- DELIMITER //: Cambia el delimitador de las sentencias SQL para permitir el uso de BEGIN ... END.
- DELIMITER ;: Restaura el delimitador al punto y coma ; después de definir el trigger.

##### Ejecución de un Trigger

Después de definir el trigger, cada vez que se actualice el correo electrónico de un usuario, se guardará el correo anterior en la tabla email_history.

Por ejemplo:

```sql
UPDATE users SET email = "test@email.com" WHERE user_id = 23;
```

##### Consultar los Cambios

Para ver los cambios registrados en la tabla de historial:

```sql
SELECT * FROM email_history;
```

Este proceso asegura que, cada vez que un usuario cambie su correo, el correo anterior se registre automáticamente, lo que es útil para auditorías o para mantener un historial de cambios.

### Vistas

Una vista es una representación virtual de una o más tablas, que podemos usar para simplificar consultas complejas.

Para crear una vista:

```sql
CREATE VIEW v_adult_users AS SELECT CONCAT(name, " " ,surname) AS "NomComple", age FROM users WHERE age >= 25;
```

Para eliminar una vista:

```sql
DROP VIEW v_adult_users;
```

### Procedimientos almacenados

Un procedimiento almacenado es una consulta SQL guardada que podemos ejecutar en cualquier momento, lo que nos permite reutilizar consultas frecuentes.

Para crear un procedimiento almacenado:

```sql
DELIMITER // 

CREATE PROCEDURE P_all_users() 
	BEGIN 
 		SELECT * FROM users; 
   	END //
```

Para llamar a un procedimiento almacenado:

```sql
CALL P_all_users;
```

Para crear un procedimiento almacenado con parámetros:

```sql
DELIMITER //

CREATE PROCEDURE p_age_users(IN edadMin INT)
	BEGIN
		SELECT age FROM users WHERE age >= edadMin;
	END //
```

Para llamar al procedimiento almacenado con parámetros:

```sql
CALL p_age_users(23);
```

Para eliminar un procedimiento almacenado:

```sql
DROP PROCEDURE p_age_users;
```

### Transacciones

Una transacción es un conjunto de operaciones SQL que se ejecutan como una unidad. Si alguna falla, todas las operaciones anteriores se revierten, manteniendo la base de datos en un estado coherente.

Para iniciar una transacción:

```sql
START TRANSACTION;
```

Para confirmar una transacción:

```sql
COMMIT;
```

Para revertir una transacción:

```sql
ROLLBACK;
```

###### Continuara...
