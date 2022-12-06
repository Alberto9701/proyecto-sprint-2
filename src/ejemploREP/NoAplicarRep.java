package ejemploREP;
import ejemploREPpaquete.Arma.*;
import ejemploREPpaquete.Armadura.*;
import ejemploREPpaquete.Jugador.*;


//un ejemplo que rompe con el principio de REP es el siguiente,
//ya que estamos necesitando un paquete que necesita de otros paquetes
//para ser usados
public class NoAplicarRep {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Juan",new Arma("espada"),new Armadura("túnica"));
    }
}
