package pkg1ev_danielmedina;
import java.util.*;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double RANDOM = Math.floor(1+Math.random()*3);//genero un número del 1-3 y lo aproximo con el floor
        System.out.println("Dime de qué equipo eres: ");
        System.out.println("1.- Real Valladolid.");
        System.out.println("2.-Burgos CF.");
        System.out.println("3.-Ponferradina.");
        System.out.print("Elige una opcion [1-3]: ");
        System.out.println("");
        int equipo = in.nextInt();
        //aqui una vez dados todos los datos hacemos comprobaciones con el número del usuario
        if (equipo>=1 && equipo<=3){
        switch(equipo){
            case 1:
                System.out.println("Un pucelano, a ver si no bajamos");
                break;
            case 2:
                System.out.println("Ole ese Burgos bueno");
                break;
            case 3:
                System.out.println("Bua la Ponferradina, vaya fieras");
                break;
        }
        //Este bucle es para generar otro número en caso de que se igual al equipo
        while(RANDOM==equipo){
        RANDOM = Math.floor(1+Math.random()*3);
        }
        //aqui se hace la comprobacion del equipo
        if (RANDOM==1.0){
            System.out.println("Soy del pucela");
        }else if(RANDOM==2.0){
            System.out.println("Soy del Burgos");
            
        }else if(RANDOM==3.0){
            System.out.println("Soy de la Ponferradina");
        }
        }else{//basicamente si no es del 1-3 pues nos saca este error
        System.out.println("No me cuadra la opcion dije del 1-3");
        }
        
    }    
}
