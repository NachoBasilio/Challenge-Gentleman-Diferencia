INSERT INTO users (name, surname, age, init_date, email) VALUES ("Nico", "Burraco", 21, "2003-01-23", "hola@gmail.com");

-- Con INSERT INTO vamos a agregar entidades a la tabla. Cosas como el ID en caso de que sea auto incremental no necesita que le aclaremos su valor.

-- Ejemplo aclarando id:

INSERT INTO users (user_id, name, surname, age, init_date, email) VALUES (26, "Nico", "Burraco", 21, "2003-01-23", "hola@gmail.com");

-- Asi se puede gregar mas de un registro a la vez:


INSERT INTO languages (name) VALUES 
('Python'),
('JavaScript'),
('Java'),
('C#'),
('C++'),
('Ruby'),
('Go'),
('Rust'),
('Swift'),
('Kotlin');

-- En este caso estamos agregando 10 registros a la tabla languages. Cada uno con un nombre distinto.
