package inputOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InOut {

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        System.out.println(readAsString(in, Charset.forName("UTF-8")));


    }

    public static String readAsString(InputStream in, Charset ch) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int read;

        while ((read = in.read()) != -1) {
            out.write(read);
        }
        return out.toString(ch.toString());
    }
}
