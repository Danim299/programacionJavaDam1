package Arrays;
import java.util.*;
public class ComplejoEj53 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int TIRADA = (int)Math.round(Math.random());
        System.out.print("Elige Cara[0] o Cruz[1]: ");
        int jug = in.nextInt();
        if(jug == TIRADA){
            System.out.print("Has ganado :)");
        }else {
            System.out.println("Has perdido :(");
        }
    }
    
}
