
package javacolecciones.ejercicio2aprendizaje;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


 
public class JavaColeccionesEjercicio2Aprendizaje {
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
    
        
        
        System.out.println("ingrese un perro que eliminara de la lista");
        String perroEliminado=leer.next();
        int contador=razaPerros.size();
        Iterator<String>it=razaPerros.iterator() ;
     
 
        while(it.hasNext()){
            if (it.next().equals(perroEliminado)){           
                it.remove(); 
           }
        }
        
        
        if(contador==razaPerros.size()){
            System.out.println("no se encuentra ese perro en la lista"); 
        }else{
            System.out.println("perro eliminado de la lista");
        }   
            
      
        
           System.out.println("la lista de perros queda conformada asi");
        
            for (String aux : razaPerros) {
        
            System.out.println(aux);
            
            }
            
               Collections.sort(razaPerros);
        }
        

    }


