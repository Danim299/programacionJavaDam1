package Funciones;
import java.util.Scanner;
public class FuncionEj7 {
/*Escribe una función que muestre por pantalla un triángulo como el del ejemplo. 
Deberá recibir dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce la altura del Triangulo: ");
        int altura=in.nextInt();
        System.out.print("Introduce el caracter que quieras: ");
        String carac=in.next();

}
   public static int alt(int a){
       
        for (int i = 0; i < a; i++) {//Filas del cuadro
            for (int j = a-1-i; j>=0; j--) {//Columnas
                System.out.print(" ");
            }
            
    }
        return a;
  }
 /* public static String caract(int alt, String b){
       for (int j = 0; j <= alt(altura); j++) {//Columnas
        System.out.print(b);
      }
      System.out.println("");
       
      return b;
  }*/
}
