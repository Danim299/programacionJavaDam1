package EjercicioHerencia;

public class individuales extends vehiculo {
    private int numRuedas;
    
    public static void pitar(){System.out.println("Pi-Pi-Pi-Pi-Pi-PiPi-Pi-Pi-Pi-Pi-Pi-Pi-Pi-Pi-Pi-Pi-Pi-Pi-Pi-Pi");}

    public int getNumRuedas() {
        return numRuedas;
    }

    @Override
    public String toString() {
        return "individuales{" + "numRuedas=" + numRuedas + '}';
    }
    
    public individuales(int numRuedas, String matricula, String modelo) {
        super(matricula, modelo);
        this.numRuedas = numRuedas;
    }

    
}
