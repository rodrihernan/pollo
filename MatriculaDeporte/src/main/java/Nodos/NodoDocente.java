/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Clases.Docente;

public class NodoDocente {

    private Docente dato;
    private NodoDocente sig;
    
    

    public NodoDocente(Docente dato, NodoDocente sig) {
        this.dato = dato;
        this.sig = sig;
    }

    public NodoDocente() {
    }

    public Docente getDato() {
        return dato;
    }

    public void setDato(Docente dato) {
        this.dato = dato;
    }

    public NodoDocente getSig() {
        return sig;
    }

    public void setSig(NodoDocente sig) {
        this.sig = sig;
    }

    public NodoDocente(Docente dato) {
        this.dato = dato;
        this.sig = null;
    }
}
