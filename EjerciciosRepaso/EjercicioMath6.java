package EjerciciosRepaso;
import java.util.*;
public class EjercicioMath6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca la vocal: ");
        String vocal = in.next();
        double c1 = Math.random()*10;
        c1=Math.floor(c1);
        double c2 = Math.random()*10;
        c2=Math.floor(c2);
        double c3 = Math.random()*10;
        c3=Math.floor(c3);
        System.out.println(c1+""+c2+""+c3+vocal);
    }
    
}
