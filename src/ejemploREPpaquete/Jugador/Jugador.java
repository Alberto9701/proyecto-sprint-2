package ejemploREPpaquete.Jugador;

import ejemploREPpaquete.Arma.Arma;
import ejemploREPpaquete.Armadura.Armadura;

public class Jugador {
    private String nombre;
    private Arma arma;
    private Armadura armadura;

    public Jugador(){}
    public Jugador(String nombre, Arma arma, Armadura armadura){
        this.nombre = nombre;
        this.arma = arma;
        this.armadura = armadura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }
}
