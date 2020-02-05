package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Armando Salazar
 */
public class UsuarioDAO {

    private PreparedStatement st;
    private ResultSet resultado;
    private final Conexion conexion = new Conexion();
    private Connection acceso;
    Usuario usuario = new Usuario();

    public Usuario validarUsuario(String nombre, String clave) {
        String sql = "SELECT * FROM Usuario WHERE Usuario = ? AND Clave = ?";
        try {
            acceso = conexion.conectar();
            st = acceso.prepareStatement(sql);
            st.setString(1, nombre);
            st.setString(2, clave);
            resultado = st.executeQuery();
            while (resultado.next()) {
                usuario.setUsuario(resultado.getString(1));
                usuario.setClave(resultado.getString(2));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return usuario;
    }
}
