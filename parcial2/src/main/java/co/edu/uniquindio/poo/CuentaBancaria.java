package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public abstract class CuentaBancaria {

    private final int numeroCuenta;
    private double saldo;
    private boolean estado;
    private final Collection<Transaccion> listaTransacciones;
    
 
    
    public CuentaBancaria(Titular titular, int numeroCuenta, double saldo, boolean estado,
            Collection<Transaccion> listTransacciones) {
       
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estado = estado;
        this.listaTransacciones = new LinkedList<>();
       
    }
  
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public boolean cuentaActiva() {
        return estado;
        
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public Collection<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }
      /**
     * @param valor
     */
     public void depositar (double valor){
       assert valor >0;
        saldo = saldo + valor;
        estado = true;
    }
    /**
     * @param valor
     */
    public void retirar (double valor){
        assert valor >0;
        assert valor <= saldo;
        saldo = saldo-valor;
        if(saldo==0) estado = false;

    }


}
