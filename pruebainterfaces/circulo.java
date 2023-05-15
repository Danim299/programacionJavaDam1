package pruebainterfaces;

public class circulo implements figura {
    private int radio;

    circulo(int r){
        this.radio=r;
    }
    public int area(){
        return (int)(Math.PI*Math.pow(this.radio, 2));
    }
}
