/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import Entidad.Alumnos;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 *
 * @author LILIANA
 */
public class AlumnosComparadores {
    
     public static Comparator<Alumnos> comparadorAlumnosDescendente= new Comparator<Alumnos>() {
         
    @Override
    public int compare(Alumnos a, Alumnos a2) {
 
         return  a2.apellido.compareTo(a.apellido);
       
   }

  };
             
 
  public static Comparator<Alumnos> comparadorAlumnosAscendente= new Comparator<Alumnos>() {
     @Override
     public int compare(Alumnos a, Alumnos a2) {
 
        return  a.apellido.compareTo(a2.apellido);
      
       
   }
  
 };
    
}
