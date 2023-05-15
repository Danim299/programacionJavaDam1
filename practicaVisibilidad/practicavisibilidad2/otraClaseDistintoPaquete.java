package practicavisibilidad2;

import practicavisibilidad.Persona;

public class otraClaseDistintoPaquete {

    public static void main(String[] args) {
        Persona p = new Persona("Daniel", "Medina");
        p.saludar(); 
        p.setLocalidad("Cuellar");
        System.out.println("Localidad: "+p.getLocalidad());
        System.out.println("Mayor de edad: "+p.decirMayorEdad());
        
        Persona p2 = new Persona("Daniel", "Medina");
        p2.saludar(); 
        p2.setLocalidad("Cuellar");
        System.out.println("Localidad: "+p2.getLocalidad());
        System.out.println("Mayor de edad: "+p2.decirMayorEdad());
        
        Persona p3 = new Persona("Daniel", "Medina");
        p2.saludar();
        Persona p4 = new Persona("Daniel", "Medina");
        p2.saludar(); 
        
        System.out.println("cont1: "+p.getcont1());
        System.out.println("cont2: "+p.getcont2());
    }
    
}
