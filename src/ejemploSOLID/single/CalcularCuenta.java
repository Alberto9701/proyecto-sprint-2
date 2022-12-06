package ejemploSOLID.single;

import java.util.Random;

public class CalcularCuenta {
    private Orden orden;
    //constructor
    public CalcularCuenta(Orden orden){
        this.orden=orden;
    }
    //metodos
    public void calcularLaCuenta(){
        Random random= new Random();
        int totalAcumulado = random.nextInt(200) + this.orden.getTotalDeLaCuenta();
        this.orden.setTotalDeLaCuenta(totalAcumulado);
        System.out.println("La orden con el id " +
                this.orden.getIdOrden() + " tiene un valor total de " +
                this.orden.getTotalDeLaCuenta());
    }
}
