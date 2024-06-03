
package javacoleccionesejercicio4aprendizaje;
import PeliculaEntidad.PeliculaEntidad;
import PeliculaServicio.PeliculaServicio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


 
public class JavaColeccionesEjercicio4Aprendizaje {
    public static void main(String[] args) {
       
        PeliculaServicio p= new PeliculaServicio();
        
        ArrayList<PeliculaEntidad>listaPeliculas=p.nuevaPelicula();

        p.mostrarPeliculas(listaPeliculas);
        p.mostrarPeliculasLargas(listaPeliculas);
        p.OrdenarPeliculasDescendente(listaPeliculas);
        p.OrdenarPeliculasAscendente(listaPeliculas);
        p.OrdenarPeliculasPorTitulo(listaPeliculas);
        p.OrdenarPeliculasPordirector(listaPeliculas);
    }

}
