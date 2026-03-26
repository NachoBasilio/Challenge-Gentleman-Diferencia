#Crear una función simple

def mi_funcion():
    print("Esta es una función en el archivo funciones.py")

#Llamar a la función
mi_funcion()

#Funciones con parámetros

def saludar(nombre):
    print(f"Hola, {nombre}!")

#Ahora se llama argumento al llamar a la función
saludar("Carlos")

#Funcion con valor de retorno

def sumar(a, b):
    return a + b

resultado = sumar(5, 7)

print("El resultado de la suma es:", resultado)

#Funcion con múltiples valores de retorno

def operaciones(a, b):
    suma = a + b
    resta = a - b
    producto = a * b
    return suma, resta, producto

s, r, p = operaciones(10, 4)

print("Suma:", s)
print("Resta:", r)
print("Producto:", p)

#Funcion lamda normal

cuadrado = lambda x: x ** 2
print("El cuadrado de 6 es:", cuadrado(6))
