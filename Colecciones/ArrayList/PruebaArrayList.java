package ArrayList;

import java.util.ArrayList;

public class PruebaArrayList {

    public static void main(String[] args) {
        ArrayList/*<Integer> para hacer que la arraylist tenga un tipo de dato*/ lista = new ArrayList();
        lista.add(-25);
        lista.add("Dani");
        lista.add(0, 4);
        lista.add("Pedro");
        System.out.println(lista);
        System.out.println("Longitud: "+ lista.size());
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i)+" ");
        }
        
    }
    
}
