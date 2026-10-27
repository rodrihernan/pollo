package Clases;

import java.util.Date;

public class Enfermo {

    public String apellidos, nombres, dni, direccion, genero;
    public Date fechanac;

    public void leerEnfermo() {
        apellidos = Basicas.LeerTexto("Apellidos:");
        nombres = Basicas.LeerTexto("Nombres:");
        dni = Basicas.LeerTexto("DNI:");
        direccion = Basicas.LeerTexto("Dirección:");
        genero = Basicas.LeerTexto("Género:");
        fechanac = new Date(); // puede cambiarse a entrada manual
    }

    @Override
    public String toString() {
        return "Enfermo: " + "Apellidos: " + apellidos + " , Nombres: " + nombres + " , DNI: " + dni + " , Direccion: " + direccion + " , Genero: " + genero + ", Fecha nacimiento: " + fechanac + '}';
    }

}
