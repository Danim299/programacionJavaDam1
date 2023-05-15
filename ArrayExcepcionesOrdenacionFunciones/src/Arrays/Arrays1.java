package Arrays;

public class Arrays1 {

    public static void main(String[] args) {
        /*int[] arrayDeEnteros = new int[4];
        String[] array2 = new String[5];
        array2[0]="hola";
        array2[1]="Dani";
        array2[2]="que";
        array2[3]="tal";
        array2[4]="estas";*/
        /*String[] array3={"hola","dani","que","tal","estas"};*/
        
        int[] arrayenteros=new int[4];
        
        for(int i = 0; i <arrayenteros.length; i++) {
            arrayenteros[i]=(int)Math.pow(2,i+1);
            System.out.println(arrayenteros[i]); 
        }
    }
    
}
