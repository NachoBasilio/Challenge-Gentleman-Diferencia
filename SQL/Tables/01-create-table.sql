CREATE TABLE persons (
	id int,
    name varchar(100),
    age int,
    email varchar(50),
    created date
);

-- Asi vamos a crar una tabla en la base de datos, resulta interesante recoradr que tenemos que agregar el nombre de la columna, el tipo de dato y si es requerido o no.

-- Existen ciertas restricciones que podemos agregar a las columnas y ahora las vamos a ir viendo:

-- NOT NULL: Indica que el campo no puede ser nulo.

CREATE TABLE persons2 (
	id int 	NOT NULL,
    name varchar(100) NOT NULL,
    age int,
    email varchar(50),
    created date
);

-- UNIQUE: Indica que el campo no puede repetirse.

CREATE TABLE persons3 (
	id int NOT NULL,
    name varchar(100) NOT NULL,
    age int,
    email varchar(50),
    created datetime,
    UNIQUE(id)
);

-- PRIMARY KEY: Indica que el campo es la llave primaria de la tabla.

CREATE TABLE person4 (
	id int NOT NULL,
    name varchar(100) NOT NULL,
    age int,
    email varchar(50),
    created datetime,
    UNIQUE(id),
    PRIMARY KEY(id)
);

-- CHECK: Indica que el campo debe cumplir con una condicion. Nuestras bases de datos y tablas van a tener muchas restricciones y eso es lo que nos va a permitir tener una base de datos consistente.

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

-- DEFAULT: Indica que el campo tiene un valor por defecto.

CREATE TABLE persons4 (
	id int NOT NULL,
    name varchar(100) NOT NULL,
    age int,
    email varchar(50),
    created datetime DEFAULT CURRENT_TIMESTAMP(), --CURRENT_TIMESTAMP es una funcion que nos va a dar la fecha y hora actual.
    UNIQUE(id),
    PRIMARY KEY(id),
    CHECK(age>=18)
);

-- AUTO_INCREMENT: Indica que el campo se va a autoincrementar.

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

