package EjercicioHerencia;

public class autobus extends colectivos{
    private boolean aire;
    
    public autobus(boolean aire, int cantPas, String matricula, String modelo) {
        super(cantPas, matricula, modelo);
        this.aire=aire;
    }

    public boolean isAire() {
        return aire;
    }

    public void setAire(boolean aire) {
        this.aire = aire;
    }

    @Override
    public String toString() {
        return "autobus{" + "aire=" + aire + '}';
    }
    
}
