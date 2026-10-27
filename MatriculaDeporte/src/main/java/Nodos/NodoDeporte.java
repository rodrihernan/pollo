/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Clases.Deporte;

public class NodoDeporte {

    private Deporte dato;
    private NodoDeporte anterior;
    private NodoDeporte siguiente;

    public NodoDeporte(Deporte dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }

    public Deporte getDato() {
        return dato;
    }

    public NodoDeporte getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDeporte anterior) {
        this.anterior = anterior;
    }

    public NodoDeporte getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDeporte siguiente) {
        this.siguiente = siguiente;
    }
}
