/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Listas.ListaAlumnos;
import Listas.ListaAmbientes;
import Listas.ListaDeportes;
import Listas.ListaDocentes;
import Listas.ListaTrabajadores;

/**
 *
 * @author ESTUDIANTE
 */
public class Empresa {

    private String nombre;
    private String direccion;
    private String ruc;
    private ListaTrabajadores listaT;
    private ListaAlumnos ListaA;
    private ListaDocentes ListaDoc;
    private ListaAmbientes ListaAm;
    private ListaDeportes ListaDep;

    public Empresa() {
        this.nombre = "Codice Sport";
        this.direccion = "2 de mayo #331";
        this.ruc = "10174329741";
        this.listaT = new ListaTrabajadores();
        this.ListaA = new ListaAlumnos();
        this.ListaAm = new ListaAmbientes();
        this.ListaDoc = new ListaDocentes();
        this.ListaDep = new ListaDeportes();

    }

    public Empresa(String nombre, String direccion, String ruc, ListaTrabajadores listaT, ListaAlumnos ListaA, ListaDocentes ListaDoc, ListaAmbientes ListaAm, ListaDeportes ListaDep) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ruc = ruc;
        this.listaT = listaT;
        this.ListaA = ListaA;
        this.ListaDoc = ListaDoc;
        this.ListaAm = ListaAm;
        this.ListaDep = ListaDep;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public ListaTrabajadores getListaT() {
        return listaT;
    }

    public void setListaT(ListaTrabajadores listaT) {
        this.listaT = listaT;
    }

    public ListaAlumnos getListaA() {
        return ListaA;
    }

    public void setListaA(ListaAlumnos ListaA) {
        this.ListaA = ListaA;
    }

    public ListaDocentes getListaDoc() {
        return ListaDoc;
    }

    public void setListaDoc(ListaDocentes ListaDoc) {
        this.ListaDoc = ListaDoc;
    }

    public ListaAmbientes getListaAm() {
        return ListaAm;
    }

    public void setListaAm(ListaAmbientes ListaAm) {
        this.ListaAm = ListaAm;
    }

    public ListaDeportes getListaDep() {
        return ListaDep;
    }

    public void setListaDep(ListaDeportes ListaDep) {
        this.ListaDep = ListaDep;
    }

    public void recuperarDatos() {
        this.listaT.recuperarTrabajadores();
        this.ListaA.recuperarAlumnos();
        this.ListaAm.recuperarAmbientes();
        this.ListaDoc.recuperarDocentes();
        this.ListaDep.recuperarDeportes();
    }

}
