/*



 */
package AlumnoServicio;


import AlumnoEntidad.AlumnoEntidad;
import java.util.ArrayList;
import java.util.Scanner;

/**
 
 */
public class AlumnoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    AlumnoEntidad alumno=new AlumnoEntidad();
    
       
    Integer nota1,nota2,nota3;
    String letra;
    ArrayList<String>listaAlumnos= new ArrayList();
   
    
  public void crearALumno(){
 
      
      do {
       System.out.println("introduzca nombre del alumno");
      alumno.setNombre(leer.next());
  
      listaAlumnos.add(alumno.getNombre());

      System.out.println("desea agregar otro alumno?(s/n");
      letra=leer.next();
      
      } while (letra.equalsIgnoreCase("s"));

  }
 
  
  int suma,notas;
double promedio;
  String f;
  
  
  
      public double promedioFinal(){
      
      System.out.println("promedio final de cada alumno con sus notas");
      
      
 do {
       
     System.out.println("ingresar nombre del alumno");
         alumno.setNombre(leer.next());
    if(listaAlumnos.contains(alumno.nombre)){
   
        
              
     System.out.println("ingresar notas del alumno");
      nota1=leer.nextInt();
      nota2=leer.nextInt();
      nota3=leer.nextInt();
  
      alumno.listaNotas.add(nota1);
      alumno.listaNotas.add(nota2);
      alumno.listaNotas.add(nota3);
      
        
        
        System.out.println("calcular promedio");
        suma=(nota1+nota2+nota3);
        notas=3;
        promedio=(suma/notas);
        
        System.out.println("el promedio del alumno es " + promedio);
      
       if(promedio>=6){
            System.out.println("aprobado");
           
        }else{
          System.out.println("desaprobado");
       }
     }else{
   
       System.out.println("no se encuentra en la lista,intente de nuevo");
        
     } 

     System.out.println("Quiere seguir?s/n");
         f=leer.next();
    
 }while(f.equalsIgnoreCase("s"));
        return promedio;


    }

}