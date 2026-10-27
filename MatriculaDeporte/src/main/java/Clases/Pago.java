/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

public class Pago {

    private String codigoPgo;
    private char estado;  // P = Pagó , M= moroso
    private int monto;
    private Date fechaPago;

    public Pago() {
    }

    public Pago(String codigoPgo, char estado, int monto, Date fechaPago) {
        this.codigoPgo = codigoPgo;
        this.estado = estado;
        this.monto = monto;
        this.fechaPago = fechaPago;
    }

    public String getCodigoPgo() {
        return codigoPgo;
    }

    public void setCodigoPgo(String codigoPgo) {
        this.codigoPgo = codigoPgo;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Override
    public String toString() {
        return "Pago{" + "codigoPgo=" + codigoPgo + ", estado=" + estado + ", monto=" + monto + ", fechaPago=" + fechaPago + '}';
    }

}
