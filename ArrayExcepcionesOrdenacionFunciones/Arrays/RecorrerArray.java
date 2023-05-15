package Arrays;

import java.util.Scanner;

public class RecorrerArray {

    public static void main(String[] args) {
        int suma = 0, s1=0,s2=0,s3=0;
        /*int[][] matriz={{1,2,3},{4,5,6},{7,8,9}};*/
        System.out.print("Dame un numero de filas: ");
        Scanner in = new Scanner(System.in);
        int filas = in.nextInt();
        int matriz [][] = new int[filas][filas];
        int sumas[]= new int[matriz.length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
            matriz[i][j]= (int)(Math.random()*9+1);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " "); //Para mostrar en cada celda
                sumas[i] += matriz[i][j];//Para sumar en cada fila "i"
            } 
            
            System.out.println(""); //Enter tras cada fila
        }
        /*for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumas[i] += matriz[i][j];
            }
        }*/
        for (int i = 0; i < sumas.length; i++) {
            System.out.println("Suma"+(i+1)+": "+sumas[i]);
        }
        

    }
    
}
