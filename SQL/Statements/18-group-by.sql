SELECT MAX(age) FROM users GROUP BY age;

SELECT count(age), age FROM users GROUP BY age;

--  Este comando es muy útil para agrupar datos en función de una columna determinada, por ejemplo podríamos utilizarlo para conseguir la cantidad de ventas por producto.

SELECT producto, SUM(precio) AS total_ventas
FROM ventas
GROUP BY producto;

-- * producto es la columna por la que estás agrupando los datos.
-- * SUM(precio) es la función que estás aplicando a la columna precio.
-- * AS total_ventas es el alias que le estás dando a la columna que se genera con la función SUM(precio).
