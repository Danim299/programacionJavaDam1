package EjercicioHerencia;

public class colectivos extends vehiculo{
    private int cantPas;

    public colectivos(int cantPas, String matricula, String modelo) {
        super(matricula, modelo);
        this.cantPas = cantPas;
    }

    public int getCantPas() {
        return cantPas;
    }

    @Override
    public String toString() {
        return "colectivos{" + "cantPas=" + cantPas + '}';
    }
    
    
}
