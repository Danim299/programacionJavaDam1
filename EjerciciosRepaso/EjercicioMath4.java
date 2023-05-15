package EjerciciosRepaso;
import java.util.*;
public class EjercicioMath4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        double base = in.nextInt();
        System.out.print("Introduzca el exponente: ");
        double exp = in.nextInt();
        if (base>=0){
        double pow = Math.pow(base, exp);
            System.out.println(pow);
        }else{
            System.out.println("Base erronea");
        }
    }
    
}
