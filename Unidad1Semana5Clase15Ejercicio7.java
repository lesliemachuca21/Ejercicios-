
package unidad1semana6clase17ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Leslie Gisselle Machuca Amaya
 */
public class Unidad1Semana6Clase17Ejercicio6 {

    public static void main(String[] args) {
        String nombre,clave;
        Scanner entrada= new Scanner (System.in);
        System.out.print("Ingrese Nombre de usuario:");
        nombre=entrada.nextLine();
        System.out.println("Ingrese Clave de usuario :");
        clave=entrada.nextLine();
        if(nombre.equals("juan")&&clave.equals("123456")){
            System.out.println("Bienvenidos al Sistema");
        }
        else{
            System.out.println("Nombre de Usuario o contraseña Incorrecto");
            
        }
        
        }
    }
    

