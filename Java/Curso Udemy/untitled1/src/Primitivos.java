public class Primitivos {
    public static void main(String[] args) {
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("El byte corresponde en BYTE a: " + Byte.BYTES);
        System.out.println("El byte corresponde en Bites a: " + Byte.SIZE);
        System.out.println("El valor maximo es de: " + Byte.MAX_VALUE);
        System.out.println("El valor minimo es de: " + Byte.MIN_VALUE);

        short numeroShort = 3000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("El short corresponde en BYTE a: " + Short.BYTES);
        System.out.println("El short corresponde en Bites a: " + Short.SIZE);
        System.out.println("El valor maximo es de: " + Short.MAX_VALUE);
        System.out.println("El valor minimo es de: " + Short.MIN_VALUE);

        int numeroInt = 380000;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("El short corresponde en BYTE a: " + Integer.BYTES);
        System.out.println("El short corresponde en Bites a: " + Integer.SIZE);
        System.out.println("El valor maximo es de: " + Integer.MAX_VALUE);
        System.out.println("El valor minimo es de: " + Integer.MIN_VALUE);

        long numeroLong = 3800000000000L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("El short corresponde en BYTE a: " + Long.BYTES);
        System.out.println("El short corresponde en Bites a: " + Long.SIZE);
        System.out.println("El valor maximo es de: " + Long.MAX_VALUE);
        System.out.println("El valor minimo es de: " + Long.MIN_VALUE);

        var numeroVar = 123; //Var nos deja definir una variable cuyo tipo se define en la literal.
        var numeroMasAlto = 23214123123L;
    }
}
