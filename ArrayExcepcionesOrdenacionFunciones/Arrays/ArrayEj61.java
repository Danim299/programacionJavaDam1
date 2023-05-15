package Arrays;
import java.util.*;
public class ArrayEj61 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int[] numeros;
		int ini, fin;
		boolean capicua = true;
                System.out.print("Introduce las cifras de tu número: ");
		int cifras = in.nextInt();
		numeros = new int[cifras];
		
		for (int i = 0; i < numeros.length; i++) {
                        System.out.print("Introduce cifra a cifra: ");
			numeros[i] = in.nextInt();
                }
		ini = 0;
		fin = numeros.length - 1;
		while(ini <= fin && capicua) {
			capicua = (numeros[ini++] == numeros[fin--]);
		}
		if(capicua)
			System.out.println("El array es capicua");
		else
			System.out.println("El array NO es capicua");
	}
    
}
