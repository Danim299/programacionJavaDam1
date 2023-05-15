package EjercicioHerencia;

public class coche extends colectivos{
    private double velMax;
    public coche(double velMax, int cantPas, String matricula, String modelo) {
        super(cantPas, matricula, modelo);
        this.velMax=velMax;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    @Override
    public String toString() {
        return "coche{" + "velMax=" + velMax + '}';
    }
    
}
