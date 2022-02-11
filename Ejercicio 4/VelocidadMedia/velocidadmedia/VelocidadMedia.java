package velocidadmedia;

import java.util.Scanner;


public class VelocidadMedia{ 
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la distancia recorrida (km).");
        int distancia = teclado.nextInt();
        System.out.println("Introduzca el tiempo del recorrido (min).");
        double tiempo = teclado.nextInt();
        
        teclado.close();
        
        double velocidad = distancia/(tiempo/60);

        System.out.println(String.format("Se ha desplazado a una velocidad de %f km/h.", velocidad));

       

        
        
    }
}
