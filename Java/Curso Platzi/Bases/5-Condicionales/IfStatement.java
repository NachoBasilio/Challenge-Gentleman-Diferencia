/**
 * IfStatement
 */
public class IfStatement {
  public static void main(String[] args) {
    boolean isWiFiEnabled = true;

    // Para hacer algo respecto a una variable vamos a usar if, con eso vamos a
    // determinar un camino a seguir por nuestro codigo.
    if (isWiFiEnabled) {
      System.out.println("Conectado a la red");
    } else {
      System.out.println("Desconectado de la red");
    }

    // Operadores de equidad
    // ==, !=, <, >, <=, >=

    int age = 18;

    if (age >= 18) {
      System.out.println("Eres mayor de edad");
    } else {
      System.out.println("Eres menor de edad");
    }

    // Operadores logicos
    // &&, ||, !

    boolean isInternetEnabled = true;

    if (isWiFiEnabled && isInternetEnabled) {
      System.out.println("Conectado a internet");
    } else {
      System.out.println("Desconectado de internet");
    }

    // else if

    int calificacion = 10;

    if (calificacion == 10) {
      System.out.println("Excelente");
    } else if (calificacion == 9) {
      System.out.println("Muy bien");
    } else if (calificacion == 8) {
      System.out.println("Bien");
    } else if (calificacion == 7) {
      System.out.println("Regular");
    } else {
      System.out.println("Reprobado");
    }

    // Switch

    int dia = 1;

    switch (dia) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miercoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sabado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
      default:
        System.out.println("Dia no valido");
        break;
    }
    // En el case va el valor que se va a comparar, y en el default se ejecuta si no
    // se cumple ningun case.

  }
}
