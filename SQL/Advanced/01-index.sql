-- Un indice en SQL es una estructura de datos que nos va a permitir "indixar" una tabla, con esto vamos a poder acceder a los datos de una tabla de manera mas rapida. Ademas vamos a tener distintos tipos de indices, como los indices unicos, los indices compuestos, los indices de texto, entre otros.
-- No siempre es necesario crear indices, ya que estos ocupan espacio en disco y pueden ralentizar las operaciones de escritura en la base de datos. Por lo tanto, es importante saber cuando y donde crear indices.

-- Indice primario: Este esta vinculado a la clave primaria de una tabla, y es unico. Es decir, no puede haber dos registros con la misma clave primaria. Por lo tanto, este indice es unico y no nulo.

-- Indices unicos: Son indices que no permiten duplicados, pero no necesariamente estan vinculados a la clave primaria de una tabla.

-- Indices compuestos: Son indices que se crean a partir de dos o mas columnas de una tabla. Estos indices son utiles cuando se realizan consultas que involucran mas de una columna.

-- Existen diferentes tipos de indices porque a veces los criterios de busqueda no son los mismos, por lo tanto, es importante saber que tipo de indice se debe crear en cada caso.

-- Para crear indices vamos a hacer lo siguiente:

CREATE INDEX idx_name ON users(name);

-- Ahora vemos que usamos la palabra clave CREATE INDEX seguido del nombre del indice que queremos crear, luego la palabra clave ON seguido del nombre de la tabla y entre parentesis el nombre de la columna que queremos indexar.

--Para que un indice sea unico hacemos lo siguiente:

CREATE UNIQUE INDEX idx_name ON users(name);

-- Tambien podriamos tener mas de una columna en un indice, para eso hacemos lo siguiente:

CREATE INDEX idx_name ON users(name, surname);

-- Una vez creado el indice, podemos hacer una busqueda, con un SELECT como ya lo veniamos haciendo, pero nos aseguramos de que la busqueda sea mas rapida ya que el tener un indice nos permite accediier a los datos de una tabla de manera mas rapida. En el caso de que las consultas habituales sean por nombres, como vemos en este ejemplo, nos asegurariamos de que la busqueda sea mas rapida.

-- Si quisiera borar un indice, hago lo siguiente:

DROP INDEX idx_name ON users;


