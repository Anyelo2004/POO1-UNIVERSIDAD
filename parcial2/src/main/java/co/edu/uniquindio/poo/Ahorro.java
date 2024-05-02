package co.edu.uniquindio.poo;

import java.util.Collection;

public class Ahorro extends CuentaBancaria {
    private final Double tasaInteres;

    public Ahorro(String nombreTitular, String apellidosTitular, int numeroCuenta, double saldo, boolean estado,
            Collection<Transaccion> listTransacciones, Double tasaInteres) {
        super(nombreTitular, apellidosTitular, numeroCuenta, saldo, estado, listTransacciones);
        this.tasaInteres = tasaInteres;
    }

    public Double getTasaInteres() {
        return tasaInteres;
    }

    
}
