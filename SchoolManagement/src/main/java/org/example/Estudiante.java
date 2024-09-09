package org.example;

import java.util.Date;

public class Estudiante extends Persona{

    private int id;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String estado;

    public Estudiante(int id, String nombre, String apellido, String fechaDeNacimiento, String estado) {
        super(id, nombre, apellido, fechaDeNacimiento);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
