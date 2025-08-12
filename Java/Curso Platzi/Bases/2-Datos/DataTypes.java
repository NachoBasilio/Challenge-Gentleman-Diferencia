public class DataTypes {
  public static void main(String[] args) {
    // int - 32 bits
    int n = 1234567890;

    // long - 64 bits
    long nL = 12345678901L;

    // float - 32 bits
    float nF = 123.456F;

    // double - 64 bits
    double nD = 123.456;

    // Imprimir en consola
    System.out.println(n);
    System.out.println(nL);
    System.out.println(nF);
    System.out.println(nD);

    // Char - 2 bits
    char nC = 'a';

    // Boolean - 2 bit
    boolean nB = true;

    System.out.println(nC);
    System.out.println(nB);

    // A partir de Java 10 se pueden crear variables con datos inferidos.

    var salary = 1000; // int
    var name = "Diego"; // String
    var pension = 0.1; // double
    var employee = true; // boolean

    // Imprimir en consola todo junto

    System.out.println("El empleado " + name + " gana: " + salary + " y tiene una pension de: " + (salary * pension)
        + " y es empleado: " + employee);
  }
}
