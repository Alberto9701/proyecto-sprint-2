package ejemploSOLID.liskov;

public class Rectangulo {
    protected int altura;
    protected int anchura;

    //getters and setters

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    //metodos
    public double calcularArea(){
        return anchura*altura;
    }
}
