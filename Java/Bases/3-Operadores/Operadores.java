/**
 * Operadores
 */
public class Operadores {
  public static void main(String[] args) {
    // Operadores aritmeticos

    // Suma
    double a = 3, b = 2;
    double resultado = a + b;
    System.out.println("Suma: " + resultado);

    // Resta
    resultado = a - b;
    System.out.println("Resta: " + resultado);

    // Multiplicacion
    resultado = a * b;
    System.out.println("Multiplicacion: " + resultado);

    // Division
    resultado = a / b;
    System.out.println("Division: " + resultado);

    // Modulo
    resultado = a % b;
    System.out.println("Modulo: " + resultado);

    // Incremento
    // Pre-incremento
    resultado = ++a;
    System.out.println("Pre-incremento: " + resultado);

    // Post-incremento
    resultado = b++;
    System.out.println("Post-incremento: " + resultado);

    // Decremento
    // Pre-decremento
    resultado = --a;
    System.out.println("Pre-decremento: " + resultado);

    // Post-decremento
    resultado = b--;
    System.out.println("Post-decremento: " + resultado);

    // La diferencia entre pre y post es que pre se incrementa o decrementa antes de
    // asignar el valor a la variable y post se incrementa o decrementa despues de
    // asignar el valor a la variable

    // Clase Math
    // Math es una clase que nos permite realizar operaciones matematicas mas
    // complejas

    // Raiz cuadrada
    resultado = (int) Math.sqrt(9);
    System.out.println("Raiz cuadrada: " + resultado);

    // Potencia
    resultado = (int) Math.pow(3, 2);
    System.out.println("Potencia: " + resultado);

    // Redondear
    resultado = (int) Math.round(5.6);
    System.out.println("Redondear: " + resultado);
    // Por defecto redondea hacia arriba si el decimal es mayor o igual a 0.5 y
    // hacia abajo si es menor a 0.5.

    // Redondear hacia arriba
    resultado = (int) Math.ceil(5.1);
    System.out.println("Redondear hacia arriba: " + resultado);

    // Redondear hacia abajo
    resultado = (int) Math.floor(5.9);
    System.out.println("Redondear hacia abajo: " + resultado);

    // Valor absoluto
    resultado = (int) Math.abs(-5);
    System.out.println("Valor absoluto: " + resultado);

    // Para saber que dato es mayor
    resultado = (int) Math.max(5, 10);
    System.out.println("El mayor es: " + resultado);

    // Para saber que dato es menor
    resultado = (int) Math.min(5, 10);
    System.out.println("El menor es: " + resultado);
  }
}
