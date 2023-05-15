package Funciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncioEj6 {
/*Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga si la fecha es correcta o no. 
Supondremos que todos los meses tienen 30 días. Se debe crear una función donde le pasemos los datos y devuelva si es correcta o no.*/
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Introduce el día: ");
        try{
        int dia = in.nextInt();
        System.out.print("Introduce el mes: ");
        int mes = in.nextInt();
        System.out.print("Introduce el año: ");
        int año = in.nextInt();
        
        if( comprobacion(dia, mes, año)){
            System.out.println("Tu fecha está bien :)");
        }else{
            System.out.println("Tu fecha está mal :(");
        }
        }catch (InputMismatchException e){
            System.out.println("Dato incorrecto");
        }
        
    }
    
    public static boolean comprobacion(int a, int b, int c){
        if((a>=1&&a<=30) && (b>=1 && b<=12) && (c!=0)){
            return true;
        }else{
            return false;
        }
    }
    
}
