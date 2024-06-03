/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
 */
package PaisServicio;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;



/**
 *Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 * @author LILIANA
 */
public class PaisServicio {

    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
      String letra,pais;
    
    
    public HashSet<String> agregarPais(){
    
        HashSet<String>listaPaises=new HashSet();
      
        
        do {
            
            System.out.println("ingrese nombre de pais");
            pais = leer.next();
            
            listaPaises.add(pais);
            
            System.out.println("Quiere ingresar otro pais?(S/N)");
            letra = leer.next();
            
            
        } while (letra.equalsIgnoreCase("s"));
        
      return listaPaises;
    
    }
    
    
    
    public void mostrarPaises(HashSet<String>listaPaises){

        System.out.println("mostrar paises ingresados");
        
        System.out.println("---------------------------");

        for (String aux : listaPaises) {
            System.out.println(aux);
        }
}

    

public void mostrarPaisesOrdenados(HashSet<String>listaPaises){
  
    
   System.out.println("---------------------------");
    
    
  ArrayList<String>lista= new ArrayList(listaPaises);
    
  System.out.println("mostrar lista de paises ingresados por orden alfabetico");
    
  Collections.sort(lista);
  
    System.out.println("-------------------------------------------------------");
  
    for (String aux : lista) {
        System.out.println(aux);
    }
       

}



public void eliminarPais(HashSet<String>listaPaises){

    
    System.out.println("---------------------------");
    
    System.out.println("eliminar de la lista un pais ingresado");
    System.out.println("ingrese nombre");
     
    String pais = leer.next();
    
    Iterator<String>it=listaPaises.iterator();
    
 while(it.hasNext()){
    if(it.next().equalsIgnoreCase(pais)){
       System.out.println("pais eliminado");
       it.remove();
        break;
      }else{
          System.out.println("no se encuentra en la lista,intente de nuevo");
      }
   
    }

    
    

    System.out.println("-------------------------------------------");
 
    for (String aux : listaPaises) {
            System.out.println(aux);
        }
}
    

}


    
   
    


