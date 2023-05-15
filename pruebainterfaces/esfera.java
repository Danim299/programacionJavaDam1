package pruebainterfaces;

public class esfera{
    private int radio;

    esfera(int r){
        this.radio=r;
    }
    
    public int area(){
        return (int)(Math.PI*Math.pow(this.radio, 2));
    }
}
