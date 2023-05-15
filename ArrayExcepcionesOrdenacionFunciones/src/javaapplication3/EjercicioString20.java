package javaapplication3;
import java.util.*;
public class EjercicioString20 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String cont= "perro";
        System.out.print("Introduce la contraseña: ");
        String comp=in.nextLine();
        int comp1=comp.compareToIgnoreCase(comp);
        int cont1 = Integer.parseInt(cont);
        if(cont1==comp1){
            System.out.println("contraseña correcta");
        }else{System.out.println("contraseña incorrecta");}
    }  
}
