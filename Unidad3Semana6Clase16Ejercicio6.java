
package unidad3semana6clase16ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Leslie Gisselle Machuca Amaya
 */
public class Unidad3Semana6Clase16Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     int fact=1;
     int num=0;
      System.out.println("Introduce numero");
      num = teclado.nextInt();
      for(int ind=1;ind<=num;ind++){
     fact*=ind;
      }
      System.out.println("El factorial es"+fact);
    }
    
}
