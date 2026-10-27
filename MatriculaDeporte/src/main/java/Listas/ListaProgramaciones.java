/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Clases.Programacion;
import Nodos.NodoProgramacion;

public class ListaProgramaciones {

    private NodoProgramacion cabeza;
    private NodoProgramacion cola;
    private int tamaño;

    public ListaProgramaciones() {
        cabeza = null;
        cola = null;
        tamaño = 0;
    }

    public void insertarAlFinal(Programacion nuevoDato) {
        NodoProgramacion nuevoNodo = new NodoProgramacion(nuevoDato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            // Usando getters/setters porque los atributos del nodo son privados
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;
        }

        tamaño++;
        System.out.println("Programación agregada.");
    }

    // Mostrar desde la cabeza hacia adelante
    public void mostrarAdelante() {
        NodoProgramacion actual = cabeza;
        System.out.println("--- Lista de Programaciones (Adelante) ---");

        while (actual != null) {
            System.out.println(actual.getDato().toString());
            actual = actual.getSiguiente();
        }
    }

    // Mostrar desde la cola hacia atrás
    public void mostrarAtras() {
        NodoProgramacion actual = cola;
        System.out.println("--- Lista de Programaciones (Atrás) ---");

        while (actual != null) {
            System.out.println(actual.getDato().toString());
            actual = actual.getAnterior();
        }
    }

    public Programacion buscar(String codigoCampania, char seccion) {
        NodoProgramacion aux = cabeza;

        while (aux != null) {
            Programacion p = aux.getDato();

            if (p.getCodigoc().equalsIgnoreCase(codigoCampania)
                    && p.getSección() == seccion) {
                return p;
            }

            aux = aux.getSiguiente();
        }
        return null;
    }

    public boolean modificar(String codigoCampania, char seccion, Programacion nueva) {
        NodoProgramacion aux = cabeza;

        while (aux != null) {
            Programacion p = aux.getDato();

            if (p.getCodigoc().equalsIgnoreCase(codigoCampania)
                    && p.getSección() == seccion) {

                aux.setDato(nueva);
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    public Programacion buscarPorCodigo(String codigo) {
        NodoProgramacion aux = cabeza;

        while (aux != null) {
            if (aux.getDato().getCodigoc().equalsIgnoreCase(codigo)) {
                return aux.getDato();
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    public NodoProgramacion getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoProgramacion cabeza) {
        this.cabeza = cabeza;
    }

    public NodoProgramacion getCola() {
        return cola;
    }

    public void setCola(NodoProgramacion cola) {
        this.cola = cola;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
