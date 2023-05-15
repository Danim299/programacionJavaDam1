package EjerciciosRepaso;
import javax.swing.*;
public class EjercicioMath11 {

    public static void main(String[] args) {
       int a= 0;
       int b=0;
       int c=0;

       a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
       b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));
       c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de c: "));
       double det=Math.pow(b, 2)-(4*a*c);
       if (det>0){
           double x1=((b*(-1))+Math.sqrt(det))/(2*a);
           double x2=((b*(-1))-Math.sqrt(det))/(2*a);
           System.out.println("El valor de x1= "+x1);
           System.out.println("El valor de x2= "+x2);
       }else{
           System.out.println("El determinante es engativo no se puede completar la operacion");
       }
    
    }
}
