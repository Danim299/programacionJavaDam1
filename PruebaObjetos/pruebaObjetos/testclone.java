package pruebaObjetos;

public class testclone {
  
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(5,7);
        Rectangulo r2 = (Rectangulo) r1.clone();
        r2.incrementarAncho();
        r2.incrementarAlto();
       // r1.setNombre("Chiquito");
       // r2.setNombre("grande");
        System.out.println("Alto: "+r1.getAlto());
        System.out.println("Ancho: "+r1.getAncho());
        System.out.println("Alto: "+r1.getAlto());
        System.out.println("Ancho: "+r1.getAncho());
       // System.out.println("Nombre: "+r1.getNombre());
       // System.out.println("Nombre  : "+r1.getNombre());
        
    }
    
}
