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
public class ProductoDAO implements CRUD {

    private PreparedStatement st;
    private ResultSet resultado;
    private final Conexion conexion = new Conexion();
    private Connection acceso;

    @Override
    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM Producto";
        try {
            acceso = conexion.conectar();
            st = acceso.prepareStatement(sql);
            resultado = st.executeQuery();
            while (resultado.next()) {
                Producto productoListar = new Producto();
                productoListar.setId(resultado.getInt(1));
                productoListar.setProducto(resultado.getString(2));
                productoListar.setPrecio(resultado.getDouble(3));
                productoListar.setUtilidad(resultado.getDouble(4));
                productoListar.setCantidad(resultado.getInt(5));
                productoListar.setProvedor(resultado.getString(6));
                productoListar.setStock(resultado.getInt(7));
                productoListar.setCodigo(resultado.getString(8));
                lista.add(productoListar);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }

    @Override
    public int agregar(Object[] o) {
        int resultadoAgregar = 0;
        String sql = "INSERT INTO Producto (Producto, Precio, Utilidad, Cantidad, Provedor, Stock, Codigo) VALUES (?, ?, ?, ?, ?, ?, ?)";
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
            resultadoAgregar = st.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return resultadoAgregar;
    }

    @Override
    public int actualizar(Object[] o) {
        int resultadoActualizar = 0;
        String sql = "UPDATE Producto SET Producto = ?, Precio = ?, Utilidad = ?, Cantidad = ?, Provedor = ?, Stock = ?, Codigo = ?  WHERE ID = ?";
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
            resultadoActualizar = st.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return resultadoActualizar;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM Producto WHERE ID = ?";
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
