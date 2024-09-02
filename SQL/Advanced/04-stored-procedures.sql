-- El stored procedure es una query que guardamos en "favoritos" para poder ejecutarla en cualquier momento. Es una forma de guardar una query que usamos frecuentemente para no tener que escribirla cada vez que la necesitemos.

DELIMiTER //
CREATE PROCEDURE P_all_users()
BEGIN
SELECT * FROM users;
END// 

-- Ahora tengo un procedimiento almacenado llamado P_all_users que me va a devolver todos los usuarios de la tabla users.

CALL P_all_users

-- Ahora puedo llamar al procedimiento almacenado P_all_users usuando la palabra clave CALL seguida del nombre del procedimiento almacenado.

DELIMiTER //
CREATE PROCEDURE p_age_users( IN edadMin int )
BEGIN
SELECT age FROM users WHERE age >= edadMin;
END//

CALL p_age_users(23)

-- Este procedimiento almacenado me va a devolver la edad de los usuarios que tengan una edad mayor o igual a la edad que le paso como parametro.

DROP PROCEDURE p_age_users

-- Si quisiera borrar un procedimiento almacenado, debo utilizar la palabra clave DROP seguida del nombre del procedimiento almacenado que quiero borrar.
