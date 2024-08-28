-- Relacion 1 : 1
-- Esta relacion se trata de una relacion donde un registro de una tabla se relaciona con un solo registro de otra tabla.

-- Ejemplo de una tablar que es una tabla dni donde vamos a linkear a los usuarios de la tabla con la que comenzamos a trabajar en un principio.

CREATE TABLE dni (
	dni_id INT AUTO_INCREMENT PRIMARY kEY,
    dni_number INT NOT NULL,
    user_id INT	, 
    UNIQUE(dni_id),
	FOREIGN KEY(user_id) REFERENCES users(user_id)
);

-- Aqui podemos ver varias cosas y terminos nuevos:

-- FOREIGN KEY(user_id) REFERENCES users(user_id): Con esto estamos diciendo que la columna user_id de la tabla dni es una llave foranea que se relaciona con la columna user_id de la tabla users.
-- las claves foraneas son una forma de relacionar dos tablas, en este caso estamos relacionando la tabla dni con la tabla users.

-- Relacion 1 : N
-- Ahora el ejemplo va a ser entre una tabla de companias y la misma tabla de personas.
CREATE TABLE companies (
	company_id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    name VARCHAR(100) NOT NULL
);

-- Primero vamos a agregar una columna a la tabla de usuarios para poder relacionarla con la tabla de companias.
ALTER TABLE users 
ADD company_id INT;

--Luego tenemos que agregar la restriccion, para eso vamos a usar ADD FOREIGN KEY.

