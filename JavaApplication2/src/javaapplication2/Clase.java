/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Random;

/**
 *
 * @author Aulas Heredia
 */
public class Clase {
    
    
    // Atributos privados
    private final String codigo;
    private int cupo;
    private Estado estado;
    private float notaPromedio;

    // Enumeración para el estado del curso
    public enum Estado {
        ACTIVO, INACTIVO
    }

    // Constructor
    public curso(String codigo) {
        if (!validarCodigo(codigo)) {
            throw new IllegalArgumentException("Código no válido. Debe tener el formato SC-XXX, donde X es un número.");
        }
        this.codigo = codigo;
        this.cupo = generarCupo();
        this.estado = Estado.INACTIVO;
        this.notaPromedio = 0.0f;
    }

    // Método para validar el formato del código
    private boolean validarCodigo(String codigo) {
        return codigo.matches("SC-\\d{3}");
    }

    // Generar cupo aleatorio entre 30 y 40
    private int generarCupo() {
        Random random = new Random();
        return random.nextInt(11) + 30; // Genera un número entre 30 y 40
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        if (cupo < 30 || cupo > 40) {
            throw new IllegalArgumentException("El cupo debe estar entre 30 y 40.");
        }
        this.cupo = cupo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public float getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(float notaPromedio) {
        this.notaPromedio = notaPromedio;
    }

    // Método para determinar si el promedio es bueno, regular o malo
    public String evaluarPromedio() {
        if (notaPromedio >= 85) {
            return "Bueno";
        } else if (notaPromedio >= 75) {
            return "Regular";
        } else {
            return "Malo";
        }
    }

    // Método toString para representar el curso como una cadena de texto
    @Override

        public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", cupo=" + cupo +
                ", estado=" + estado +
                ", notaPromedio=" + notaPromedio +
                '}';
    }

    
    
}
