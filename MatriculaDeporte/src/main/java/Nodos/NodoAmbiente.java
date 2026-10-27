/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Clases.Ambiente;

public class NodoAmbiente {

    private Ambiente dato;
    private NodoAmbiente sig;
    private NodoAmbiente ant;

    public NodoAmbiente() {
    }

    public NodoAmbiente(Ambiente dato, NodoAmbiente sig, NodoAmbiente ant) {
        this.dato = dato;
        this.sig = sig;
        this.ant = ant;
    }

    public Ambiente getDato() {
        return dato;
    }

    public void setDato(Ambiente dato) {
        this.dato = dato;
    }

    public NodoAmbiente getSig() {
        return sig;
    }

    public void setSig(NodoAmbiente sig) {
        this.sig = sig;
    }

    public NodoAmbiente getAnt() {
        return ant;
    }

    public void setAnt(NodoAmbiente ant) {
        this.ant = ant;
    }

}

