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
public class Servicios extends Casa{
    private String nombreServicio;
    private String descripcion;

    public Servicios(String nombreServicio, String descripcion, int numerocasa, String direccion, String propietario, Date fechaentrega) {
        super(numerocasa, direccion, propietario, fechaentrega);
        this.nombreServicio = nombreServicio;
        this.descripcion = descripcion;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void Registrar() {
        
    }
    
}
