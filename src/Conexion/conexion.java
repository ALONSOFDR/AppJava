package Conexion;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author alons
 */
public class conexion {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "root";
    private static final String url = "jdbc:mysql://localhost:3306/PM";

    public conexion() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog (null,"Error en conexion" + e.getMessage());
        }
    }
    
    //Este metodo nos retorna la conexion
    public Connection getConnection(){
        return conn;
    }
    
    //desconecta de la BD
    public void desconectar (){
        conn = null;
    }
   
    
}

