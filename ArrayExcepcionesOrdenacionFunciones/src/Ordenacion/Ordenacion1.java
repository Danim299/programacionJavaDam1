package Ordenacion;

import java.util.Arrays;
import java.util.Collections;

public class Ordenacion1 {

    public static void main(String[] args) {
        Integer[] arr2 = {5, -2, 23, 7, 87, -42, 509};
        System.out.println("Array original de enteros (Integer): ");
        for (int i = 0;
                i < arr2.length;
                i++) {
            System.out.print(arr2[i] + " ");
        }

        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("\nArray ordenado descendentemente: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        
        Arrays.sort(arr2);
        System.out.println("\nArray ordenado ascendentemente: ");
        for (int i = 0;i < arr2.length;i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
