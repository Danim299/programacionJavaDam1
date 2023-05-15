package EjerciciosRepaso;
import java.util.*;
public class EjermploString20 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String CONT = "perro";
        System.out.print("Introduzca la contraseña: ");
        String contUser= in.next();
        int va1= contUser.compareToIgnoreCase(CONT);
        if (va1 == 0){
            System.out.println("Contraseña correcta");
        } 
    }
    
}
