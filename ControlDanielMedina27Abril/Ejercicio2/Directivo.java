package Ejercicio2;

public class Directivo extends Profesor{
    private String cargo;

    public Directivo(String cargo, double sueldo, String DNI, String nombre, String apellidos) {
        super(sueldo, DNI, nombre, apellidos);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
