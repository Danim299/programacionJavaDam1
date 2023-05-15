package Array3;
import java.util.Scanner;
public class Array8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] pais = new String [4][4];
        for (int i = 0; i < pais.length; i++) {
            for (int j = 0; j < pais[i].length; j++) {
                if(pais[i][j]==pais[i][0]){
                    System.out.print("Introduce los paises: ");
                }else{
                System.out.print("Introduce las ciudades: ");
                
                }
                pais[j][i]=in.next();
            }
        }
        for (int i = 0; i < pais.length; i++) {
            for (int j = 0; j < pais[i].length; j++) {
                System.out.print(pais[j][i]+" ");
            }
            System.out.println("");
        }
    
    }
    
}
