package ejercicio.pkg2.k;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.Statement; 
import java.sql.ResultSet;
import java.util.Scanner;
/*
No hace falta hacer el último apartado (sqing) para ésta entrega.

Crea una base de datos “futbol” con una tabla “equipos” con campos “id” que servirá
de identificador (3 letras), nombre y ciudad. Inserta 10 equipos diferentes. Crea los
siguientes programas java que realicen las siguientes acciones

- e. Un programa que muestre el id y el nombre de todos los equipos.
- f. Un programa que pida un nuevo equipo al usuario y lo inserte.
- g. Un programa que elimine un equipo según la elección del usuario (hay
     libertad para interactuar con el usuario)
- h. Un programa que modifique el nombre de un equipo pedido al usuario.
- i. Un programa que modifique la ciudad de un equipo pedido al usuario con una
     nueva ciudad también dada por el usuario.
- j. Crea una clase “equipo” y genera un programa que lea todos los equipos de
     la base de datos y los almacene en un arrayList de objetos de tipo “equipo”.
- k. Juntar todos los programas anteriores en uno solo para que el usuario pueda
     ir interactuando con el programa.
*/
public class Ejercicio2K {

    public static void main(String[] args) {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/futbol";
        String user = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = DriverManager.getConnection(url, user, password);
            
            Statement stmt = conn.createStatement();

            
            //Menú
            
            int op = 0;
            do{
            System.out.println("Menu. Elige tu opcion:\n"
                    + "         1 - Muestre el id y el nombre de todos los equipos \n"
                    + "         2 - Nuevo equipo al usuario y lo inserte. \n"
                    + "         3 - Eliminacion de un equipo \n"
                    + "         4 - Modificar la ciudad del equipo \n"
                    + "         5 - Crear arrayList de equipos\n"
                    + "         6 - Salir");

            Scanner in = new Scanner(System.in);
                do {
                    System.out.print("Dame tu opcion [1-6]: ");
                    op = in.nextInt();
                } while (op < 1 || op > 6);
            }while(op!=6);
            ResultSet rs = null;
            switch (op) {
                case 1:
                    rs = stmt.executeQuery(mostrarId());
                    break;
                case 2:
                    rs = stmt.executeQuery(introducirEquipo());
                    break;
                case 3:
                    rs = stmt.executeQuery("");
                    break;
                case 4:
                    rs = stmt.executeQuery("");
                    break;
                case 5:
                    rs = stmt.executeQuery("");
                    break;
            }      
            while (rs.next()) {
                        String n1 = rs.getString("nombre");
                        System.out.println(n1);
                    }                
            stmt.close();
            conn.close();

        } catch (Exception ex) {

            System.out.println("Exception: " + ex.getMessage());

        }
    }
    
    public static String mostrarId(){ 
        String c= "select id, nombre from equipos;";
        return c;
    }
    public static String introducirEquipo(){
        Scanner in = new Scanner(System.in);
        System.out.print("Dame el nombre del equipo:");
        String eq = in.nextLine();
        System.out.print("Dame la ciudad del equipo:");
        String ciu = in.nextLine();
        in.close();
        in.close();
        String //c = "insert into equipos (nombre, ciudad) values("+'"'+eq+'"'+","+'"'+ciu+'"'+");";
         c = "insert into equipos (nombre, ciudad) values("+"'"+eq+"'"+","+"'"+ciu+"'"+");";
        return c;
    }
}
