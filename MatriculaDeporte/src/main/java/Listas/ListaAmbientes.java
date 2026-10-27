/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Nodos.NodoAmbiente;
import Clases.Ambiente;
import com.mycompany.matriculadeporte.MatriculaDeporte;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ListaAmbientes { //Lista circular doble

    private NodoAmbiente inicio;

    public void insertarInicio(Ambiente amb) {
        NodoAmbiente nuevo = new NodoAmbiente();
        nuevo.setDato(amb);

        if (inicio == null) {
            inicio = nuevo;
            inicio.setSig(inicio);
            inicio.setAnt(inicio);
        } else {
            NodoAmbiente ultimo = inicio.getAnt();

            nuevo.setSig(inicio);
            nuevo.setAnt(ultimo);

            ultimo.setSig(nuevo);
            inicio.setAnt(nuevo);

            inicio = nuevo;
        }
    }

    public Ambiente buscar(String codigo) {
        if (inicio == null) {
            return null;
        }
        NodoAmbiente aux = inicio;
        do {

            if (aux.getDato().getCodigo().equals(codigo)) {
                return aux.getDato();
            }
            aux = aux.getSig();
        } while (aux != inicio);

        return null;
    }

    public void listar() {
        if (inicio == null) {
            return;
        }

        NodoAmbiente aux = inicio;

        do {
            System.out.println(
                    aux.getDato().getCodigo() + " - " + aux.getDato().getNombre()
            );
            aux = aux.getSig();
        } while (aux != inicio);
    }

    public String[][] obtenerTodos() {
        if (inicio == null) {
            return new String[0][0];
        }

        // Contar nodos
        int count = 0;
        NodoAmbiente aux = inicio;

        do {
            count++;
            aux = aux.getSig();
        } while (aux != inicio);

        // Crear matriz
        String[][] datos = new String[count][5];

        int i = 0;
        aux = inicio;
        do {
            datos[i][0] = String.valueOf(aux.getDato().getCodigo());
            datos[i][1] = aux.getDato().getNombre();
            datos[i][2] = String.valueOf(aux.getDato().getCapacidad());
            datos[i][3] = aux.getDato().getUbicacion();
            datos[i][4] = String.valueOf(aux.getDato().getEstado());
            i++;
            aux = aux.getSig();
        } while (aux != inicio);

        return datos;
    }

    public boolean eliminar(int codigo) {
        if (inicio == null) {
            return false; // Lista vacía
        }

        NodoAmbiente actual = inicio;

        do {
            if (actual.getDato().getCodigo().equals(codigo)) {

                if (actual.getSig() == actual && actual.getAnt() == actual) {
                    inicio = null;
                    return true;
                }

                if (actual == inicio) {
                    NodoAmbiente ultimo = inicio.getAnt();

                    inicio = inicio.getSig();
                    inicio.setAnt(ultimo);
                    ultimo.setSig(inicio);

                    return true;
                }

                NodoAmbiente anterior = actual.getAnt();
                NodoAmbiente siguiente = actual.getSig();

                anterior.setSig(siguiente);
                siguiente.setAnt(anterior);

                return true;
            }

            actual = actual.getSig();

        } while (actual != inicio);

        return false; // No encontrado
    }

    //ARCHIVO
    public void guardarAmbienteEnArchivo(Ambiente amb) {
        try (
                FileWriter fw = new FileWriter(MatriculaDeporte.archivoAmbientes, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
            pw.println(
                    amb.getCodigo() + ","
                    + amb.getNombre() + ","
                    + amb.getCapacidad() + ","
                    + amb.getUbicacion() + ","
                    + amb.getEstado() + ","
                    + amb.getHabilitado()
            );
        } catch (IOException e) {
            System.out.println("Error al guardar ambiente: " + e.getMessage());
        }
    }

    public void recuperarAmbientes() {
        try (BufferedReader br = new BufferedReader(new FileReader(MatriculaDeporte.archivoAmbientes))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                Ambiente amb = new Ambiente(
                        datos[0], 
                        datos[1], 
                        Integer.parseInt(datos[2]), 
                        datos[3], 
                        datos[4].charAt(0), 
                        Boolean.parseBoolean(datos[5]) 
                );

                this.insertarInicio(amb);
            }
        } catch (Exception e) {
            System.out.println("Error al recuperar ambientes: " + e.getMessage());
        }
    }
}
