package controljava;

public class E1DanielMedina {

    public static void main(String[] args) {
        int contador = 0;
        /*A efectos práctico nos sirve con copiar y pegar en ese orden, pero podríamos optimizar mas este pograma, en cuestion de tiempo para mi ha sido más facil 
        hacer esto ya que lo repite 2 veces las 4 funciones sin ningún tipo de problema
        */
        do{
        contador++; 
        funcion1(contador);
        contador++;
        funcion2(contador);
        contador++;
        funcion3(contador);
        contador++;
        funcion4(contador);
        }while(contador!=8);
    }
    /*En las funciones las ponemos que sean void ya que no quiero que me retornen un dato, simplemente con la String y 
    introduciendo el dato de "orden" que sería contador nos basta
    */
    public static void funcion1( int orden){
            System.out.println("F1 "+"en orden "+orden);
    }
    public static void funcion2( int orden){
           System.out.println("F2 "+"en orden "+orden);
    }
    public static void funcion3( int orden){
           System.out.println("F3 "+"en orden "+orden);
    }
    public static void funcion4( int orden){
           System.out.println("F4 "+"en orden "+orden);
    }
}
