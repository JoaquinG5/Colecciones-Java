/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeliculaComparadores;

import PeliculaEntidad.PeliculaEntidad;
import java.util.Comparator;

/**
 *
 * @author LILIANA
 */
public class PeliculaComparadores {
    
    
 public static Comparator<PeliculaEntidad> comparadorPeliculasDescendente= new Comparator<PeliculaEntidad>() {
    @Override
    public int compare(PeliculaEntidad P1, PeliculaEntidad P2) {
 
         return  P2.getDuracionPelicula().compareTo(P1.getDuracionPelicula());
       
   }
  
 };
 
 
  public static Comparator<PeliculaEntidad> comparadorPeliculasAscendente= new Comparator<PeliculaEntidad>() {
     @Override
     public int compare(PeliculaEntidad P1, PeliculaEntidad P2) {
 
        return  P1.getDuracionPelicula().compareTo(P2.getDuracionPelicula());
      
       
   }
  
 };
        
    
  public static Comparator<PeliculaEntidad> comparadorPeliculasTitulos= new Comparator<PeliculaEntidad>() {
     @Override
     public int compare(PeliculaEntidad P1, PeliculaEntidad P2) {
 
         return  P1.getTituloPelicula().compareTo(P2.getTituloPelicula());
       
   }
  
 };      






 public static Comparator<PeliculaEntidad> comparadorPeliculasDirector= new Comparator<PeliculaEntidad>() {
     @Override
     public int compare(PeliculaEntidad P1, PeliculaEntidad P2) {
 
         return P1.getDirectorPelicula().compareToIgnoreCase(P2.getDirectorPelicula());
       
   }
  
 };      
         
}



     