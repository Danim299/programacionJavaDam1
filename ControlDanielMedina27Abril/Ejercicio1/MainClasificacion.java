package Ejercicio1;

import static Ejercicio1.generarEquipos.generar;
import static Ejercicio1.inicializarVacio.inicializar;
import static Ejercicio1.intercambiarEquipos.intercambio;
import static Ejercicio1.mostrarClasificacion.mostrar;
import java.util.Scanner;

public class MainClasificacion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cEquipos;
        System.out.println("Como quieres crear los equipos?\n1- Introducir\n2- Generar aleatorios");
        cEquipos=in.nextInt();
        
        if(cEquipos==1){
        
        System.out.println("Cuantos equipos quieres?");
        int tEquipos = in.nextInt();
        int[] array = new int[tEquipos];
        int opc;
        String[] arrayEquipos = new String[tEquipos];
        
        
        for (int i = 0; i < array.length; i++) {
            in.nextLine();
            System.out.print("Dame el equipo que va en posicion "+i+" ");
            arrayEquipos[i]=in.nextLine();
        }
        System.out.println("Creacion de equipos es: "+inicializar(array.length));
        System.out.println("Enter para continuar\n");in.nextLine();
        System.out.println("Ahora que quieres hacer?\n1- Mostrar Clasificacion\n2- Intercambiar equipos\n3- Salir");
        opc=in.nextInt();
        if(opc==1){
            mostrar(arrayEquipos);
        }else if(opc == 2){
            System.out.print("Introduzca la posicion de los equipos que quiera intercambiar\nEquipo 1: ");
            int eq1 = in.nextInt();
            System.out.print("Equipo 2: ");
            int eq2 = in.nextInt();
            if (intercambio(eq1,eq2, arrayEquipos)==true){
                System.out.println("Intercambio correcto");
                for (int i = 0; i < arrayEquipos.length; i++) {
                    System.out.println("La clasificaion actual es: "+arrayEquipos[i]);
                }
            }
        }else if(opc==3){System.out.println("Has seleccionado salir, gracias por usarme");}
        
    }else if(cEquipos==2){
        System.out.println("Cuantos equipos quieres?");
        int nEquipos = in.nextInt();
        System.out.println("Ahora que quieres hacer?\n1- Mostrar Clasificacion\n2- Intercambiar equipos\n3- Salir");
        int opc=in.nextInt();
        if(opc==1){
            System.out.println("La clasificacion actual es:");
            for (int i = 0; i < generar(nEquipos).length; i++) {
                System.out.println(generar(nEquipos)[i]);
            }
        }else if(opc == 2){
            System.out.print("Introduzca la posicion de los equipos que quiera intercambiar\nEquipo 1: ");
            int eq1 = in.nextInt();
            System.out.print("Equipo 2: ");
            int eq2 = in.nextInt();
            if (intercambio(eq1,eq2, generar(nEquipos))==true){
                System.out.println("Intercambio correcto");
                for (int i = 0; i < generar(nEquipos).length; i++) {
                    System.out.println("La clasificaion actual es: "+generar(nEquipos)[i]);
                }
            }
        }else if(opc==3){System.out.println("Has seleccionado salir, gracias por usarme");}
    }else{
        System.out.println("Algo ha ido mal");
    }
  }
}
