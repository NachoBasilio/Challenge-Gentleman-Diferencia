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

ALTER TABLE users 
ADD CONSTRAINT fk_compenie FOREIGN KEY (company_id) REFERENCES companies(company_id)

-- El CONSTRAINT es una manera de luego poder company_identificar la restriccion que estamos agregando, en este caso la llamamos fk_compenie. Pero en teoria no es necesario ponerle un nombre.

-- Relacion N : N

-- Ahora vamos a crear una tabla que represente los diferentes luguajes de programacion que los usuarios pueden conocer.

CREATE TABLE languages(
	language_id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	name VARCHAR(100) NOT NULL
)

-- Para relacionar los usuarios con los diferentes lenguajes deberemos crear una tabla intermedia que realcione los ids de los usuarios con los ids de los lenguajes.
-- A estas tablas intermedias le solemos poner de nombre la concatenacion de los nombres de las tablas que estamos relacionando.

CREATE TABLE users_languages(
    users_language_id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    user_id INT,
    language_id INT,
    FOREIGN KEY(user_id) REFERENCES users(user_id),
    FOREIGN KEY(language_id) REFERENCES languages(language_id),
    UNIQUE (user_id, language_id)
);

