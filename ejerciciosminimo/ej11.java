package ejerciciosminimo;

import java.util.Scanner;

public class ej11 {
/*Escribe un programa que lea 3 números diferentes*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c=1;
        System.out.println("Introduce 3 números");
        do{
           System.out.println("numero "+c);
           double n1 = in.nextDouble();
           c++;
        }while(c!=4);
    }
    
}
