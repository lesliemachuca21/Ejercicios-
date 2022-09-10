
package unidad3semana5Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Leslie Gisselle Machuca
 */
public class Unidad3Semana5Clase13Ejercicio1 {

    public static void main(String[] args) {
 Scanner datos = new Scanner (System.in);
        int valor;
        do{
          System.out.println("Ingrese un valor entre 0 y 999 (0 dinaliza):");  
          valor=datos.nextInt();
          if(valor>=100) {
               System.out.println("Es de 3 digitos."); 
          }else {
              if (valor>=10) {
                   System.out.println("Es de 2 digitos."); 
              } else {
                   System.out.println("Es de 1 digito."); 
              }
          }
        } while (valor!=0);
    }
    
}
