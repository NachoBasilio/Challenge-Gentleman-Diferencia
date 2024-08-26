UPDATE users SET name = "Juan" WHERE user_id = 27;


-- De esta manera vamos a poder actualizar un registro en la base de datos, usando la sentencia UPDATE, seguido del nombre de la tabla, SET, el nombre de la columna que queremos actualizar, el valor que queremos asignarle y finalmente la condición que debe cumplir el registro que queremos actualizar.

UPDATE users SET age = 21, init_date = "2020-10-12" WHERE user_id = 23;

-- En este caso estamos actualizando la edad y la fecha de inicio de un usuario con user_id 23. Osea actualizamos mas de una columna a la vez.
