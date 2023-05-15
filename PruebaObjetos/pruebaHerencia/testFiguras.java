package pruebaHerencia;

public class testFiguras {

    public static void main(String[] args) {
        figura c = new cuadrado(5);
        c.setColor("verde");
        System.out.println("El area: "+((cuadrado)c).getArea());
    }
    
}
