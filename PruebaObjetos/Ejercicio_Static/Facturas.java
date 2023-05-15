package Ejercicio_Static;

public class Facturas {
    public static double totalConIVA(double a){
        double ivaAplicado = a*1.21; 
        return ivaAplicado;
    }
    
    public static double primerPago(double a){
        double pago = totalConIVA(a)*0.6;
        return pago;
    }
    
    public static double segundoPago(double a){
        double pago = totalConIVA(a)*0.4;
        return pago;
    }
    
    public static void fraccionarPago(double a){
        System.out.println("El pago total con IVA es: "+totalConIVA(a));
        System.out.println("El primer pago será de: "+primerPago(a));
        System.out.println("El segundo pago será de: "+segundoPago(a));
    }
    
    public static boolean esPosibleFraccionar(String a, double b){
    
    if("NO".equalsIgnoreCase(a)){
        System.out.println("No puedes fraccionarlo, el total es: "+totalConIVA(b));
    return false;
    
    }else if("Hasta500".equalsIgnoreCase(a)){
        if(b>500){
            System.out.println("Te pasas de 500€, no puedes fraccionarlo, el total será: "+totalConIVA(b));
            return false;
        }else{
            return true;
        }
    }else if("TodoLoQueQuiera".equalsIgnoreCase(a)){
        return true;
    }else{
        System.out.println("Valor erróneo");
        return false;
    }
 }
}
