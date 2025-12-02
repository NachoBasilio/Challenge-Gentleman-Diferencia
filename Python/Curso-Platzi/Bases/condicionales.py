#Condicionales en Python

edad = 18
if edad < 18:
    print("Eres menor de edad.")
elif edad == 18:
    print("Tienes 18 años, acabas de ser mayor de edad.")
else:
    print("Eres mayor de edad.")

#Sentencia Match (similar a switch-case en otros lenguajes)

dia = "martes"

match dia:
    case "lunes":
        print("Hoy es lunes.")
    case "martes":
        print("Hoy es martes.")
    case "miércoles":
        print("Hoy es miércoles.")
    case _: # caso por defecto
        print("No es lunes, martes ni miércoles.")