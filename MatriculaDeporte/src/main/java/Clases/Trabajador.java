/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

public class Trabajador extends Persona {

    private String turno;
    private String cargo;
    private boolean habilitado;

    public Trabajador() {
        this.habilitado = true;
    }

    public Trabajador(String turno, String cargo) {
        this.turno = turno;
        this.cargo = cargo;
    }

    public Trabajador(String turno, String cargo, boolean habilitado) {
        this.turno = turno;
        this.cargo = cargo;
        this.habilitado = habilitado;
    }

    public Trabajador(String turno, String cargo, boolean habilitado, String nombre, String apellido, String dni, String codigo, Date fechNaci, char genero, String direccion, String telefono) {
        super(nombre, apellido, dni, codigo, fechNaci, genero, direccion, telefono);
        this.turno = turno;
        this.cargo = cargo;
        this.habilitado = habilitado;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "turno=" + turno + ", cargo=" + cargo + '}';
    }
///
    public Trabajador(String codigo, String nombre, String apellido, String turno, String cargo, boolean habilitado) {
        super(nombre, apellido, "", codigo, null, ' ', "", "");
        this.turno = turno;
        this.cargo = cargo;
        this.habilitado = habilitado;
    }


}
