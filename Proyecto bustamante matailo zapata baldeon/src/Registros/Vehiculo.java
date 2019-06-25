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
public class Vehiculo extends Persona{
    private String placa;
    private String modelo;
    private String color;

    public Vehiculo(String placa, String modelo, String color, int cedula, String nombre, String apellido, int telefono, String correo, int numerocasa, String direccion, String propietario, Date fechaentrega) {
        super(cedula, nombre, apellido, telefono, correo, numerocasa, direccion, propietario, fechaentrega);
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void Registrar() {
        
    }
}
