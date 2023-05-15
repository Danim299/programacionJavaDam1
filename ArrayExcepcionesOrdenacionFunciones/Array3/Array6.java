package Array3;

import java.util.*;

public class Array6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = new int[3][3];
        int[] sumafilas = new int[3];
        int[] sumacolum = new int[3];
        System.out.print("Filas [1]\nColumnas [2]\nQue quieres sumar: ");
        int op = in.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 8.99 + 1);
                for (int ci = 0; ci <= i; ci++) {
                    for (int cj = 0; cj < array[ci].length; cj++) {
                        if (array[ci][cj] == array[i][j]) {
                            if (ci == i && cj == j) {
                                break;
                            } else {
                                array[i][j] = (int) (Math.random() * 8.99 + 1);
                                ci = 0;
                                cj = -1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");//para que saque los números en filas
        }
        if (op == 1) {

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sumafilas[i] = sumafilas[i] + array[i][j];

                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(sumafilas[i] + " ");
            }
            System.out.println("");
        }

        if (op == 2) {

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sumacolum[j] = sumacolum[j] + array[i][j];

                }
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(sumacolum[j] + " ");
                }
                System.out.println("");
            }
        }
    }
}

