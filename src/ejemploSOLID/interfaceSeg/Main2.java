package ejemploSOLID.interfaceSeg;

public class Main2 {
    public static void main(String[] args) {

        AppYoutube2 youtube = new AppYoutube2();
        youtube.reproducirVideo();
        youtube.reproducirAudio();
        System.out.println("\n");

        AppHBO2 hbo = new AppHBO2();
        hbo.reproducirVideo();
        hbo.reproducirAudio();
        System.out.println("\n");

        AppDeezer2 deezer = new AppDeezer2();
        deezer.reproducirAudio();

    }
}
