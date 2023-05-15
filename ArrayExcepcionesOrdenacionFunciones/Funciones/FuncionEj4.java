package Funciones;

import java.util.Scanner;

public class FuncionEj4 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Dame un numero para saber su signo: ");
        int num = in.nextInt();
        dimeSigno(num);
    }
    public static int dimeSigno(int a){
        
        if(a<0){
            System.out.println("Signo negativo");
            return a;
        }else if(a==0){
            System.out.println("Es 0");
            return a;
        }else{
            System.out.println("Es positivo");
            return a;
        }
    }
}
