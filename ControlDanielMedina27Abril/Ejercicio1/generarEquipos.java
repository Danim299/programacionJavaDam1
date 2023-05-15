package Ejercicio1;

public class generarEquipos {
    public static String[] generar(int a){
        String[] aEquiposA= new String[a];
        
        for (int i = 0; i < aEquiposA.length; i++) {
            aEquiposA[i]= "Equipo"+i;
        }
        return aEquiposA;
    }
}
