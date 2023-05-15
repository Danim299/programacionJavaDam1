package Arrays;

public class Array3 {

    public static void main(String[] args) {
        int[] arrayNumeros= {1, 2, 3, 4, 5};
        for (int i=0; i<arrayNumeros.length; i++) {
            System.out.print(arrayNumeros[i]+ ", ");
        }
        System.out.println("");
        int suma=funcionSumaArray ( arrayNumeros);
        System.out.println("La suma es: "+ suma);
        for (int i=0; i<arrayNumeros.length; i++) {
            System.out.print(arrayNumeros[i]+ ", ");
        }
    }

    static int funcionSumaArray (int[] arrayEntrada) { 
        int suma=0;
        for (int i=0; i<arrayEntrada.length; i++) {
            suma=suma+arrayEntrada[i];
        } 
        arrayEntrada[0]=6;
            return suma; 
        }
    }
