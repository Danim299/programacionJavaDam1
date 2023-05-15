package ejerciciosminimo;

import java.util.Scanner;

public class ej4 {
/*Escribe un programa que lee 2 números y muestra el mayor o diga que son iguales.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce dos numeros para compararlos: ");
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        if(n1>n2){
            System.out.println(n1+"es mayor que "+n2);
        }else if(n1==n2){
            System.out.println("los números son iguales");
        }else if(n1<n2){
            System.out.println(n1+"es menor que "+n2);
        }
    }
    
}
