package excepciones;

public class Excepcion2 {

    public static void main(String[] args) {
        int i=1, o=0, d=-1;
        
        try{
            d = i/o;
            System.out.println("La ej no llega aca");
        }
        catch(Exception e)
        {
            System.out.println("Una excepçao "+e);
        }
        System.out.println("La diviçao: "+d);
    }
    
}
