package ejemploSOLID.single;

import java.util.Random;

public class Orden {
    private Cliente cliente;
    private String idOrden;
    private String nombreArticulo;
    private int cantidad;
    private int totalDeLaCuenta;

    //getters y setters

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(String idOrden) {
        Random random = new Random();
        this.idOrden = idOrden + "-" + random.nextInt(500);
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
        setIdOrden(nombreArticulo);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotalDeLaCuenta() {
        return totalDeLaCuenta;
    }

    public void setTotalDeLaCuenta(int totalDeLaCuenta) {
        this.totalDeLaCuenta = totalDeLaCuenta;
    }
    //metodos
    public void prepararOrden(){
        System.out.println("Preparando orden para comprador - " +
                this.getCliente().getNombre() +
                " el cual ha ordenado " +
                this.getNombreArticulo());
    }
}
