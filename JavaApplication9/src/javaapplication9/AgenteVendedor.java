/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author Usuario
 */
public class AgenteVendedor {
    
    
    
    private String nombre;
    private String apellidos;
    private String cedula;
    private String codigo;
    private String sucursal;
    private boolean tieneVehiculo;
    private double comisionesTotales;
    private int puntosTotales;

    public AgenteVendedor(String nombre, String apellidos, String cedula, String codigo, String sucursal, boolean tieneVehiculo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.tieneVehiculo = tieneVehiculo;
        this.comisionesTotales = 0;
        this.puntosTotales = 0;
    }

    public void agregarComision(double comision) {
        this.comisionesTotales += comision;
    }

    public void agregarPuntos(int puntos) {
        this.puntosTotales += puntos;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public boolean isTieneVehiculo() {
        return tieneVehiculo;
    }

    public void setTieneVehiculo(boolean tieneVehiculo) {
        this.tieneVehiculo = tieneVehiculo;
    }

    public double getComisionesTotales() {
        return comisionesTotales;
    }

    public void setComisionesTotales(double comisionesTotales) {
        this.comisionesTotales = comisionesTotales;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    
}

    

