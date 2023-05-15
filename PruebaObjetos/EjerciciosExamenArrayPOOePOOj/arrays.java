package EjerciciosExamenArrayPOOePOOj;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);       
//Asiganacion de variables
       double array1[] = new double[5]; 
       double array2[] = new double[5];

//Código  
        try{
       //Bucle para la asignacion del número a una posicion y recorrer el array
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Introduce un número para el primer array");
            array1[i]=in.nextDouble();
            System.out.println("Introduce un número para el segundo array");
            array2[i]=in.nextDouble();
        }
        System.out.println("La suma es: "+Arrays.toString(sumar(array1,array2)));
        
        }catch(Exception e){System.out.println("Dato erroneo");}
    }
    
    //Funcion sumar de un array
    public static double[] sumar(double a[], double b[]){
        double sumar[] = new double[5];
        for (int i = 0; i < 5; i++) {
            sumar[i] = a[i]+b[i];
            
        }
        return sumar;
    }
    
    
}
