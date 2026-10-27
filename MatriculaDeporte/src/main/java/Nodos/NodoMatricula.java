/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Clases.Matricula;

public class NodoMatricula {

    private Matricula dato;
    private NodoMatricula anterior;
    private NodoMatricula siguiente;

    public NodoMatricula(Matricula dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }

    public Matricula getDato() {
        return dato;
    }

    public void setDato(Matricula dato) {
        this.dato = dato;
    }

    public NodoMatricula getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoMatricula anterior) {
        this.anterior = anterior;
    }

    public NodoMatricula getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoMatricula siguiente) {
        this.siguiente = siguiente;
    }
}
