
package Principal;

import Parking.Parking;
import java.util.Scanner;

public class Parqueadero {
    Parking parking=new Parking("Parqueadero.com",10);
    static int opcion;
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        do {            
            menu();
        } while (opcion!=4);
      
    }
    
    public static void menu(){
        System.out.println("""
                           1)Entrada de Vehiculo
                           2)Salida de Vehiculo
                           3)Mostrar Reporte
                           4)Salir del Programa
                            """);
        opcion=Integer.parseInt(sc.nextLine());
    }
    
}
