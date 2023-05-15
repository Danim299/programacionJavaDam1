package EjerciciosRepaso;
import java.util.*;
public class EjercicioRombo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce la altura del Rombo: ");
        int altura=in.nextInt();
        System.out.print("Introduce el caracter que quieras: ");
        String carac=in.next();
        for (int i = 0; i < altura; i++) {
            for (int j = altura-1-i; j>=0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(carac+" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = altura-1-i; j >= 0; j--) {
                System.out.print(carac+" ");
            }
            System.out.println("");
        }
    }
  }
