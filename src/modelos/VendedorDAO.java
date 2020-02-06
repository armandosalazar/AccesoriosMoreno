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
public class VendedorDAO implements CRUD {

    private PreparedStatement st;
    private ResultSet resultado;
    private final Conexion conexion = new Conexion();
    private Connection acceso;

    @Override
    public List listar() {
        List<Vendedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM Vendedor";
        try {
            acceso = conexion.conectar();
            st = acceso.prepareStatement(sql);
            resultado = st.executeQuery();
            while (resultado.next()) {
                Vendedor vendedorListar = new Vendedor();
                vendedorListar.setId(resultado.getInt(1));
                vendedorListar.setNombre(resultado.getString(2));
                vendedorListar.setDireccion(resultado.getString(3));
                vendedorListar.setTelefono(resultado.getString(4));
                vendedorListar.setSeguro(resultado.getString(5));
                lista.add(vendedorListar);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public int agregar(Object[] o) {
        int resultadoAgregar = 0;
        String sql = "INSERT INTO Vendedor (Nombre, Direccion, Telefono, Seguro) VALUES (?, ?, ?, ?)";
        try {
            acceso = conexion.conectar();
            st = acceso.prepareStatement(sql);
            st.setObject(1, o[0]);
            st.setObject(2, o[1]);
            st.setObject(3, o[2]);
            st.setObject(4, o[3]);
            resultadoAgregar = st.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return resultadoAgregar;
    }

    @Override
    public int actualizar(Object[] o) {
        int resultadoActualizar = 0;
        String sql = "UPDATE Vendedor SET Nombre = ?, Direccion = ?, Telefono = ?, Seguro = ?  WHERE ID = ?";
        try {
            acceso = conexion.conectar();
            st = acceso.prepareStatement(sql);
            st.setObject(1, o[0]);
            st.setObject(2, o[1]);
            st.setObject(3, o[2]);
            st.setObject(4, o[3]);
            st.setObject(5, o[4]);
            resultadoActualizar = st.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return resultadoActualizar;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM Vendedor WHERE ID = ?";
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
