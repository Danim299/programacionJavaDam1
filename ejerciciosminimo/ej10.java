package ejerciciosminimo;

public class ej10 {
/*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for, while, do-while*/
    public static void main(String[] args) {
        int c = 0;
        while(c!=101){
            double resultao = c%5;
            if(resultao == 0){
                System.out.println("Er numero "+c+" es murtiplo de 5");
            }else{
                System.out.println("Er numero "+c+" no es murtiplo de 5");
            }
        c++;
        }
    }
    
}
