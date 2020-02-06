package modelos;

/**
 *
 * @author Armando Salazar
 */
public class Cliente {

    private int id;
    private String nombre;
    private String rfc;
    private String direccion;
    private String telefono;
    private String colonia;
    private String cp;
    private String ciudad;
    private String correo;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String rfc, String direccion, String telefono, String colonia, String cp, String ciudad, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.rfc = rfc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
