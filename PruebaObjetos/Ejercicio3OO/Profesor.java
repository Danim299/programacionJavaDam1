package Ejercicio3OO;

public class Profesor {
    
    public static void  ponerNotas(Alumno alum){
        
        alum.getSi().setClasificacion(1+Math.random()*9.99);
        alum.getProg().setClasificacion(1+Math.random()*9.99);
        alum.getBbdd().setClasificacion(1+Math.random()*9.99);
        System.out.println("Nota si "+alum.getSi().getClasificacion());
        System.out.println("Nota bbdd "+alum.getBbdd().getClasificacion());
        System.out.println("Nota prog "+alum.getProg().getClasificacion());
        System.out.println("Id de si "+alum.getSi().getIdentificador());
        System.out.println("Id de bbdd "+alum.getBbdd().getIdentificador());
        System.out.println("Id de prog "+alum.getProg().getIdentificador());
        

    }
    
    public static double calcularMedia(Alumno a){
        return ((a.getBbdd().getClasificacion() + a.getProg().getClasificacion() + a.getSi().getClasificacion())/3);
        
    }
}
