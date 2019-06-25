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
public class Vivienda extends Persona{
    private String modelocasa;
    private float dimensiones;
    private int manzana;
    private int villa;

    public Vivienda(String modelocasa, float dimensiones, int manzana, int villa, int cedula, String nombre, String apellido, int telefono, String correo, int numerocasa, String direccion, String propietario, Date fechaentrega) {
        super(cedula, nombre, apellido, telefono, correo, numerocasa, direccion, propietario, fechaentrega);
        this.modelocasa = modelocasa;
        this.dimensiones = dimensiones;
        this.manzana = manzana;
        this.villa = villa;
    }

    public String getModelocasa() {
        return modelocasa;
    }

    public void setModelocasa(String modelocasa) {
        this.modelocasa = modelocasa;
    }

    public float getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(float dimensiones) {
        this.dimensiones = dimensiones;
    }

    public int getManzana() {
        return manzana;
    }

    public void setManzana(int manzana) {
        this.manzana = manzana;
    }

    public int getVilla() {
        return villa;
    }

    public void setVilla(int villa) {
        this.villa = villa;
    }
    @Override
    public void Registrar(){
        
    }
    
}
