package EjerciciosRepaso;
import java.util.*;
public class EjercicioMath7 {

    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
        System.out.print("Introduzca un numero de 3 cifras: ");
        int num1 = in.nextInt();
        String numString = String.valueOf(num1);
        int num = numString.length();
        String numS1 = String.valueOf(num);
        if (num<=3){
            for (int i = 0, j = numS1.length()-1; i <= 10; i++, j--) {
                if(numS1.charAt(i)== numS1.charAt(j)){
                    System.out.println("es capicua");
                }else{
                    System.out.println("No es capicua");
                }
            }
 
        }else{
            System.out.println("Dije de 3 cifras");
        }
    }
    
}
