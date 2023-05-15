package Ejercicio2;

public class Asignatura {
    private String Nombre;
    private int curso;
    private int horas;

    public Asignatura(String Nombre, int curso, int horas) {
        this.Nombre = Nombre;
        this.curso = curso;
        this.horas = horas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

}
