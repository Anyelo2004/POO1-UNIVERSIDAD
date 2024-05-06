package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class BancoTest {
    private static final Logger LOG = Logger.getLogger(CuentaAhorro.class.getName());

    @Test
    public void retirarDineroCuentaAhorro(){
        LOG.info("Iniciando Test");
        CuentaAhorro cuentaAhorro = new CuentaAhorro("19290128", 100.000, true, new Titular("Anyelo", "Castellanos"), 10.0);
        cuentaAhorro.retirarDinero(50.000);
        assertEquals(50.000, cuentaAhorro.getSaldo());
        LOG.info("Finalizando Test");
    }

    @Test
    public void retirarTodoElSaldo(){
        LOG.info("Iniciando Test");
        CuentaAhorro cuentaAhorro = new CuentaAhorro(
            "18299", 10.000, true, new Titular(
                "Pablo",
                "Cheverri"), 10.0);
            cuentaAhorro.retirarDinero(10.000);
            assertEquals(0.0, cuentaAhorro.getSaldo());
            assertFalse(cuentaAhorro.isEstadoCuenta());
        LOG.info("Finalizando Test");
    }

    @Test
    public void depositarDineroCuentaAhorro (){
        LOG.info("Iniciando Test");
        CuentaAhorro cuentaAhorro = new CuentaAhorro("1829182", 100.000, true, new Titular("pepito", "pepe"), 10.0);
        cuentaAhorro.depositarDinero(50.000);
        assertEquals(150.000, cuentaAhorro.getSaldo());
        LOG.info("Terminando Test");
    }

    @Test
    public void consultarSaldoCuentaActiva (){
        LOG.info("Iniciando Test");
        CuentaAhorro cuentaAhorro = new CuentaAhorro("1829322", 500.000, true, new Titular("Anyelo", "Roman"), 10.0);
        cuentaAhorro.consultarSaldo();
        assertEquals(500.000, cuentaAhorro.consultarSaldo());
        LOG.info("Finalizando Test");
    }

    @Test
    public void consultarSaldoCuentaInactiva (){
        CuentaAhorro cuentaAhorro = new CuentaAhorro("189182", 0.0, false, new Titular("Anyelo", "Castellanos"), 10.00);
        cuentaAhorro.consultarSaldo();
        assertEquals(0.0, cuentaAhorro.consultarSaldo());
    }

    @Test
    public void testCuentaActivaYExiste() {
        LOG.info("Iniciando Test");
        Titular titular = new Titular("Juan", "Pepito");
        CuentaAhorro cuenta = new CuentaAhorro("1234567890", 100.0, true, titular, 10.0);
        boolean resultado1 = cuenta.cuentaActivaYExiste("1234567890");
        boolean resultado2 = cuenta.cuentaActivaYExiste("1234567891");
        assertTrue(resultado1);
        assertFalse(resultado2);
        LOG.info("Finalizando Test");
    }

    @Test
    public void transferirDinero (){
        LOG.info("Iniciando Test");
        Titular titularOrigen = new Titular("Anyelo", "Areiza");
        Titular titularDestino = new Titular("Camila", "Rojas");
        CuentaAhorro cuentaOrigen = new CuentaAhorro("1234567890", 100.000, true, titularOrigen, 10.0);
        CuentaAhorro cuentaDestino = new CuentaAhorro("0987654321", 50.000, true, titularDestino, 13.0);
        cuentaOrigen.transferirDinero(50.0, cuentaDestino);
        assertEquals(50.000, cuentaOrigen.getSaldo(), 0.001);
        assertEquals(100.000, cuentaDestino.getSaldo(), 0.001);
        LOG.info("Finalizando Test");
    }
    /**Test en Corriente */
    @Test
    public void retirarDinero (){
        LOG.info("Iniciando Test");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("123654", 150.000, true, new Titular("Anyelo", "Castellanos"), 100.000);
        cuentaCorriente.retirarDinero(90.000);
        assertEquals(60.000, cuentaCorriente.getSaldo());
        LOG.info("Finalizando Test");
    }

    @Test
    public void retirarDineroUtilizandoSobregiro (){
        LOG.info("Iniciando Test");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("1238524", 200.000, true, new Titular("Juan", "Peralta"), 50.000);
        cuentaCorriente.retirarDinero(250.000);
        assertEquals(0,0, cuentaCorriente.getSaldo());
        LOG.info("Finalizando Test");
    }
    
    @Test
    public void depositarDinero (){
        LOG.info("Iniciando Test");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("7896556", 10.000, true, new Titular("Camila", "Lopez"), 50.000);
        cuentaCorriente.depositarDinero(90.000);
        assertEquals(100.000, cuentaCorriente.getSaldo());
        LOG.info("Finalizando Test");
    }

    @Test
    public void consultarSaldoCuentaActivaCorriente (){
        LOG.info("Iniciando Test");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("18282", 150.000, true, new Titular("Santiago", "Fuentes"), 20.000);
        cuentaCorriente.consultarSaldo();
        assertEquals(150.000, cuentaCorriente.consultarSaldo());
        LOG.info("Finalizando Test");
    }

    @Test
    public void consultarSaldoCuentaInactivaCorriente (){
        LOG.info("Iniciando Test");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("1829542", 0.0, false, new Titular("Anyelo", "Castellanos"), 0.0);
        cuentaCorriente.consultarSaldo();
        assertEquals(0.0, cuentaCorriente.consultarSaldo());
        LOG.info("Finalizando Test");
    }

    @Test
    public void testCuentaActivaYExisteCorriente() {
        LOG.info("Iniciando Test");
        Titular titular = new Titular("Teresa", "Carmen");
        CuentaCorriente cuenta = new CuentaCorriente("1234567890", 150.000, true, titular, 50.000);
        boolean resultado1 = cuenta.cuentaActivaYExiste("1234567890");
        boolean resultado2 = cuenta.cuentaActivaYExiste("1234567891");
        assertTrue(resultado1);
        assertFalse(resultado2);
        LOG.info("Finalizando Test");
    }

    @Test
    public void transferirDineroCorriente(){
        LOG.info("Iniciando Test");
        Titular titularOrigen = new Titular("Juan", "Martinez");
        Titular titularDestino = new Titular("Maria", "Caicedo");
        CuentaCorriente cuentaOrigen = new CuentaCorriente("12345690", 150.000, true, titularOrigen, 50.000);
        CuentaCorriente cuentaDestino = new CuentaCorriente("0987321", 80.000, true, titularDestino, 20.000);
        cuentaOrigen.transferirDinero(20.000, cuentaDestino);
        assertEquals(130.000, cuentaOrigen.getSaldo(), 0.001);
        assertEquals(100.000, cuentaDestino.getSaldo(), 0.001);
        LOG.info("Finalizando Test");
    }
}
