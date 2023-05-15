package hasmap;

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioHasMap {
/*
Realiza una aplicación que sea capaz de almacenar la información de libros junto con su ISBN (son únicos y no se pueden repetir).
El programa primero pedirá libros al usuario para almacenarlos para luego mostrar un menú con las siguientes opciones (puede ser con entorno gráfico o no):
Ver todos los libros almacenados.
- Introducir un nuevo libro. Se indicará si se ha podido o no hacerlo.
- Buscar un libro por ISBN. Si no existe, se debe indicar de alguna manera.
- Buscar un libro por el título. Si no existe o existen varios se deberá indicar.
- Borrar un libro por ISBN. Se indicará si se ha borrado o no.
- Borrar un libro por título. Se indicará el número de libros que se hayan borrado
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap infoLibros = new HashMap();
        int isbn;
        int val;
        String nombre;
        int comp=0;
        do{
        System.out.println("Vamos a introducir libros con su ISBN");
        System.out.print("Introduce el ISBN [0 es un parametro para salir]: ");
        isbn = in.nextInt();
        if (infoLibros.containsKey(isbn) == true) {
           while (infoLibros.containsKey(isbn) == true) {
                System.out.print("ISBN repetido, introduzca de nuevo: ");
                isbn = in.nextInt();
            }
        }
        in.nextLine();
        System.out.print("Introduce el nombre del libro [para salir introduce 'salir']: ");
        nombre = in.nextLine();

        
        infoLibros.put(isbn, nombre);
        val = nombre.compareToIgnoreCase("salir");
        }while(val!=0);
        for (int i = 0; i < infoLibros.size(); i++) {
            if(infoLibros.containsValue("salir")){infoLibros.remove(infoLibros.containsKey(0), infoLibros.containsValue("salir"));}
        }
        
        System.out.println(infoLibros);
        System.out.println("Menú\n[1]- Añadir un nuevo libro\n[2]- Buscar Libro por ISBN\n[3]- Buscar por Nombre\n[4]- Borrar Libro por ISBN\n[5]- Borrar libro por titulo");
        System.out.print("Opcion: ");
        int opc = in.nextInt();
        if(opc==1){
            System.out.print("Introduce el ISBN: ");
            isbn = in.nextInt();
            if (infoLibros.containsKey(isbn) == true) {
                while (infoLibros.containsKey(isbn) == true) {
                    System.out.print("ISBN repetido, introduzca de nuevo: ");
                    isbn = in.nextInt();
                }
            }
            in.nextLine();
            System.out.print("Introduce el nombre del libro: ");
            nombre = in.nextLine();
            infoLibros.put(isbn, nombre);
            System.out.println("La informacion de libros que tienes actualmente con el nuevo es:\n"+infoLibros);
        }else if(opc==2){
            System.out.println("\nVamos a buscar por ISBN\nIndicalo");
            isbn=in.nextInt();
            if(infoLibros.containsKey(isbn)){
                System.out.println("El nombre del libro con el ISBN "+ isbn +" es: "+infoLibros.get(isbn));
            }else{
                System.out.println("No se ha encontrado dicho isbn");
            }
        }else if(opc==3){
            in.nextLine();
            System.out.println("\nVamos a buscar por titulo\nIndicalo");
            nombre = in.nextLine();
            for (int i = 0; i < infoLibros.size(); i++) {
            if(infoLibros.containsValue(nombre)==true){
                System.out.println("El/Los libros con dicho nombre son: "+infoLibros.get(i));
            }
          } 
        }else if(opc==4){
            System.out.println("Vamos a borrar por ISBN\nIntroducelo");
            isbn = in.nextInt();
            if(infoLibros.containsKey(isbn)==true){
               infoLibros.remove(isbn);
                System.out.println("Se ha borrado el elemento\nLa informacion te queda asi:\n"+infoLibros);
            }else{
                System.out.println("No se ha podido eliminar lo indicado");
            }
        }else if(opc==5){
            in.nextLine();
            System.out.println("Vamos a borrar por titulo\nIntroducelo");
            nombre = in.nextLine();
            if(infoLibros.containsValue(nombre)==true){
            
            }
        }
    }
}
