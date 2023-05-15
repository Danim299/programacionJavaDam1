package Ejercicio2;

public class Persona {
    private String DNI;
    private String nombre;
    private String apellidos;

    public Persona(String DNI, String nombre, String apellidos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}
