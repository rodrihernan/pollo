/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Clases.Pago;

public class NodoPago {

    private Pago dato;
    private NodoPago anterior;
    private NodoPago siguiente;

    public NodoPago(Pago dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }

    public Pago getDato() {
        return dato;
    }

    public void setDato(Pago dato) {
        this.dato = dato;
    }

    public NodoPago getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoPago anterior) {
        this.anterior = anterior;
    }

    public NodoPago getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPago siguiente) {
        this.siguiente = siguiente;
    }
}
