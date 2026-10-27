/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Listas.ListaAlumnos;

import java.util.Date;

public class Alumno extends Persona {

    private String talla;
    private float peso;
    private boolean habilitado;

    public Alumno() {
        this.habilitado = true;

    }

    public Alumno(String talla, float peso, boolean habilitado) {
        this.talla = talla;
        this.peso = peso;
        this.habilitado = habilitado;
    }

    public Alumno(String talla, float peso, boolean habilitado, String nombre, String apellido, String dni, String codigo, Date fechNaci, char genero, String direccion, String telefono) {
        super(nombre, apellido, dni, codigo, fechNaci, genero, direccion, telefono);
        this.talla = talla;
        this.peso = peso;
        this.habilitado = habilitado;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Alumno(String codigo, String nombre, String apellido, String dni, String talla, float peso, boolean habilitado) {
        super(nombre, apellido, dni, codigo, null, ' ', "", "");
        this.talla = talla;
        this.peso = peso;
        this.habilitado = habilitado;
    }

//PARA ARCHIVOOOOOO - NO BORRAR NI TOCAR :'D
    public String toStringArchivo() {
        return getCodigo() + ","
                + getNombre() + ","
                + getApellido() + ","
                + getDni() + ","
                + talla + ","
                + peso + ","
                + isHabilitado();
    }

}
