#Listas

frutas = ["manzana", "banana", "cereza"]

print("Lista de frutas:", frutas)

#Acceder a elementos
print("Primera fruta:", frutas[0])
print("Última fruta:", frutas[-1])

#Modificar elementos

frutas[1] = "naranja"
print("Lista modificada:", frutas)

#Agregar elementos

frutas.append("kiwi")
print("Lista después de agregar kiwi:", frutas)

#Eliminar elementos

frutas.remove("manzana")
print("Lista después de eliminar manzana:", frutas)

frutas.pop(0)  # Elimina el primer elemento
print("Lista después de hacer pop en el índice 0:", frutas)

#Cuantos elementos hay

print("Número de frutas en la lista:", len(frutas))

#Rango de indices de una lista

numeros = [10, 20, 30, 40, 50, 60]
print("Elementos del índice 1 al 4:", numeros[1:5])

#Si existe un elemento en la lista

existe_cereza = "cereza" in frutas
print("¿Existe la cereza en la lista?", existe_cereza)

#Insertar elemento en una posición específica

frutas.insert(1, "fresa")
print("Lista después de insertar fresa en la posición 1:", frutas)

#Tuplas

coordenadas = (10.0, 20.0)

#Tupla de un solo elemento

personas = ("Juan",)

print("Coordenadas:", coordenadas)

#Acceder a elementos

print("Primera coordenada:", coordenadas[0])

#Desempaquetado de tuplas

x, y = coordenadas
print("Coordenada x:", x)
print("Coordenada y:", y)

#Diccionarios

persona = {
    "nombre": "Ana",
    "edad": 25,
    "ciudad": "Barcelona"
}

print("Diccionario persona:", persona)

#Acceder a valores

print("Nombre:", persona["nombre"])

#Modificar valores

persona["edad"] = 26

print("Diccionario después de modificar la edad:", persona)

#Agregar pares clave-valor

persona["profesión"] = "Ingeniera"

print("Diccionario después de agregar profesión:", persona)

#Eliminar pares clave-valor

del persona["ciudad"]

print("Diccionario después de eliminar ciudad:", persona)

#Número de elementos

print("Número de elementos en el diccionario:", len(persona))

#Conjuntos

numeros_set = {1, 2, 3, 4, 5, 5} #Ignora duplicados automáticamente, ni el leng lo toma en cuenta.

print("Conjunto de números:", numeros_set)

#Agregar elemento

numeros_set.add(6)

mas_numeros = {7, 8, 9}

numeros_set.update(mas_numeros)

print("Conjunto después de agregar 6 y más números:", numeros_set)

#Eliminar elemento

numeros_set.remove(3)

numeros_set.discard(10)  # No genera error si el elemento no existe

numeros_set.pop()  # Elimina un elemento arbitrario

numeros_set.clear()  # Elimina todos los elementos

numeros_set = {1, 2, 4, 5, 6, 7, 8, 9}  # Reasignar para continuar con el ejemplo

print("Conjunto después de eliminar 3:", numeros_set)

#Verificar existencia

existe_dos = 2 in numeros_set

print("¿Existe el número 2 en el conjunto?", existe_dos)

#Número de elementos

print("Número de elementos en el conjunto:", len(numeros_set))

#Operaciones de conjuntos

A = {1, 2, 3, 4}

B = {3, 4, 5, 6}

union = A.union(B)

interseccion = A.intersection(B)

diferencia = A.difference(B)

print("Unión de A y B:", union)

print("Intersección de A y B:", interseccion)

print("Diferencia de A y B (A - B):", diferencia)