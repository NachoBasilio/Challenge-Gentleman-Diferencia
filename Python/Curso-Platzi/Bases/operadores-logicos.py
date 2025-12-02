# Operadores de Comparación

a = 10
b = 20

print(a == b)  # Igualdad
print(a != b)  # Desigualdad
print(a > b)   # Mayor que
print(a < b)   # Menor que
print(a >= b)  # Mayor o igual que
print(a <= b)  # Menor o igual que

# Operadores Lógicos

x = True
y = False

print(x and y)  # AND lógico
print(x or y)   # OR lógico
print(not x)    # NOT lógico

# Combinación de operadores de comparación y lógicos

edad = 25
ingresos = 50000

es_adulto = (edad >= 18) and (ingresos > 30000)
print(es_adulto)  # True si es adulto y tiene ingresos mayores a 30000
tiene_beca = (edad < 30) or (ingresos < 20000)
print(tiene_beca)  # True si es menor de 30 o tiene ingresos menores a 20000

# Negación de una condición

es_menor = not (edad >= 18)
print(es_menor)  # False, ya que edad es 25