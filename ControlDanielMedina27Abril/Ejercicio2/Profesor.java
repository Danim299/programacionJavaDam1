package Ejercicio2;

public class Profesor extends Persona{
    private double sueldo;
    private String asignatura;

    public Profesor(double sueldo, String DNI, String nombre, String apellidos) {
        super(DNI, nombre, apellidos);
        this.sueldo = sueldo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
