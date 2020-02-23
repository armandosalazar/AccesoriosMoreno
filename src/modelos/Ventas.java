package modelos;

/**
 *
 * @author Armando Salazar
 */
public class Ventas {

    private int id;
    private int idCliente;
    private int idVendedor;
    private int serie;
    private String fechaVentas;
    private double monto;
    private int estado;

    public Ventas() {
    }

    public Ventas(int id, int idCliente, int idVendedor, int serie, String fechaVentas, double monto, int estado) {
        this.id = id;
        this.idCliente = idCliente;
        this.idVendedor = idVendedor;
        this.serie = serie;
        this.fechaVentas = fechaVentas;
        this.monto = monto;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getFechaVentas() {
        return fechaVentas;
    }

    public void setFechaVentas(String fechaVentas) {
        this.fechaVentas = fechaVentas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
