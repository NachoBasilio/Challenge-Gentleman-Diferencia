SELECT MAX(age) FROM users GROUP BY age;

SELECT count(age), age FROM users GROUP BY age;

--  Este comando es muy útil para agrupar datos en función de una columna determinada, por ejemplo podríamos utilizarlo para conseguir la cantidad de ventas por producto.

SELECT producto, SUM(precio) as total_ventas SELECT producto, SUM(precio) as total_ventas