/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author diego
 */
public class Cliente {
    private int id;
    private String identificacion;
    private String clave;
    private String nombre;
    private String telefono;
    private String correo;
    private String metodoPago;

    public Cliente(int id, String identificacion, String clave, String nombre, String telefono, String correo, String metodoPago) {
        this.id = id;
        this.identificacion=identificacion;
        this.clave = clave;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.metodoPago = metodoPago;
    }
    public Cliente( String identificacion, String clave, String nombre, String telefono, String correo, String metodoPago) {
        this.id = 0;
        this.identificacion=identificacion;
        this.clave = clave;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.metodoPago = metodoPago;
    }
    
    public Cliente(){
    id=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    
}

