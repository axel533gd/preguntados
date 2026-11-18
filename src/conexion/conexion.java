package src.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    
    private static final String URL = "jdbc:mysql://localhost:3306/preguntados?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String CLAVE = ""; 

    public static Connection obtenerConexion() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("¡Conexión exitosa a la base de datos 'preguntados'!");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la BD: " + e.getMessage());
        }
        return con;
    }
}

