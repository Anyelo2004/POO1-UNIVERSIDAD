package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class BancoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void realizarDeposito (){
        LOG.info("Inicio test realizar deposito");
        Banco banco = new Banco ("Banco Hogar");
        var cuenta = new Corriente(new Titular("Valentina", "Rodriguez"), 819280, 
        100000, false, 50000);
        banco.añadircuentasBancarias(cuenta);
        cuenta.retirarDinero(130000);
        assertEquals(-30000, cuenta.getSaldo());
       assertEquals(20000, cuenta.getLimiteSobregiro());
        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getLimiteSobregiro());
    }

    @Test 
    public void transferirDinero (){
        LOG.info("Inicio test transferir dinero");
        var banco = new Banco("Davivienda");
        var cuenta = new Corriente(new Titular("a", "b"), 1001000200,
         300000, true, 50000);
        var cuenta2 = new Corriente(new Titular("a", "b"), 2002000100, 
         40000, true, 50000);
        banco.añadircuentasBancarias(cuenta);
        banco.añadircuentasBancarias(cuenta2);
        var transacción = new Transaccion("9182", 100000, LocalDate.of(2024, 05, 02), "a", false, Tipo.DEPOSITO);
        transacción.transferirDinero(cuenta, cuenta2);
        System.out.println(cuenta2.getSaldo());
        
        
         

    }
    //singleton permite crear metodos de un unico uso
    //un sistema debe de estar altamente cohesionado y debe estar bajo (acoplamiento)
    //cohesion - cuando se elimine un elemento no afecte el comportamiendo de un sistema
    //acoplar - muchas dependencias con otras cosas 
    /* 
     * interfaaz grafica
     * grafical user interface
     * grafical-toda la parte visual
     * layout como se distribuyen los componentes en un espacio
     * user - 
     * interfaz grafica de usuario - contrato, publico (debe de ser publica), servicios(publicos)- se hace mediane uana interaccion. e interacción- 
     * 
    */
    

}
