if 5 > 3:
    print("5 es mayor que 3")

print("Este es un mensaje fuera del bloque condicional")

# Esto es un comentario

x = "Esta es una variable de tipo cadena"
print(x)

x = 42  # Ahora x es una variable de tipo entero
print(x)
# Cuidado, python es medio JS en cuanto a tipado

y, z = 10, 20
print(y, z)

a = b = c = 100
print(a, b, c)

fruta_favorita = "mango"
print("Mi fruta favorita es: " + fruta_favorita)
print(f"Mi fruta favorita es: {fruta_favorita}")
print("Mi fruta favorita es:", fruta_favorita)

comillas_simples = 'Hola con comillas simples'
comillas_dobles = "Hola con comillas dobles"
comillas_triples = '''Hola con comillas triples'''
comillas_dobles_triples = """Hola con comillas dobles triples"""

print(comillas_simples)
print(comillas_dobles)
print(comillas_triples)
print(comillas_dobles_triples)

#Numeros

entero = 10
flotante = 10.5
complejo = 3 + 4j
print(entero, flotante, complejo)

#Lista

mi_lista = [1, 2, 3, "cuatro", "cinco"]
print(mi_lista)
#Si es puede modificar

#Tupla

mi_tupla = (1, 2, 3, "cuatro", "cinco")
print(mi_tupla)
#No se puede modificar

#Diccionario

mi_diccionario = {
    "nombre": "Juan",
    "edad": 30,
    "ciudad": "Madrid"
}
print(mi_diccionario)

#Conjunto

mi_conjunto = {1, 2, 3, 4, 5}
print(mi_conjunto)
#No permite elementos duplicados, sin orden específico

#Booleano

es_verdadero = True
es_falso = False
print(es_verdadero, es_falso)

#Ninguno

valor_nulo = None
print(valor_nulo)

#Como ver los tipos

entero = 10
flotante = 10.5
complejo = 3 + 4j
cadena = "Hola"

print(type(entero))
print(type(flotante))
print(type(complejo))
print(type(cadena))

#Castings

numero_entero = 10
numero_flotante = float(numero_entero)
print(numero_flotante)

#Generar un número aleatorio, entre 1 y 100. El 100 no está incluido.

import random

numero_aleatorio = random.randrange(1, 100)
print(numero_aleatorio)

#Encontrar un texto dentro de otro texto

texto = "Hola, bienvenido al curso de Python en Platzi"
buscar = "Python"

encontrado = buscar in texto
print(encontrado)  # Devuelve True si se encuentra, False si no. Es key sensitive.

no_encontrado = "Java" in texto
print(no_encontrado)  # Devuelve False

no_esta_incluido = "Java" not in texto
print(no_esta_incluido)  # Devuelve True

#Convertir a mayúsculas y minúsculas

mensaje = "Hola Mundo"
mensaje_mayusculas = mensaje.upper()
mensaje_minusculas = mensaje.lower()
print(mensaje_mayusculas)
print(mensaje_minusculas)

#Mostrar una letra de una cadena

primera_letra = mensaje[0]
print(primera_letra)

ultima_letra = mensaje[-1]
print(ultima_letra)

#Slicing

subcadena = mensaje[0:4]  # Desde el índice 0 hasta el 4 (no incluido)
print(subcadena)
subcadena_final = mensaje[5:]  # Desde el índice 5 hasta el final
print(subcadena_final)
subcadena_saltos = mensaje[0:10:2]  # Desde el índice 0 hasta el 10, saltando de 2 en 2
print(subcadena_saltos)
cadena_invertida = mensaje[::-1]  # Cadena invertida
print(cadena_invertida)

#Longitud de una cadena

longitud = len(mensaje)
print(longitud)

#Split

frase = "Hola bienvenido al curso de Python en Platzi"
palabras = frase.split(" ")  # Dividir por espacios
print(palabras)

#Booleanos

v = True
f = False

print(v)
print(f)

print(5 > 3)  # True
print(5 < 3)  # False

print (type(v))

print (bool(1))  # True
print (bool(0))  # False
print (bool(""))  # False
print (bool("Hola"))  # True
print (bool([]))  # False
print (bool([1, 2, 3]))  # True
print (bool(None))  # False
print (bool({}))  # False
print (bool({"key": "value"}))  # True
