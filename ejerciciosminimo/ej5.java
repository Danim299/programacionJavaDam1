package ejerciciosminimo;

import java.util.Scanner;

public class ej5 {
/*Escribe un programa que lea tres números y los muestre en orden ascendente*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 3 números para ordenarlos de manera ascendente");
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        double n3 = in.nextDouble();
        
        if(n1>n2 && n1>n3){
            if(n2>n3){
                System.out.println(n3+" "+n2+" "+n1);
            }else{
                System.out.println(n2+" "+n3+" "+n1);
            }
        }else if(n2>n1 && n2>n3){
            if(n1>n3){
                System.out.println(n3+" "+n1+" "+n2);
            }else{
                System.out.println(n1+" "+n3+" "+n2);
            }
        }else if(n3>n1 && n3>n2){
            if(n1>n2){
                System.out.println(n2+" "+n1+" "+n3);
            }else{
                System.out.println(n1+" "+n2+" "+n3);
            }
        }else{
            System.out.println("Son todos iguales o hay un dato incorrecto");
        }
    }
    
}
