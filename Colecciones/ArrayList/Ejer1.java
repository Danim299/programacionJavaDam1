package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejer1 {

    public static void main(String[] args) {
        ArrayList<Ejer1Producto> lista = new ArrayList<>(); 
        lista.add(new Ejer1Producto("a", 1));
        lista.add(new Ejer1Producto("b", 2));
        lista.add(new Ejer1Producto("c", 3));
        lista.add(new Ejer1Producto("d", 4));
        lista.add(new Ejer1Producto("e", 5));

        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i).getNombre()+" ");
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i).getCantidad()+" ");
        }
        lista.remove(1); 
        lista.remove(2); 

        lista.add(2, new Ejer1Producto("f", 6)); 

        System.out.println("");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i).getNombre()+" ");
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i).getCantidad()+" ");
        }
        lista.clear();
    }


}