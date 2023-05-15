package Arrays;
public class Array4 {
public static void main(String[] args) {
        int[] arrayNumeros= {1, 2, 3, 4, 5};
        int dato1 = 10;
        for (int i=0; i<arrayNumeros.length; i++) {
            System.out.print(arrayNumeros[i]+", ");
        }
        System.out.println("\n"+dato1+"\n");
        int suma=funcionSumaArray(dato1, arrayNumeros);
       
        for (int i=0; i<arrayNumeros.length; i++) {
            System.out.print(arrayNumeros[i]+", ");
        }
        System.out.println("\n"+dato1+"\n");
    }
   
    static int funcionSumaArray (int d, int[] arrayEntrada) {
        int suma=0;
        arrayEntrada[0]=6;
        d=20;
        return suma;                            // Devolvemos el valor total
    }    }
