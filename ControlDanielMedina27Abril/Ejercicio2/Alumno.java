package Ejercicio2;

public class Alumno extends Persona{
    private String[] asignaturas;
    private int numAsig;

    public Alumno(int numAsig, String DNI, String nombre, String apellidos) {
        super(DNI, nombre, apellidos);
        this.numAsig = numAsig;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public int getNumAsig() {
        return numAsig;
    }
    
}
