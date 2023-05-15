package EjerciciosRepaso;
import java.util.Scanner;
public class EjercicioTriangulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce la altura del Triangulo: ");
        int altura=in.nextInt();
        System.out.println("Figura de: "+altura);
        for (int i = 0; i < altura; i++) {//Filas del cuadro
            for (int j = 0; j <=altura; j++) {//Columnas
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {//Columnas
                System.out.print(" "+"*");
            }
            System.out.println("");
        }
    }
}
