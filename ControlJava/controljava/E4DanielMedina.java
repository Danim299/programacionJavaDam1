package controljava;

import java.util.Scanner;

public class E4DanielMedina {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Dame el numero de números que quieres que genere");
        int numero = in.nextInt();
        int c=0;
        int[] arrayN = new int[numero];
        
        if (numero>0){
            while(c!=numero){
            int random = (int)(1+Math.random()*9.99);
            c++;
                for (int i = 0; i < arrayN.length; i++) {
                    arrayN[i]=random;
                    System.out.print(arrayN[i]+" ");
                }
            }
            arraycuenta(arrayN);
        }else{
            System.out.println("Tiene que ser > 0 o positivo");
        }
    }
    public static void arraycuenta(int[] arrayN){
        int cuenta = 0;
        int numeroR=0;
        for (int i = 1; i < arrayN.length; i++) {
            if(arrayN[i-1]==arrayN[i]){
                arrayN[i]= numeroR;
                cuenta++;
            }  
        }
        System.out.println("El numero: "+numeroR+" es el que mas se ha repetido, se a repetido "+cuenta+"veces");
    }
    
}
