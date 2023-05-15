package Funciones;

import java.util.Scanner;

public class FuncionesEj3 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Dame dos numeros para saber el minimo\nNum1: ");
        int num1 = in.nextInt();
        System.out.print("Num2: ");
        int num2 = in.nextInt();
        System.out.println("El minimo es: "+minimo(num1,num2));
    }
    public static int minimo(int a, int b){
        int min;
        if(a>b){
            min=b;
        }else{
            min=a;
        }
        return min;
    }
    
}
