SELECT *,
CASE
	WHEN age > 24 THEN "Es mayor de 23"
    ELSE "Es menor de 23"
END AS "EsMayorQue"
FROM users;

-- Con CASE vamos a tener un IF, luego del select va una coma.

SELECT *,
CASE
	WHEN age > 24 THEN "Es mayor de 24"
    WHEN age = 24 THEN "Tiene 24"
    ELSE "Es menor de 24"
END AS "EsMayorQue"
FROM users;

-- Se puede anidar. Aunque hay que tener cuidado, resulta que cuando se cumple una condición ya salta esa.