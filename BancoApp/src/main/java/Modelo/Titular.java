package Modelo;

public class Titular {

    private String codigo;
    private String apellidos;
    private String nombres;
    private char genero;
    private String dni;
    private String direccion;
    private String email;
    private String telefono;

    public Titular(String codigo, String apellidos, String nombres, char genero, String dni, String direccion, String email, String telefono) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.genero = genero;
        this.dni = dni;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public char getGenero() {
        return genero;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Titular: " + nombres + " " + apellidos + " | DNI: " + dni;
    }
}
