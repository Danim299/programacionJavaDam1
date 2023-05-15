package Arrays;

public class Array8 {

    public static void main(String[] args) {
        int intArray[] = {9, 8, 7, 6, 5}; //Array original 
        int cloneArray[] = new int[4]; //Array destino sin la misma longitud 
        System.arraycopy(intArray, 1, cloneArray, 1, 2); //Copiado del array 
        System.out.println(intArray == cloneArray); // Será false al ser copia 
        for (int i = 0; i < cloneArray.length; i++) { System.out.print(cloneArray[i]+" "); }
    }

}
