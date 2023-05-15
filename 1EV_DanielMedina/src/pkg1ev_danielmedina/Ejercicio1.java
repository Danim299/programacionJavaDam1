package pkg1ev_danielmedina;
import java.util.*;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //aqui vamos a dar toda la informacion necesaria al usuario y sus respuestas las almacenamos en res(num)
        System.out.println("Hola, vas a ser sometido a una encuesta a ver cuanto sabes de fútbol");
        System.out.println("Todas las respuestas se dan con números enteros");
        System.out.println("");
        System.out.println("¿Cuándo tuvo lugar la primera Copa Mundial de Fútbol?");
        System.out.print("Respuesta: ");
        int res1 = in.nextInt();
        System.out.println("Klose es el maximo goleador de la historia de la Copa Mundial de Fútbol,¿Con cuántos goles?");
        System.out.print("Respuesta: ");
        int res2 = in.nextInt();
        System.out.println("En qué año disputó el mundial de fútbol España");
        System.out.print("Respuesta: ");
        int res3 = in.nextInt();
        System.out.println("¿Cada cuántos años se celebra el mundial de fútbol?");
        System.out.print("Respuesta: ");
        int res4 = in.nextInt();
        System.out.println("¿Cuántos mundiales de fútbol ha ganado España?");
        System.out.print("Respuesta: ");
        int res5= in.nextInt();
        System.out.println("¿Cuántas finales ha disputado Alemania en un mundial de fútbol?");
        System.out.print("Respuesta: ");
        int res6 = in.nextInt();
        
        int resultado=0;//inicializo un "contador" de respuestas correctas
        if(res1>=0 && res2>=0 && res3>=0 && res4>=0 && res5>=0 && res6>=0){//comporbación de datos
        //aqui basicamente por respuesta correcta sumamos 1
        if(res1==1930){
            resultado = resultado+1;
        }
        if(res2==16){
            resultado = resultado+1;
        }
        if(res3==1982){
            resultado = resultado+1;
        }
        if (res4==4){
           resultado= resultado+1;
        }
        if(res5==1){
            resultado=resultado+1;
        }
        if(res6==8){
            resultado=resultado+1;
        }
            System.out.println("Tu puntuacion es de "+resultado);
        //comprobacion de del resultado para dar una "nota"
        if(resultado>=0 && resultado<=2){
            System.out.println("No sabes muucho de los mundiales de fútbol");
        }else if(resultado>=3 && resultado<=4){
            System.out.println("No está mal pero podrías saber más sobre mundiales de fútbol");
        }else if(resultado>=5 && resultado<=6){
            System.out.println("Sabes más de lo que parecía sobre mundiales de fútbol>");
        }
        }else{//Si se pone un número negativo en 1 de las respuestas el test seria erroneo y al finalizar te mostraria este mensaje
            System.out.println("Se a introducido un numero negativo, a si que el test es erroneo");
        }

    }    
}
