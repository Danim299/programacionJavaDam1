package EjerciciosRepaso;
import java.util.*;
public class EjercicioTrianguloNormal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce la altura del Triangulo: ");
        int altura=in.nextInt();
        System.out.print("Introduce el caracter que quieras: ");
        String carac=in.next();
        for (int i = 0; i < altura; i++) {//Filas del cuadro
            for (int j = altura-1-i; j>=0; j--) {//Columnas
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {//Columnas
                System.out.print(carac+" ");
            }
            System.out.println("");
    }
  }  
}
