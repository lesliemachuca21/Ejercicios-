
package unidad3semana3semana7ejercicio2;

/**
 *
 * @author Leslie Gisselle Machuca Amaya
 */
public class Unidad3Semana3Semana7Ejercicio2 {

    public static void main(String[] args) {
         double dinero = 1000;
       int  mes = 1;
       while (mes<=12){
           dinero = dinero * 1.02;
           mes++;    
       }
       System.out.println(dinero);
    }
    
}
