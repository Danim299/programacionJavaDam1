package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ej2_7 {

    /*
Estadísticas: Implementa un programa que lea un documento de texto y muestre por pantalla algunos datos estadísticos: 
nº de líneas, nº de palabras, nº de caracteres y cuáles son las 10 palabras más comunes (y cuántas veces aparecen). 
Prueba el programa con los archivos de la carpeta ‘Libros’.    
     */
    public static void main(String[] args) {
        try {
            Scanner in1 = new Scanner(System.in);
            System.out.print("Introduce la ruta del libro que quieres leer: ");
            String f = in1.nextLine();
            File fich = new File(f);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            int nLineas = 0;
            String linea;
            int i, j, palab = 0;
            int nCarac = 0;
            int caract = br.read();

            while ((linea = br.readLine()) != null) {
                nLineas++;

                for (i = 0; i < linea.length(); i++) {
                    nCarac+=linea.length();
                    if (i == 0) {
                        if (linea.charAt(i) != ' ') {
                            palab++;
                        }
                    } else {
                        if (linea.charAt(i - 1) == ' ') {
                            if (linea.charAt(i) != ' ') {
                                palab++;
                            }
                        }
                    }
                }
            }
            br.close();
            fr.close();
            in1.close();
            Scanner in2 = new Scanner(fich);

            //hashmap para contar cosos
            HashMap<String, Integer> pRepetidas = new HashMap<String, Integer>();
            while (in2.hasNextLine()) {
                String[] pLinea = in2.nextLine().split(" ");
                //System.out.println("pLinea "+pLinea[0]);
                int cont = 1;
                for (String palabra : pLinea) {
                    //System.out.println(cont++ + " Palabra: " + palabra);
                    if (pRepetidas.containsKey(palabra)) {
                        pRepetidas.put(palabra, pRepetidas.get(palabra) + 1);
                    } else {
                        pRepetidas.put(palabra, 1);
                    }
                }
            }

            in2.close();
            System.out.println("El libro tiene " + palab + " palabras");
            System.out.println("El libro tiene " + nLineas + " lineas");
            System.out.println("El libro tiene " + nCarac + " caracteres");
            System.out.println("Las 10 parabras que mas se repiten son: ");
            
            for (HashMap.Entry<String, Integer> entry : pRepetidas.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
/*                Iterator it = pRepetidas.entrySet().iterator();
                ArrayList listaClaves = new ArrayList();
                Collections.sort(listaClaves);
                listaClaves.stream().forEach(clave -> System.out.println(clave + " : " + pRepetidas.get(clave)));*/
                //he probado a ordenarlo así y no va, me doy por vencido, si lo consigo arreglar te lo vuelvo a enviar
            }
            

        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontado el archivo");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
