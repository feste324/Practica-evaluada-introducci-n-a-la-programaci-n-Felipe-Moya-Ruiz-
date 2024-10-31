/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Aulas Heredia
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nn;
        int b;
        int s;
        Curso curso1 = new Curso("SC-101");
        Curso curso2 = new Curso("SC-102");
        Curso curso3 = new Curso("SC-103");

        String a = JOptionPane.showInputDialog("Digite 1 para ingresar un curso extra y su cupo ");
        nn = Integer.parseInt(a);

        if (nn == 1) {
            Curso curso4 = new Curso("SC-104");
            String c = JOptionPane.showInputDialog(" Ingrese el cupo del curso (entre 30 y 40) ");
            b = Integer.parseInt(c);
            curso4.setCupo(b);

            System.out.println("Desea cambiar el estado del nuevo  curso");    // Opcion para cambiar el estado del curso creado 
            String d = JOptionPane.showInputDialog("Digite 1 para cambiar el estado a activo ");
            s = Integer.parseInt(d);
            if (s == 1) {

            }

            // Cambiar el estado de los cursos a activo
            curso1.setEstado(Curso.Estado.INACTIVO);
            curso2.setEstado(Curso.Estado.INACTIVO);
            curso3.setEstado(Curso.Estado.INACTIVO);
            curso4.setEstado(Curso.Estado.ACTIVO);

            // Asignar notas promedio
            curso1.setNotaPromedio(90);
            curso2.setNotaPromedio(80);
            curso3.setNotaPromedio(70);

            // Llamar a los métodos y mostrar la información
            System.out.println(curso1.toString());
            System.out.println("Promedio del curso1: " + curso1.evaluarPromedio());

            System.out.println(curso2.toString());
            System.out.println("Promedio del curso2: " + curso2.evaluarPromedio());

            System.out.println(curso3.toString());
            System.out.println("Promedio del curso3: " + curso3.evaluarPromedio());

            System.out.println(curso4.toString());
            System.out.println("Promedio del curso4: " + curso4.evaluarPromedio());

        } else {
            System.out.println(curso1.toString());
            System.out.println("Promedio del curso1: " + curso1.evaluarPromedio());

            System.out.println(curso2.toString());
            System.out.println("Promedio del curso2: " + curso2.evaluarPromedio());

            System.out.println(curso3.toString());
            System.out.println("Promedio del curso3: " + curso3.evaluarPromedio());

        }

    }

    // TODO code application logic here
}
