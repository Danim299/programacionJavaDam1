package ArraysEj2;

public class ArrayEj4 {

    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        for (int i = 0; i < numero.length; i++) {
            numero[i]=(int)(Math.random()*99.99);
            cuadrado[i]=(int)(Math.pow(numero[i],2));
            cubo[i]=(int)(Math.pow(numero[i],3));
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Numero: "+numero[i]+"\nSu cuadrado es: "+cuadrado[i]+"\nSu cubo es: "+cubo[i]);
            System.out.println("");
        }

    }
    
}
