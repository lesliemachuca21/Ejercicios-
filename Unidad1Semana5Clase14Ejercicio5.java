package Unidad1Semana5Clase14Ejercicio5;
import java.util.Scanner;


/**
 *
 * @author Leslie Gisselle Machuca Amaya
 *
 */

public class Unidad1Semana5Clase14Ejercicio5 {
     public static void main(String[] args) {
     Scanner Entrada = new Scanner(System.in);
        int reglas;
        double nota;
         System.out.print("Usted cumple las reglas de la universidad:");
          System.out.print("Ingrese un numero: \n 1. Siempre \n 2. Aveces \n 3. Nunca");
        reglas = Entrada.nextInt();
         System.out.print("Que nota obtuvo en el laboratorio:");
         nota = Entrada.nextInt();
         switch (reglas) {
             case 1:
                 if (nota >= 8 & nota <=10){
                     nota = 10;
                 }else{
                     System.out.print("Nota no valida");
                 }    break;
             case 2:
                 if (nota< 6){
                     nota = nota + 0.5;
                 } else if ( nota >=6 & nota <8){
                     nota = nota + 0.7;
                 } else {
                     System.out.print("Nota invalida");
                 }     break;
             default:
                 System.out.print(" Usted debe cumplir las reglas");
                 break;
         }
        System.out.print("La nueva nota es :" + nota);
            
            
     }         
    
}
