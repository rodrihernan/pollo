package Clases;

import java.util.Date;

public class Enfermedad {

    public int codigo;
    public String nombre, sintomas, publico;
    public Date fecha;
    public ListaEnfermo le = new ListaEnfermo();

    public void leerEnfermedad() {
        codigo = Basicas.LeerEntero("Código:", 1, 1000);
        nombre = Basicas.LeerTexto("Nombre de la enfermedad:");
        sintomas = Basicas.LeerTexto("Síntomas:");
        publico = Basicas.LeerTexto("Público afectado (niño, joven, adulto, adulto mayor):");
        fecha = new Date();
    }

    @Override
    public String toString() {
        return "Enfermedad ---> " + "Codigo: " + codigo + " , Nombre de la enfermedad: " + nombre + " , Sintomas: " + sintomas + " , Publico: " + publico + " , Fecha: " + fecha + '}';
    }

}
