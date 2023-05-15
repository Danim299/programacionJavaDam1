package hasmap;

import java.util.HashMap;
import java.util.Iterator;

public class Ejemplo1 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Casillas");
        map.put(15, "Ramos"); 
        map.put(3, "Pique");
        map.put(5, "Puyol"); 
        map.put(11, "Capdevila");
        map.put(14, "Xabi Alonso"); 
        map.put(16, "Busquets");
        map.put(8, "Xavi Hernandez"); 
        map.put(18, "Pedrito");
        map.put(6, "Iniesta");
        map.put(7, "Villa");
        Iterator<Integer> it = map.keySet().iterator();// Imprimimos el Map con un 
        while(it.hasNext()){  
            Integer key = it.next();  
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }
    }
    
}
