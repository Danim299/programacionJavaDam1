package EjerciciosOO;

public class Calculadora {
    private double suma;
    private double resta;
    private double multi;
    private double division;
    
    Calculadora (double n1, double n2){
        this.suma=n1+n2;
        this.resta=n1-n2;
        this.multi=n1*n2;
        this.division=n1/n2;
    }
    
    public double getSuma() {
        return suma;
    }

    public double getResta() {
        return resta;
    }

    public double getMulti() {
        return multi;
    }

    public double getDivision() {
        return division;
    }
    Calculadora (){
        System.out.println("No me has dado parametros");
    }
}
