package ficheros;

import java.io.File;
import java.util.Scanner;

public class ej1_5 {
/*
Borrando archivos: Implementa un programa con una función boolean borraTodo(File f) que borre f: Si no existe lanzará una excepción. Si es un archivo lo borrará. 
Si es un directorio, borrará primero sus archivos y luego el propio directorio (recuerda que para poder borrar un directorio debe estar vacío). 
Devolverá ‘true’ si pudo borrar el ‘File f’ (‘false’ si no fue posible):
a. Prueba la función borrando las carpetas: ‘Documentos/Fotografias’, ‘Documentos/Libros’ y ‘Documentos’ (es decir, tres llamadas a la función, en ese orden).
b. Como opción esta función, tal y como está definida, no borrará las subcarpetas que estén dentro de una carpeta 
    (para ello habría que borrar primero el contenido de dichas subcarpetas). Arréglala para que pueda hacerse.    
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ruta;
        do{
            System.out.print("Dime la ruta: ");
            ruta = in.nextLine();
            File f = new File(ruta);
            borrarTodo(f);
        }while(ruta.compareToIgnoreCase("")!=0);
    }

    private static boolean borrarTodo(File f){
        if(!f.exists()){
            if(f.getName().compareToIgnoreCase("")!=0){
                System.out.println("No se ha podido borrar");return false;
                }
            }else{
        if(f.isFile()){f.delete();}
        if(f.isDirectory()){
        File[] lista = f.listFiles();
            for (int i = 0; i < lista.length; i++) {
                if(lista[i].isDirectory()){
                    File[] lista2 = lista[i].listFiles();
                    for (int j = 0; j < lista2.length; j++) {
                        if(lista2[j].isFile()){lista2[j].delete();}
                    }
                    lista[i].delete();
                }
                lista[i].delete();
            }
            f.delete();
            
        }
        System.out.println("Se ha borrado correctamente");return true;
    }
        System.out.println("Saliendo");return true;
 }
    
}
