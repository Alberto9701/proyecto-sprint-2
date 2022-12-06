package ejemploSOLID.single;

public class AppDeEntrega {
    private Orden orden;
    //constructores
    public AppDeEntrega(Orden orden){
        this.orden=orden;
    }
    //métodos
    public void entregar(){
        System.out.println("Entregando la orden....");
        System.out.println("La orden con id " + this.orden.getIdOrden()
                + " esta siendo entregada a " + this.orden.getCliente().getNombre());
        System.out.println("La orden ha sido entregada en: " +
                this.orden.getCliente().getDireccion());
    }
}
