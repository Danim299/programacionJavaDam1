package javaapplication3;
     import java.util.*;
public class NewMain {
    
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
		System.out.println("Introduce un número, 0 para acabar");
		int num=1;
		int max=0;
		int min=0;
		int acumulador=0;
		int i = -1; //i es el acumulador que mide la cantidad de números totales. inicia a -1 porque al final del bucle se suma 1 incluso cuando no se mete ningún número
		boolean seguir=true;
		int seguirInt;
		boolean primeraVez=true;
		while (num!=0) {
			num = in.nextInt();
			if (num==0) {
				System.out.println("¿Desea terminar o contar el 0?");
					System.out.println("0: Salir");
					System.out.println("1: Contar");
					seguirInt= in.nextInt();
					if (seguirInt==0) {
						seguir=false;
					}
					else if (seguirInt==1) {
						seguir=true;
					}
					else {
						System.out.print("Así que quieres romper esto. ");
						seguir=false;
					}
				System.out.println("Entendido");				
			}
			if (primeraVez) {
				max= num;
				min=num;
				primeraVez=false;
			}
			if (num>max && seguir) {
				max=num;
			}
			if (num<min && seguir) {
				min=num;
			}
			if (seguir && num==0) {
				num=1;
			}
			acumulador = acumulador + num;
			i++;
		}
		
		System.out.println("El número más pequeño es " +min);
		System.out.println("El número más grande es " +max);
		System.out.println("La media (redondeada) es " +acumulador/i);
		
	}
}  
