/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Clases.Alumno;

public class NodoColaAtencion {

    private Alumno alumno;
    private NodoColaAtencion sig;

    public NodoColaAtencion() {
    }

    public NodoColaAtencion(Alumno alumno, NodoColaAtencion sig) {
        this.alumno = alumno;
        this.sig = sig;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public NodoColaAtencion getSig() {
        return sig;
    }

    public void setSig(NodoColaAtencion sig) {
        this.sig = sig;
    }

}
