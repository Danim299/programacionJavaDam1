package EjerciciosRepaso;
import java.util.*;
public class EjercicioBucles48 {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Este programa pinta una pirámide hecha a base de números.");
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = in.nextInt();

    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida - 1;
    
    while (altura <= alturaIntroducida) {
      
      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      // pinta la línea de números
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
    } // while
    }
    
}
