package pruebainterfaces;

public class Pruebainterfaces {

    public static void main(String[] args) {
        rectangulo r = new rectangulo(4, 6);
        circulo c = new circulo(5);
        esfera e = new esfera(5);
        System.out.println(r.area());
        System.out.println(c.area());
        System.out.println(e.area());
    }
    
}
