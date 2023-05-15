package Arrays;
import java.util.*;
public class ArrayEj59 {
    /* Pide al usuario 10 números, guárdalos en un array, genera la media y luego cuenta cuántos son superiores a la media, cuantos son menores y cuantos iguales.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double suma = 0;
        double media =0;
        double[] array = new double [10];
        System.out.println("Introduce 10 números");
            for (int i = 0; i < array.length; i++) { //guardamos los números del usuario y vamos haciendo la suma para calcular la media
                array [i] = in.nextInt();
                suma = suma + array[i];
            }
            media = suma/10;
            for (int i = 0; i < array.length; i++) {//comparamos si es mayor, menor o igual a la media
                if (media>array[i]){
                    System.out.println("El numero: "+array[i]+" es menor que la media "+"("+media+")");
                }else if (media<array[i]){
                    System.out.println("El numero: "+array[i]+" es mayor que la media "+"("+media+")");
                }else if (media == array[i]){
                    System.out.println("El numero: "+array[i]+" es igual que la media "+"("+media+")");
                }
        }
    }
    
}
