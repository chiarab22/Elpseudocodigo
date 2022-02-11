package queveremos;

public class QueVeremos{

    public static void main(String[] args) {
        int valor1, valor2;
        String cadena1;

        final double CST = 49.78;

        valor1 = 92 % 8;
        valor2 = 2 * valor1;

        cadena1 = "Test";

        System.out.println(String.format("%s , valor2 = %d", cadena1,valor2));
        System.out.println(String.format("%d # %f", valor1,CST));
    }
}