package Modelo;

public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;

    protected Titular titular;

    public CuentaBancaria(String numeroCuenta, Titular titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.titular = titular;
        abrirCuenta();
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && this.saldo >= monto) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + this.saldo);
        } else if (monto <= 0) {
            System.out.println("El monto a retirar debe ser positivo.");
        } else {
            System.out.println("Saldo insuficiente. Saldo actual: " + this.saldo);
        }
    }

    public void abrirCuenta() {
        System.out.println("Cuenta " + this.numeroCuenta + " abierta exitosamente.");
    }

    public double consultarSaldo() {
        System.out.println("Saldo actual de la cuenta " + this.numeroCuenta + ": " + this.saldo);
        return this.saldo;
    }

    public void cerrarCuenta() {
        System.out.println("Cerrando la cuenta " + this.numeroCuenta + "...");
        System.out.println("Se le ha devuelto su saldo restante: " + this.saldo);
        this.saldo = 0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Cuenta Nro. " + numeroCuenta + " | Saldo: " + saldo + " | " + titular.toString();
    }
}
