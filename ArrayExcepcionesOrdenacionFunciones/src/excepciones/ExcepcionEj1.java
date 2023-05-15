package excepciones;

import java.util.Scanner;

public class ExcepcionEj1 {

    public static void main(String[] args) {
        boolean esPrimo = true;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce numero para saber si es primo\n[0 para acabar]: ");
        int num = in.nextInt();

        if (num >= 0) {
            int cont = num - 1;
            while (cont > 1) {
                if ((num % cont--) == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                System.out.println(num + " es primo");
            } else {
                System.out.println(num + " no es primo");
            }
        }
    }
}
