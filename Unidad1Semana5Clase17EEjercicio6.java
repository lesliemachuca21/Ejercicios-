
package unidad1semana5clase15ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Leslie Gisselle Machuca Amaya
 */
public class Unidad1Semana5Clase15Ejercicio6 {

    public static void main(String[] args) {
     Scanner Entrada = new Scanner(System.in);
       System.out.print("Ingrese la base: ");
       double base = Entrada.nextDouble();
       System.out.print("Ingrese el exponente: ");
       double exponente = Entrada.nextDouble();
       double resultado = Math.pow(base, exponente);
        System.out.print("El resultado es: "+ resultado);
        
        }
    }
    

