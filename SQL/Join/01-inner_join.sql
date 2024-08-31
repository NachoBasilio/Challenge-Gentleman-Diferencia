-- Inner Join nos va a server para retornar las filas de dos o mas tablas que cumplen con una condición.

SELECT * FROM users
INNER JOIN dni
ON users.user_id = dni.user_id;

-- En este caso estamos seleccionando todas las columnas de la tabla users y de la tabla dni, donde el user_id de la tabla users sea igual al user_id de la tabla dni. En teoria de conjuntos el INNER JOIN nos va a devolver la intersección de los conjuntos de las dos tablas.

SELECT * FROM users 
JOIN dni
ON users.user_id = dni.user_id;

-- En la mayoria de los casos se puede omitir la palabra INNER, ya que por defecto se va a hacer un INNER JOIN.

SELECT CONCAT(name, " " , surname), dni_number FROM users 
JOIN dni
ON users.user_id = dni.user_id
ORDER BY age;

-- Podemos aplicar todo lo que vimos antes a los JOIN, en este caso estamos concatenando el nombre y el apellido de los usuarios y mostrando el dni_number de la tabla dni, ordenado por la edad de los usuarios.

SELECT CONCAT(users.name, " " , users.surname) as "Nombre completo", companies.name as "Laburo" FROM users
JOIN companies
ON users.company_id = companies.company_id

-- La diferencia es que esto es un relacion uno a n, donde cada usuario tiene una sola empresa. En este caso estamos seleccionando el nombre completo de los usuarios y el nombre de la empresa donde trabajan. Ahi estoy trayendo el nombre de la empresa y no el id, por eso hago un JOIN con la tabla companies y no con la tabla users.

SELECT users.name, languages.name FROM users_languages
JOIN users ON users_languages.user_id = users.user_id
JOIN languages ON users_languages.language_id = languages.language_id

-- Ahora tenemos una relacion muchos a muchos, donde un usuario puede tener muchos lenguajes y un lenguaje puede ser hablado por muchos usuarios. En este caso estamos seleccionando el nombre de los usuarios y el nombre de los lenguajes que hablan. Para esto hacemos un JOIN con la tabla users_languages y con la tabla languages.
