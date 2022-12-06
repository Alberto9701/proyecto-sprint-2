package ejemploDry;

public class EjemploDry {

    public static final boolean logged= true;
    public static final String ROLE = "admin";


    public static boolean isAdmin(){
        return logged && ROLE.equals("admin");
    }

    //en este caso la implementación de dry esta parametrizado en este método
    public static void runRepport(int report){
        if(isAdmin()){
            System.out.println("Report: " + report);
        }
    }

    //ejemplo de un antipatrón de dry
    //es incorrecto usar 2 o mas funciones para la misma función
    public static  void runReport2(){
        if(isAdmin()){
            System.out.println("Report 2");
        }
    }

    public static void main(String[] args) {
        runRepport(10);
        runReport2();
    }
}
