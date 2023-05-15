package pruebadb;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;
import java.sql.Statement; 
import java.sql.ResultSet; 
import java.util.Date;

public class PruebaDB {

    public static void main(String[] args) {
        Statement stmt = null; 
        ResultSet rs = null;
        try {
             // Cargamos la clase que implementa el Driver 
             Class.forName("com.mysql.cj.jdbc.Driver");
             // Creamos una nueva conexión a la base de datos "bdpruebas" 
             String url = "jdbc:mysql://localhost:3306/bdpruebas";
             // Abrimos la conexión con el usuario y la clave correspondiente 
             Connection conn = DriverManager.getConnection(url, "root", "1234");
             stmt = conn.createStatement();
             String sql = "SELECT * FROM tablapruebas"; 
             rs = stmt.executeQuery(sql);
             while (rs.next()) { 
                 int id = rs.getInt("id"); 
                 String nombre = rs.getString("campo1"); 
                 Date fecha = rs.getDate("campo2"); 
                 System.out.println(id + " " + nombre + " " + fecha); 
             }
        rs.close();
        stmt.close(); 
        conn.close();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage()); 
            System.out.println("SQLState: " + ex.getSQLState()); 
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception e) { 
            System.out.println("Error: " + e.getMessage());
        }finally {
            if (rs != null) { try {rs.close();} catch (SQLException sqlEx) { System.out.println("Error al cerrar el ResultSet.");} rs = null;}
        }if (stmt != null) { try {stmt.close();} catch (SQLException sqlEx) { System.out.println("Error al cerrar el Statement.");} stmt = null;}
    }
    
}
