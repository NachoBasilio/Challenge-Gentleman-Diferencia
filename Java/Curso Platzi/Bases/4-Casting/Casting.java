/**
 * Casting
 */
public class Casting {
  public static void main(String[] args) {
    // El Casting es la conversion de un tipo de dato a otro, esto puede que lo
    // necesitemos cuando queremos asignar un valor de un tipo de dato a otro tipo
    // de dato.

    double d = 86.45;

    int i = (int) d;

    System.out.println(i);

    int a = 30;
    int b = 12;

    System.out.println((double) a / b);

    double c = a / b; // De manera implicita se convierte a double, pero se pierde la precision

    // para que no se pierda la precision se debe hacer un casting explicito
    c = (double) a / b;

    System.out.println(c);

    char n = '1';

    int nI = n; // Se convierte a su valor ASCII

    System.out.println(nI);

    short ns = (short) n;

    System.out.println(ns);
  }
}
