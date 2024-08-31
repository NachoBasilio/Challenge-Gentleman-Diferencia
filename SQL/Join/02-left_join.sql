SELECT * FROM users 
LEFT JOIN dni
ON users.user_id = dni.user_id
ORDER BY age;

-- Left Join nos va a servir para retornar todas las filas de la tabla de la izquierda y las filas de la tabla de la derecha que cumplen con la condición que nosotros le pasamos.

SELECT users.name, languages.name FROM users
LEFT JOIN users_languages ON users.user_id = users_languages.user_id
LEFT JOIN languages ON users_languages.language_id = languages.language_id

-- En este caso estamos seleccionando el nombre de los usuarios y el nombre de los lenguajes que hablan. En este caso estamos haciendo un LEFT JOIN con la tabla users_languages y con la tabla languages. En este caso estamos trayendo todos los usuarios y los lenguajes que hablan, si un usuario no habla ningun lenguaje, va a traer NULL en el nombre del lenguaje.
