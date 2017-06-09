package decorator.lowercase;

import java.io.*;

/**
 * Created by levente on 2017.05.30..
 */
public class LowerCaseDecorator extends FilterInputStream {

    public LowerCaseDecorator(InputStream file) throws FileNotFoundException {
        super(file);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    public int read(byte[] b, int offser, int len) throws IOException {
        int result = super.read(b,offser,len);
        for (int i = offser; i < offser+result; i++){
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }
}
