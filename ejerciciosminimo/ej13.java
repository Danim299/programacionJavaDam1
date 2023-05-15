package ejerciciosminimo;

import java.util.Scanner;

public class ej13 {
/*. Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es aquel que sólo es divisible entre él mismo y la unidad*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i =2;
        boolean esPrimo=true;
        int num = in.nextInt();
        
        if((num%i)==0){
            esPrimo=false;
        }
        System.out.println("Es primo: "+esPrimo);
    }
    
}
