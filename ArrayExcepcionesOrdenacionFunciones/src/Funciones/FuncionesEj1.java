package Funciones;

import java.util.Scanner;

public class FuncionesEj1 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Introduce 2 numeros para multiplicarlos\nNum1: ");
        double num1 = in.nextDouble();
        System.out.print("Num2: ");
        double num2 = in.nextDouble();
        System.out.print("El resultado es: "+multiplica(num1,num2));
        System.out.println("");
    }
    public static double multiplica(double n1, double n2){
        double resultado = n1*n2;
        return resultado;
    }
    
}
