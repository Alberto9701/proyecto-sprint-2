package ejemploSOLID.openclosed;

//clase cuboide para almacenar los atributos de este objeto
//geometrico
/*
class Cuboide {
    public double profundidad;
    public double ancho;
    public double altura;
}

//clase para calcular el volumen de los objetos geométricos
class Aplicacion{
    public double obtenerVolumenTotal(Cuboide[] objetosGeometricos){
        double sumaDelVolumen=0;
        for(Cuboide objeto: objetosGeometricos){
            sumaDelVolumen += objeto.altura*objeto.ancho*objeto.profundidad;
        }
        return sumaDelVolumen;
    }
}

public class Main{
    public static void main(String[] args) {

        Cuboide cubo1 = new Cuboide();
        cubo1.profundidad=5;
        cubo1.ancho=10;
        cubo1.altura=15;//750

        Cuboide cubo2 = new Cuboide();
        cubo2.profundidad=2;
        cubo2.altura=4;
        cubo2.ancho=6;//48

        Cuboide cubo3 = new Cuboide();
        cubo3.profundidad=3;
        cubo3.ancho=12;
        cubo3.altura=15; //360+180 540

        Cuboide[] cuboides = new Cuboide[3];
        cuboides[0]=cubo1;
        cuboides[1]=cubo2;
        cuboides[2]=cubo3;

        //instanciamos un objeto de la clase aplicación
        Aplicacion app = new Aplicacion();

        //variable para almacenar el volumen total
        double volumen = app.obtenerVolumenTotal(cuboides);

        //despliegue del volumento total
        System.out.println("El volumen total es: " + volumen);
    }
}
*/


class Cuboide {
    public double profundidad;
    public double ancho;
    public double altura;
}
//nueva clase con el objeto geométrico esfera
class Esfera{
    public double radio;
}
//modificamos la clase aplicacion para implementar nuevas funcionalidades
class Aplicacion{
    public double obtenerVolumenTotal(Cuboide[] cuboides,Esfera[] esferas){
        double sumaDelVolumen=0;

        for(Cuboide cubo:cuboides){
            sumaDelVolumen += cubo.altura*cubo.ancho*cubo.profundidad;
        }
        //en este foreach implementamos la obtencion del volumen de una esfera
        for (Esfera esfera:esferas){
            sumaDelVolumen += (4/3) * Math.PI * esfera.radio*esfera.radio*esfera.radio;
        }
        return sumaDelVolumen;
    }
}

public class Main{
    public static void main(String[] args) {
        //inicializando objetos de tipo Cuboide
        Cuboide c1 = new Cuboide();
        c1.profundidad=5;
        c1.ancho=10;
        c1.altura=15;

        Cuboide c2 = new Cuboide();
        c2.profundidad=2;
        c2.ancho=4;
        c2.altura=6;

        Cuboide c3= new Cuboide();
        c3.profundidad=3;
        c3.ancho=12;
        c3.altura=15;

        //declaramos un arreglo con nuestro cuboides
        Cuboide[] cuboides = new Cuboide[3];
        cuboides[0] = c1;
        cuboides[1] =c2;
        cuboides[2] =c3;

        //inicializamos objetos de tipo esfera
        Esfera e1= new Esfera();
        e1.radio=5;

        Esfera e2 = new Esfera();
        e2.radio=2;

        Esfera e3 = new Esfera();
        e3.radio=3;

        //declaramos un arreglo con nuestras esferas
        Esfera[] esferas = new Esfera[3];
        esferas[0]=e1;
        esferas[1] =e2;
        esferas[2] =e3;

        //inicializamos un objeto de nuestra aplicacion
        Aplicacion app = new Aplicacion();

        //variable para almacenar el volumen total
        double volumen = app.obtenerVolumenTotal(cuboides,esferas);

        //despliegue del volumen total
        System.out.println("El volumen total: " + volumen);
    }

}
