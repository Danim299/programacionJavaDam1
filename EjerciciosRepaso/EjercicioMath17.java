package EjerciciosRepaso;
import java.util.*;
public class EjercicioMath17 {

    public static void main(String[] args) {
      double tiempo = Math.sqrt(2);
      double gravedad = 9.81;
      double altura = (gravedad*(Math.pow(tiempo,2))/2);
        System.out.println("El tiempo que tarda son: "+Math.round(altura*100.0)/100.0+" segundos");
    }
}
