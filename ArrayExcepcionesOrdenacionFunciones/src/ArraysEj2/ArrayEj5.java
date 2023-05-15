package ArraysEj2;
import java.util.*;
public class ArrayEj5 {
/*5. Escribe un programa que lea 15 números por teclado y que los almacene en un array.
Rota los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, 
    el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0. 
    Muestra el contenido del array antes y después de la rotación.*/
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] array = new int[15];
        int[] array1 = new int[15];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce numeros: ");
            array[i] = in.nextInt();
        }
        System.out.println("");
        System.out.println("Array original");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ") ;
        }System.out.println("");
        System.out.println("Array rotada");
        for (int i = 0; i < array1.length-1; i++) {
            array1[i]=array[i+1];
        }
        array1[array1.length-1]=array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array1[i]+", ");
        }
    }
    
}
