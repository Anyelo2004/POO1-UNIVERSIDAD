package co.edu.uniquindio.poo;

public class Titular {
    private final String nombres;
    private final String apellidos;
    
    public Titular(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        assert nombres != null && !nombres.isBlank();
        assert apellidos != null && !apellidos.isBlank();
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    
}
