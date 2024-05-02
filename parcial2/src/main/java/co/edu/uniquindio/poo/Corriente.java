package co.edu.uniquindio.poo;

import java.util.Collection;

public class Corriente extends CuentaBancaria {
    private final double sobreGiro;

    public Corriente(String nombreTitular, String apellidosTitular, int numeroCuenta, double saldo, boolean estado,
            Collection<Transaccion> listTransacciones, double sobreGiro) {
        super(nombreTitular, apellidosTitular, numeroCuenta, saldo, estado, listTransacciones);
        this.sobreGiro = sobreGiro;
    }

    public double getSobreGiro() {
        return sobreGiro;
    }
    


    
}
