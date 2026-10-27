/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Nodos.NodoTrabajador;
import Clases.Trabajador;
import com.mycompany.matriculadeporte.MatriculaDeporte;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ListaTrabajadores {

    private NodoTrabajador inicio;
    private int nTra = 0; 

    public NodoTrabajador getCab() {
        return inicio;
    }
    public int getnTra() {
        return nTra;
    }

    public void insertarInicio(Trabajador tra) {
        NodoTrabajador nuevo = new NodoTrabajador();
        nuevo.setDato(tra);
        nuevo.setSig(inicio);
        inicio = nuevo;
        nTra++; // ¡Aumentar el contador!
    }

    public Trabajador buscar(String codigo) {
        NodoTrabajador aux = inicio;
        while (aux != null) {
            if (aux.getDato().getCodigo().equals(codigo)) {
                return aux.getDato();
            }
            aux = aux.getSig();
        }
        return null;
    }

    public boolean eliminar(String codigo) {
        if (inicio == null) {
            return false;
        }

        if (inicio.getDato().getCodigo().equals(codigo)) {
            inicio = inicio.getSig();
            return true;
        }

        // Caso 2: buscar en la lista
        NodoTrabajador aux = inicio;
        while (aux.getSig() != null) {
            if (aux.getSig().getDato().getCodigo().equals(codigo)) {
                aux.setSig(aux.getSig().getSig());
                return true;
            }
            aux = aux.getSig();
        }

        return false;
    }

    public void guardarTrabajadorEnArchivo(Trabajador tra) {
        try (
                FileWriter fw = new FileWriter(MatriculaDeporte.archivoTrabajadores, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
            pw.println(
                    tra.getCodigo() + ","
                    + tra.getNombre() + ","
                    + tra.getApellido() + ","
                    + tra.getTurno() + ","
                    + tra.getCargo() + ","
                    + tra.getHabilitado()
            );
        } catch (IOException e) {
            System.out.println("Error al escribir trabajador: " + e.getMessage());
        }
    }

    public void recuperarTrabajadores() {
        try (BufferedReader br = new BufferedReader(new FileReader(MatriculaDeporte.archivoTrabajadores))) {
            String linea;

            while ((linea = br.readLine()) != null) {
 
                String[] datos = linea.split(",");

                Trabajador tra = new Trabajador(
                        datos[0], 
                        datos[1], 
                        datos[2], 
                        datos[3],
                        datos[4], 
                        Boolean.parseBoolean(datos[5]) 
                );

                this.insertarInicio(tra);
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
    }

}
