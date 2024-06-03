/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import static Comparadores.AlumnosComparadores.comparadorAlumnosAscendente;
import static Comparadores.AlumnosComparadores.comparadorAlumnosDescendente;
import Entidad.Alumnos;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author LILIANA
 */

public class Servicio {
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Alumnos a=new Alumnos();
    ArrayList<Alumnos>lista=new ArrayList();
    String n,ap;

     
     
    
    public ArrayList<Alumnos> A(){

        System.out.println("alta de alumnos");
       
     lista.add(new Alumnos("joaquin","gonzalez","a",LocalDate.of(1994,03,15)));
     lista.add(new Alumnos("jusn","fernandez","c",LocalDate.of(1993,02,13)));
     lista.add(new Alumnos("jose","rodriguez","v",LocalDate.of(1992,01,12)));
     lista.add(new Alumnos("josefina","scaglione","a",LocalDate.of(1991,12,11)));
     lista.add(new Alumnos("alessandra","garcia","c",LocalDate.of(1990,04,10)));
     lista.add(new Alumnos("adriana","martino","v",LocalDate.of(1992,11,01)));
     lista.add(new Alumnos("adrian","martinez","c",LocalDate.of(1995,02,15)));
     lista.add(new Alumnos("alan","thompson","a",LocalDate.of(1996,05,17)));
     lista.add(new Alumnos("alana","diaz","a",LocalDate.of(1996,07,18)));
     lista.add(new Alumnos("facundo","gonzalez","v",LocalDate.of(1994,05,19)));
     lista.add(new Alumnos("martina","martin","c",LocalDate.of(1998,03,15)));
     lista.add(new Alumnos("anna","rodriguez","a",LocalDate.of(1993,04,19)));
     lista.add(new Alumnos("joaquina","gonzalvez","a",LocalDate.of(1995,8,21)));
     lista.add(new Alumnos("julieta","perez","c",LocalDate.of(1999,9,19)));
     lista.add(new Alumnos("daniel","zeballos","c",LocalDate.of(2000,02,22)));
     lista.add(new Alumnos("daniela","ceballos","v",LocalDate.of(1997,10,23)));
     lista.add(new Alumnos("julian","alvarez","a",LocalDate.of(1997,03,15)));
     lista.add(new Alumnos("juliana","romero","a",LocalDate.of(1999,07,22)));
     lista.add(new Alumnos("julia","robles","v",LocalDate.of(1998,03,19)));
     lista.add(new Alumnos("davina","alaba","c",LocalDate.of(1995,03,15)));

 
        
        return lista;
     
     
    }
    
   
    
    
    public void B(){
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Dar de baja a un alumno");
        
        System.out.println("ingrese su nombre");
        n=leer.next();
        System.out.println("ingrese su apellido");
        ap=leer.next();
        
        for (Alumnos aux : lista) {
            
        if((aux.getNombre().equalsIgnoreCase(n)) && (aux.getApellido().equalsIgnoreCase(ap))){
              lista.remove(aux);
              System.out.println("alumno dado de baja");
              break;
        }else{
             System.out.println("no encontrado,intente de nuevo");
         }
        
         
        
        }
 
  
    
    }
    
    
    
    public void M(){
    
        System.out.println("-----------------------------------------------------");
        
        System.out.println("modificar alumno");
       
        System.out.println("ingrese nombre y apellido del alumno");
        String no=leer.next();
        String ape=leer.next();
        int opcion = 0;
        
        for (Alumnos aux : lista) {
            
      if((aux.getNombre().equalsIgnoreCase(no)) && (aux.getApellido().equalsIgnoreCase(ape))){
            
         
        do {
            System.out.println("\tMenu");
            System.out.println("1-Opcion 1-cambiar nombre");
            System.out.println("2-Opcion 2-cambiar apellido");
            System.out.println("3-Opcion 3-cambiar nacionalidad");
            System.out.println("4-Opcion 4-cambiar fecha de nacimiento");
            System.out.println("5-Salir");
            System.out.println("Elija una opcion:");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                     System.out.println("ingrese nuevo nombre");
                     a.setNombre(leer.next());
                   
                    break;
                case 2:
                    System.out.println("ingrese nuevo apellido");
                    a.setApellido(leer.next());
                    break;
                case 3:
                    System.out.println("ingrese nueva nacionalidad");
                    a.setNacionalidad(leer.next());
                   
                    break;
                case 4:
                    System.out.println("ingrese nueva fecha de nacimiento");
                    a.setFechaDeNacimiento(LocalDate.of(leer.nextInt(), leer.nextInt(), leer.nextInt()));
                    
                    break;
                case 5:
                    System.out.println("hasta luego....");
                       
                            
                    
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    
            }
            
        } while (!(opcion == 5));
            
            
            
            }
      
     
      
        }
        
    }
    
     
     public void mostrarLista(ArrayList<Alumnos>lista){
        
        System.out.println("----------------------------------------------");
    
        System.out.println("mostrar lista de alumnos");
    
        for (Alumnos aux : lista) {
            System.out.println(aux);
        }
    
    
    }
    
    
   
    
    public void ordenarListaFormaAscendente(ArrayList<Alumnos>lista){
        
        System.out.println("---------------------------------------------------");
    
        System.out.println("Ordenar lista de forma Ascandente segun su apellido");
    
       Collections.sort(lista, comparadorAlumnosAscendente);

       mostrarLista(lista);
    }
    
     public void ordenarListaFormaDescendente(ArrayList<Alumnos>lista){
         
         System.out.println("--------------------------------------------");
    
        System.out.println("Ordenar lista de forma Descandente segun su apellido");
    
       Collections.sort(lista, comparadorAlumnosDescendente);
    
        mostrarLista(lista);
        
    }
     
     
     public void identificarAlumnoPorNacionalidad(ArrayList<Alumnos>lista){
     
         System.out.println("----------------------------------------------");
         
       System.out.println("averiguar cuantas personas hay de cada nacionalidad");
         
         int contadorCh =0,contadorA = 0,contadorV = 0;
         
         
         System.out.println("lista de alumnos chilenos");
        
         
         System.out.println("------------------------------------------------");
         
         for (Alumnos aux : lista) {
             
             if(aux.getNacionalidad().contentEquals("c")){
             
                 System.out.println(aux.getNombre() + "  " + aux.getApellido());
             
                  contadorCh++;
                  
             }
             
         }
         
         System.out.println("------------------------------------");
                 
           System.out.println("lista de alumnos argentinos");
         
            for (Alumnos aux : lista) {
             
                if(aux.getNacionalidad().equalsIgnoreCase("a")){
         
                 
                 System.out.println(aux.getNombre() + "  "  + aux.getApellido());
                 contadorA++;
            
                 }
               }
            
            System.out.println("----------------------------------------");
            

    
                for (Alumnos aux  : lista) {
                   
                    
                    if(aux.getNacionalidad().equalsIgnoreCase("v")){
         
                  System.out.println(aux.getNombre() + "  " + aux.getApellido());
                 contadorV++;
         
                
            
                 }
                
                }
                
         System.out.println("-------------------------------------");
                
         System.out.println("cantidad de alumnos chilena/o : " + contadorCh);
         System.out.println("cantidad de alumnos argentino/a : " + contadorA);
         System.out.println("cantidad de alumnos venezolano/a : " + contadorV);
                
              }
            
             
     
     
     
     
     
     
       public void alumnosMayoresDe25(ArrayList<Alumnos>lista){
       
       
           System.out.println("-----------------------------------");
           System.out.println("averiguar cuantos alumnos son mayores de 25 años");
       
           for (Alumnos aux : lista) {
               
           }
       
       
       }
    
     
       public void inicialesApellido(ArrayList<Alumnos>lista){
       
      System.out.println("-------------------------------");
       System.out.println("averiguar cuantos alumnos tienen como inicial de apellido la letra L o F");
              
        int contadorL = 0;
        int contadorF = 0;
  
           for (Alumnos aux : lista) {
               
               
         if(aux.getApellido().startsWith("l")){
             
             System.out.println("alumnos con apellidos iniciados con L");
             
             System.out.println(aux.getNombre() + " " + aux.getApellido());
            
             contadorL++;
             
           }else if(aux.getApellido().startsWith("f")){

            System.out.println("alumnos con apellidos iniciados con F");
            
            System.out.println(aux.getNombre() + " " + aux.getApellido());
            
            contadorF++;
            
       }
       
       
       }
       
     
           System.out.println("cantidad de alumnos con apellidos iniciados con L " + contadorL);
           System.out.println("cantidad de alumnos con apellidos iniciados con F " + contadorF);
           
           
         }
       
       LocalDate hoy = LocalDate.now() ; 
    
        int edad;
       
       
       public void edadDeAlumno(ArrayList<Alumnos>lista){
       
         
           System.out.println("--------------------------------------------------");
    
           System.out.println("averiguar la edad de un alumno en especifico");
       
           System.out.println("ingrese nombre y apellido del alumno");
           String an=leer.next();
           String apell=leer.next();
           
          
           
           for (Alumnos aux : lista) {
               
                edad = hoy.getYear()-aux.getFechaDeNacimiento().getYear();
               
               if((aux.getNombre().equalsIgnoreCase(an)) && (aux.getApellido().equalsIgnoreCase(apell))){
               
                       
                    System.out.println("edad de alumno : " + edad);
               
               
               }
               
           }
       
       
       }
       
       public void mayores25(ArrayList<Alumnos>lista){
       
          
           int contadorMayores=0;
           int contadorMenores=0;
         
           System.out.println("------------------------------------------------");
           
           System.out.println("averiguar cuantos alumnos son mayores de 25");
       
           for (Alumnos aux : lista) {
               
               edad =hoy.getYear()-aux.getFechaDeNacimiento().getYear();
 
                
                if (edad>25){
                   
                    contadorMayores++;
                
                }else{
                   
                 contadorMenores++;
            }
                
               
           }
           
           System.out.println("alumnos mayores de 25 " + contadorMayores);
           System.out.println("alumnos menores de 25 " + contadorMenores);
       
       }
       


    
}
     
     
     
     
     
     

     


