/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Ambiente {

    private String codigo;
    private String nombre;
    private int capacidad;
    private String ubicacion;
    private char estado;
    private boolean habilitado = true;

    public Ambiente() {
    }

    public Ambiente(String codigo, String nombre, int capacidad, String ubicacion, char estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ambiente{");
        sb.append("codigo=").append(codigo);
        sb.append(", nombre=").append(nombre);
        sb.append(", capacidad=").append(capacidad);
        sb.append(", ubicacion=").append(ubicacion);
        sb.append(", estado=").append(estado);
        sb.append(", habilitado=").append(habilitado);
        sb.append('}');
        return sb.toString();
    }

    public Ambiente(String codigo, String nombre, int capacidad, String ubicacion, char estado, boolean habilitado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.habilitado = habilitado;
    }

    //ARCHIVOOO
    public String toStringArchivo() {
        return codigo + ","
                + nombre + ","
                + capacidad + ","
                + ubicacion + ","
                + estado + ","
                + habilitado;
    }

}
