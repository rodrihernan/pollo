/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;
import Clases.Matricula;
import javax.swing.JOptionPane;
import java.util.Date; //

public class Matricula {

    private String idMatricula;
    private Date fechaMatricula;
    private double costo;
    private Alumno alu;
    private Trabajador tra;
    private Programacion grupo; //que sección es
    private Pago pag; //pago completo, no se acepta cuotas

    public Matricula() {
    }

    public Matricula(String idMatricula, Date fechaMatricula, double costo, Alumno alu, Trabajador tra, Programacion grupo, Pago pag) {
        this.idMatricula = idMatricula;
        this.fechaMatricula = fechaMatricula;
        this.costo = costo;
        this.alu = alu;
        this.tra = tra;
        this.grupo = grupo;
        this.pag = pag;
    }

    public String getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(String idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Date getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Date fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Alumno getAlu() {
        return alu;
    }

    public void setAlu(Alumno alu) {
        this.alu = alu;
    }

    public Trabajador getTra() {
        return tra;
    }

    public void setTra(Trabajador tra) {
        this.tra = tra;
    }

    public Programacion getGrupo() {
        return grupo;
    }

    public void setGrupo(Programacion grupo) {
        this.grupo = grupo;
    }

    public Pago getPag() {
        return pag;
    }

    public void setPag(Pago pag) {
        this.pag = pag;
    }

    @Override
    public String toString() {
        return "Matricula{" + "idMatricula=" + idMatricula + ", fechaMatricula=" + fechaMatricula + ", costo=" + costo + ", alu=" + alu + ", tra=" + tra + ", grupo=" + grupo + ", pag=" + pag + '}';
    }

}
