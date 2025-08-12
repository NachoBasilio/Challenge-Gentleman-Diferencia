public class Variables {
  public static void main(String[] args) {

    // Estasmos declarando una variable. tipo nombre ;
    int speed;

    // Asignamos un valor a la variable. nombre = valor;
    speed = 10;

    // Imprimimos el valor de la variable
    System.out.println(speed);

    // Tambien se puede inicializar y declarar en la misma linea
    int salary = 1000;

    // String
    String employeeName = "Diego";

    // Imprimir en consola mas de una variable
    System.out.println("El empleado " + employeeName + " gana: " + salary);

    // Reasignar un valor a una variable
    salary = salary + 150;

    System.out.println("El empleado " + employeeName + " gana: " + salary);

    // Resasignar un valor a una variable pero ahora String
    employeeName = employeeName + " Hernandez";

    System.out.println("El empleado " + employeeName + " gana: " + salary);

    // Convenciones de nombres:

    // En Java se recomienda que las variables sean camelCase
    int numberOfEmployees = 10;

    System.out.println(numberOfEmployees);

    // CamelCase consiste en que la primera palabra empiece con minuscula y las
    // siguientes palabras empiecen con mayuscula

    // Constantes
    // Se recomienda que las constantes sean en mayusculas y con guion bajo

    int POSITION = 10;
    String URL_BASE = "http://localhost";

    System.err.println(POSITION);
    System.err.println(URL_BASE);
  }
}
