/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplicacionServicio;

import AplicacionEntidad.AplicacionEntidad;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author LILIANA
 */
public class AplicacionServicio {
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    HashMap<String,Integer> mapa= new HashMap();

    public void introducirElemento(){

      String letra;
      
   do {
     
       AplicacionEntidad p1= new AplicacionEntidad();
      System.out.println("ingrese nombre del producto");
      p1.setProducto(leer.next());
      System.out.println("ingrese precio del producto");
      p1.setPrecio(leer.nextInt());
     
       mapa.put(p1.getProducto(), p1.getPrecio());
     
     System.out.println("desea ingresar otro producto?(Si o no?)");
     letra=leer.next();

    } while(letra.equalsIgnoreCase("si"));
  }   
     
   public void modificarPrecio(){
       
       System.out.println("ingresar nombre del producto al que le cambiara el precio");
       String productoCambiable=leer.next();
       
       if(mapa.isEmpty()){
           System.out.println("la tienda se encuentra vacia");
       }else{
          if (mapa.containsKey(productoCambiable)){
           System.out.println("ingrese el nuevo Precio");
           mapa.replace(productoCambiable, leer.nextInt());
         }else{
           System.out.println("el producto no se encuentra disponible");
         }
       }
   }
   
   public void eliminarProducto(){
       System.out.println("introduzca el nombre del producto a eliminar ");
        String productoEliminado=leer.next();
       
       if(mapa.isEmpty()){
           System.out.println("la tienda se encuentra vacia");
       }else{
          if (mapa.containsKey(productoEliminado)){
           mapa.remove(productoEliminado);
         }else{
           System.out.println("el producto no se encuentra disponible");
         }
       }
       
   }
   
   public void mostrarProductos(){
       
       if(mapa.isEmpty()){
           System.out.println("la tienda se encuentra vacia");
       }else{
           System.out.println("mostrar lista de productos con sus respectivos precios");
     
       for (Map.Entry<String, Integer> entry : mapa.entrySet()) { 
           System.out.println("Producto: "+ entry.getKey() + "  precio: " + entry.getValue() );
       }
       }
   }
}

   
   
  
    
    

