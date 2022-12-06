package ejemploSOLID.interfaceSeg;

public class AppYoutube implements IReproductorContenidoMedia{

    @Override
    public void reproducirAudio() {
        System.out.println("Reproduciendo Audio en youtube.....");
    }

    @Override
    public void reproducirVideo() {
        System.out.println("Reproduciendo Video en youtube.....");
    }
}
