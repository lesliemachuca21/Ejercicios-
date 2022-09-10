
package unidad3semana3semana7ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Leslie Gisselle Machuca Amaya
 */
public class Unidad3Semana3Semana7Ejercicio7 {

    public static void main(String[] args) {
      Scanner keyboard = new Scanner (System.in);
        int password;
        do{
         System.out.println("Introduzca su contraseña  numérica: ");
         password = keyboard.nextInt();
         if (password !=1234)
             System.out.println("La contraseña no es válida. ");
        }
        while  (password != 1234);
    }
    
}
