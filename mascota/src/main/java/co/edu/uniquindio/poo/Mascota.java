package co.edu.uniquindio.poo;

public record Mascota(String nombre, String identificacion, String especie, String raza, int edad, String genero, String color, double peso) {
    public Mascota {
        assert nombre != null && !nombre.isBlank() && nombre != "0" && nombre != "1" && nombre != "2" && nombre != "3" && nombre != "4" && nombre != "5" && nombre != "6" && nombre != "7" && nombre != "8" && nombre != "9": "El nombre de la mascota no puede ser nulo, tampoco puede ser vacio y no puede ser un numero";
        assert identificacion != null && !identificacion.isBlank();
        assert especie != null &&  !especie.isBlank() : "La especie de la mascota no puede ser nula y tampoco puede ser vacia";
        assert raza != null && !raza.isBlank() : "la raza de la mascota no puede ser nula y tampoco puede ser vacia";
        assert edad >= 0 && peso >= 0;
        assert genero != null && !genero.isBlank() && genero == "H" || genero == "M": "El genero no puede ser nulo y tampoco puede ser vacio";
        assert color != null && !color.isBlank() : "El color no pueder ser nulo y tampoco puede ser vacio";    
    } 
    

/**
 * get para obtener el nombre de la mascota
 * @return nombre
 */
public String getNombre() {
    return nombre;
}

/**
 * get para obtener la identificacion de la mascota
 * @return identificacion
 */
public String getIdentificacion() {
    return identificacion;
}

/**
 * get para obtener la espepecie de la mascota
 * @return especie
 */
public String getespecie() {
    return especie;
}
/**
     * Get para obtener la raza de la mascota 
     * @return raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Get para obtener la edad de la mascota 
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Get para obtener el genero de la mascota 
     * @return genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Get para obtener el color de la mascota 
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Get para obtener el peso de la mascota 
     * @return peso
     */
    public double getPeso() {
        return peso;
    }
}
    
