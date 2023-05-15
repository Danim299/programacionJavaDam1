package pruebaObjetos;

public class Rectangulo implements Cloneable {
    private int ancho = 100;
    private int alto = 100;
    private String nombre;
    
    public Object clone(){
        Object objeto =null;
        try{
            objeto = super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println("Error al clonar");
        }
        return objeto;
    }
      
    Rectangulo (int ancho, int alto) { /*Constructores*/
        this.ancho = ancho;
        this.alto = alto;
    }
    Rectangulo(){}
    
    public int getAncho() {return ancho;}
    public int getAlto() {return alto;}
    
    public Rectangulo incrementarAncho(){
        ancho++;
        return this;
    }
    public Rectangulo incrementarAlto(){
        alto++;
        return this;
    }
    
public static void main(String[] args){
    /*
        Rectangulo r = new Rectangulo(2,3);
        System.out.println("R1 "+r.getAncho()+", "+r.getAlto());
        
        Rectangulo r2 = new Rectangulo();
        System.out.println("R2 "+r2.getAncho()+", "+r2.getAlto());
        
        Rectangulo r3 = r2.incrementarAlto();
        System.out.println("R3"+r3);*/
    
        Rectangulo r1 = new Rectangulo(5,7);
        Rectangulo r2 = (Rectangulo) r1.clone();
        Rectangulo r3 = r1;
        r2.incrementarAncho();
        r2.incrementarAlto();
        //r1.setNombre("Chiquito");
        //r2.setNombre("grande");
        System.out.println("Alto: "+r1.getAlto());
        System.out.println("Ancho: "+r1.getAncho());
        System.out.println("Alto: "+r1.getAlto());
        System.out.println("Ancho: "+r1.getAncho());
       // System.out.println("Nombre: "+r1.getNombre());
       // System.out.println("Nombre  : "+r1.getNombre());
    }
}