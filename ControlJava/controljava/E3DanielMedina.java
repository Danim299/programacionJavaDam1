package controljava;

import java.util.Scanner;

public class E3DanielMedina {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Datos*/
        System.out.println("Introduce tu nombre");
        String nom = in.next();
        System.out.println("Intrduce la hora");
        int hora = in.nextInt();
        System.out.println("Introduce los minutos");
        int minutos = in.nextInt();
        /*filtro*/
        if(hora<0 && hora>23) {
            System.out.println("Debes introducir un valor correcto del 0-23");
        }else if(minutos<0 && minutos >59){
            System.out.println("debes introducir un valor correcto del 0-59");
        }
        /*llamamos a la función que nos saludará dependiendo de los datos introducidos*/
        saludo(hora, minutos);
        /*
        String [] nombre = {nom};
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("En forma de array "+nombre[i].charAt(i)+" ");
        }*/
    }
    public static void saludo(int a, int b){
        if((a>=8 && a<=13) && (b==0 || b>=1)){
            System.out.println("Buenos dias");
        }else if((a>=13 && a<=20)&&(b==0 || b>=1)){
            System.out.println("Buenas tardes");
        }else if((a>=20 && a<=8)&&(b==0 || b>=1)){
            System.out.println("Buenas noches");
        }
    }
}
