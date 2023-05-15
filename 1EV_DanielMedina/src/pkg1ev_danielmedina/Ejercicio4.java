package pkg1ev_danielmedina;
import java.util.*;
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Introduce la altura del cuadrado: ");
        int altura=in.nextInt();
        System.out.println("Figura de "+altura+" líneas");
        for (int i = 0; i < altura; i++) {//Filas del cuadro
                        for (int j = 0; j <= i; j++) {//Columnas con los espacion en blanco
                System.out.print(" ");
            }
            for (int j = 0; j < altura; j++) {//Columnas con asteriscos
                System.out.print("*");
            }

            System.out.println("");
        }
    }
    
}
