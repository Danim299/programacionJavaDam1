package pruebainterfaces;

public class rectangulo implements figura {
    private int ancho;
    private int alto;
    rectangulo(int a, int b){
        this.ancho=a;
        this.alto=b;
    }
    public int area(){
        return this.ancho*this.alto;
    }
}