/*
 
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.

 */
package AlumnoEntidad;

import java.util.ArrayList;



public class AlumnoEntidad {
    
   public String nombre;
   public ArrayList<Integer>listaNotas= new ArrayList(3);

    public AlumnoEntidad() {
    }

    public AlumnoEntidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    
    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", listaNotas=" + listaNotas + '}';
    }
    
    

}  
 
    
    

