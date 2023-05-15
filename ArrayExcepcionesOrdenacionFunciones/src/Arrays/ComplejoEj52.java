package Arrays;
import java.util.*;
public class ComplejoEj52 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int NUM_RANDOM = (int)(Math.random()*99+1);
        System.out.print("Introduce tu número: ");
        int num_jugador = in.nextInt();
        
        do{
        if(NUM_RANDOM > num_jugador){
            System.out.println("Mi número es mayor");
            System.out.println("");
        }else if(NUM_RANDOM < num_jugador){
            System.out.println("Mi número es menor");
            System.out.println("");
        }
        System.out.print("Introduce: ");
        num_jugador = in.nextInt();
        }while(NUM_RANDOM!=num_jugador);
        
        System.out.println("Has acertado");
    }
    
}
