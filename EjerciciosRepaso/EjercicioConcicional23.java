package EjerciciosRepaso;
import java.util.*;
public class EjercicioConcicional23 {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
        System.out.print("Introduzca el mes de nacimiento[numero del mes]: ");
        int mes = in.nextInt();
        System.out.print("Introduzca el dia de nacimiento: ");
        int dia = in.nextInt();
        if (mes==1){
            if(dia>=20){
                System.out.println("Acuario");
            }else if(dia<=19){
                System.out.println("Capricornio");
            }
        }else if (mes==2){
            if(dia<=18){
                System.out.println("Acuario");
            }else if (dia>=19){
                System.out.println("Piscis");
            }
        }else if(mes==3){
            if(dia<=20){System.out.println("Piscis");
            }else if(dia>=21){System.out.println("Aries");}
        }else if(mes==4){
            if(dia<=19){
                System.out.println("Aries");
            }else if (dia>=20){System.out.println("Tauro");}
        }else if(mes==5){
            if(dia>=21){System.out.println("Geminis");
            }else if(dia<=20){
            System.out.println("Tauro");
            }
        }else if(mes==6){
            if(dia<=20){
                System.out.println("Geminis");
            }else if (dia>=21){
                System.out.println("Cancer");
            }
        }else if (mes==7){
            if(dia<=22){
                System.out.println("Cancer");
            }else if(dia>=23){
                System.out.println("Leo");
            }
        }else if (mes==8){
            if(dia<=22){
                System.out.println("Agosto");
            }else if(dia>=23){System.out.println("Virgo");}
        }else if (mes==9){
            if (dia<=22){
                System.out.println("Virgo");
            }else if (dia>=23){System.out.println("Libra");}
        }else if(mes==10){
            if(dia<=22){
                System.out.println("Libra");
            }else if (dia>=23){System.out.println("Escorpio");}
        }else if(mes==11){
            if(dia<=21){System.out.println("Escorpio");
            }else if (dia>=22){
                System.out.println("Sagitario");
            }
        }else if (mes==12){
            if(dia>=22){
                System.out.println("Capricornio");
            }else if (dia<=21){
                System.out.println("Sagitario");
            }
        }
    }
    
}
