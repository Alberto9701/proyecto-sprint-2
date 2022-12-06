package ejemploSOLID.liskov;

public class Cuadrado extends Rectangulo{

    public int getAltura(){
        return altura;
    }
    public void setAltura(int altura){
        this.altura=altura;
        this.anchura=altura;
    }

    public int getAnchura(){
        return anchura;
    }
    public void setAnchura(int anchura){
        this.altura=anchura;
        this.anchura=anchura;
    }
}
