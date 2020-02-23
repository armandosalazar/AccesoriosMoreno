package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Armando Salazar
 */
public class ClienteDAO implements CRUD {

    private PreparedStatement st;
    private ResultSet resultado;
    private final Conexion conexion = new Conexion();
    private Connection acceso;

    public Cliente listarID(String nombre) {
        Cliente cliente = new Cliente();
        String sql = "SELECT * FROM Cliente WHERE Nombre = ?";
        try {
            acceso = conexion.conectar();
            st = acceso.prepareStatement(sql);
            st.setString(1, nombre);
            resultado = st.executeQuery();
            while (resultado.next()) {                
                cliente.setId(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setRfc(resultado.getString(3));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return cliente;
    }
    
    @Override
    public List listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM Cliente";
        try {
            acceso = conexion.conectar();
            st = acceso.prepareStatement(sql);
            resultado = st.executeQuery();
            while (resultado.next()) {
                Cliente clienteListar = new Cliente();
                clienteListar.setId(resultado.getInt(1));
                clienteListar.setNombre(resultado.getString(2));
                clienteListar.setRfc(resultado.getString(3));
                clienteListar.setDireccion(resultado.getString(4));
                clienteListar.setTelefono(resultado.getString(5));
                clienteListar.setColonia(resultado.getString(6));
                clienteListar.setCp(resultado.getString(7));
                clienteListar.setCiudad(resultado.getString(8));
                clienteListar.setCorreo(resultado.getString(9));
                lista.add(clienteListar);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public int agregar(Object[] o) {
        int resultadoAgregar = 0;
        String sql = "INSERT INTO Cliente (Nombre, RFC, Direccion, Telefono, Colonia, CP, Ciudad, Correo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            acceso = conexion.conectar();
            st = acceso.prepareStatement(sql);
            st.setObject(1, o[0]);
            st.setObject(2, o[1]);
            st.setObject(3, o[2]);
            st.setObject(4, o[3]);
            st.setObject(5, o[4]);
            st.setObject(6, o[5]);
            st.setObject(7, o[6]);
            st.setObject(8, o[7]);
            resultadoAgregar = st.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return resultadoAgregar;
    }

    @Override
    public int actualizar(Object[] o) {
        int resultadoActualizar = 0;
        String sql = "UPDATE Cliente SET Nombre = ?, RFC = ?, Direccion = ?, Telefono = ?, Colonia = ?, CP = ?, Ciudad = ?, Correo = ? WHERE ID = ?";
        try {
            acceso = conexion.conectar();
            st = acceso.prepareStatement(sql);
            st.setObject(1, o[0]);
            st.setObject(2, o[1]);
            st.setObject(3, o[2]);
            st.setObject(4, o[3]);
            st.setObject(5, o[4]);
            st.setObject(6, o[5]);
            st.setObject(7, o[6]);
            st.setObject(8, o[7]);
            st.setObject(9, o[8]);
            resultadoActualizar = st.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return resultadoActualizar;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM Cliente WHERE ID = ?";
        try {
            acceso = conexion.conectar();
            st = acceso.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

}
