SELECT * FROM users
RIGHT JOIN dni
ON users.user_id = dni.user_id

-- RIGHT JOIN nos va a servir para retornar todas las filas de la tabla de la derecha y las filas de la tabla de la izquierda que cumplen con la condición que nosotros le pasamos. Es parecido al LEFT JOIN pero en este caso estamos trayendo todas las filas de la tabla que va luego de la palabra RIGHT JOIN.
-- Si ben podemos hacer RIGHT JOIN, en la mayoria de los casos se usa LEFT JOIN, ya que es mas facil de entender y de leer. Ademas que en optimización de consultas, el LEFT JOIN es mas eficiente que el RIGHT JOIN.

SELECT users.name, languages.name FROM users
RIGHT JOIN users_languages ON users.user_id = users_languages.user_id
RIGHT JOIN languages ON users_languages.language_id = languages.language_id

-- Ahora podemos ver que hasta los lenguajes se repiten y los usuarios no. Esto es porque estamos haciendo un RIGHT JOIN con la tabla users_languages y con la tabla languages. En este caso estamos trayendo todos los lenguajes y los usuarios que hablan esos lenguajes, si un lenguaje no es hablado por ningun usuario, va a traer NULL en el nombre del usuario.
