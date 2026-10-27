/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private String codigo;
    private Date fechNaci;
    private char genero;
    private String direccion;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, String codigo, Date fechNaci, char genero, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.codigo = codigo;
        this.fechNaci = fechNaci;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechNaci() {
        return fechNaci;
    }

    public void setFechNaci(Date fechNaci) {
        this.fechNaci = fechNaci;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", codigo=" + codigo + ", fechNaci=" + fechNaci + ", genero=" + genero + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

}
