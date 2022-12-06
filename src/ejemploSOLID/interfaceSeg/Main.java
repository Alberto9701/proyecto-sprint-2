package ejemploSOLID.interfaceSeg;

public class Main {
    public static void main(String[] args) {
        AppYoutube youtube = new AppYoutube();
        youtube.reproducirAudio();
        youtube.reproducirVideo();
        System.out.println("\n");

        AppHBO hbo = new AppHBO();
        hbo.reproducirAudio();
        hbo.reproducirVideo();
        System.out.println("\n");

        AppDeezer deezer = new AppDeezer();
        deezer.reproducirAudio();
        deezer.reproducirVideo();
    }
}
