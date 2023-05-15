package Funciones;
import java.util.*;

public class FuncionEj8 {
/*Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos, para cada número introducido si es primo o no. 
    Hay que recordar que un número es primo si es divisible por sí mismo y por 1. El 1 no es primo por convenio. 
    Se debe crear una función que pasándole un número entero devuelva si es primo o no.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Introduce numeros\n[para parar 0]: ");
        int num = in.nextInt();
        System.out.println(numbers(num)+" "+"es primo: "+esprimo(num));
        
    }
     public static boolean esprimo(int num) {

        if (num==1||num==0) return false;

        boolean es_primo = true;
        int i = 2;
        
        while ((num % i == 0) && (i < num)) {
            
            i++;
            es_primo = false;
        }
        return es_primo;
    }
    public static int numbers(int a){
        while(a!=0){
            System.out.print("Introduce numeros: ");
        }
        return a;
    }
}
