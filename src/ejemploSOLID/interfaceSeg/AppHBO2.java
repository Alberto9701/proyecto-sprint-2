package ejemploSOLID.interfaceSeg;

public class AppHBO2 implements IReproductorVideo,IReproductorAudio{

    @Override
    public void reproducirAudio() {
        System.out.println("Reproduciendo audio en HBO .....");
    }

    @Override
    public void reproducirVideo() {
        System.out.println("Reproduciendo video en HBO .......");
    }
}
