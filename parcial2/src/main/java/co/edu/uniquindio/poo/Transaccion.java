package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Transaccion {
    private final String codigo;
    private final int valor;
    private final LocalDate fecha;
    private final String descripcion;
    private final boolean estadoCuenta;
    private final Tipo tipo;

    /*
     * Método constructor de la clase Transacción
     */
    public Transaccion (String codigo, int valor, LocalDate fecha, String descripcion, boolean estadoCuenta, Tipo tipo){
        this.codigo = codigo;
        this.valor = valor;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estadoCuenta = true;
        this.tipo = tipo;
        assert codigo != null && !codigo.isBlank();
        assert valor > 0;
        assert descripcion != null && !descripcion.isBlank();
    }

    /*
     * Método para obtener el codigo de una transacción
     * @return codigo de una transacción bancaria
     */
    public String getCodigo (){
        return codigo;
    }

    /*
     * Método para obtener el valor de una transacción
     * @return valor de una transacción
     */
    public int getValor (){
        return valor;
    }

    /*
     * Método para obtener la fecha de una transacción
     * @return fecha de una transacción
     */
    public LocalDate getFecha (){
        return fecha;
    }

    /*
     * Método para obtener la descripcion de una transacción
     * @return descripcion de una transacción
     */
    public String getDescripcion (){
        return descripcion;
    }

    
    public boolean getEstadoCuenta (){
        return estadoCuenta;
    }

    public Tipo getTipo (){
        return tipo;
    }

    /*public void transferirDinero (CuentaBancaria cuentaBancaria, CuentaBancaria cuentaDestino){
        if (cuentaBancaria.getSaldo() >= valor){
            cuentaBancaria.retirarDinero(valor);
            cuentaDestino.depositarDinero(valor);
        }
    }*/

}