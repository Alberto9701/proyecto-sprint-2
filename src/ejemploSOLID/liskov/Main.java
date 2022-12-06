package ejemploSOLID.liskov;

public class Main {
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo();
        rect1.setAltura(4);
        rect1.setAnchura(8);
        System.out.println("Area del rectangulo: " + rect1.calcularArea());

        Cuadrado cuad1 = new Cuadrado();
        cuad1.setAltura(8);
        cuad1.setAnchura(3);
        System.out.println("Area del cuadrado: " + cuad1.calcularArea());
    }
}
