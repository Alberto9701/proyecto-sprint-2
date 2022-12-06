package ejemploSOLID.openclosed;

//creamos una clase abstracta con el método obtener volumen
abstract class ObjetosGeometricos {
    public abstract double obtenerVolumen();
}

//extendemos para poder implementar el método abstracto para un cuboide
class Cuboide2 extends ObjetosGeometricos {
    public double profundidad;
    public double ancho;
    public double altura;

    @Override
    public double obtenerVolumen() {
        return profundidad*ancho*altura;
    }
}

//extendemos para poder implementar el método abstracto para una esfera
class Esfera2 extends ObjetosGeometricos {
    public double radio;

    @Override
    public double obtenerVolumen() {
        return (4/3) * Math.PI *radio*radio*radio;
    }
}

class Aplicacion2{
    public double obtenervolumenTotal(ObjetosGeometricos[] objetosGeometricos){
        double sumaDeVolumenes = 0;
        for(ObjetosGeometricos objeto:objetosGeometricos){
            sumaDeVolumenes += objeto.obtenerVolumen();
        }
        return sumaDeVolumenes;
    }
}



public class Main2 {
    public static void main(String[] args) {
        //inicializando objetos de tipo Cuboide
        Cuboide2 c1 = new Cuboide2();
        c1.profundidad=5;
        c1.ancho=10;
        c1.altura=15;

        Cuboide2 c2 = new Cuboide2();
        c2.profundidad=2;
        c2.ancho=4;
        c2.altura=6;

        Cuboide2 c3= new Cuboide2();
        c3.profundidad=3;
        c3.ancho=12;
        c3.altura=15;

        //inicializamos objetos de tipo esfera
        Esfera2 e1= new Esfera2();
        e1.radio=5;

        Esfera2 e2 = new Esfera2();
        e2.radio=2;

        Esfera2 e3 = new Esfera2();
        e3.radio=3;

        //creamos un arreglo en donde almacenaremos los cubides y las esferas
        ObjetosGeometricos[] objetosGeometricos = new ObjetosGeometricos[6];
        objetosGeometricos[0] = c1;
        objetosGeometricos[1] = c2;
        objetosGeometricos[2] = c3;
        objetosGeometricos[3] = e1;
        objetosGeometricos[4] = e2;
        objetosGeometricos[5] = e3;

        //inicializamos un objeto de nuestra clase aplicacion
        Aplicacion2 app = new Aplicacion2();

        //variable para almacenar el volumen total
        double volumen = app.obtenervolumenTotal(objetosGeometricos);

        //despliegue del volumen total
        System.out.println("El volumen total es: " + volumen);
    }
}
