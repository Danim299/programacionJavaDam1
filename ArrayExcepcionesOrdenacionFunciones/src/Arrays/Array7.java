package Arrays;

public class Array7 {
    public static void main(String[] args) { 
// Programa para clonar de arrays unidimensionales      
             int intArray[] = {1,2,3}; //Array original 
             int cloneArray[] = intArray.clone(); 
                     //Array para clonar 
                     System.out.println(intArray == cloneArray); // Será false al estar clonado 
                     for (int i = 0; i < cloneArray.length; i++) { 
                         System.out.print(cloneArray[i]+" "); 
                     }
        }
    }
