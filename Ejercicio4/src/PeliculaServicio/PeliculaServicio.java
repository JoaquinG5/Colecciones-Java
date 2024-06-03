/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeliculaServicio;


import static PeliculaComparadores.PeliculaComparadores.*;
import PeliculaEntidad.PeliculaEntidad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author LILIANA
 */
public class PeliculaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
 public ArrayList<PeliculaEntidad> nuevaPelicula() {
       
     String opc ;
    
     ArrayList<PeliculaEntidad> listaPeliculas = new ArrayList();

      System.out.println("Bienvenido : ");      

        System.out.println("------------------------------");


        do {
            PeliculaEntidad p = new PeliculaEntidad();
            System.out.println("Ingrese el nombre de la película");
            p.setTituloPelicula(leer.next());
            System.out.println("Ingrese el nombre del director");
            p.setDirectorPelicula(leer.next());
            System.out.println("Ingrese la duracion de la película");
            p.setDuracionPelicula(leer.nextDouble());
            listaPeliculas.add(p);
            System.out.println("Queres cargar otra peli?(Si/No)");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("no")); 
       
        return listaPeliculas;
    }

//    
    public void mostrarPeliculas(ArrayList<PeliculaEntidad> listaPeliculas){
     
         System.out.println(" mostrar peliculas ingresadas ");
        
         for (PeliculaEntidad aux : listaPeliculas) {
          
             System.out.println("----------------------------");
             
            System.out.println(aux);
        }
          
}
   
    
    public void mostrarPeliculasLargas(ArrayList<PeliculaEntidad> listaPeliculas){

        System.out.println("-----------------------------");
        
        System.out.println("mostrar peliculas de mas de 1 hora de duracion");

         for (PeliculaEntidad aux : listaPeliculas) {
        
            if (aux.getDuracionPelicula()>1){
                
                System.out.println("----------------------");
                System.out.println(aux.getTituloPelicula());
            }
        }
    }
    
    public void OrdenarPeliculasDescendente(ArrayList<PeliculaEntidad> listaPeliculas){
        
        System.out.println("ordenar las peliculas de mayor a menor");
        
        System.out.println("-----------------------------------------");
       
        Collections.sort(listaPeliculas, comparadorPeliculasDescendente);
        

        
                  mostrarPeliculas(listaPeliculas);
        
    }
        
      public void OrdenarPeliculasAscendente(ArrayList<PeliculaEntidad> listaPeliculas){
        System.out.println("ordenar las peliculas de menor a mayor");
        
        Collections.sort(listaPeliculas, comparadorPeliculasAscendente);
        
                  mostrarPeliculas(listaPeliculas);
      }    
                  
       public void OrdenarPeliculasPorTitulo(ArrayList<PeliculaEntidad> listaPeliculas){
          
           
           
           System.out.println("ordenar peliculas por titulos");
           
           System.out.println("-------------------------------------");
           
           
           Collections.sort(listaPeliculas, comparadorPeliculasTitulos );
           
           mostrarPeliculas(listaPeliculas);
       }           
           
        public void OrdenarPeliculasPordirector(ArrayList<PeliculaEntidad> listaPeliculas){
          
           System.out.println("ordenar peliculas por Director");
           
            System.out.println("------------------------------------");
            
           Collections.sort(listaPeliculas, comparadorPeliculasDirector);
           
           mostrarPeliculas(listaPeliculas);
       }           
                  

       
    }
      
      
        

  

        
            

        
        


    
    
    

