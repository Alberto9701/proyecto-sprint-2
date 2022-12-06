package ejemploSOLID.interfaceSeg;

public class AppHBO implements IReproductorContenidoMedia{
    @Override
    public void reproducirAudio() {
        System.out.println("Reproduciendo audio en HBO.....");
    }

    @Override
    public void reproducirVideo() {
        System.out.println("Reproduciendo audio en HBO.....");
    }
}
