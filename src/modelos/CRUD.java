package modelos;

import java.util.List;

/**
 *
 * @author Armando Salazar
 */
public interface CRUD {

    public List listar();

    public int agregar(Object[] o);

    public int actualizar(Object[] o);

    public void eliminar(int id);
}
