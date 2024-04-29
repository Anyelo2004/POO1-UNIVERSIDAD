package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());

    

/**
 * prueba para verificar que el nombre de la veterinaria este correcto
 */
@Test
public void datosCompletosVeterinaria(){
    LOG.info("Inicio prueba de datosCompletosVeterinaria");

    Veterinaria veterinaria = new Veterinaria("AmigosPeludos");
    assertEquals("AmigosPeludos", veterinaria.getNombre());
    LOG.info("Fin prueba datosCompletosVeterinaria");
}
/**
 * Prueba para verificar que los datos de la clinica no esten nulos
 */
@Test

public void datosNulosVeterinaria(){
    LOG.info("Inicio prueba datosNulosVeterinaria");
    assertThrows(Throwable.class, () -> new Veterinaria(null));
    LOG.info("Fin prueba datosNulosVeterinaria");
}

/**
 * prueba para añadir una mascota a la veterinaria
 */
@Test

public void registrarMascota() {
    LOG.info("Inicio prueba registrarMascota");
    Veterinaria veterinaria = new Veterinaria("AmigosPeludos");
    Mascota mascota = new Mascota("Alana","123456","canino","pomerania", 7,"H","cafe claro",2.5);

    veterinaria.añadirMascotas(mascota);
    assertTrue(veterinaria.getMascotas().contains(mascota));
    assertEquals(1, veterinaria.getMascotas().size());
    LOG.info("Fin prueba registrarMascota");
}

/**
 * prueba para verificar la ID de una mascota
 */
@Test

public void verificarIdMascota(){
    LOG.info("Inicio test verificarIdMascota");
    Veterinaria veterinaria=  new Veterinaria("AmigosPeludos");
    Mascota mascota1 = new Mascota("Alana","123456","canino","pomerania", 7,"H","cafe claro",2.5);
    Mascota mascota2 = new Mascota("rufus","123456","gato","mestizo",10,"M","negro",3.5);

    veterinaria.añadirMascotas(mascota1);
    assertThrows(Throwable.class, ()-> veterinaria.añadirMascotas(mascota2));
    LOG.info("Fin test verificarIdMascota");

}

/**
 * prueba para identificar las mascotas mayores a 10 años
 */
@Test

public void identificarIdMayores10(){
    LOG.info("Inicio test identificarMayores10");
    Veterinaria veterinaria = new Veterinaria("AmigosPeludos");
    Mascota mascota2 = new Mascota("rufus","789654","gato","mestizo",10,"M","negro",3.5);

    veterinaria.añadirMascotaMayor10(mascota2);
    assertTrue(veterinaria.getMayoresA10().contains(mascota2));
    LOG.info("Fin test identificarMayores10");
             


    
}


}

