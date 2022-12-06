package ejemploSOLID.interfaceSeg;

public class AppDeezer implements IReproductorContenidoMedia{
    @Override
    public void reproducirAudio() {
        System.out.println("Reproduciendo audio en Deezer.....");
    }

    @Override
    public void reproducirVideo() {
        System.out.println("Video no disponible");
    }
}
