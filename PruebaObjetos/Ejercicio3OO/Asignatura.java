package Ejercicio3OO;

public class Asignatura {
    
    private int identificador;
    private double clasificacion;

    public Asignatura(int i, double c) {
        this.identificador = i;
        this.clasificacion = c;
    }

    public void setClasificacion(double c) {
        this.clasificacion = c;
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getClasificacion() {
        return clasificacion;
    }
    
}
