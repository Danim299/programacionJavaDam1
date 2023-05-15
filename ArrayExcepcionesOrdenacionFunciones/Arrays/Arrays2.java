package Arrays;
import java.util.*;
public class Arrays2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ArrayEnteros = new int [5];
            for (int i = 0; i < ArrayEnteros.length; i++) {
                System.out.print("Introduce el numero"+(i+1)+": ");
                ArrayEnteros[i] = in.nextInt();
                
            }
            for (int i = 0; i < ArrayEnteros.length; i++) {
                System.out.print(ArrayEnteros[i]);
                if (i!=(ArrayEnteros.length-1)){
                    System.out.print(", ");
                }
        }
/*
            for (int i = 0; i < ArrayEnteros.length; i++) {
                System.out.println(ArrayEnteros[9-1]);*/
            }/*
            for (int i = ArrayEnteros.length; i>0; i--) {
                System.out.println(ArrayEnteros[i-1]);
            }*/
    }
   /* 
}*/
