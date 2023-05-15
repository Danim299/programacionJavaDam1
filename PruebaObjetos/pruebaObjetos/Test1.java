package pruebaObjetos;

public class Test1 {
    public int dado=0;
    public static int datostatico=0;
    public void metodo(){this.datostatico++;}
    public static void metodostatico(){
            //this.datostatico++; //da error al compuilar porque es estático
            datostatico++;
    }
    public static void main(String[] args) {
        //dato++; //da error al compilar
        datostatico++;
        metodostatico();
        //metodo(); //da error al compilar
    }
    
}
