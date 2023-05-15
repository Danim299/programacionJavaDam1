package concurso;
import java.util.Scanner;
public class Concurso3 {
    public static void main(String[] args) {
    Scanner in =new Scanner (System.in);

        int numcasos =in.nextInt();
        int año1, año2, año3, comp21, comp23;

        while (numcasos>0){
            año1=in.nextInt();
            año2=in.nextInt();
            año3=in.nextInt();

            if (año1>0 && año3<0) año1--;

            else if (año3>0 && año1<0) año3--;
            
            comp21= (año1-año2);
            comp23= (año3-año2);

            if (comp23==0||comp21==0)System.out.println("EMPATE");
            else if (comp23<comp21){
                if (año3>0 && año1<0) System.out.println(año1);
                else System.out.println(año1++);
            }
            else if (comp21<comp23){

                if (año1>0 && año3<0) System.out.println(año3++);
                else System.out.println(año3++);
            }
            numcasos--;
        }
    }
}