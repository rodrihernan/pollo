/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.matriculadeporte;

import Ventanas.Login;
import java.awt.EventQueue;

public class MatriculaDeporte {

    public static final String archivoTrabajadores = "trabajadores.dat";
    public static final String archivoAlumnos = "alumnos.dat";
    public static final String archivoAmbientes = "ambientes.dat";
    public static final String archivoDocentes = "docentes.dat";
    public static final String archivoDeporte = "deportes.dat";

    public static void main(String[] args) {

        new Login().setVisible(true);  // Abre la ventana Login

    }

}
