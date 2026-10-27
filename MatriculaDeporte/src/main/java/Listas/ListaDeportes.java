/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Clases.Deporte;
import Nodos.NodoDeporte;
import com.mycompany.matriculadeporte.MatriculaDeporte;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ListaDeportes {

    private NodoDeporte cabeza;
    private NodoDeporte cola;

    public ListaDeportes() {
        cabeza = null;
        cola = null;
    }

    public NodoDeporte getCabeza() {
        return cabeza;
    }

    public void insertarAlFinal(Deporte nuevo) {
        NodoDeporte nodo = new NodoDeporte(nuevo);

        if (cabeza == null) {
            cabeza = nodo;
            cola = nodo;
        } else {
            cola.setSiguiente(nodo);
            nodo.setAnterior(cola);
            cola = nodo;
        }
    }

    public Deporte buscar(String codigo) {
        NodoDeporte aux = cabeza;

        while (aux != null) {
            if (aux.getDato().getCodigoDep().equalsIgnoreCase(codigo)) {
                return aux.getDato();
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    public boolean eliminar(String codigo) {
        NodoDeporte aux = cabeza;

        while (aux != null) {
            if (aux.getDato().getCodigoDep().equals(codigo)) {

                if (aux == cabeza) {
                    cabeza = aux.getSiguiente();
                    if (cabeza != null) {
                        cabeza.setAnterior(null);
                    } else {
                        cola = null;
                    }
                } else if (aux == cola) {
                    cola = aux.getAnterior();
                    cola.setSiguiente(null);
                } else {
                    aux.getAnterior().setSiguiente(aux.getSiguiente());
                    aux.getSiguiente().setAnterior(aux.getAnterior());
                }
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    public void guardarDeporteEnArchivo(Deporte dep) {
        try (
                FileWriter fw = new FileWriter(MatriculaDeporte.archivoDeporte, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
            pw.println(
                    dep.getCodigoDep() + ","
                    + dep.getNombreDep() + ","
                    + dep.getCategoria() + ","
                    + dep.getDescripcion() + ","
                    + dep.getHabilitado()
            );
        } catch (IOException e) {
            System.out.println("Error al guardar deporte: " + e.getMessage());
        }
    }

    public void recuperarDeportes() {
        try (BufferedReader br = new BufferedReader(new FileReader(MatriculaDeporte.archivoDeporte))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                Deporte dep = new Deporte(
                        datos[0], 
                        datos[1], 
                        datos[2].charAt(0), 
                        datos[3], 
                        Boolean.parseBoolean(datos[4]) 
                );

                // En este caso usas insertarAlFinal
                this.insertarAlFinal(dep);
            }
        } catch (Exception e) {
            System.out.println("Error al recuperar deportes: " + e.getMessage());
        }
    }
}
