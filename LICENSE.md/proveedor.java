/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author karla
 */
public class proveedor {
    private String empresa;
    private String dui;
    private String nombre;
    private String telefono;
    private String direccion;
    
    public String getEmpresa(){
        return empresa;
    }
    public String getDui() {
        return dui;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setEmpresa(String empresa){
        this.empresa= empresa;
    }
    public void setDui(String dui) {
        this.dui = dui;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
}
