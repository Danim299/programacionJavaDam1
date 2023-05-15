
package EjerciciosRepaso;

public class EjercicioTrianguloVacio {

    public static void main(String[] args) {
int n=5; // n indica el número de filas de triángulos huecos, aquí hay un ejemplo de 5 líneas
		for(int i=1;i<=n;i++) {
			/*for(int j=1;j<=n-i;j++) { // Controla el primer espacio de cada línea
				System.out.print(" ");
			}*/
			for (int k = 1; k <= 2*i-1; k++) { // Controla el asterisco total y el espacio
				if(i==1||i==n) { 
					/* Controla los asteriscos en la primera y última línea
					  * Cuando i es igual a n, solo se tomará una oración en cada ciclo
					  * Entonces se imprimirán 2 * n-1 asteriscos */
					System.out.print("*");
				}else if(k==1||k==2*i-1) { // Controla la salida del asterisco desde la segunda línea hasta la línea n-1
						System.out.print("*");
					}else { // Controla la salida de espacios desde la segunda línea hasta la línea n-1
						System.out.print(" ");
					}
				
			}
			System.out.println(); // Después de completar la salida de cada línea, se realiza una operación de avance de línea
		}
    
}}
