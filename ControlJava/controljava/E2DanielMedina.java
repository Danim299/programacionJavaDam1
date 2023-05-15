package controljava;

import java.util.Scanner;

public class E2DanielMedina {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto[0000 para salir]: ");
        String cadena = in.next();
        while(!"0000".equals(cadena)){
        caracteres(cadena);
        }
        
    }
   public static boolean vacia(String cad){
       if("".equals(cad)){
           return true;
       }else{
           return false;
       }
   }
   public static String caracteres(String carac){
       int suma=0;
       for (int i = 0; i <= carac.length(); i++) {
           carac.charAt(i);
           suma++;
           if(carac.charAt(i)==carac.length()){
               System.out.print("El Ultimo caracter es: "+carac.charAt(i));
           }
       }
       /*
       String sumac = sumac.indent(suma);*/
       return carac;
   }
}
