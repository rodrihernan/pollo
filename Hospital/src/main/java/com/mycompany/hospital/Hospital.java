package com.mycompany.hospital;

import Clases.Basicas;
import Clases.Enfermedad;
import Clases.Enfermo;
import Clases.ListaEnfermedades;
import Clases.ListaEnfermo;
import Clases.NodoEnfermedad;
import Clases.NodoEnfermo;

import java.util.Scanner;

public class Hospital {

    Scanner sc = new Scanner(System.in);
    ListaEnfermedades le = new ListaEnfermedades();

    public static void main(String[] args) {
        Hospital h = new Hospital();
        h.control();
    }

    public void control() {
        int op;
        do {
            op = Basicas.menu();
            switch (op) {
                case 1 ->
                    registrarEnfermedad();
                case 2 ->
                    listarEnfermedades();
                case 3 ->
                    buscarEnfermedad();
                case 4 ->
                    registrarEnfermo();
                case 5 ->
                    listarEnfermos();
                case 6 ->
                    buscarEnfermo();
            }
        } while (op != 7);
    }

    public void registrarEnfermedad() {
        Enfermedad e = new Enfermedad();
        e.leerEnfermedad();
        le.insertarEnfermedad(e);
        System.out.println("Enfermedad registrada");
    }

    public void listarEnfermedades() {
        le.listarEnfermedades();
    }

    public void buscarEnfermedad() {
        String nom = Basicas.LeerTexto("Ingrese nombre de enfermedad:");
        le.buscarEnfermedad(nom);
    }

    public void registrarEnfermo() {
        le.listarEnfermedades();
        Enfermedad enf = le.seleccionarEnfermedad();
        Enfermo enfermo = new Enfermo();
        enfermo.leerEnfermo();
        enf.le.insertarEnfermo(enfermo);
        System.out.println(" Enfermo registrado.");
    }

    public void listarEnfermos() {
        le.listarEnfermedades();
        Enfermedad enf = le.seleccionarEnfermedad();
        enf.le.listarEnfermos();
    }

    public void buscarEnfermo() {
        le.listarEnfermedades();
        Enfermedad enf = le.seleccionarEnfermedad();
        String dni = Basicas.LeerTexto("Ingrese DNI del enfermo:");
        enf.le.buscarEnfermo(dni);
    }
}
