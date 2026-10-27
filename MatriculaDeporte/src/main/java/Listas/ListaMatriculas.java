/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Clases.Matricula;
import Nodos.NodoMatricula;

public class ListaMatriculas {

    private NodoMatricula cabeza;
    private NodoMatricula cola;
    private int tamaño;

    public ListaMatriculas() {
        cabeza = null;
        cola = null;
        tamaño = 0;
    }

    // Insertar matrícula al final
    public void insertarAlFinal(Matricula m) {
        NodoMatricula nuevo = new NodoMatricula(m);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }

        tamaño++;
        System.out.println("Matrícula registrada correctamente.");
    }

    // Listar desde el inicio
    public void listarAdelante() {
        NodoMatricula actual = cabeza;

        System.out.println("--- Lista de Matrículas (inicio → fin) ---");
        while (actual != null) {
            System.out.println(actual.getDato().toString());
            actual = actual.getSiguiente();
        }
    }

    // Listar desde el final
    public void listarAtras() {
        NodoMatricula actual = cola;

        System.out.println("--- Lista de Matrículas (fin → inicio) ---");
        while (actual != null) {
            System.out.println(actual.getDato().toString());
            actual = actual.getAnterior();
        }
    }

    // Buscar matrícula por ID
    public Matricula buscarPorID(String id) {
        NodoMatricula actual = cabeza;

        while (actual != null) {
            if (actual.getDato().getIdMatricula().equalsIgnoreCase(id)) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }

        return null; // no encontrado
    }

    public int getTamaño() {
        return tamaño;
    }

    public boolean eliminar(String idMatricula) {

        if (cabeza == null) {
            return false;
        }

        NodoMatricula actual = cabeza;

        while (actual != null) {

            if (actual.getDato().getIdMatricula().equalsIgnoreCase(idMatricula)) {

                if (actual == cabeza && actual == cola) {
                    cabeza = null;
                    cola = null;
                } else if (actual == cabeza) {
                    cabeza = actual.getSiguiente();
                    cabeza.setAnterior(null);
                } else if (actual == cola) {
                    cola = actual.getAnterior();
                    cola.setSiguiente(null);
                } else {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }

                tamaño--;
                return true;
            }

            actual = actual.getSiguiente();
        }

        return false;
    }

    public boolean eliminarPorID(String id) {

        NodoMatricula actual = cabeza;

        while (actual != null) {

            if (actual.getDato().getIdMatricula().equalsIgnoreCase(id)) {

                // Caso 1: único nodo
                if (actual == cabeza && actual == cola) {
                    cabeza = null;
                    cola = null;
                } // Caso 2: es la cabeza
                else if (actual == cabeza) {
                    cabeza = actual.getSiguiente();
                    cabeza.setAnterior(null);
                } // Caso 3: es la cola
                else if (actual == cola) {
                    cola = actual.getAnterior();
                    cola.setSiguiente(null);
                } // Caso 4: está en medio
                else {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }

                tamaño--;
                return true;
            }

            actual = actual.getSiguiente();
        }

        return false; // no encontrado
    }

    public NodoMatricula getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoMatricula cabeza) {
        this.cabeza = cabeza;
    }

    public NodoMatricula getCola() {
        return cola;
    }

    public void setCola(NodoMatricula cola) {
        this.cola = cola;
    }

}
