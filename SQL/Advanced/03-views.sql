-- Una view es una represtacion virtual de una o mas tablas. Es decir, es una tabla virtual que no existe fisicamente en la base de datos, pero que podemos usar para hacer consultas. Las vistas son utiles cuando queremos hacer consultas complejas, ya que nos permiten simplificar las consultas.

CREATE VIEW v_adult_users AS
SELECT CONCAT(name, " " ,surname) AS "NomComple" , age
FROM users
WHERE age >= 25

-- Estoy creando una vista llamada v_adult_users, donde selecciono el nombre completo y la edad de los usuarios que tengan mas de 25 años. De esta manera puedo hacer consultas mas simples y rapidas, ya que no tengo que escribir la consulta cada vez que la necesite.

DROP VIEW v_adult_users;

-- Si quisiera borrar una vista, debo utilizar la palabra clave DROP seguida del nombre de la vista que quiero borrar.
