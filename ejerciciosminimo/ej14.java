package ejerciciosminimo;

import java.util.Scanner;

public class ej14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el número de filas de la pirámide");
        int altura = in.nextInt();
        int num = 1;
        
        for (int i = 0; i < altura; i++) {//Filas del cuadro
            for (int j = altura-1-i; j>=0; j--) {//Columnas
                System.out.print(" ");
            }
            num=1;
            for (int j = 0; j <= i; j++) {//Columnas
                System.out.print(num++);
            }
            num--;
            for (int j = 1; j <= i; j++) {//Columnas
                System.out.print(--num);
            }
            System.out.println("");
        }
    }
}
