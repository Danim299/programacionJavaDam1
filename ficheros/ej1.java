package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ej1 {
    public static void main(String[] args) {
         String ruta;
        do{
            System.out.println("Introduce la ruta: ");
            Scanner in = new Scanner(System.in);
            ruta= in.nextLine();
            File rutaFile = new File(ruta);
             try {
                 muestraInfoRuta(rutaFile);
             } catch (FileNotFoundException ex) {
                 System.out.println(ex);
             }
        
        }while(ruta.compareToIgnoreCase("")!=0);
    }

    private static void muestraInfoRuta(File rutaFile) throws FileNotFoundException {
        rutaFile.isFile();
        if(rutaFile.isFile()){
            System.out.println("Nombre del archivo"+rutaFile.getName());
        }
        if(rutaFile.isDirectory()){
            File[] lista = rutaFile.listFiles();
            for (int i = 0; i < lista.length; i++) {
                if(lista[i].isDirectory()){
                    System.out.println("[*] "+lista[i].getName());
                }
            }
            for (int i = 0; i < lista.length; i++) {
                if(lista[i].isFile()){
                    System.out.println("[A] "+lista[i].getName());
                }
            }
        if(!rutaFile.exists()){throw new FileNotFoundException("No existe el fichero");}
        }
    }
    
}
