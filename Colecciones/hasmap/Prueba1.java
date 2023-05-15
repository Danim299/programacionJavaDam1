package hasmap;

import java.util.HashMap;

public class Prueba1 {

    public static void main(String[] args) {
        HashMap agenda = new HashMap();
        agenda.put("Carlos", 123456);
        agenda.put("Ana", 456789);
        System.out.println(agenda.get("Ana"));
        System.out.println(agenda.containsKey("Ana"));
        System.out.println(agenda.keySet());
        System.out.println(agenda.values());
        
    }
    
}
