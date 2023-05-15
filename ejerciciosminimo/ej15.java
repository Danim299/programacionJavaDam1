package ejerciciosminimo;

import java.util.Scanner;

public class ej15 {
/*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = 1;
        int suma = 0;
        int i=0;
        System.out.println("Introduce un número");
        int num = in.nextInt();
        
        while(c!=0){
            if ((num%3)==0) {
                System.out.println(num+" es múltiplo de 3");
                suma=suma+num;
                i++;
            }else{
                System.out.println(num+" no es multiplo de 3");
            }
        num--;
        c++;
        }
        System.out.println("");
    }
       
    
}
