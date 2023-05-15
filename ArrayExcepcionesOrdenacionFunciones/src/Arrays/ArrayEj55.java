package Arrays;
import java.util.*;
public class ArrayEj55 {
/*55. Rellena un array con números aleatorios de al menos 10 elementos.
  Luego muéstralos en el orden normal todos en la misma línea con un separador, por ejemplo “:”*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int [10];
            for (int i = 0; i < array.length; i++) {
                array [i] = (int)(Math.random()*10);
            }
            for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
             if (i!=(array.length-1)){
                 System.out.print(":");
             }
        }
        System.out.println("");
    }
    
}
