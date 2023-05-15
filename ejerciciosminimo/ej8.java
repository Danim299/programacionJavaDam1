package ejerciciosminimo;

public class ej8 {
/*Sea un Keygen (generador de contraseñas aleatorio) de 3 cifras y una vocal concatenada.*/
    public static void main(String[] args) {
        int c = (int)(1+Math.random()*4.99);
        char vocal = ' ';
        switch (c) {
            case 1:
                vocal='A';
                break;
            case 2:
                vocal='E';
                break;
            case 3:
                vocal='I';
                break;
            case 4:
                vocal='O';
                break;
            case 5:
                vocal='U';
                break;
            default:
                break;
        }
        System.out.println((int)(1+Math.random()*9)+""+(int)(1+Math.random()*9)+""+(int)(1+Math.random()*9)+""+vocal);
    }
}
