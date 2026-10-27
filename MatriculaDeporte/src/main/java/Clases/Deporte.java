/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Deporte {

    private String codigoDep;
    private String nombreDep;
    private char categoria; // G= grupal , I= 
    private String Descripcion;

    private boolean habilitado;

    public Deporte() {
        this.habilitado = true;
    }

    public Deporte(String codigoDep, String nombreDep, char categoria, String descripcion) {
        this.codigoDep = codigoDep;
        this.nombreDep = nombreDep;
        this.categoria = categoria;
        this.Descripcion = descripcion;
        this.habilitado = true;
    }

    public String getCodigoDep() {
        return codigoDep;
    }

    public void setCodigoDep(String codigoDep) {
        this.codigoDep = codigoDep;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        return "Deporte{" + "codigoDep=" + codigoDep + ", nombreDep=" + nombreDep + ", categoria=" + categoria + ", Descripcion=" + Descripcion + '}';
    }

    public Deporte(String codigoDep, String nombreDep, char categoria, String descripcion, boolean habilitado) {
        this.codigoDep = codigoDep;
        this.nombreDep = nombreDep;
        this.categoria = categoria;
        this.Descripcion = descripcion; 
        this.habilitado = habilitado;
    }

    //
    public String toStringArchivo() {
        return codigoDep + ","
                + nombreDep + ","
                + categoria + ","
                + Descripcion + ","
                + habilitado;
    }

}
