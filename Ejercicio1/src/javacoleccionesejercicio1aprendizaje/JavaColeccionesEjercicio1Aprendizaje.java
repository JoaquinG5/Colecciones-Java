
package javacoleccionesejercicio1aprendizaje;
import java.util.ArrayList;

import java.util.Scanner;


 
public class JavaColeccionesEjercicio1Aprendizaje {
    public static void main(String[] args) {
        
   Scanner leer= new Scanner(System.in).useDelimiter("\n");
        
   ArrayList<String> razaPerros = new ArrayList();
        
        String perro="";
       String letra="";
        
        do {
             System.out.println("ingrese una raza de perro");
             perro=leer.next();
             
      
             razaPerros.add(perro);
             
             System.out.println("Desea sumar otro perro a la lista?(S o N)");
             letra=leer.next();        
             
        } while (letra.equalsIgnoreCase("S"));
        
        System.out.println("la lista de razas de perros es");
      
  
        for (String aux : razaPerros) {
            System.out.println(aux);
        }
        
        System.out.println("la cantidad de perros en la lista es " + razaPerros.size() );
    }





    
 }   

