package pkg1ev_danielmedina;
import java.util.*;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double RANDOM = Math.floor(1+Math.random()*10);//Genero el número 1-10 y lo aproximo con el floor
        System.out.println("Vamos a jugar un juego");
        System.out.println("Voy a pedirte números del 1-10 y yo voy a ir generando también, cuando sean iguales pararé");
        System.out.println("");
        System.out.print("Introduce un número: ");
        double numUser= in.nextDouble();
        
        //vamos a realizar este bucle hasta que el número sea igual, mínimo al estar con el do se ejecutará 1 vez
        do{
        if (numUser>=1.0 && numUser<=10.0){
            if(numUser>RANDOM){//hacemos comprobaciones para dar si es mayor, menor e igual
                System.out.println("Tu número es mayor que el mío");
                System.out.println("Yo he generado: "+RANDOM+" y tu has seleccionado"+numUser);
            }else if (numUser<RANDOM){
                System.out.println("Tu número es menor que el mío");
                System.out.println("Yo he generado: "+RANDOM+" y tu has seleccionado"+numUser);
            }
            if (numUser==RANDOM){
                System.out.println("El número es igual a si que salimos");
            }
            RANDOM = Math.floor(1+Math.random()*10);//aqui lo vuelvo a generar para que no sea el mismo ya que se lo decimos al usuario
            System.out.print("Introduzca de nuevo un número: ");
            numUser= in.nextDouble();
        
        }else{//Si no introduce entre los números indicados nos muestra el mensaje y basicamente nos lo vuelve a pedir
            System.out.println("Dije del 1-10");
            System.out.print("Introduzca de nuevo: ");
            numUser= in.nextDouble();
        }
    
        }while(numUser!=RANDOM);//mientras sean distintos los números ejecutará el bucle
    }
}
