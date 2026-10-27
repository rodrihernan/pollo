/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Clases.Alumno;

public class NodoAlumno {

    public NodoAlumno() {
    }
    public Alumno dato;
    public NodoAlumno sig;

    public NodoAlumno(Alumno dato, NodoAlumno sig) {
        this.dato = dato;
        this.sig = sig;
    }

    public NodoAlumno(Alumno dato) {
        this.dato = dato;
        this.sig = null;
    }

    public Alumno getDato() {
        return dato;
    }

    public void setDato(Alumno dato) {
        this.dato = dato;
    }

    public NodoAlumno getSig() {
        return sig;
    }

    public void setSig(NodoAlumno sig) {
        this.sig = sig;
    }

}

