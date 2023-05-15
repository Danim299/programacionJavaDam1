package ejerciciosminimo;

import java.util.Scanner;

public class ej12 {
/*Programa que lea números hasta introducir 0 desde teclado en un proceso repetitivo y muestre el número de números introducidos y la suma.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = -1;
        double suma = 0;
        int c = 0;
        while(num!=0){
        System.out.print("Introduce números[para finalizar 0]: ");
        num = in.nextDouble();
        suma=suma+num;
        c++;
        }
        System.out.println("La suma de todos los números es: "+suma+" y has introducido "+(c-1)+" numeros");
    }
    
}
