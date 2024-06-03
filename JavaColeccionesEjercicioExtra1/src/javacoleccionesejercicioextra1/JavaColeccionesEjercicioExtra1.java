
package javacoleccionesejercicioextra1;
import Entidad.Alumnos;
import Servicio.Servicio;
import java.util.ArrayList;
import java.util.Scanner;

 //@author LILIANA
 
public class JavaColeccionesEjercicioExtra1 {
    public static void main(String[] args) {
       
        Servicio s= new Servicio();
        ArrayList<Alumnos> l= s.A();
       s.B();
      s.M();
      s.mostrarLista(l);
      s.ordenarListaFormaAscendente(l);
      s.ordenarListaFormaDescendente(l);
      s.edadDeAlumno(l);
      s.alumnosMayoresDe25(l);
      s.inicialesApellido(l);
     s.identificarAlumnoPorNacionalidad(l);
    }
}
