package pruebaObjetos;



public class pajaro {
      private static int numpajaros=0;
      private char color; //Propiedad o atributo de color
      private int edad; //Propiedad o atributo de edad
      pajaro(){color='v';edad=0;nuevoPajaro();} 
      pajaro(char c, int e){color=c;edad=e;nuevoPajaro();}
      static void nuevoPajaro(){numpajaros++;}
      static void muestraPajaros(){System.out.println(numpajaros);}
      public static void main(String[] args){
          pajaro p1, p2;
          p1=new pajaro();
          p2=new pajaro('a',3);
          p1.muestraPajaros();
          p2.muestraPajaros();
      }
}
