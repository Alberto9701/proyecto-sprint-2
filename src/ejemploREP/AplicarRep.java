package ejemploREP;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class AplicarRep {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        os.write("my word".getBytes());

        os.writeTo(System.out);
    }
}
