package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Armando Salazar
 */
public class Conexion {

    private final String url = "/Users/armando/DATABASE/database.db";
    private Connection conexion;

    public Connection conectar() {
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:" + url);
            if (conexion != null) {
                System.out.println("Conectado correctamente");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return conexion;
    }
}
