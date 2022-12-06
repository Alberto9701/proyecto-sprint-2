package ejemploSOLID.liskov;

public class Geometria implements ICalificacionFinal {

    @Override
    public double calcularCalificacion(double tareas, double examen) {
        return (0.2*tareas) + (0.8*examen);
    }
}
