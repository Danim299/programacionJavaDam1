package EjercicioHerencia;

public class moto extends individuales{
    private String color;
    
    public moto(String color, int numRuedas, String matricula, String modelo) {
        super(numRuedas, matricula, modelo);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "moto{" + "color=" + color + '}';
    }
    
}
