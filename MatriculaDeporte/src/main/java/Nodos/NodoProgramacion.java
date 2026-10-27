/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodos;

import Clases.Programacion;

public class NodoProgramacion {

    private Programacion dato;
    private NodoProgramacion anterior;
    private NodoProgramacion siguiente;

    public NodoProgramacion(Programacion dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }

    public Programacion getDato() {
        return dato;
    }

    public void setDato(Programacion dato) {
        this.dato = dato;
    }

    public NodoProgramacion getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoProgramacion anterior) {
        this.anterior = anterior;
    }

    public NodoProgramacion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoProgramacion siguiente) {
        this.siguiente = siguiente;
    }
}
