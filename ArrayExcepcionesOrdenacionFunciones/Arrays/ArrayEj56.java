package Arrays;
import java.util.*;
public class ArrayEj56 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int [10];
            for (int i = 0; i < array.length; i++) {
                array [i] = (int)(Math.random()*10);
            }
             for (int i = array.length-1; i >= 0; i--) {
                System.out.print(array[i]);
                if (i!=0){
                System.out.print(":");
             }
        }
           System.out.println("");
        }
  }

