
package unidad1semana3clase8ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Leslie Gisselle Machuca Amaya
 */
public class Unidad1Semana3Clase8Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int suma;
        
        System.out.print("Escribe el primer entero:");
        numero1 = entrada.nextInt ();
        
         System.out.print("Escribe el segundo entero:");
        numero2 = entrada.nextInt ();
        
        suma = numero1 + numero2 ;
        
         System.out.print("La suma es" + suma);
    }
    
}
