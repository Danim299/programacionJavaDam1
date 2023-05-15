package EjerciciosOO;

public class ClaseEjB {
    private int dato1;
    private double dato2;
    private static int contador=0;
    
    
    ClaseEjB(int d1, double d2){
        this.dato1=dato1;
        this.dato2=dato2;
        contador++;
    }

    public int getDato1() {
        return this.dato1;
    }

    public double getDato2() {
        return this.dato2;
    }

    public static int getContador() {
        return contador;
    }
    
    ClaseEjB(){
        dato1=0;
        dato2=0;
        contador++;
    }
    
    
}
