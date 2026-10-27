/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Listas.ListaDocentes;
import java.util.Date;

public class Docente extends Persona {

    private String especialidad;
    private int aniosExperiencia;
    private boolean habilitado;

    public Docente() {
        this.habilitado = true;
    }

    public Docente(String especialidad, int aniosExperiencia) {
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
        this.habilitado = true;
    }

    public Docente(
            String especialidad,
            int aniosExperiencia,
            String nombre,
            String apellido,
            String dni,
            String codigo,
            Date fechNaci,
            char genero,
            String direccion,
            String telefono
    ) {
        super(nombre, apellido, dni, codigo, fechNaci, genero, direccion, telefono);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
        this.habilitado = true;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Docente(String codigo, String nombre, String apellido, String especialidad, int aniosExperiencia, boolean habilitado) {
        // Enviamos los datos básicos a Persona
        super(nombre, apellido, "", codigo, null, ' ', "", "");
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
        this.habilitado = habilitado;
    }

    //////////////////////
    public String toStringArchivo() {
        return getCodigo() + ","
                + getNombre() + ","
                + getApellido() + ","
                + especialidad + ","
                + aniosExperiencia + ","
                + habilitado;
    }

}
