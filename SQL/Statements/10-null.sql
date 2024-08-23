SELECT * FROM users WHERE email IS NULL;

SELECT * FROM users WHERE email IS NOT NULL;

-- Aca podemos usar el NULL para traer o no los los registros que sea o no NULL.

SELECT name, IFNULL(age, 0) FROM users:

-- Si es nulo, podemos determinar que valor va a tener.