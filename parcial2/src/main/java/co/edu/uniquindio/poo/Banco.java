package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Banco {
    private final String nombre;
    private final Collection<CuentaBancaria> cuentasBancarias;
    private final Collection<Titular> listaTitulares;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentasBancarias = new LinkedList<>();
        this.listaTitulares = new LinkedList<>();
        assert  nombre!= null && !nombre.isBlank();

    }

    public String getNombre() {
        return nombre;
    }

    public Collection<CuentaBancaria> getCuentasBancarias() {
        return  Collections.unmodifiableCollection(cuentasBancarias);
        
    }

    public Collection<Titular> getListaTitulares(){
        return  Collections.unmodifiableCollection(listaTitulares);
    }

    public void añadircuentasBancarias (CuentaBancaria cuentaBancaria){
        cuentasBancarias.add(cuentaBancaria);
    }
}
