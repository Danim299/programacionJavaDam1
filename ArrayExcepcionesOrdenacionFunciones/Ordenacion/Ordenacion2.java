package Ordenacion;
import java.util.*;
public class Ordenacion2 {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i]=(int)(Math.random()*499.99+1);
            System.out.print(array[i]+" ");
        }
        Arrays.sort(array);
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
    }
    
}
