/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author Usuario
 */
public class Factura {

    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private double monto;
    private int mes;
    private boolean productosElectricos;
    private boolean productosAutomotrices;
    private boolean productosConstruccion;

    public Factura(String nombreCliente, String cedulaCliente, String codigoFactura, double monto, int mes, boolean productosElectricos, boolean productosAutomotrices, boolean productosConstruccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.monto = monto;
        this.mes = mes;
        this.productosElectricos = productosElectricos;
        this.productosAutomotrices = productosAutomotrices;
        this.productosConstruccion = productosConstruccion;
    }

    public double calcularComision() {
        double comision = 0;

        // Bonos segun el  producto
        if (productosElectricos && productosAutomotrices && productosConstruccion) {
            if (monto > 50000) {
                comision += monto * 0.10;
            }
        } else {
            if (productosElectricos) {
                comision += monto * 0.04;
            }
            if (productosAutomotrices) {
                comision += monto * 0.04;
            }
            if (productosConstruccion) {
                comision += monto * 0.08;
            }
        }

        // Comision adicional si el monto es mayor a 50000
        if (monto > 50000) {
            comision += monto * 0.05;
        }

        return comision;
    }

    public int calcularPuntos() {
        int puntos = 0;
        if (productosElectricos && productosAutomotrices && productosConstruccion && monto > 50000) {
            puntos += 3;
        }
        if (productosElectricos) {
            puntos += 1;
        }
        if (productosAutomotrices) {
            puntos += 1;
        }
        if (productosConstruccion) {
            puntos += 2;
        }

        if (monto > 50000) {
            puntos += 1;
        }
        return puntos;
    }

    // Getters y Setters
}
