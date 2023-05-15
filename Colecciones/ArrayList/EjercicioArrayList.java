package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayList {
/*
Realiza una aplicación que sea capaz de memorizar las palabras que el usuario le va diciendo (puede ser con entorno gráfico o no).
En el menú del programa, el usuario podrá:
-Introducir una palabra.
-Ver todas las palabras.
-Buscar una palabra. Si la palabra existe el programa le permitirá borrarla o no según quiera el usuario.    
    
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList();
        System.out.print("Introduce palabras, voy a memorizar todas hasta que introduzcas [0]\nLuego podrás mostrar todas o buscar una para borrarla o visualizarla\nIntroduce la palabra: ");
        String opc = in.nextLine();
        lista.add(opc);
        while(true){
            int devol = opc.compareToIgnoreCase("0");
            if(devol!=0){
            System.out.print("Introduce la palabra: ");
            opc = in.nextLine();
            lista.add(opc);
            }else{
                lista.remove(lista.lastIndexOf(opc));
                break;
            }
        }
        System.out.println("Ahora que quieres hacer\n[1]-Mostrar la lista\n[2]-Buscar palabra en la lista\n[0]-Salir");
        int opc1 = in.nextInt();
        while(opc1!=0){
            if(opc1==1){
                in.nextLine();
                System.out.println("Esta es tu lista completa: "+lista+"\n[1]-Mostrar la lista\n[2]-Buscar palabra en la lista\n[0]-Salir"+"\nAhora que hacemos?");
                opc1 = in.nextInt();
            }else if(opc1==2){
                in.nextLine();
                System.out.println("Elige la palabra que quieres buscar: ");
                String opc3= in.nextLine();
                for (int i = 0; i < lista.size(); i++) {
                    if(lista.get(i).equals(opc3)){
                        System.out.println("Ahora que quieres hacer\n[1]-Borrar\n[2]-Visualizar la palabra\n[0]-Salir");
                        int opc4 = in.nextInt();
                        in.nextLine();
                        if(opc4 == 1){
                            lista.remove(opc3);
                            System.out.println("Tu lista sin esa palabra: "+lista);
                        }else if(opc4==0){
                            System.out.println("Gracias por usar el programa");
                            break;
                        }else if(opc4==2){
                            System.out.println("Esta es la palabra: "+lista.get(i));
                        }
                        System.out.println("Ahora que quieres hacer\n[1]-Mostrar la lista\n[2]-Buscar palabra en la lista\n[0]-Salir");
                        break;
                        }
                    } 
                    opc1 = in.nextInt();
            }else{
                System.out.println("Dato u opcion incorrecta");
                opc1=in.nextInt();
            }
        }
        System.out.println("Saliendo, gracias por usar el programa");
    }
    
}
