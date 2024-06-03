
package javacoleccionesejercicio6aprendizaje;
import AplicacionServicio.AplicacionServicio;
import java.util.HashMap;
import java.util.Scanner;

 //@author LILIANA
 
public class JavaColeccionesEjercicio6Aprendizaje {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        AplicacionServicio app= new AplicacionServicio();
        
        int opcion;
        
        do {
            System.out.println("Menu:");
            System.out.println("1 - cargar producto");
            System.out.println("2 - modificar precio");
            System.out.println("3 - eliminar producto");
            System.out.println("4 - mostrar lista");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();
            
         switch(opcion){
             case 1:
                 app.introducirElemento();
                 break;
             case 2:
                 app.modificarPrecio();
                 break;
             case 3:
                 app.eliminarProducto();
                 break;
             case 4:
                 app.mostrarProductos();
                 break;
             case 5:
                 System.out.println("adios,que tenga buen dia");
                 break;
             default:
                 System.out.println(" opcion no valida,elija un numero del menu");
                 break;
         }
            
        } while (opcion<5);
        
    }
      
        
        
    }


