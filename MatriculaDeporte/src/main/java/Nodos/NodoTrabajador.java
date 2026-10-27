/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Clases.Trabajador;

public class NodoTrabajador {

    private Trabajador dato;
    private NodoTrabajador sig;

    public NodoTrabajador() {
    }

    public NodoTrabajador(Trabajador dato, NodoTrabajador sig) {
        this.dato = dato;
        this.sig = sig;
    }

    public NodoTrabajador(Trabajador dato) {
        this.dato = dato;
        this.sig = null;
    }

    public Trabajador getDato() {
        return dato;
    }

    public void setDato(Trabajador dato) {
        this.dato = dato;
    }

    public NodoTrabajador getSig() {
        return sig;
    }

    public void setSig(NodoTrabajador sig) {
        this.sig = sig;
    }

}
