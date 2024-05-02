package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Transaccion {
    private final double codigo;
    private final int valor;
    private final LocalDate fecha;
    private final String descripcion;
    private final boolean estado;
    private final Tipo tipo;
    private int dinero;



    public Transaccion(double codigo, int valor, LocalDate fecha, String descripcion, boolean estado, Tipo tipo, int dinero ) {
        this.codigo = codigo;
        this.valor = valor;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipo = tipo;
        this.dinero= dinero;
        assert codigo >0;
        assert valor >0;
        assert fecha != null;
        assert descripcion != null && !descripcion.isBlank();

    }
    public double getCodigo() {
        return codigo;
    }
    public int getValor() {
        return valor;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public boolean isEstado() {
        return estado;
    }
    public Tipo getTipo() {
        return tipo;
    }

    public int getDinero(){
        return dinero;
    }
}
