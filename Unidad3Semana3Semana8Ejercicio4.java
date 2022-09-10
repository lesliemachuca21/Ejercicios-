
package unidad3semana3semana8ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Leslie Gisselle Machuca Amaya
 */
public class Unidad3Semana3Semana8Ejercicio4 {

    public static void main(String[] args) {
       Scanner Reader = new Scanner(System.in);
        String quieroJugar = "si";
        while(quieroJugar.equals ("si")){
        System.out.println("¿Quieres seguir jugando?");    
        quieroJugar = Reader.next();
    }
    
}
}
