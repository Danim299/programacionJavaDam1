package ejerciciosminimo;

import java.util.Scanner;

public class ej6 {
/*Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en calificación alfabética, escribiendo el resultado.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame la calificación del [0-10]");
        int n = in.nextInt();
        if(n<3){
            System.out.println("Muy deficiente");
        }else if(n>=3 && n<5){
            System.out.println("Insuficiente");
        }else if(n>=5 && n<6){
            System.out.println("Bien");
        }else if(n>=6 && n<9){
            System.out.println("Notable");
        }else if(n>=9 && n==10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Dato incorrecto o fuera de rango");
        }
            
    }
    
}
