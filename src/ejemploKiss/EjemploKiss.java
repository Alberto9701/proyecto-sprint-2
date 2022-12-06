package ejemploKiss;

public class EjemploKiss {
    private static String[] dias = new String[] {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado" ,"Domingo"};

    //este método no aplica kiss
    public static String diasDeLaSemana(int numero){
        switch (numero){
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miércoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sábado";
            case 7: return "Domingo";
            default: throw new UnsupportedOperationException();
        }
    }

    //en este metodo con ayuda de nuestro arreglo que declaramos previamente aplicamos kiss
    public static String diasDeLaSemana2(int numero){
        if(numero<1 || numero>7){
            throw new UnsupportedOperationException();
        }
        return dias[numero-1];
    }

    public static void main(String[] args) {
        System.out.println(diasDeLaSemana(3));
        System.out.println(diasDeLaSemana2(5));
    }
}
