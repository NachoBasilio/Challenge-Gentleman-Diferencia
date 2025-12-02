#Operadores de asignación

x = 5
print("Valor inicial de x:", x)

x += 3  # Equivalente a x = x + 3
print("Después de x += 3:", x)

x -= 2  # Equivalente a x = x - 2
print("Después de x -= 2:", x)

x *= 4  # Equivalente a x = x * 4
print("Después de x *= 4:", x)

x /= 2  # Equivalente a x = x / 2
print("Después de x /= 2:", x)

x %= 2  # Equivalente a x = x % 2
print("Después de x %= 2:", x)

x **= 2  # Equivalente a x = x ** 2
print("Después de x **= 2:", x)

x //= 3  # Equivalente a x = x // 3
print("Después de x //= 3:", x)

print("Tipo de dato de x:", type(x))

#WALRUS (Asignación con expresión)

print(z := 10)  # Asigna 10 a z y lo imprime
print("Valor de z después de la asignación:", z)