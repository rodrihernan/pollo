/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

public class Programacion {

    private Date mesini, mesfin; //mes inicio y mes final 
    private String horario; // de que hora a que hora
    private Docente doc;
    private Ambiente ambi;
    private Deporte depor;
    private int capacidad; //20 como maximo, 10 como minimo 
    private char sección; //solo dos secciones A y B con distintos ambientes, docentes, y horarios
    private String Codigoc; //codigo de campaña
    private String nombrePro;
    private boolean habilitado = true;

    public Programacion() {
    }

    public Programacion(Date mesini, Date mesfin, String horario, Docente doc, Ambiente ambi, Deporte depor, int capacidad, char sección, String Codigoc, String nombrePro) {
        this.mesini = mesini;
        this.mesfin = mesfin;
        this.horario = horario;
        this.doc = doc;
        this.ambi = ambi;
        this.depor = depor;
        this.capacidad = capacidad;
        this.sección = sección;
        this.Codigoc = Codigoc;
        this.nombrePro = nombrePro;
    }

    public Date getMesini() {
        return mesini;
    }

    public void setMesini(Date mesini) {
        this.mesini = mesini;
    }

    public Date getMesfin() {
        return mesfin;
    }

    public void setMesfin(Date mesfin) {
        this.mesfin = mesfin;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Docente getDoc() {
        return doc;
    }

    public void setDoc(Docente doc) {
        this.doc = doc;
    }

    public Ambiente getAmbi() {
        return ambi;
    }

    public void setAmbi(Ambiente ambi) {
        this.ambi = ambi;
    }

    public Deporte getDepor() {
        return depor;
    }

    public void setDepor(Deporte depor) {
        this.depor = depor;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public char getSección() {
        return sección;
    }

    public void setSección(char sección) {
        this.sección = sección;
    }

    public String getCodigoc() {
        return Codigoc;
    }

    public void setCodigoc(String Codigoc) {
        this.Codigoc = Codigoc;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        return "Programacion{" + "mesini=" + mesini + ", mesfin=" + mesfin + ", horario=" + horario + ", doc=" + doc + ", ambi=" + ambi + ", depor=" + depor + ", capacidad=" + capacidad + ", secci\u00f3n=" + sección + ", Codigoc=" + Codigoc + ", nombrePro=" + nombrePro + ", habilitado=" + habilitado + '}';
    }

}
