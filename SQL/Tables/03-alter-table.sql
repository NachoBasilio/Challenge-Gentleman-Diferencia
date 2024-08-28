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

ALTER TABLE users 
ADD CONSTRAINT fk_compenie FOREIGN KEY (company_id) REFERENCES companies(company_id)

-- El CONSTRAINT es una restriccion que se le pone a la tabla, en este caso estamos poniendo una restriccion de llave foranea, que se llama fk_compenie, que se relaciona con la columna company_id de la tabla companies. El nombre de la restricción es útil para identificarla y para poder referirse a ella en futuras modificaciones, como eliminar la restricción si es necesario.

