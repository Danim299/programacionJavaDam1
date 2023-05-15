package Arrays;

public class ArrayEj60 {

    public static void main(String[] args) {
        double[] array = new double [10];
        double media = 0;
        for (int i = 0; i < array.length; i++) {
                array [i] = Math.random()*9.9+1;
                media = media + array[i];
            }
        media = media/array.length;
        if(media<5 && media>=0){
            System.out.println("Has suspendido");
            System.out.println(Math.floor(media));
        }else if(media>=5 && media<7){
            System.out.println("Tienes un bien");
            System.out.println(Math.floor(media));
        }else if (media>=7 && media<9){
            System.out.println("Tienes un notable");
            System.out.println(Math.floor(media));
        }else if (media>=9 && media<=10){
            System.out.println("Tienes un sobresaliente");
            System.out.println(Math.floor(media));
        }else{
            System.out.println(Math.floor(media));
        }
        
    }
    
}
