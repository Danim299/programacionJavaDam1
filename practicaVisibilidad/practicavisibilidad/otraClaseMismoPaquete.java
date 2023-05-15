package practicavisibilidad;

public class otraClaseMismoPaquete {

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
