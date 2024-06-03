
package javacoleccionesejercicioextra3;
import Entidad.Entidad;
import Servicio.Servicio;
import java.util.HashSet;
import java.util.Scanner;

 //@author LILIANA
 
public class JavaColeccionesEjercicioExtra3 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio s= new Servicio();
        
        HashSet<Entidad>j=s.jugadores();
        s.mostrarListaJugadores(j);
        s.encontrarJugador();
        
        HashSet<Entidad>j2=s.jugadores2();
        s.mostrarListaJugadores2();
        s.encontrarElementos(j, j2);
        s.unionConjuntos(j, j2);
        s.eliminarJugadoresDeJugadores2(j2);

       
    }

}
