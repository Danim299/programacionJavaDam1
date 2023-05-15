
package figurasAbstractas;

public abstract class Figura {
    private String color;

    public String getColor() {
        return color;
    }

    public Figura(String color) {
        this.color = color;
    }
    public abstract double calcularArea();
}
