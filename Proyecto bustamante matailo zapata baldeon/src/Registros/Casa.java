/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registros;
import interfaces.InterfaceOperaciones;
import java.util.Date;


/**
 *
 * @author Alexander
 */
public abstract class Casa implements InterfaceOperaciones {
    private int numerocasa;
    private String direccion;
    private String propietario;
    private Date fechaentrega;

    public int getNumero() {
        return numerocasa;
    }

    public void setNumero(int numerocasa) {
        this.numerocasa = numerocasa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Casa(int numerocasa, String direccion, String propietario, Date fechaentrega) {
        this.numerocasa = numerocasa;
        this.direccion = direccion;
        this.propietario = propietario;
        this.fechaentrega = fechaentrega;
    }
    @Override
    public abstract void Registrar();
    @Override
    public void GenerarCodigo(){}
    public String IngresosDeVisitas(){
        String x= "hola";
        return x;
    }
    public void IngresoDeVehiculos(){
        
    }

    @Override
    public void ControlPago() { }
    
            
    
}
