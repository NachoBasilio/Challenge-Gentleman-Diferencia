-- En mySQL no existe la función FULL JOIN, por lo que usamos el UNION. Tenemos que establecer las columnas que queremos mostrar en el SELECT.

SELECT users.user_id as u_user_id, dni.user_id as d_user_id
FROM users
LEFT JOIN dni
ON users.user_id = dni.user_id
UNION ALL
SELECT users.user_id as u_user_id, dni.user_id as d_user_id
FROM users
RIGHT JOIN dni
ON users.user_id = dni.use_id;
