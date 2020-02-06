package modelos;

/**
 *
 * @author Armando Salazar
 */
public class Producto {

    private int id;
    private String producto;
    private double precio;
    private double utilidad;
    private int cantidad;
    private String provedor;
    private int stock;
    private String codigo;

    public Producto() {
    }

    public Producto(int id, String producto, double precio, double utilidad, int cantidad, String provedor, int stock, String codigo) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
        this.utilidad = utilidad;
        this.cantidad = cantidad;
        this.provedor = provedor;
        this.stock = stock;
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
