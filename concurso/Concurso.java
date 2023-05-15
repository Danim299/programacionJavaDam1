package concurso;
import java.util.*;
public class Concurso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numcasos =in.nextInt();
        int año1, año2, año3, comp21, comp23;
        while (numcasos>0){
            año1=in.nextInt();
            año2=in.nextInt();
            año3=in.nextInt();
            
            if (año1>0 && año3<0) año1--;
            if (año1>0){
                año1--;
            }
            else{
                año1++;
            }
            else if (año3>0 && año1<0) año3--;
            if (año3>0){
                año3--;
            }
            else{
                año3++;
            }
        
        }
    }
    
}
