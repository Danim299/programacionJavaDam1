package ejerciciosminimo;

import java.util.Scanner;

public class ej3 {
/*Escribe un programa que lea del teclado dos números, calcule y muestre el valor de sus suma, resta, producto y división.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce dos números para sumarlos, restarlos, multiplicarlos y dividirlos: ");
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        
        System.out.println("La suma de "+n1+"+"+n2+" es de "+(n1+n2));
        System.out.println("La resta de "+n1+"+"+n2+" es de "+(n1-n2));
        System.out.println("La multiplicación de "+n1+"+"+n2+" es de "+(n1*n2));
        if(n2<=0)
        System.out.println("No se puede realizar la division");
        else
            System.out.println("La división de "+n1+"+"+n2+" es de "+(n1/n2));
    }
    
}
