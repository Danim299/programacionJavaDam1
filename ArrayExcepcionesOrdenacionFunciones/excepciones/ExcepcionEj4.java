package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionEj4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n=0;
        int posicion=0;
        String cadena;
        double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};
        System.out.println("Contenido del array antes de modificar:");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);
        }
        System.out.print("\n\nIntroduce la posición del array a modificar: ");
        cadena = in.nextLine();
        try {
        posicion = Integer.parseInt(cadena);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepcion de tamaño de array");
        } catch (NumberFormatException e) {
            System.out.println("Excepcion de dato erroneo");
        }
        System.out.print("\nIntroduce el nuevo valor de la posición " + posicion + ": ");
        try{
        n = in.nextDouble();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepcion de tamaño de array");
        } catch (NumberFormatException e) {
            System.out.println("Excepcion de dato erroneo");
        } catch (InputMismatchException e){
            System.out.println("Input erroneo");
        }
        valores[posicion] = n;
        System.out.println("\nPosición a modificar " + posicion);
        System.out.println("Nuevo valor: " + n);
        System.out.println("Contenido del array modificado:");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);
        }
        System.out.println("");

    }

}
