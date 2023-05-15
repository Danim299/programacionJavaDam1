package Arrays;

public class Array6 {

    public static void main(String[] args) {
        int i;
        int num1[] = new int[10];
        int num2[] = new int[10];
        for (i = 0; i < 10; i++) {
            num1[i] = i;
        }
        for (i = 0; i < 10; i++) {
            num2[i] = -i;
        }
        System.out.print("num1: ");
        for (i = 0; i < 10; i++) {
            System.out.print(num1[i] + " ");
        }
        System.out.println();
        System.out.print("num2: ");
        for (i = 0; i < 10; i++) {
            System.out.print(num2[i] + " ");
        }
        System.out.println();
        num2 = num1; //Asignación de referencias        
        System.out.print("num2 después: ");        
        for (i=0; i<10 ; i++)           
            System.out.print(num2[i] + " ");
        System.out.println(); //ahora opera el array num1 a través de num2      
        num2[0]=99;       
        System.out.print("num1 después: ");        
        for (i=0; i<10 ; i++)          
            System.out.print(num1[i]  + " ");        
        System.out.println();    
        
    }
    
}
