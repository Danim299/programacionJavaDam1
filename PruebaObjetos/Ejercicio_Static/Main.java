package Ejercicio_Static;

import static Ejercicio_Static.Facturas.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Asignacion de variables
        Scanner in = new Scanner(System.in);
        double cantidad;
        double cantidadT = 0;
        String fraccionar;
        
        //Código
        try{
        System.out.println("Introduce los precios, cuando termines introduce 0: ");
        cantidad = in.nextDouble();
        //Suma de precios
        while(cantidad!=0){
        cantidadT = cantidadT+cantidad;
        cantidad = in.nextDouble();
        }
            System.out.println(cantidadT);
        //Fracción de pago
        System.out.println("Quieres fraccionar el pago [S/N]");
        fraccionar = in.next();
        //Tipo de deuda
        if("S".equalsIgnoreCase(fraccionar)){
            
            System.out.println("Introduce la categoria de deuda que tienes\nCon dato [No] no podrás fraccionarlo\nCon la categoría [Hasta500] lo fraccionas hasta un límite de 500€\nCon [TodoLoQueQuiera] puedes fraccionar sin límite:");
            String deuda = in.next();
            
            if(esPosibleFraccionar(deuda, cantidadT)==true){
               totalConIVA(cantidadT); primerPago(cantidadT); segundoPago(cantidadT); fraccionarPago(cantidadT); 
            }
            
        }else if("N".equalsIgnoreCase(fraccionar)){
            System.out.println("El total a pagar: "+totalConIVA(cantidadT));
        }
        
    }catch(Exception e){System.out.println("Dato Erroneo");}
  }  
}
