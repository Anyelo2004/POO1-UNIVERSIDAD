package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Veterinaria {
    private final String nombre;
    private final Collection<Mascota> mascotas;
    private final Collection<Mascota>MayoresA10;
    
    /**
     * contructor de la clase veterinaria
     * @param nombre
     */

    public Veterinaria(final String nombre){
        assert nombre != null : "El nombre no puede ser nulo";
        mascotas = new LinkedList<>();
        MayoresA10 = new LinkedList<>();
        this.nombre = nombre;
    }




    /**
     * Metodo para añadir mascota
     */

     public void añadirMascotas(final Mascota mascota){
        assert verificarMascotaExiste(mascota.identificacion())== false;
        mascotas.add(mascota);

    }

    /**
     * metodo para añadir una mascota mayor a 10 años
     */
    public void añadirMascotaMayor10(final Mascota mascota){
        assert identificarIdMayores10() == false;
        MayoresA10.add(mascota);
    }



     /**
      * metodo para verificar la id de la mascota
      */
      private boolean verificarMascotaExiste(final String NumID){
        Boolean existe = false;
        for (final Mascota mascota : mascotas) {
            if (mascota.identificacion().equals(NumID)) {
                existe = true;
            }
        }

        return existe;

      }

    /**
     * metodo para identificar las mascotas mayores a 10
     */

     private boolean identificarIdMayores10(){
        Boolean mayor = false;
        for (final Mascota mascota : mascotas) {
            if (mascota.edad() > 10) {
                mayor = true;
            }
        }
        return mayor;
     }

     /**
      * metodo para obtener el nombre de la veterinaria
      */
      public String getNombre(){
        return nombre;
      }

    /**
     * metodo get para obtener la lista mascotas
     */

    public Collection<Mascota> getMascotas() {
        return mascotas;
    }


    /**

    * metodo get para obtener la lista MayoresA10
     */
    public Collection<Mascota> getMayoresA10(){
        return MayoresA10;
    }

    
}
