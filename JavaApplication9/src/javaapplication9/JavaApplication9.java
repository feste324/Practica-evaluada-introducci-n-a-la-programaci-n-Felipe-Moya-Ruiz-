/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Solicitar datos 
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del agente:");
        String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos del agente:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del agente:");
        String codigo = JOptionPane.showInputDialog("Ingrese el código del agente:");
        String sucursal = JOptionPane.showInputDialog("Ingrese la sucursal:");
        boolean tieneVehiculo = JOptionPane.showConfirmDialog(null, "¿Tiene vehículo propio?") == JOptionPane.YES_OPTION;

        AgenteVendedor agente = new AgenteVendedor(nombre, apellidos, cedula, codigo, sucursal, tieneVehiculo);

        while (true) {
            String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            String cedulaCliente = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
            String codigoFactura = JOptionPane.showInputDialog("Ingrese el código de la factura:");
            double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura:"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del mes:"));
            boolean productosElectricos = JOptionPane.showConfirmDialog(null, "¿Contiene productos eléctricos?") == JOptionPane.YES_OPTION;
            boolean productosAutomotrices = JOptionPane.showConfirmDialog(null, "¿Contiene productos automotrices?") == JOptionPane.YES_OPTION;
            boolean productosConstruccion = JOptionPane.showConfirmDialog(null, "¿Contiene productos de construcción?") == JOptionPane.YES_OPTION;

            Factura factura = new Factura(nombreCliente, cedulaCliente, codigoFactura, monto, mes, productosElectricos, productosAutomotrices, productosConstruccion);
            agente.agregarComision(factura.calcularComision());
            agente.agregarPuntos(factura.calcularPuntos());

            int continuar = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra factura?");
            if (continuar != JOptionPane.YES_OPTION) {
                break;
            }
        }

        System.out.println("El agente " + agente.getNombre() + " " + agente.getApellidos()
                + " obtuvo un total en comisiones de: " + agente.getComisionesTotales()
                + "\nPuntos obtenidos: " + agente.getPuntosTotales());
    }
}

// TODO code application logic here

