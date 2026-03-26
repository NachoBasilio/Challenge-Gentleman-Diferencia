#Leer un archivo de texto (con try - except para manejo de errores)
def leer_archivo(ruta):
    try:
        with open(ruta, 'r', encoding='utf-8') as archivo:
            contenido = archivo.readline()
        return contenido
    except FileNotFoundError:
        return "Error: Archivo no encontrado."
ruta_archivo = 'ejemplo.txt'
contenido = leer_archivo(ruta_archivo)
print("Contenido del archivo:")
print(contenido)

#Escribir en un archivo de texto (con try - except para manejo de errores)

def escribir_archivo(ruta, texto):
    try:
        with open(ruta, 'w', encoding='utf-8') as archivo:
            archivo.write(texto)
        return "Escritura exitosa."
    except Exception as e:
        return f"Error al escribir en el archivo: {e}"
ruta_archivo_escritura = 'salida.txt'
texto_a_escribir = 'Esta es una línea de texto escrita en el archivo.'
resultado_escritura = escribir_archivo(ruta_archivo_escritura, texto_a_escribir)
print(resultado_escritura)

#Editar un archivo de texto (con try - except para manejo de errores)

def editar_archivo(ruta, texto):
    try:
        with open(ruta, 'a', encoding='utf-8') as archivo:
            archivo.write('\n' + texto)
        return "Edición exitosa."
    except Exception as e:
        return f"Error al editar el archivo: {e}"
ruta_archivo_edicion = 'salida.txt'
texto_a_editar = 'Esta es una línea adicional añadida al archivo.'
resultado_edicion = editar_archivo(ruta_archivo_edicion, texto_a_editar)
print(resultado_edicion)

