
package practicavisibilidad;

public class Persona {
    
    private String nombre;
    private String apellido;
    private String localidad;
    private int edad;
    private static int cont1;
    private int cont2;
    
    public Persona(String nombre, String apellido){this.nombre=nombre;this.apellido=apellido;cont1++;cont2++;}
    //public Persona(){}
    
    public void saludar(){
        System.out.println("Hola "+this.nombre+" "+this.apellido);
    }
    public void setLocalidad(String localidad){
        this.localidad=localidad;
    }
    
    public String getLocalidad(){
        return this.localidad;
    }
    
    public int getEdad(){
     return this.edad;
    }
    
    public int getcont1(){return this.cont1;}
    public int getcont2(){return this.cont2;}
    
    public boolean decirMayorEdad(){
        if(this.edad>=18)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        Persona p = new Persona("Daniel", "Medina");
        p.saludar();

        Persona p2 = new Persona("Daniel", "Medina");
        p2.saludar(); 
        p2.setLocalidad("Cuellar");
        System.out.println("Localidad: "+p2.getLocalidad());
        System.out.println("Mayor de edad: "+p2.decirMayorEdad());
    }
    
}
