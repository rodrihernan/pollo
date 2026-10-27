/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Nodos.NodoDocente;
import Clases.Docente;
import com.mycompany.matriculadeporte.MatriculaDeporte;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ListaDocentes {

    private NodoDocente inicio;

    public void insertar(Docente d) {
        NodoDocente nuevo = new NodoDocente(d);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            NodoDocente aux = inicio;
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }
    }

    public Docente buscar(String codigo) {
        NodoDocente aux = inicio;

        while (aux != null) {
            if (aux.getDato().getCodigo().equalsIgnoreCase(codigo)) {
                return aux.getDato();
            }
            aux = aux.getSig();
        }
        return null;
    }

    public void listar() {
        NodoDocente aux = inicio;
        while (aux != null) {
            System.out.println(aux.getDato().getCodigo() + " - " + aux.getDato().getNombre() + " " + aux.getDato().getApellido());
            aux = aux.getSig();
        }
    }

    public NodoDocente getInicio() {
        return inicio;
    }

    public void setInicio(NodoDocente inicio) {
        this.inicio = inicio;
    }

    ///
    public void guardarDocenteEnArchivo(Docente doc) {
        try (
                FileWriter fw = new FileWriter(MatriculaDeporte.archivoDocentes, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
            pw.println(
                    doc.getCodigo() + ","
                    + doc.getNombre() + ","
                    + doc.getApellido() + ","
                    + doc.getEspecialidad() + ","
                    + doc.getAniosExperiencia() + ","
                    + doc.isHabilitado()
            );
        } catch (IOException e) {
            System.out.println("Error al guardar docente: " + e.getMessage());
        }
    }

    public void recuperarDocentes() {
        try (BufferedReader br = new BufferedReader(new FileReader(MatriculaDeporte.archivoDocentes))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Usamos 'datos' para mayor claridad como en tu ejemplo inicial
                String[] datos = linea.split(",");

                // Creamos el docente en una sola línea
                Docente doc = new Docente(
                        datos[0], 
                        datos[1], 
                        datos[2], 
                        datos[3], 
                        Integer.parseInt(datos[4]), 
                        Boolean.parseBoolean(datos[5]) 
                );

                // Llamamos al método insertar
                this.insertar(doc);
            }
        } catch (Exception e) {
            System.out.println("Error al recuperar docentes: " + e.getMessage());
        }
    }
}
