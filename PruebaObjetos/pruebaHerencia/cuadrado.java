package pruebaHerencia;

public class cuadrado extends figura {
    private int lado;
    cuadrado(int a){this.lado=a;}
    
    public int getArea(){return lado*lado;}
}
