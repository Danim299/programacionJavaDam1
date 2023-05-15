package Ejercicio1;

public class intercambiarEquipos {
    public static boolean intercambio(int a, int b, String[] array){
        String eq1=array[a];
        String eq2=array[b];
        for (int i = 0; i < array.length; i++) {
            array[a]=eq2;
            array[b]=eq1;
        }
        return true;
       
    }
}
