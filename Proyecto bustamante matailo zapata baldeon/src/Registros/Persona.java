/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registros;

import java.util.Date;

/**
 *
 * @author Alexander
 */
public class Persona extends Casa{
    private int cedula;
    private String nombre;
    private String apellido;
    private int telefono;
    private String correo;

    public Persona(int cedula, String nombre, String apellido, int telefono, String correo, int numerocasa, String direccion, String propietario, Date fechaentrega) {
        super(numerocasa, direccion, propietario, fechaentrega);
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    @Override
    public void GenerarCodigo(){
        
    }

    @Override
    public void Registrar() {
        
    }
    
    
}
