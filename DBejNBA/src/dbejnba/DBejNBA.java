package dbejnba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DBejNBA {

    public static void main(String[] args) {
        Connection conn = null;

        String url = "jdbc:mysql://localhost:3306/nba";

        String user = "root";

        String password = "1234";

        String consulta = "SELECT * FROM partidos";

        String insercion = "INSERT INTO tablapruebas (c1, c2) VALUES ('Nuevo', 'campo');";

        String consulta1 = "select  nombre from jugadores where altura=(select max(altura) from jugadores);";
        String consulta2 = "select nombre from jugadores where altura=(select min(altura) from jugadores);";
        String consulta3 = "select * from jugadores where nombre_equipo=\"Lakers\";";
        String consulta4 = "select nombre, puntos_por_partido from jugadores join estadisticas on jugadores.codigo=estadisticas.jugador order by puntos_por_partido desc limit 1;";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver"); //Aunque esta línea ya no es necesaria, yo la pongo de siempre, jeje

            conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();

            //Menú
            System.out.println("Menu. Elige tu opcion:\n"
                    + "         1 - Quién es el jugador más alto de la NBA \n"
                    + "         2 - Quién es el jugador más bajo de la NBA \n"
                    + "         3 - Quienes son los jugadores de los Lakers \n"
                    + "         4 - Quién es el jugador con más puntos");

            Scanner in = new Scanner(System.in);
            int op = 0;
            do {
                System.out.print("Dame tu opcion [1-4]: ");
                op = in.nextInt();
            } while (op < 1 || op > 4);
            
            ResultSet rs = null;
            switch (op) {
                case 1:
                    rs = stmt.executeQuery(consulta1);
                    break;
                case 2:
                    rs = stmt.executeQuery(consulta2);
                    break;
                case 3:
                    rs = stmt.executeQuery(consulta3);
                    break;
                case 4:
                    rs = stmt.executeQuery(consulta4);
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

}
