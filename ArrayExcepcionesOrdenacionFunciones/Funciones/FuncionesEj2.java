package Funciones;

import java.util.Scanner;

public class FuncionesEj2 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Dame tu edad: ");
        int edad = in.nextInt();
        
        if(esMayorEdad(edad)==true){
            System.out.println("Eres mayor de edad, vamonos de malianteo");
        }else{
            System.out.println("Eres menor de edad, te falta todavia para venirte de malianteo");
        }
    }
    public static boolean esMayorEdad(int a){
        if (a>=18){
            return true;
        }else{
            return false;
        }

    }
    
}
