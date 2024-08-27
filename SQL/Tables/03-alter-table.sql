ALTER TABLE persons6
ADD surname varchar(50);

-- ALTER TABLE: Modifica una tabla de la base de datos.
-- ADD COLUMN: Agrega una columna a la tabla.

ALTER TABLE persons6
RENAME COLUMN surname TO description;

-- RENAME COLUMN: Renombra una columna de la tabla. Se pone el RENAME COLUMN y el nombre de la columna que se quiere cambiar y luego TO y el nuevo nombre de la columna.

ALTER TABLE persons6
MODIFY COLUMN description varchar(250)

-- MODIFY COLUMN: Modifica una columna de la tabla. Se pone el MODIFY COLUMN y el nombre de la columna que se quiere modificar y luego el nuevo tipo de dato.
