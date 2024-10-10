/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Pedir numero de empleados
        String empleadoss;
        empleadoss = JOptionPane.showInputDialog("Digite el numero de empleados ");
        // variables a utilizar 
        int empleados = Integer.parseInt(empleadoss);
        int sem;
        int ivm;
        String salario;
        int rebajo = 0;
        int total = 0;

        // Solicictar los salarios 
        for (int i = 1; i <= empleados; i++) {

            //pedir datos 
            salario = JOptionPane.showInputDialog("Digite el Salario ");
            int salarioo = Integer.parseInt(salario);

            //operacion matematica 
            sem = (int) (salarioo * 0.0925);
            ivm = (int) (salarioo * 0.0508);
            rebajo = (int) (sem + ivm);
            total = total + rebajo;

        }
        // impresion del mensaje 
        System.out.print("La empresa debera abonal a la CCSS el monto de  " + total);
        System.out.print("          por concepto de SEM y IVM ");

    }

}
