package Ejercicio3OO;

public class Ej63 {

    public static void main(String[] args) {
        Asignatura a1 = new Asignatura(1,0);
        Asignatura a2 = new Asignatura(2,0);
        Asignatura a3 = new Asignatura(3,0);
        
        Alumno alum = new Alumno (a1, a2, a3);
        
        Profesor.ponerNotas(alum);
        System.out.println("La media es: "+Profesor.calcularMedia(alum));
    }
    
}
