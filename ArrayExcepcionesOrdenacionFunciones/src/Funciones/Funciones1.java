package Funciones;

public class Funciones1 {

    public static void main(String[] args) {
        System.out.println("Hola Mundo desde main");
        imprimeHolaMundo();
        imprimeHolaNombre("Dani");
        imprimeHolaNombre("Lucia");
        System.out.println("El maximo es: "+maximo(2,3));
        System.out.print("La multiplicacion es: "+multiplica(2,3));
        System.out.println("");
        System.out.print("El doble es: "+doble(2));
        System.out.println("");
    }
    
public static void imprimeHolaMundo(){
        System.out.println("Hola Mundo desde funcion");
    }
public static void imprimeHolaNombre(String nombre){
        //String nombre="Dani";
        System.out.println("Hola "+nombre);
    }
public static double maximo(double a, double b){
        double max;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        return max;
    }
public static int multiplica(int a, int b){
        int resultado= a*b;
        return resultado;
    }
public static int doble(int a){
        int resultado= a*2;
        return resultado;
    }
}