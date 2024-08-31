SELECT name, init_date AS 'init' FROM users WHERE age BETWEEN 24 AND 26;

-- Podemos crear un alias para que se represente en el resultado de la búsqueda.

SELECT CONCAT(name, ' ' ,surname) AS 'Nombre Completo' FROM users;

-- Tambien podemos concatenar