package quehace;

import java.util.Scanner;

public class QueHace{

    public static void main(String[] args) {
        double valor1,valor2;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un valor: ");
        valor1 = teclado.nextDouble();
        System.out.print("Introduzca otro valor: ");
        valor2 = teclado.nextDouble();

        teclado.close();
        
        valor1 = valor2;
        valor2 = valor1;

        System.out.println(String.format("valor1 = %f; valor2 = %f", valor1,valor2));






    }
}