/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Entidad;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author LILIANA
 */
public class Servicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
   HashSet<Entidad>jugadores= new HashSet();
 HashSet<Entidad>jugadores2= new HashSet();
        
    
    String letra;
    
    public HashSet<Entidad>jugadores(){
         
         
        
        System.out.println("mostrar lista de jugadores de fc barcelona");
      
        
        do {
            Entidad jugador= new Entidad();
            System.out.println("ingrese nombre y apellido del jugador");
            jugador.setNombre(leer.next());
            jugador.setApellido(leer.next());
            
            jugadores.add(jugador);
            
            System.out.println("desea agregar otro jugador a la lista?(S/N)");
            letra=leer.next();
            
        } while (letra.equalsIgnoreCase("S"));
       
        
        return jugadores;
        
    }
    
    public void mostrarListaJugadores(HashSet<Entidad>jugadores){
    
    
        System.out.println("mostrar lista de jugadores");
        
        for (Entidad aux : jugadores) {
            System.out.println(aux);
        }
    
    }
    
    
    
    
    public void encontrarJugador(){
    
        System.out.println("averiguar si se encuentra un jugador en la lista de jugadores");

        
        for (Entidad aux : jugadores) {
       
            System.out.println(aux);
            
          if(aux.getNombre().equalsIgnoreCase("neymar jr")){
            
            System.out.println("jugador encontrado");
            break;
            
            }else{
     
              System.out.println("no se encuentra en la lista,revise la lista de nuevo");
          
             }
        }

    }
    
    
    
    
    public  HashSet<Entidad>jugadores2(){
  
           
       jugadores2.add(new Entidad("Gerard","Pique"));
        jugadores2.add(new Entidad("Sergi","Busquets"));
 
        return jugadores2;

    
    }
    
    
    public void mostrarListaJugadores2(){

        System.out.println("mostrar jugadores de nueva lista creada ");
        System.out.println("----------------------------------------");

        for (Entidad a : jugadores2) {
            System.out.println(a);
        }


}
    
    public void unionConjuntos(HashSet<Entidad>jugadores,HashSet<Entidad>jugadores2){
    
         System.out.println("mostrar lista de jugadores unica");
         System.out.println("---------------------------------");
         
         jugadores.addAll(jugadores2);
     
         for (Entidad aux : jugadores) {
        
             System.out.println(aux);
        }
    
    }

 
    
    public void encontrarElementos(HashSet<Entidad>jugadores,HashSet<Entidad>jugadores2){
    
    System.out.println("averiguar si elementos de segundo conjunto se encuentra en el primer conjunto");
  
   
     
           if(jugadores.containsAll(jugadores2)){
            
               System.out.println("los jugadores de la segunda lista se encuentran en la primera");
            
            }else{
                System.out.println("no se encuentan jugadores de otra lista");
            }
        
    }

    
   

    public void eliminarJugadoresDeJugadores2(HashSet<Entidad>jugadores2){
    
        System.out.println("eliminar jugadores de segundo conjunto");

            jugadores2.removeAll(jugadores);
     
      
    }

}
