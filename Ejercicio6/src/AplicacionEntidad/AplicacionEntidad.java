/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplicacionEntidad;

/**
 *
 * @author LILIANA
 */
public class AplicacionEntidad {
    
    private String Producto;
    private Integer Precio;

    public AplicacionEntidad() {
    }

    public AplicacionEntidad(String Producto, Integer Precio) {
        this.Producto = Producto;
        this.Precio = Precio;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "AplicacionEntidad{" + "Producto= " + Producto + ", Precio= " + Precio + '}';
    }
    
    
    
}
