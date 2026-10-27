/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Nodos.NodoAlumno;
import Clases.Alumno;
import com.mycompany.matriculadeporte.MatriculaDeporte;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ListaAlumnos {

    private NodoAlumno inicio;

    // Insertar al inicio
    public void insertarInicio(Alumno alu) {
        NodoAlumno nuevo = new NodoAlumno();
        nuevo.setDato(alu);
        nuevo.setSig(inicio);
        inicio = nuevo;
    }

    // Buscar por código
    public Alumno buscar(String codigo) {
        NodoAlumno aux = inicio;
        while (aux != null) {
            if (aux.getDato().getCodigo().equals(codigo)) {
                return aux.getDato();
            }
            aux = aux.getSig();
        }
        return null;
    }

    // Listar
    public void listar() {
        NodoAlumno aux = inicio;
        while (aux != null) {
            System.out.println(aux.getDato().getCodigo() + " - " + aux.getDato().getNombre() + " " + aux.getDato().getApellido());
            aux = aux.getSig();
        }
    }

    // Dentro de ListaAlumnos
    public boolean eliminar(String codigo) {
        if (inicio == null) {
            return false;
        }

        if (inicio.getDato().getCodigo().equals(codigo)) {
            inicio = inicio.getSig();
            return true;
        }

        // Caso 2: buscar en la lista
        NodoAlumno aux = inicio;
        while (aux.getSig() != null) {
            if (aux.getSig().getDato().getCodigo().equals(codigo)) {
                aux.setSig(aux.getSig().getSig());
                return true;
            }
            aux = aux.getSig();
        }

        return false;
    }

    public NodoAlumno getInicio() {
        return inicio;
    }

    public void guardarAlumnoEnArchivo(Alumno alu) {
        try (
                FileWriter fw = new FileWriter(MatriculaDeporte.archivoAlumnos, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
            pw.println(
                    alu.getCodigo() + ","
                    + alu.getNombre() + ","
                    + alu.getApellido() + ","
                    + alu.getDni() + ","
                    + alu.getTalla() + ","
                    + alu.getPeso() + ","
                    + alu.isHabilitado()
            );
        } catch (IOException e) {
            System.out.println("Error al guardar alumno: " + e.getMessage());
        }
    }

    public void recuperarAlumnos() {
        try (BufferedReader br = new BufferedReader(new FileReader(MatriculaDeporte.archivoAlumnos))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                Alumno alu = new Alumno(
                        datos[0], // codigo
                        datos[1], // nombre
                        datos[2], // apellido
                        datos[3], // dni
                        datos[4], // talla
                        Float.parseFloat(datos[5]), 
                        Boolean.parseBoolean(datos[6]) 
                );

                this.insertarInicio(alu);
            }
        } catch (Exception e) {
            System.out.println("Error al recuperar alumnos: " + e.getMessage());
        }
    }

}
