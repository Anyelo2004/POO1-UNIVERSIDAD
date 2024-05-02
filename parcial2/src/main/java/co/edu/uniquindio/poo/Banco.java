package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;


public class Banco {
    private final String nombre;
    private final Collection<Titular> listaTitulares;
    private final Collection<CuentaBancaria> CuentaBancarias;
    

    public Banco(String nombre, Collection<Titular> listaTitulares, Collection<CuentaBancaria> CuentaBancarias) {
        this.nombre = nombre;
        this.listaTitulares = new LinkedList<>();
        this.CuentaBancarias = CuentaBancarias;
    }


    public String getNombre() {
        return nombre;
    }


    public Collection<Titular> getListaTitulares() {
        return listaTitulares;
    }


    public Collection<CuentaBancaria> getListCuentaBancarias() {
        return CuentaBancarias;
    }


    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + ", listaTitulares=" + listaTitulares + ", CuentaBancarias=" + CuentaBancarias
                + "]";
    }

    
}
