
package javacoleccionesejercicio5aprendizaje;

import PaisServicio.PaisServicio;
import java.util.HashSet;



 //@author LILIANA
 
public class JavaColeccionesEjercicio5Aprendizaje {
    public static void main(String[] args) {
     
        PaisServicio servi= new PaisServicio();
        
        HashSet<String>p=servi.agregarPais();
        
        servi.mostrarPaises(p);
        servi.mostrarPaisesOrdenados(p);
        servi.eliminarPais(p);
        
    }

}
