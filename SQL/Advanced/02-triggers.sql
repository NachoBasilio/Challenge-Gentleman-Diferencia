-- Los triggers se ejecutan antes o después de una operación en una tabla. Son automáticos y se ejecutan en respuesta a un evento en una tabla. Por ejemplo, si queremos que se ejecute una acción cada vez que se inserta un registro en una tabla, podemos usar un trigger.

-- Un caso de uso seria el siguiente: Imagina que quiero montar que de repente un usuario actualiza su nombre se guarde en otra tabla el nombre anterior. Para eso, puedo usar un trigger.

CREATE TRIGGER tg_email 
BEFORE/AFTER INSERT/UPDATE/DELETE
ON (la tabla donde se debe ejecutar)
FOR EACH ROW (En todas las filas)
BEGIN 
	(LOGICA A APLICAR)
END;

-- Aca lo podemos ver paso a paso:
-- Primero creamos el trigger con la palabra clave CREATE TRIGGER seguido del nombre del trigger, en este caso tg_email.
-- Luego indicamos si queremos que se ejecute antes o despues de una operacion o antes.
-- En la misma linea vamos a indicar el evento que va a disparar el trigger, en este caso INSERT, UPDATE o DELETE.
-- Luego vamos a indicar en que tabla se va a ejecutar el trigger.
-- Luego vamos a indicar que se ejecute en cada fila.
-- Por ultimo vamos a indicar la logica que se va a aplicar, en este caso la logica que se va a aplicar es la que esta entre BEGIN y END.

-- En algunos motores, como MySQL, el bloque BEGIN ... END para los triggers no admite directamente las sentencias condicionales IF...THEN. En MySQL, por ejemplo, tendria que declarar el delimitador antes de definir el trigger para permitir el uso de BEGIN ... END correctamente.

DELIMITER //

CREATE TRIGGER tg_email 
AFTER UPDATE ON users
FOR EACH ROW
BEGIN 
	IF OLD.email <> NEW.email THEN
		INSERT INTO email_history (user_id, email) VALUES (OLD.user_id, OLD.email);
	END IF;
END; //

DELIMITER ;

-- DELIMITER es una palabra clave que nos permite cambiar el delimitador de las sentencias SQL. Por defecto, el delimitador es el punto y coma (;), pero en este caso lo cambiamos a // para poder usar el bloque BEGIN ... END correctamente.

UPDATE users SET email = "test@email.com" WHERE user_id = 23;

SELECT * FROM email_history;

-- Ahora cuando actualizamos el email de un usuario, se guarda el email anterior en la tabla email_history.
