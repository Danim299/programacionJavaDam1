package Ejercicio1;

import java.util.Scanner;

public class Clasificacion {
    private static String[] clasificacionEquipos;

    public static String[] getEquipos() {
        return Clasificacion.clasificacionEquipos;
    }

    public static void setEquipos(String[] Equipos) {
        Clasificacion.clasificacionEquipos = Equipos;
    }
    
    public static boolean inicializarVacio(int numEquipos){
        if (numEquipos>1){
        try{
        clasificacionEquipos = new String[numEquipos];
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= clasificacionEquipos.length ; i++) {
            System.out.print("Dame el equipo "+i+": ");
            clasificacionEquipos[i]=in.nextLine();
            return true;
        }} catch(Exception e){
            return false;
        }
        }else{
            return false;
        }
        return false;
    }
}
