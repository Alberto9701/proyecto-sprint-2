package ejemploSOLID.single;

public class Main {
    public static void main(String[] args) {
        //declarando y definiendo cliente
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Miguel");
        cliente1.setDireccion("Calle 7");

        //definiendo y declarando una orden
        Orden orden1 = new Orden();
        orden1.setNombreArticulo("pizza");
        orden1.setCantidad(2);
        orden1.setCliente(cliente1);

        orden1.prepararOrden();

        //calculado la cuenta y desplegandola
        CalcularCuenta calcularCuenta1 = new CalcularCuenta(orden1);
        calcularCuenta1.calcularLaCuenta();

        //entregando la entrega y desplegando la informacion de entrega
        AppDeEntrega appDeEntrega = new AppDeEntrega(orden1);
        appDeEntrega.entregar();
    }
}