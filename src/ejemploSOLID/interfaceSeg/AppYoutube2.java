package ejemploSOLID.interfaceSeg;

public class AppYoutube2 implements IReproductorAudio,IReproductorVideo{

    @Override
    public void reproducirAudio() {
        System.out.println("Reproduciendo audio en Youtube .....");
    }

    @Override
    public void reproducirVideo() {
        System.out.println("Reproduciendo video en Youtube......");
    }
}
