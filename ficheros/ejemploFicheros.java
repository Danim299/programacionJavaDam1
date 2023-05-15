package ficheros;

import java.io.File;

public class ejemploFicheros {

    public static void main(String[] args) {
        File f = new File("Actividades.txt");
        f.mkdir();
        System.out.println("Ulima modificacion: "+f.lastModified());
        System.out.println("Nombre"+f.getName());
        System.out.println("Padre: "+f.getParent());
        System.out.println("Existe: "+f.exists());
        System.out.println("Ruta: "+f.getAbsolutePath());
    }
    
}
