#Try - except con division por cero

def dividir(a, b):
    try:
        resultado = a / b
    except ZeroDivisionError:
        return "Error: División por cero no permitida."
    else:
        return resultado

print(dividir(10, 2))  # Salida: 5.0
print(dividir(10, 0))  # Salida: Error: División por cero