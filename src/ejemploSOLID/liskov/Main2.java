package ejemploSOLID.liskov;

public class Main2 {
    public static void main(String[] args) {
        ICalificacionFinal geometria = new Geometria();
        System.out.println("La calificacion de geometria es: " + geometria.calcularCalificacion(8.0,6.0));

        ICalificacionFinal historia = new Historia();
        System.out.println("La calificacion de historia es: " + historia.calcularCalificacion(9.0,6.5));
    }
}
