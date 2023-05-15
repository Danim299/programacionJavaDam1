package ArraysEj2;
import java.util.*;
public class ArrayEj3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array= new int[8];

        for (int i = 0; i < array.length; i++) {
        System.out.print("Introduce los numeros que quieras\nSe para cuando introduzcas 8: ");
        int num = in.nextInt(); 
        array[i] = num;
        }
        for (int i = 0; i < array.length; i++) {
            if((array[i]%2==0)){
                System.out.println(array[i]+" es par");
            }else{
                System.out.println(array[i]+" es impar");
            }
        }
    }
    
}
