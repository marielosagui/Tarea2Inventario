/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.Scanner;

/**
 *
 * @author karla
 */
public class Inventario {
    private String Idproducto;
    private String nombre;
    private Double precio;
    private String Cantidad;
    

    public String getIdproducto() {
        return Idproducto;
    }

    public void setIdproducto(String Idproducto) {
        this.Idproducto = Idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getcantidad() {
        return Cantidad;
    }

    public void setcantidad(String cantidad) {
        this.Cantidad = cantidad;
    }

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("\nMENU\n  1.Agregar Producto\n 2.Eliminar Producto\n 3.Modificar\n 4. Cargar\n 5.Descargar\n 6.Buscar Proveedor");
    
    
}
}
