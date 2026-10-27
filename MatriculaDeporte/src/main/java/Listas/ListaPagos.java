/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Clases.Pago;
import Nodos.NodoPago;

public class ListaPagos {

    private NodoPago cabeza;
    private NodoPago cola;
    private int tamaño;

    public ListaPagos() {
        cabeza = null;
        cola = null;
        tamaño = 0;
    }
    public int getTamaño() {
        return tamaño;
    }
    
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public NodoPago getCabeza() {
        return cabeza;
    }
    
    public void setCabeza(NodoPago cabeza) {
        this.cabeza = cabeza;
    }

    public NodoPago getCola() {
        return cola;
    }
    
    public void setCola(NodoPago cola) {
        this.cola = cola;
    }

    // Insertar al final
    public void insertarAlFinal(Pago p) {
        NodoPago nuevo = new NodoPago(p);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }
        tamaño++;
        System.out.println("Pago registrado correctamente.");
    }

    // Mostrar todos los pagos
    public void listarPagos() {
        NodoPago actual = cabeza;
        System.out.println("--- Lista de Pagos ---");

        while (actual != null) {
            System.out.println(actual.getDato().toString());
            actual = actual.getSiguiente();
        }
    }

    // Buscar pago por código
    public Pago buscarPorCodigo(String codigo) {
        NodoPago actual = cabeza;

        while (actual != null) {
            if (actual.getDato().getCodigoPgo().equalsIgnoreCase(codigo)) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null; // no encontrado
    }

    // Listar solo pagos realizados
    public void listarPagados() {
        NodoPago actual = cabeza;
        System.out.println("--- Pagos Realizados (P) ---");

        while (actual != null) {
            if (actual.getDato().getEstado() == 'P') {
                System.out.println(actual.getDato());
            }
            actual = actual.getSiguiente();
        }
    }

    // Listar morosos
    public void listarMorosos() {
        NodoPago actual = cabeza;
        System.out.println("--- Pagos Morosos (M) ---");

        while (actual != null) {
            if (actual.getDato().getEstado() == 'M') {
                System.out.println(actual.getDato());
            }
            actual = actual.getSiguiente();
        }
    }

}
