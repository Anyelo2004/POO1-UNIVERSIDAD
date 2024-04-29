/**
 * Veterinaria
 * Anyelo Roman castellanos Areiza Área de programación UQ
 * 2024/2
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Prueba para validar una mascota:-)
     */
    @Test
    public void datosCompletos(){

        LOG.info("Iniciando test dastosCompletos");

        Mascota mascota= new Mascota("Alana","123456","canino","pomerania", 7,"H","cafe claro",2.5);

        assertEquals("Alana",mascota.nombre());
        assertEquals("123456", mascota.identificacion());
        assertEquals("canino", mascota.especie());
        assertEquals("pomerania", mascota.raza());
        assertEquals(7, mascota.edad());
        assertEquals("H", mascota.genero());
        assertEquals("cafe claro", mascota.color());
        assertEquals(2.5, mascota.peso());

        LOG.info("Finaliza test datosCompletos");

    }

    /**
     * prueba para verificar que los datos de una mascota no sea nulos
     */
    @Test
    public void datosNulos(){
        LOG.info("Inicio prueba datosNulos");
        assertThrows(Throwable.class, ()-> new Mascota(null,null,null,null,0,null,null,0.0));

        LOG.info("Finalización datosNulos");
    }

    /**
     * prueba para verificar que los datos no esten vacios
     */
    @Test
    public void datosVacios(){
        LOG.info("Inicio prueba datosVacios");
        assertThrows(Throwable.class, ()-> new Mascota("", "","", "", 0,"", "", 0.0));

        LOG.info("Finalización datosVacios");
    }

    /**
     * prueba para verificar que la edad y el peso de una mascota no sea negativo
     */
    @Test
    public void edadYPesoNegativa(){
        LOG.info("Inicio prueba edadNegativa");
        assertThrows(Throwable.class, ()-> new Mascota("Alana", "123456","canino","pomerania", -7, "H", "cafe claro", -2.5 ));
        LOG.info("Finalización prueba edadNegativa");
    }

    /**
     * prueba para validar el genero de la mascota
     */
    @Test
    public void generoInvalido(){
        LOG.info("Inicio prueba generoInvalido");
        assertThrows(Throwable.class, ()-> new Mascota("Alana","123456", "canino", "pomerania", 7, "No Binario", "cafe claro", 2.5 ));

        LOG.info("Finalización prueba generoInvalido");
    }
    }


