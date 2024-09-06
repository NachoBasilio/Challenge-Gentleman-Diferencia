public class Funciones {
  public static void main(String[] args) {
    int resultado = suma(5, 3);
    System.out.println(resultado);

    var area = areaDeUnCiruclo(5);

    System.out.println(area);
  }

  public static int suma(int a, int b) {
    return a + b;
  }

  public static int resta(int a, int b) {
    return a - b;
  }

  public static int multiplicacion(int a, int b) {
    return a * b;
  }

  public static int division(int a, int b) {
    return a / b;
  }

  public static int modulo(int a, int b) {
    return a % b;
  }

  public static void imprimirMensaje(String mensaje) {
    System.out.println(mensaje);
  }

  public static double areaDeUnCiruclo(int radio) {
    return (Math.PI * Math.pow(radio, 2));
  }
}
