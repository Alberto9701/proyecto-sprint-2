package ejemploSOLID.liskov;

public class Historia implements ICalificacionFinal{

    @Override
    public double calcularCalificacion(double tareas, double examen) {
        return (tareas*0.3) + (examen*0.7);
    }
}
